package Tem.Green.Junk.dao;

import Tem.Green.Junk.po.UserInfo;

public interface IUserRegisterDao {
	public boolean AddRegUser(String uname, String uemail, String upass);
}
