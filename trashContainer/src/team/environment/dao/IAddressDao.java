package Tem.Green.Junk.dao;

import Tem.Green.Junk.po.Address;
import Tem.Green.Junk.po.TryCity;

public interface IAddressDao {
	public Address getADfromDB(String userid);
	public boolean addAddress(int userid, int number, String province, String district, TryCity city, String detail,String phonenumber);
}
