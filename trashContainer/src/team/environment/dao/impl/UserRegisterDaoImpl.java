package team.environment.dao.impl;

import team.environment.dao.IUserRegisterDao;
import team.environment.db.DB;

public class UserRegisterDaoImpl implements IUserRegisterDao {
	//当前类是用于处理表中所有的业务，因此每次都需要连接
	private DB db;
	//创建构造方法，初始化DB对象
	public UserRegisterDaoImpl() {
		this.db=new DB();
	}
	public boolean AddRegUser(String uname, String uemail, String upass) {
		String sql = "insert into userinfo values(null,'"+uname+"','"+upass+"','"+uemail+"','unkonw',1,0)";
		if(db.update(sql)==1){
			System.out.println("2ok");
			return true;
		}
		return false;
	}
}
