package com.mystudy.jdbc_dao_impl;

public class MemberImplTest {

	public static void main(String[] args) {
		MemberImpl mi = new MemberImpl();
		MemberVO vo = new MemberVO("hong", "1234", "홍길동", null, null);
		MemberVO vo1 = new MemberVO("Shin", "1234", "신원호", "010-3516-6929" , "서울시 성북구");
		MemberVO vo2 = new MemberVO("Shin1", "1234", "신원호1", "010-3516-6929" , "서울시 성북구 종암동");
		MemberVO vo3 = new MemberVO("Shin2", "1234", "신원호", "010-1234-5678", "경남 밀양시");
		
		System.out.println("--- saselectAll 테스트 ---");
		mi.selectAll();
	
		System.out.println();
		System.out.println("--- selectAll 테스트 ---");
		mi.selectOne("hong");
		
		System.out.println();
		System.out.println("--- selectAll 테스트 ---");
		System.out.println(mi.selectOne(vo));
		
		System.out.println("--- insertOne 테스트 ---");
//		mi.insertOne(vo2);
//		mi.insertOne(vo3);
		
		System.out.println("--- updateOne 테스트 ---");
		mi.updateOne(vo2);
		
		System.out.println("--- deleteOne 테스트 ---");
		mi.deleteOne(vo2);
		
		System.out.println("--- selectName 테스트 ---");
		mi.selectName("신원호");
		
	}
	

}
