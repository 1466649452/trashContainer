<<<<<<< HEAD
package team.environment.dao;

import java.util.ArrayList;

import team.environment.trash.po.Address;

public interface IAddressDao {
	public ArrayList<Address> queryAddress(int userid);
	public Address queryAddressOneLine(int number);
=======
package Tem.Green.Junk.dao;

import Tem.Green.Junk.po.Address;
import Tem.Green.Junk.po.TryCity;

public interface IAddressDao {
	public Address getADfromDB(String userid);
	public boolean addAddress(int userid, int number, String province, String district, TryCity city, String detail,String phonenumber);
>>>>>>> d7369cb6bc6346e25b60e0e8a79fa554afa36caa
}
