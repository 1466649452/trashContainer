package team.environment.dao;

import java.util.ArrayList;

import team.environment.po.TrashInfo;

public interface ITrashDao {
	public ArrayList<TrashInfo> querytrash();//��ѯ����������Ϣ
	public ArrayList<TrashInfo> queryOne(String trashname);//��ѯһ����������Ϣ
	public ArrayList<TrashInfo> queryOneClassTrash(int trashclass);//���ݷ����ѯ��ǰ������������
}
