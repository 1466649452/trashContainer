package team.environment.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import team.environment.dao.ITrashDao;
import team.environment.db.DB;
import team.environment.trash.po.TrashInfo;
import team.environment.trash.po.TryCity;

public class TrashDaoImpl implements ITrashDao{
	
	private DB db;
	
	public TrashDaoImpl() {
		this.db=new DB();
	}
	//��ѯĳ����ĳ�ַ�������г�������
	public ArrayList<TrashInfo> queryOneClassTrash(int trashclass){
		String sql="select * from trashinfo where trashclass="+trashclass+"";
		
		ResultSet res=db.query(sql);
		ArrayList<TrashInfo> arr=new ArrayList<TrashInfo>();
		
		try {
			while(res.next()) {
				//�˴�city����ֻ������������Ӧ��ȥtrycity����ȥ��ѯ��������Ϣ��
				TryCity city=new TryCity();
				city.setCityname(res.getString(4));

				TrashInfo ti=new TrashInfo(res.getInt(1), res.getString(2), res.getString(3), city);
				
				arr.add(ti);
			}
			return arr;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public ArrayList<TrashInfo> querytrash() {
		//��д��ѯ���
		String sql="select * from trashinfo";
		
		ResultSet res=db.query(sql);
		ArrayList<TrashInfo> arr=new ArrayList<TrashInfo>();
		
		try {
			while(res.next()) {
				TrashInfo ti=new TrashInfo();
				TryCity city=new TryCity();
				
				//�˴�city����ֻ������������Ӧ��ȥtrycity����ȥ��ѯ��������Ϣ��
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

	public ArrayList<TrashInfo> queryOne(String trashname) {
		String sql="select distinct * from trashinfo where "+trashname+"";
		
		ResultSet res=db.query(sql);
		if(res==null) {
			return null;
		}
		ArrayList<TrashInfo> arr=new ArrayList<TrashInfo>();
		try {
			while(res.next()) {
				TrashInfo ti=new TrashInfo();
				TryCity city=new TryCity();
				
				//�˴�city����ֻ������������Ӧ��ȥtrycity����ȥ��ѯ��������Ϣ��
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
