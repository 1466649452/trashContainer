//获取数据

package team.environment.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import team.environment.dao.impl.AddressDaoImpl;
import team.environment.po.Address;

public class ChoiceAddressServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("选择地址完成");
		
		int number=Integer.parseInt(request.getParameter("choiceaddress"));
		
		AddressDaoImpl addDao=new AddressDaoImpl();
		
		Address address=addDao.queryAddressOneLine(number);
		System.out.println(address.getAnsname());
		HttpSession session=request.getSession();
		
		session.setAttribute("ChoicedAddressForOrder", address);
		
		response.sendRedirect("CreateOrder.jsp");
		
	}

}
