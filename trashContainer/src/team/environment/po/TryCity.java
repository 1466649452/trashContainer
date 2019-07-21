package Tem.Green.Junk.po;

public class TryCity {
	private int cityid;
	private String provincename;
	private String cityname;

	public TryCity() {
		
	}
	public TryCity(String provincename,String cityname) {
		this.provincename=provincename;
		this.cityname=cityname;
	}

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getProvincename() {
		return provincename;
	}

	public void setProvincename(String provincename) {
		this.provincename = provincename;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
}
