package team.environment.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import team.environment.dao.ICitytrashclassDao;
import team.environment.db.DB;
import team.environment.trash.po.Citytrashclass;
import team.environment.trash.po.TrashInfo;
import team.environment.trash.po.TryCity;

public class CitytrashClassDaoImpl implements ICitytrashclassDao{
	private DB db;
	
	public CitytrashClassDaoImpl() {
		this.db=new DB();
	}
	
	
	public ArrayList<Citytrashclass> queryall() {
		//上海为默认值，待地区建立之后从网页session表中获取用户地址
		String sql="select * from citytrashclass where cityname='上海'";
		
		ResultSet res=db.query(sql);
		ArrayList<Citytrashclass> arr=new ArrayList<Citytrashclass>();
		
		try {
			while(res.next()) {
				
				TryCity trycity=new TryCity();
				trycity.setCityname(res.getString(2));
				Citytrashclass ct=new Citytrashclass(res.getInt(1),res.getString(3),trycity,res.getString(4));
				
				arr.add(ct);
			}
			return arr;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
