package com.mystudy.project_login;

public class StudentVO {
	
	private String id;
	private String name;
	private int pw;
	private String phone;
	private String mail;
	private int age;
	private String gender;
	private String lecture;
	String days;
	String inTime;
	String outTime;
	int studyTime;
	int lectureTime;
	String payment;
	int rate;
	private int checkdate;
		
	public StudentVO(String id, String name, int pw, String phone, String mail, int age, String gender, String lecture) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.phone = phone;
		this.mail = mail;
		this.age = age;
		this.gender = gender;
		this.lecture = lecture;
		}

	
	public StudentVO(String id ,String name,String days, String inTime, String outTime, int studyTime, int rate, String payment) {
		super();
		this.id = id;
		this.name = name;
		this.days = days;
		this.inTime = inTime;
		this.outTime = outTime;
		this.studyTime = studyTime;
		this.rate = rate;
		this.payment = payment;
		
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
		return lecture;
	}
	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

	@Override
	public String toString() {
		return "ID : " + id  + "\n" +  " �̸� : " + name + "\n" + " �н����� : " + pw + "\n" + " ��ȭ��ȣ : " + phone + "\n" + " ���� :" + mail + "\n" + " ���� : " + age + "\n" + " ���� : " + gender + "\n" + " �Ʒð��� : " + lecture + "";
	}
	
	
	public String stringForAtt() {
		return "ID : " + id + "\n" + "�̸� : " + name + "\n" + "���� : " + days + "\n" + "�Խǽð� : " + inTime + "\n" + 
				"��ǽð� : " + outTime + "\n" + "�����ð�(��) : " + studyTime + "\n" + "�⼮�� : " + rate + "\n" + "�������ް��ɿ��� : " + payment;
	
	}
}