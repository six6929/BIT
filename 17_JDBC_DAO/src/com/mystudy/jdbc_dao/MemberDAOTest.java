package com.mystudy.jdbc_dao;

public class MemberDAOTest {

	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
		MemberVO vo1 = new MemberVO("hong", "홍길동", "1234", null, null);
		MemberVO vo2 = new MemberVO("hong1", "홍길동", "1234", null, null);
		MemberVO vo3 = new MemberVO("Shin", "신원호", "1234", "010-3516-6929", "서울시 성북구");
		
		System.out.println("--- dao.selectAll 테스트 ---");
		dao.selectAll();
		
		System.out.println();
		System.out.println("--- dao.selectOne(id) 테스트 ---");
		dao.selectOne("hong");
		
		System.out.println();
		System.out.println("--- dao.selectOne(vo) 테스트 ---");
		dao.selectOne(vo1);
		dao.selectOne(vo2);
		
		System.out.println();
		System.out.println("--- dao.insertOne(vo) 테스트 ---");
//		dao.insertOne(vo3);
		
		System.out.println("--- dao.checkIdPassword(id,password) 테스트 ---");
		dao.checkIdPassword("Shin", "1234");
	}

}

