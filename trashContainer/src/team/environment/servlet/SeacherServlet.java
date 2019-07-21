package team.environment.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import team.environment.dao.impl.AddressDaoImpl;
import team.environment.po.Address;

/**
 * Servlet implementation class SeacherServlet
 */
public class SeacherServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userid=Integer.parseInt(request.getParameter("userid"));
		
		AddressDaoImpl dao=new AddressDaoImpl();
		ArrayList<Address> addr=dao.getADfromDB(1);
		
		System.out.println(addr.get(0).getDetail());
		
		HttpSession session=request.getSession();
		
		session.setAttribute("addressArray", addr);
		
		response.sendRedirect("ChoiceAddress.jsp");;
	}
}


