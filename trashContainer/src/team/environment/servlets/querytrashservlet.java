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

/**
 * Servlet implementation class querytrash
 */
public class querytrashservlet extends HttpServlet {
	private int[] a=new int[100];//�ݹ��������ʱ����
	private ArrayList<ArrayList<Integer>> temp=new ArrayList<ArrayList<Integer>>();//�ݹ�������list
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("��ѯ������Ϣ");
		
		request.setCharacterEncoding("utf-8");
	
		String checkword=request.getParameter("checkWord");
		
		TrashDaoImpl tar=new TrashDaoImpl();
		
		ArrayList<TrashInfo> arr=new ArrayList<TrashInfo>();
		
		
		//��������������н��
		for(int r=checkword.length();r>0;r--) {
			this.a[0]=r;
			combination(checkword.length(), r);
		}
		
		//��������
		/*
		for(int i=0;i<temp.size();i++) {
			for(int j=0;j<temp.get(i).size();j++) {
				System.out.print(temp.get(i).get(j));
			}
			System.out.println("");
		}
		*/
		
		
		//�˲���Ϊͨ������sql��ѯ���Ĳ����ʵ�ֽ��������
		char[] tempcheck=checkword.toCharArray();
		String word="";
		for(int i=0,r=checkword.length();i<temp.size();i++) {
			
			System.out.println("i="+i+"  "+checkword.length()+"   r="+r+"temp0size"+temp.get(i).size());
			//��ʼrΪ3����һ�����3�����롣�������
			if(temp.get(i).size()==r) {
				word+="trashname like \'%";
				for(int j=temp.get(i).size()-1;j>=0;j--) {
					word=word+tempcheck[temp.get(i).get(j)-1];
				}
				word=word+"%\' OR ";
			}else {
				r--;
				i--;
				//����word��������ѯ���
				System.out.println("word length:"+(word.length()-4));
				
				word=word.substring(0,word.length()-4);
				System.out.println(word+"\n\n");
				
				//ʹ��sql�����в�ѯ
				arr=tar.queryOne(word);
				if(arr.size()!=0) {
					break;
				}
				word="";
			}
			if(i==temp.size()-1) {
				//����word��������ѯ���
				word=word.substring(0,word.length()-4);
				
				System.out.println(word+"\n\n");
				arr=tar.queryOne(word);
				if(arr!=null) {
					break;
				}
				
				word="";
			}
			
		}
		
		//���³�ʼ���洢�ռ�
		this.a=new int[100];
		this.temp=new ArrayList<ArrayList<Integer>>();
		
		//��ȡsession��request��
		HttpSession session=request.getSession();
		
		session.setAttribute("ansArr", arr);
		response.sendRedirect("querytrash.jsp");
	}

	//��������nλ����rΪһ���������Ͻ��
	public void combination(int n, int r) {
		for (int i = n; i >= r; i--) {
			a[r] = i;
			if (r > 1) combination(i-1, r-1);
			else {
				ArrayList<Integer> mm=new ArrayList<Integer>();
				for (int j = this.a[0]; j > 0; j--) {	
					mm.add(a[j]);
				}
				this.temp.add(mm);
			}
		}
	}
}
