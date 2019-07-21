package Tem.Green.Junk.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Tem.Green.Junk.dao.impl.UserDaoImpl;
import Tem.Green.Junk.po.UserInfo;

public class LogServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("用户登录");
		//doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("用户登录");
		//获取邮箱与密码
		String uemail=request.getParameter("uemail");
		String upass=request.getParameter("upass");
		String admin = request.getParameter("admin");//获取checkbox是否勾选

		
		if("1".equals(admin)){//勾选为管理员状态否则为普通状态
			System.out.println("admin");
		}else{
			System.out.println("User");
			UserDaoImpl dao = new UserDaoImpl();
			
			//方式一：
			if(dao.loginUser(uemail, upass)){
				HttpSession session = request.getSession();
				//保存一个对象
				session.setAttribute("User",dao.getInfo(uemail));
				session.setAttribute("Address",dao.getInfo(uemail));
				
				System.out.println("登录成功");
				response.sendRedirect("InfoPage.jsp");
			}else{
				System.out.println("邮箱或密码错误");
				response.sendRedirect("LoginPage.jsp");
			}
			
		}
	}
}
