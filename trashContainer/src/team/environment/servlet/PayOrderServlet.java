package team.environment.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import team.environment.dao.impl.OrderTableDaoImpl;

/**
 * Servlet implementation class PayOrderServlet
 */
public class PayOrderServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pay=Integer.parseInt(request.getParameter("pay"));
		int orderid=Integer.parseInt(request.getParameter("orderid"));
		
		
		OrderTableDaoImpl dao=new OrderTableDaoImpl();
		if(pay==1) {
			//更新订单状态
			int m=2;
			boolean f=dao.updateOrderState(orderid,m);
			if(f) {
				response.sendRedirect("LoginPage.jsp");	
			}else {
				//回到主页
				response.sendRedirect("");
			}
		}else {
			int m=4;
			dao.updateOrderState(orderid,m);
			//回到主页
			response.sendRedirect("");
		}
	}

}
