package Tem.Green.Junk.dao.impl;

import Tem.Green.Junk.dao.IAddressDao;
import Tem.Green.Junk.db.DB;
import Tem.Green.Junk.po.Address;
import Tem.Green.Junk.po.TryCity;

public class AddressDaoImpl implements IAddressDao {
	//��ǰ�������ڴ���������е�ҵ�����ÿ�ζ���Ҫ����
	private DB db;
	//�������췽������ʼ��DB����
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
