package team.environment.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import team.environment.dao.IOrderTableDao;
import team.environment.db.DB;
import team.environment.po.OrderTable;
import team.environment.po.UserInfo;

public class OrderTableDaoImpl implements IOrderTableDao{
	private DB db;
	
	public OrderTableDaoImpl() {
		this.db=new DB();
	}
	
	public boolean insertOrderOneLine(String[] string) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		// new Date()为获取当前系统时间
		System.out.println(df.format(new Date()));
		//string还需要保存用户id，待session完成后获取
		String sql="INSERT into ordertable VALUES (null,'"+df.format(new Date())+"',null,null,1,1,20,'"+string[0]+"','"+string[1]+"')";
		
		int n=db.update(sql);
		if(n==1) {
			return true;
		}
		return false;
	}
	
	public OrderTable newestOrder(int useri) {
		String sql="select * from ordertable where userid="+useri+" order by newordertime DESC";
		
		ResultSet res;
		try{
			res=db.query(sql);
		}catch(NullPointerException e) {
			return null;
		}
		try {
			OrderTable ordertable=null;
			if(res.next()) {
				UserInfo userid=new UserInfo();
				userid.setUserid(res.getInt(6));
				
				ordertable=new OrderTable(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getInt(5),
						userid,res.getDouble(7), res.getInt(8),res.getString(9));
			}
			return ordertable;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(NullPointerException e) {
			return null;
		}
		return null;
	}
	
	//更新订单状态
	public boolean updateOrderState(int orderid,int m) {
		String sql="UPDATE ordertable set orderstate="+m+" where orderid="+orderid+"";
		
		int res=db.update(sql);
		
		if(res==1) {
			return true;
		}else {
			return false;
		}
	}
	

}
