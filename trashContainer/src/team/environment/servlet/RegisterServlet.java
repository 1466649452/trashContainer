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
		System.out.println("�û�ע��");
		//��ȡ�û���������������
		String uname=request.getParameter("uname");
		String uemail=request.getParameter("uemail");
		String upass=request.getParameter("upass");
		String Rupass=request.getParameter("Rupass");
		System.out.println(uname+uemail+upass+Rupass);//����
		if(upass.equals(Rupass)){
			System.out.println("ok");
			UserRegisterDaoImpl dao = new UserRegisterDaoImpl();
			//ע��
			if(dao.AddRegUser(uname, uemail, upass)){
				System.out.println("ע��ɹ�");
				response.sendRedirect("InfoPage.jsp");
			}else{
				System.out.println("����");
				response.sendRedirect("register.jsp");
			}
		}else{
			response.sendRedirect("register.jsp");
		}
	}

}
