package team.environment.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import team.environment.dao.IAddressDao;
import team.environment.db.DB;
import team.environment.po.Address;
import team.environment.po.TryCity;
import team.environment.po.UserInfo;

public class AddressDaoImpl implements IAddressDao{

	private DB db;
	
	public AddressDaoImpl() {
		db=new DB();
	}
	
	public ArrayList<Address> getADfromDB(int userid) {
		ArrayList<Address> addr = new ArrayList<Address>();
		UserInfo user = new UserInfo();
		user.setUserid(userid);
		String sql="select * from address where userid="+userid+"";
		try {
			ResultSet rs = db.query(sql);
			while(rs.next()){
				TryCity city = new TryCity();
				city.setCityname(rs.getString("city"));
				Address address= new Address();
				address.setUserid(user);
				address.setAnsname(rs.getString("ansname"));
				address.setNumber(rs.getInt("number"));
				address.setPhonenumber(rs.getString("phonenumber"));
				address.setDetail(rs.getString("detail"));
				address.setProvince(rs.getString("province"));
				address.setCity(city);
				
				addr.add(address);
			}
			return addr;
		} catch (SQLException e) {
			System.out.println("addressdao");
			e.printStackTrace();
			return null;
		}
	}

	public Address queryAddressOneLine(int number) {
		String sql="select * from address where number="+number+"";
		System.out.println("sql: "+sql);
		
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
