package Tem.Green.Junk.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;


import Tem.Green.Junk.dao.IUserDao;
import Tem.Green.Junk.db.DB;
import Tem.Green.Junk.po.UserInfo;

public class UserDaoImpl implements IUserDao {
	//当前类是用于处理表中所有的业务，因此每次都需要连接
	private DB db;
	//创建构造方法，初始化DB对象
	public UserDaoImpl() {
		this.db=new DB();
	}
	@Override
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

	@Override
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
