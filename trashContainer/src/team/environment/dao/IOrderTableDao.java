package team.environment.dao;

import team.environment.po.OrderTable;

public interface IOrderTableDao {
	public boolean insertOrderOneLine(String[] string);
	public OrderTable newestOrder(int userid);//查询最新的一条订单
	public boolean updateOrderState(int orderid,int m);//更新订单状态
}
