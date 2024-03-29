package team.environment.po;

public class OrderTable {
	private int orderid;
	private String newordertime;
	private String payordertime;
	private String doneordertime;
	private int orderstate;
	private UserInfo userid;
	private double price;
	private int addressnum;
	private String yuyue;
	

	public OrderTable() {
		
	}


	public OrderTable(int orderid, String newordertime, String payordertime, String doneordertime, int orderstate,
			UserInfo userid, double price, int addressnum, String yuyue) {
		super();
		this.orderid = orderid;
		this.newordertime = newordertime;
		this.payordertime = payordertime;
		this.doneordertime = doneordertime;
		this.orderstate = orderstate;
		this.userid = userid;
		this.price = price;
		this.addressnum = addressnum;
		this.yuyue = yuyue;
	}


	public int getOrderid() {
		return orderid;
	}


	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}


	public String getNewordertime() {
		return newordertime;
	}


	public void setNewordertime(String newordertime) {
		this.newordertime = newordertime;
	}


	public String getPayordertime() {
		return payordertime;
	}


	public void setPayordertime(String payordertime) {
		this.payordertime = payordertime;
	}


	public String getDoneordertime() {
		return doneordertime;
	}


	public void setDoneordertime(String doneordertime) {
		this.doneordertime = doneordertime;
	}


	public int getOrderstate() {
		return orderstate;
	}


	public void setOrderstate(int orderstate) {
		this.orderstate = orderstate;
	}


	public UserInfo getUserid() {
		return userid;
	}


	public void setUserid(UserInfo userid) {
		this.userid = userid;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getAddressnum() {
		return addressnum;
	}


	public void setAddressnum(int addressnum) {
		this.addressnum = addressnum;
	}


	public String getYuyue() {
		return yuyue;
	}


	public void setYuyue(String yuyue) {
		this.yuyue = yuyue;
	}

	
}
