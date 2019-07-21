package team.environment.dao;

import java.util.ArrayList;

import team.environment.po.Address;

public interface IAddressDao {
	public ArrayList<Address> getADfromDB(int userid);
	public Address queryAddressOneLine(int number);
}
