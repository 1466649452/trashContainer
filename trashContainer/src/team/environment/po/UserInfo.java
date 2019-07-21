package Tem.Green.Junk.po;

public class UserInfo {
	private int userid; 
	private String uname;
	private String upass;
	private String uemail;
	private String sex;
	private int state;
	private double repoints;
	
	public UserInfo() {
		
	}
	public UserInfo(String uname,String upass,String sex2,int state) {
		this.uname=uname;
		this.upass=upass;
		this.sex=sex2;
		this.state=state;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public double getRepoints() {
		return repoints;
	}
	public void setRepoints(double repoints) {
		this.repoints = repoints;
	}

	
}
