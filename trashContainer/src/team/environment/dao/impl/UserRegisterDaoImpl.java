package Tem.Green.Junk.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import Tem.Green.Junk.dao.IUserRegisterDao;
import Tem.Green.Junk.db.DB;
import Tem.Green.Junk.po.UserInfo;

public class UserRegisterDaoImpl implements IUserRegisterDao {
	//��ǰ�������ڴ���������е�ҵ�����ÿ�ζ���Ҫ����
	private DB db;
	//�������췽������ʼ��DB����
	public UserRegisterDaoImpl() {
		this.db=new DB();
	}
	@Override
	public boolean AddRegUser(String uname, String uemail, String upass) {
		String sql = "insert into userinfo values(null,'"+uname+"','"+upass+"','"+uemail+"','unkonw',1,0)";
		if(db.update(sql)==1){
			System.out.println("2ok");
			return true;
		}
		return false;
	}
}
