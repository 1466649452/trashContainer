package team.environment.dao;

import java.util.ArrayList;

import team.environment.po.Citytrashclass;

public interface ICitytrashclassDao {
	public ArrayList<Citytrashclass> queryall();
	public Citytrashclass queryOneLine(int id);//使用id查询单条记录
	
}
