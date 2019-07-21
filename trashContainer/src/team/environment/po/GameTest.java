package Tem.Green.Junk.po;

public class GameTest {
	private int quesid;
	private String quescontext;
	private String ansone;
	private String anstwo;
	private String ansthree;
	private String ansfour;
	private String rightans;
	
	//构造器
	public GameTest(String quescontext,String ansone,String anstwo,String ansthree,String ansfour,String rightans) {
	this.quescontext=quescontext;
	this.ansone=ansone;
	this.anstwo=anstwo;
	this.ansthree=ansthree;
	this.ansfour=ansfour;
	this.rightans=rightans;
	}
	public GameTest() {
		
	}

	//基础属性
	public int getQuesid() {
		return quesid;
	}

	public void setQuesid(int quesid) {
		this.quesid = quesid;
	}

	public String getQuescontext() {
		return quescontext;
	}

	public void setQuescontext(String quescontext) {
		this.quescontext = quescontext;
	}

	public String getAnsone() {
		return ansone;
	}

	public void setAnsone(String ansone) {
		this.ansone = ansone;
	}

	public String getAnstwo() {
		return anstwo;
	}

	public void setAnstwo(String anstwo) {
		this.anstwo = anstwo;
	}

	public String getAnsthree() {
		return ansthree;
	}

	public void setAnsthree(String ansthree) {
		this.ansthree = ansthree;
	}

	public String getAnsfour() {
		return ansfour;
	}

	public void setAnsfour(String ansfour) {
		this.ansfour = ansfour;
	}

	public String getRightans() {
		return rightans;
	}

	public void setRightans(String rightans) {
		this.rightans = rightans;
	}
	
}
