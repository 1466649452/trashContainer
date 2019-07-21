package team.environment.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import team.environment.dao.impl.UserRegisterDaoImpl;

public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("用户注册");
		//获取用户名，邮箱与密码
		String uname=request.getParameter("uname");
		String uemail=request.getParameter("uemail");
		String upass=request.getParameter("upass");
		String Rupass=request.getParameter("Rupass");
		System.out.println(uname+uemail+upass+Rupass);//测试
		if(upass.equals(Rupass)){
			System.out.println("ok");
			UserRegisterDaoImpl dao = new UserRegisterDaoImpl();
			//注册
			if(dao.AddRegUser(uname, uemail, upass)){
				System.out.println("注册成功");
				response.sendRedirect("InfoPage.jsp");
			}else{
				System.out.println("错误");
				response.sendRedirect("register.jsp");
			}
		}else{
			response.sendRedirect("register.jsp");
		}
	}

}
