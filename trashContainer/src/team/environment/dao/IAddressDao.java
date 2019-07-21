package team.environment.dao;

import java.util.ArrayList;

import team.environment.trash.po.Address;

public interface IAddressDao {
	public ArrayList<Address> queryAddress(int userid);
	public Address queryAddressOneLine(int number);
}
