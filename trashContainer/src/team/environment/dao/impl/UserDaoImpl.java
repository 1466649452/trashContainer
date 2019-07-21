package team.environment.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import team.environment.dao.IUserDao;
import team.environment.db.DB;
import team.environment.po.UserInfo;
public class UserDaoImpl implements IUserDao {
	//当前类是用于处理表中所有的业务，因此每次都需要连接
	private DB db;
	//创建构造方法，初始化DB对象
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
	public UserInfo getInfo(String uemail) {
		UserInfo User = new UserInfo();
		String sql="select * from userinfo where uemail='"+uemail+"'";
		try {
			ResultSet rs = db.query(sql);
			while(rs.next()){
				User.setUserid(rs.getInt("userid"));
				User.setUname(rs.getString("uname"));
				User.setUemail(uemail);
				User.setSex(rs.getString("sex"));
				User.setState(rs.getInt("state"));
				User.setRepoints(rs.getDouble("repoints"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return User;
	}
	public String getuname(int userid) {
		String uname = null;
		String sql="select * from userinfo where userid='"+userid+"'";
		try {
			ResultSet rs = db.query(sql);
			while(rs.next()){
				uname = rs.getString("uname");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return uname;
	}
}