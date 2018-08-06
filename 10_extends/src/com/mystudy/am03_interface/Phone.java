package com.mystudy.am03_interface;

//인터페이스를 구현(implements)
//I_Phone 인터페이스를 사용해서 Phone 클래스를 구현

class Phone implements I_Phone{
	
	//필드선언-------------------------------------
	
	private String type;
	private String phoneNo;

	//생성자 생성-----------------------------------
		
//	public Phone() {}
		
	public Phone(String phoneNo) {
		super();
		this.phoneNo = phoneNo;
	}
	
	public Phone(String type, String phoneNo) {
		this.type = type;
		this.phoneNo = phoneNo;
	}
		
	
	//get, set문--------------------------------
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}

		public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
		
	//인터페이스 정의 메서드 구현----------------------------------
	
	@Override
	public void view() {
		System.out.println(super.toString());
	}

	@Override
	public void call() {
		System.out.println(">> 전화걸기");
	}

	@Override
	public void receiveCall() {
		System.out.println(">> 전화받기");
	}

	@Override
	public void sendMsg() {
		System.out.println(">> 메세지보내기");
	}

	@Override
	public void receiveMsg() {
		System.out.println(">> 메세지 받기");
	}
	
	//toString() 호출------------------------------------
	@Override
	public String toString() {
		return "Phone [type=" + type + ", phoneNo=" + phoneNo + "]";
	}

}
