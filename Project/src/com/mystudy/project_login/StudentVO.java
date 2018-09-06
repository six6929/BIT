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
		return "ID : " + id  + "\n" +  " 이름 : " + name + "\n" + " 패스워드 : " + pw + "\n" + " 전화번호 : " + phone + "\n" + " 메일 :" + mail + "\n" + " 나이 : " + age + "\n" + " 성별 : " + gender + "\n" + " 훈련과정 : " + lecture + "";
	}
		
}
