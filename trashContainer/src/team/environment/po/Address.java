package Tem.Green.Junk.po;


//外键使用对象来处理更好。此处urserid为外键，故需要使用userinfo.getUserid()来获取
public class Address {
	private UserInfo userid;
	private int number;
	private String province;
	private String district;
	private TryCity city;
	private String detail;
	private String phonenumber;

	public Address() {
		
	}

	public Address(UserInfo userid, int number, String province, String district, TryCity city, String detail,
			String phonenumber) {
		super();
		this.userid = userid;
		this.number = number;
		this.province = province;
		this.district = district;
		this.city = city;
		this.detail = detail;
		this.phonenumber = phonenumber;
	}

	public UserInfo getUserid() {
		return userid;
	}

	public void setUserid(UserInfo userid) {
		this.userid = userid;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public TryCity getCity() {
		return city;
	}

	public void setCity(TryCity city) {
		this.city = city;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	
	
}
