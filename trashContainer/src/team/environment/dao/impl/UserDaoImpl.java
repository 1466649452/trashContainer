package team.environment.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import team.environment.dao.IUserDao;
import team.environment.db.DB;
import team.environment.trash.po.UserInfo;

public class UserDaoImpl implements IUserDao {
	//��ǰ�������ڴ���������е�ҵ�����ÿ�ζ���Ҫ����
	private DB db;
	//�������췽������ʼ��DB����
	public UserDaoImpl() {
		this.db=new DB();
	}
	public boolean loginUser(String uemail, String upass) {
		String sql = "select uemail from userinfo where uemail='"+uemail+"' and upass='"+upass+"'";
		ResultSet rs = db.query(sql);
		try {
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean loginUser(UserInfo user) {
		String sql="select uemail from userinfo where uemail='"+user.getUemail()+"' and upass='"+user.getUpass()+"'";
		ResultSet rs = db.query(sql);
		try {
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
