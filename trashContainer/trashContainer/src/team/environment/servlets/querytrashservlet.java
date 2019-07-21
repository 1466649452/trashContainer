package team.environment.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import team.environment.dao.impl.Trash;
import team.environment.trash.po.TrashInfo;

/**
 * Servlet implementation class querytrash
 */
public class querytrashservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("查询分类信息");
		
		request.setCharacterEncoding("utf-8");
	
		String checkword=request.getParameter("checkWord");
		
		Trash trinstance=new Trash();
		ArrayList<TrashInfo> arr=new ArrayList<TrashInfo>();
		
		arr=trinstance.querytrash(checkword);
		
		//获取session从request处
		HttpSession session=request.getSession();
		session.setAttribute("ansArr", arr);
		System.out.println(arr.get(0).getTrashname());
		response.sendRedirect("querytrash.jsp");
	}

}
