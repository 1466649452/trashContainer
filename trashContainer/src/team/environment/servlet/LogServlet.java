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
		System.out.println("�û���¼");
		//doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("�û���¼");
		//��ȡ����������
		String uemail=request.getParameter("uemail");
		String upass=request.getParameter("upass");
		String admin = request.getParameter("admin");//��ȡcheckbox�Ƿ�ѡ

		
		if("1".equals(admin)){//��ѡΪ����Ա״̬����Ϊ��ͨ״̬
			System.out.println("admin");
		}else{
			System.out.println("User");
			UserDaoImpl dao = new UserDaoImpl();
			
			//��ʽһ��
			if(dao.loginUser(uemail, upass)){
				HttpSession session = request.getSession();
				//����һ������
				session.setAttribute("User",dao.getInfo(uemail));
				session.setAttribute("Address",dao.getInfo(uemail));
				
				System.out.println("��¼�ɹ�");
				response.sendRedirect("InfoPage.jsp");
			}else{
				System.out.println("������������");
				response.sendRedirect("LoginPage.jsp");
			}
			
		}
	}
}
