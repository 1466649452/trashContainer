package team.environment.po;


//外键使用对象来处理
public class Citytrashclass {
	private int classid;
	private String classname;
	private TryCity cityname;
	private String color;
	
	public Citytrashclass() {
		
	}
	
	

	public Citytrashclass(int classid, String classname, TryCity cityname, String color) {
		super();
		this.classid = classid;
		this.classname = classname;
		this.cityname = cityname;
		this.color = color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
