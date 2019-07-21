//�û���ʾ���û������Ӧ�����ǣ�չʾ���еĳ�������

package team.environment.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import team.environment.dao.impl.TrashDaoImpl;
import team.environment.trash.po.TrashInfo;

public class ShowTrashListServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("��ѯ��ǰ�������������");
		int trashclass=Integer.parseInt(request.getParameter("junkclass_classid"));
		
		ArrayList<TrashInfo> arr=new ArrayList<TrashInfo>();
		
		arr=new TrashDaoImpl().queryOneClassTrash(trashclass);
		
		HttpSession session=request.getSession();
		
		session.setAttribute("detailclass", arr);
		
		response.sendRedirect("querytrash.jsp");
		
	}

}
