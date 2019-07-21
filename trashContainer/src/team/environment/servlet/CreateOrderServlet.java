package team.environment.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import team.environment.dao.impl.AddressDaoImpl;
import team.environment.dao.impl.OrderTableDaoImpl;
import team.environment.po.Address;
import team.environment.po.OrderTable;


public class CreateOrderServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int addressid=-1;
		
		//判断是否已经选择地址 若无 则跳转到地址选择界面
		try{
			addressid=Integer.parseInt(request.getParameter("addressid"));
			if(addressid==-1) {
				response.sendRedirect("ChoiceAddress.jsp");
				return;
			}
			
		}catch(NumberFormatException nfe) {
			if(addressid==-1) {
				response.sendRedirect("ChoiceAddress.jsp");
				return;
			}
			response.sendRedirect("ChoiceAddress.jsp");
			return;
		}
		String yuyuedate=request.getParameter("yuyuedate");
		String yuyuetime=request.getParameter("yuyuetime");
		String[] string= {""+addressid,yuyuedate+" "+yuyuetime};
		
		OrderTableDaoImpl dao=new OrderTableDaoImpl();
		
		boolean whethersuccess=dao.insertOrderOneLine(string);
		
		if(whethersuccess) {
			
			OrderTable ordertable=dao.newestOrder(Integer.parseInt(request.getParameter("userid")));
			Address addDao=new AddressDaoImpl().queryAddressOneLine((ordertable.getAddressnum()));
			HttpSession session=request.getSession();
						
			//newestorder需要获取用户的id参数 等待于登录系统合并时获取
			session.setAttribute("newestOrder",ordertable);
			session.setAttribute("informationOfAddress", addDao);
			
			response.sendRedirect("PayOrder.jsp");
			return ;
		}else {
			//跳转到首页 并提示创建失败
			response.sendRedirect("PayOrder.jsp");
			return;
		}
	}

}
