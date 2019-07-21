package team.environment.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//��ǰ�����ã������Զ����ӣ�������κα��CRUD ͨ�����õ�ǰ��ķ���������sql����
public class DB {
	private Connection conn;

	//�ڹ��췽���У��������
	public DB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/trashbase";
			this.conn = DriverManager.getConnection(url,"root","1");
			//System.out.println(this.conn.isClosed());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//ִ����ɾ��
	public int update(String sql){
		System.out.println("sql: "+sql);
		try {
			Statement stmt = this.conn.createStatement();
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;	
	}
	
	//ִ�в�ѯ���
	public ResultSet query(String sql){
		System.out.println("sql: "+sql);
		try {
			Statement stmt = this.conn.createStatement();
			return stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
