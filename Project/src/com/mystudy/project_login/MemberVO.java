package com.mystudy.project_login;

public class MemberVO {
	//���̺�� ������ ��Ī
	//���� ����
	private String id;
	private String name;
	private String mail;
	private String lectureName;
	private String pw;
	private int phone;
	private int age;
	
	
	
	//������ ����
	public MemberVO() {
		
	}
	
	public MemberVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	
	//get,set �ڵ�
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}


	//toString()
	
	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", pw=" + pw + "]";
	}
	
	
	
}