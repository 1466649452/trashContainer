
package team.environment.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import team.environment.dao.impl.CitytrashClassDaoImpl;
import team.environment.po.Citytrashclass;

/**
 * Servlet implementation class QueryClass
 */
public class QueryClassServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("查看该城市的分类情况");
		
		CitytrashClassDaoImpl temp=new CitytrashClassDaoImpl();
		ArrayList<Citytrashclass> arr=new ArrayList<Citytrashclass>();
		
		arr=temp.queryall();
		
		HttpSession session=request.getSession();
		
		//cityclass城市的垃圾类别
		session.setAttribute("cityclass", arr);
		
		response.sendRedirect("querytrash.jsp");
		
	}

}
