package team.environment.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import team.environment.dao.impl.UserDaoImpl;


public class LogServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("用户登录");
		//获取邮箱与密码
		String uemail=request.getParameter("uemail");
		String upass=request.getParameter("upass");
		//System.out.println(uemail+upass);//测试
		
		UserDaoImpl dao = new UserDaoImpl();
		
		//方式一：
		if(dao.loginUser(uemail, upass)){
			System.out.println("登录成功");
			response.sendRedirect("InfoPage.jsp");
		}else{
			System.out.println("邮箱或密码错误");
			response.sendRedirect("LoginPage.jsp");
		}
	}
}
