package com.mystudy.am03_interface;

//인터페이스(추상체)
public interface I_Phone {
	//추상메소드(구현되지 않은 메소드) - 정의만 되어 있는 것
	void view(); 			//0. 전화정보 확인
	void call(); 			//1. 전화걸기
	void receiveCall(); 	//2.전화받기
	void sendMsg(); 		//3.메시지 보내기
	void receiveMsg(); 		//4.메시지 받기
}
