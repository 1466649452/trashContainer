package Tem.Green.Junk.dao;

import Tem.Green.Junk.po.UserInfo;

public interface IUserDao {
	public boolean loginUser(String uemail, String upass);
	public boolean loginUser(UserInfo user);
	public UserInfo getInfo(String uemail);
}
