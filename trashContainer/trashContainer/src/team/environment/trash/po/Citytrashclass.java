package team.environment.trash.po;


//外键使用对象来处理
public class Citytrashclass {
	private int classid;
	private String classname;
	private TryCity cityname;
	
	public Citytrashclass() {
		
	}

	public Citytrashclass(int classid, String classname, TryCity cityname) {
		super();
		this.classid = classid;
		this.classname = classname;
		this.cityname = cityname;
	}

	public int getClassid() {
		return classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public TryCity getCityname() {
		return cityname;
	}

	public void setCityname(TryCity cityname) {
		this.cityname = cityname;
	}
	
	
	
}
