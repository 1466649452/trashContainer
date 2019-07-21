package team.environment.dao;

import team.environment.po.UserInfo;

public interface IUserDao {
	public boolean loginUser(String uemail, String upass);
	public boolean loginUser(UserInfo user);
	public UserInfo getInfo(String uemail);
	public String getuname(int userid);
}