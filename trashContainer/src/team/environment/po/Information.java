package team.environment.po;

public class Information {
	private int newsid;
	private ClassforNews newsclass;
	private String newstitle;
	private String newsauthor;
	private String newstime;
	private String newsabstract;
	private String newstext;
	private String newscover;

	//¹¹ÔìÆ÷
	public Information() {
		
	}

	public Information(int newsid, ClassforNews newsclass, String newstitle, String newsauthor, String newstime,
			String newsabstract, String newstext, String newscover) {
		super();
		this.newsid = newsid;
		this.newsclass = newsclass;
		this.newstitle = newstitle;
		this.newsauthor = newsauthor;
		this.newstime = newstime;
		this.newsabstract = newsabstract;
		this.newstext = newstext;
		this.newscover = newscover;
	}

	public int getNewsid() {
		return newsid;
	}

	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}

	public ClassforNews getNewsclass() {
		return newsclass;
	}

	public void setNewsclass(ClassforNews newsclass) {
		this.newsclass = newsclass;
	}

	public String getNewstitle() {
		return newstitle;
	}

	public void setNewstitle(String newstitle) {
		this.newstitle = newstitle;
	}

	public String getNewsauthor() {
		return newsauthor;
	}

	public void setNewsauthor(String newsauthor) {
		this.newsauthor = newsauthor;
	}

	public String getNewstime() {
		return newstime;
	}

	public void setNewstime(String newstime) {
		this.newstime = newstime;
	}

	public String getNewsabstract() {
		return newsabstract;
	}

	public void setNewsabstract(String newsabstract) {
		this.newsabstract = newsabstract;
	}

	public String getNewstext() {
		return newstext;
	}

	public void setNewstext(String newstext) {
		this.newstext = newstext;
	}

	public String getNewscover() {
		return newscover;
	}

	public void setNewscover(String newscover) {
		this.newscover = newscover;
	}
	
	
	
}
