package com.mystudy.project_login;

public class ManagerVO {
	private String id;
	private String name;
	private int pw;
	private String phone;
	private String mail;
	private int age;
	private String gender;
	private String lecturename;
	String days;
	String inTime;
	String outTime;
	int studyTime;
	int startdate;
	int finishdate;

		
	
	public ManagerVO() {}
	
	public ManagerVO(String name,String days, String inTime, String outTime, int startdate, int finishdate) {
		super();
		this.name = name;
		this.days = days;
		this.inTime = inTime;
		this.outTime = outTime;
		this.startdate = startdate;
		this.finishdate = finishdate;
		
		}
	
	public ManagerVO(String lecturename ,String id, String name, int pw, String phone, String mail, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.phone = phone;
		this.mail = mail;
		this.age = age;
		this.gender = gender;
		this.lecturename = lecturename;
		}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLecture() {
		return lecturename;
	}
	public void setLecture(String lecturename) {
		this.lecturename = lecturename;
	}

	@Override
	public String toString() {
		return "\t         ID : " + id  + "\n" +  
			   "\t         �̸� : " + name + "\n" + 
			   "\t         �н����� : " + pw + "\n" + 
			   "\t         ��ȭ��ȣ : " + phone + "\n" + 
			   "\t         ���� :" + mail + "\n" + 
			   "\t         ���� : " + age + "\n" + 
			   "\t         ���� : " + gender + "\n" + 
			   "\t         �Ʒð��� : " + lecturename + "";
	}
	
	public String stringForAtt() {
		return  "\t         �̸� : " + name + "\n" + 
				"\t         ���� : " + days + "\n" + 
				"\t         �Խǽð� : " + inTime + "\n" + 
				"\t         ��ǽð� : " + outTime + "\n" + 
				"\t         ���ۿ� : " + startdate + "\n" + 
				"\t         �����¿� : " + finishdate;
	}
}