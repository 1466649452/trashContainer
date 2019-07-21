package Tem.Green.Junk.dao.impl;

import Tem.Green.Junk.dao.IAddressDao;
import Tem.Green.Junk.db.DB;
import Tem.Green.Junk.po.Address;
import Tem.Green.Junk.po.TryCity;

public class AddressDaoImpl implements IAddressDao {
	//当前类是用于处理表中所有的业务，因此每次都需要连接
	private DB db;
	//创建构造方法，初始化DB对象
	public AddressDaoImpl() {
		this.db=new DB();
	}
	@Override
	public Address getADfromDB(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addAddress(int userid, int number, String province, String district, TryCity city, String detail,
			String phonenumber) {
		// TODO Auto-generated method stub
		return false;
	}

}
