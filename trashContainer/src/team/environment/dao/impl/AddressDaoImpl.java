<<<<<<< HEAD
package team.environment.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import team.environment.dao.IAddressDao;
import team.environment.db.DB;
import team.environment.trash.po.Address;
import team.environment.trash.po.TryCity;
import team.environment.trash.po.UserInfo;

public class AddressDaoImpl implements IAddressDao{

	private DB db;
	
	public ArrayList<Address> queryAddress(int userid) {
		
		
		return null;
	}

	public Address queryAddressOneLine(int number) {
		String sql="select * from address where number="+number+"";
		ResultSet res;
		try{
			res=db.query(sql);
		}catch(NullPointerException e) {
			return null;
		}
		try {
			Address address=null;
			if(res.next()) {
				UserInfo userinfo=new UserInfo();
				userinfo.setUserid(res.getInt(1));
				TryCity trycity=new TryCity();
				trycity.setCityname(res.getString(5));
				
				
				address=new Address(userinfo, res.getString(2), res.getInt(3), res.getString(4),trycity, res.getString(6),res.getString(7));
			}
			return address;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
=======
package Tem.Green.Junk.dao.impl;

import Tem.Green.Junk.dao.IAddressDao;
import Tem.Green.Junk.db.DB;
import Tem.Green.Junk.po.Address;
import Tem.Green.Junk.po.TryCity;

public class AddressDaoImpl implements IAddressDao {
	//当前类是用于处理表中所有的业务，因此每次都需要连接
	private DB db;
	//创建构造方法，初始化DB对象
	public AddressDaoImpl() {
		this.db=new DB();
	}
	@Override
	public Address getADfromDB(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addAddress(int userid, int number, String province, String district, TryCity city, String detail,
			String phonenumber) {
		// TODO Auto-generated method stub
		return false;
>>>>>>> d7369cb6bc6346e25b60e0e8a79fa554afa36caa
	}

}
