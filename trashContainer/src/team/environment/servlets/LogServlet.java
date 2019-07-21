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
		System.out.println("�û���¼");
		//��ȡ����������
		String uemail=request.getParameter("uemail");
		String upass=request.getParameter("upass");
		//System.out.println(uemail+upass);//����
		
		UserDaoImpl dao = new UserDaoImpl();
		
		//��ʽһ��
		if(dao.loginUser(uemail, upass)){
			System.out.println("��¼�ɹ�");
			response.sendRedirect("InfoPage.jsp");
		}else{
			System.out.println("������������");
			response.sendRedirect("LoginPage.jsp");
		}
	}
}
