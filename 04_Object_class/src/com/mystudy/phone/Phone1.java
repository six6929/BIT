package com.mystudy.phone;

//접근 제한자 : public, protected, (default), private
//package를 사용하게 되면 같은 패키지 안에서만 사용할 수 있다.
//클래스 : public, (default)
//필드, 메서드 : 4가지의 형태[public, protected(상속관계가 있는 것, 다른 패키지에 있지만 상속을 받았으면 사용할 수 있다), (default), private]를 다 사용할 수 있다.
//생성자 : 클래스와 같은 범위의 제한자 사용

class Phone1 {
	//필드선언
	String name; // String은 참조형 : null 초기화
	String type;
	int hsize; // int : 0 초기화
	int vsize;
	boolean hasLCD;
	
	
	//생성자 선언
	//생성자 선언이 되어 있지 않으면 아무 파라미터를 받지 않는 기본값이 생성됨.
	
	//생성자에 매개변수를 넣으면 Main에 객체생성할때 파라미터값을 넣어줘야한다.
	Phone1() {
		super();//기본생성자 안에 super();가 생략되어 있다고 봐야함.
		//부모클래스의 기본 생성자 호출
		//super : 부모클래스, 부모클래스의 기본 생성자
	} //기본생성자를 만들어줘야 메인메서드에서 파라미터값을 넣지 않는 객체생성이 가능
	
	Phone1(String name, String type) {
		this.name = name; // this : 현재 객체(instance)
		this.type = type;
	} //전역변수명과 지역변수명이 같을 때, 전역변수 앞에 this. 를 붙여서 구분해줌
	// static 앞에는 this.를 붙일 수 없음
	// this - 현재 객체를 의미
	
	
	Phone1(String name, String type, boolean hasLCD) {
		this.name = name; // this : 현재 객체(instance)
		this.type = type;
		this.hasLCD = hasLCD;
	}
	//메소드 선언
	void view() {
		System.out.println("---전화기 정보---");
		System.out.println("모델명 : " + name);
		System.out.println("타입 : " + type);
		System.out.println("가로크기 : " + hsize);
		System.out.println("세로크기 : " + vsize);
		System.out.println("LCD유무 : " + hasLCD);
	}
	
	void call() {
		System.out.println(">>> 전화걸기");
	}
	
	void receiveCall() {
		System.out.println(">>> 전화받기");
	}
	
	void sendSms(String msg) {
		System.out.println("[메시지전송]" + msg);
	}
	
	String receiveSms(String msg) {
		System.out.println("[메시지수신]" + msg);
		return msg;
	}

}
