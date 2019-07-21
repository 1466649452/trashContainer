package team.environment.dao;

import java.util.ArrayList;

import team.environment.po.Address;

public interface IAddressDao {
	public ArrayList<Address> queryAddress(int userid);
	public Address queryAddressOneLine(int number);
}
