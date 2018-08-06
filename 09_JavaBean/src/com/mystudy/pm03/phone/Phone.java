package com.mystudy.pm03.phone;

public class Phone extends Object {
	//부호로 접근 제한자 표시
	//+ : public, # : protected, - :private, (default)
	
	//-type : String
	//-phoneNo : String
	
	private String type;
	private String phoneNo;

	public Phone() {
		
	}
	//생성자(phoneNo) : type값 "Phone 타입" 입력처리
	public Phone(String phoneNo) {
		super();
		this.phoneNo = phoneNo;
		type = "Phone 타입";
	}

	//생성자(type, phoneNo)
	
	public Phone(String type, String phoneNo) {
		super(); //()는 생성자 호출;
		this.type = type;
		this.phoneNo = phoneNo;
	}

	//getType
	
	public String getType() {
		return type;
	}

	//getPhoneNo
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	//call() : "전화걸기" 화면출력
	
	public void call() {
		System.out.println(">> 전화걸기");
	}
	//receiveCall() : ">>전화받기" 화면출력
	
	public void receiveCall() {
		System.out.println(">> 전화받기");
	}
	
	//view() : toString() 호출

	public void view() {
		System.out.println(toString());
	}
	
	//toString() : 이클립스에서 자동생성
	
	@Override
	public String toString() {
		return "Phone [type=" + type + ", phoneNo=" + phoneNo + "]";
	}
	
}
