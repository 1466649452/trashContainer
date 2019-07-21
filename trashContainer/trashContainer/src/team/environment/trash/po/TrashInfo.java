package team.environment.trash.po;

public class TrashInfo {
	private int trashid;
	private String trashname;
	private String trashclass;
	private TryCity classcity;
	
	public TrashInfo() {
		
	}

	public TrashInfo(int trashid, String trashname, String trashclass, TryCity classcity) {
		super();
		this.trashid = trashid;
		this.trashname = trashname;
		this.trashclass = trashclass;
		this.classcity = classcity;
	}

	public int getTrashid() {
		return trashid;
	}

	public void setTrashid(int trashid) {
		this.trashid = trashid;
	}

	public String getTrashname() {
		return trashname;
	}

	public void setTrashname(String trashname) {
		this.trashname = trashname;
	}

	public String getTrashclass() {
		return trashclass;
	}

	public void setTrashclass(String trashclass) {
		this.trashclass = trashclass;
	}

	public TryCity getClasscity() {
		return classcity;
	}

	public void setClasscity(TryCity classcity) {
		this.classcity = classcity;
	}

	
	
	

}
