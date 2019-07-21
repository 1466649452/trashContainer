package team.environment.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import team.environment.dao.ITrash;
import team.environment.db.DB;
import team.environment.trash.po.TrashInfo;
import team.environment.trash.po.TryCity;

public class Trash implements ITrash{
	
	private DB db;
	
	public Trash() {
		this.db=new DB();
	}

	public ArrayList<TrashInfo> querytrash(String trashname) {
		//书写查询语句
		String sql="select * from trashinfo where trashname='"+trashname+"'";
		
		ResultSet res=db.query(sql);
		ArrayList<TrashInfo> arr=new ArrayList<TrashInfo>();
		
		try {
			while(res.next()) {
				TrashInfo ti=new TrashInfo();
				TryCity city=new TryCity();
				
				//此处city内容只包含城市名，应该去trycity表中去查询来完善信息。
				city.setCityname(res.getString(4));
				ti.setTrashid(res.getInt(1));
				ti.setTrashname(res.getString(2));
				ti.setTrashclass(res.getString(3));
				ti.setClasscity(city);
				arr.add(ti);
			}
			return arr;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
