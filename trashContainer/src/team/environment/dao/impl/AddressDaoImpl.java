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
	}

}
