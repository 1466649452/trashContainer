package Tem.Green.Junk.po;

public class ManagerInfo {
	private String manaid;
	private String manapass;

	public ManagerInfo() {
		
	}
	
	public ManagerInfo(String manaid,String manapass) {
		this.manaid=manaid;
		this.manapass=manapass;
	}

	public String getManaid() {
		return manaid;
	}

	public void setManaid(String manaid) {
		this.manaid = manaid;
	}

	public String getManapass() {
		return manapass;
	}

	public void setManapass(String manapass) {
		this.manapass = manapass;
	}
	
}
