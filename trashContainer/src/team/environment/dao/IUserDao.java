package team.environment.dao;

import team.environment.trash.po.UserInfo;

public interface IUserDao {
	public boolean loginUser(String uemail, String upass);
	public boolean loginUser(UserInfo user);
}
