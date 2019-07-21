package team.environment.dao;

import java.util.ArrayList;

import team.environment.po.TrashInfo;

public interface ITrashDao {
	public ArrayList<TrashInfo> querytrash();//查询表中所有信息
	public ArrayList<TrashInfo> queryOne(String trashname);//查询一个垃圾的信息
	public ArrayList<TrashInfo> queryOneClassTrash(int trashclass);//根据分类查询当前分类所有垃圾
}
