package team.environment.dao;

import team.environment.po.OrderTable;

public interface IOrderTableDao {
	public boolean insertOrderOneLine(String[] string);
	public OrderTable newestOrder(int userid);//��ѯ���µ�һ������
	public boolean updateOrderState(int orderid,int m);//���¶���״̬
}
