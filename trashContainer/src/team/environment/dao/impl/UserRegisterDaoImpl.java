package team.environment.dao.impl;

import team.environment.dao.IUserRegisterDao;
import team.environment.db.DB;

public class UserRegisterDaoImpl implements IUserRegisterDao {
	//��ǰ�������ڴ���������е�ҵ�����ÿ�ζ���Ҫ����
	private DB db;
	//�������췽������ʼ��DB����
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
