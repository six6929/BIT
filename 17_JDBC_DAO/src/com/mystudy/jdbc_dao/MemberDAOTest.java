package com.mystudy.jdbc_dao;

public class MemberDAOTest {

	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
		MemberVO vo1 = new MemberVO("hong", "ȫ�浿", "1234", null, null);
		MemberVO vo2 = new MemberVO("hong1", "ȫ�浿", "1234", null, null);
		MemberVO vo3 = new MemberVO("Shin", "�ſ�ȣ", "1234", "010-3516-6929", "����� ���ϱ�");
		
		System.out.println("--- dao.selectAll �׽�Ʈ ---");
		dao.selectAll();
		
		System.out.println();
		System.out.println("--- dao.selectOne(id) �׽�Ʈ ---");
		dao.selectOne("hong");
		
		System.out.println();
		System.out.println("--- dao.selectOne(vo) �׽�Ʈ ---");
		dao.selectOne(vo1);
		dao.selectOne(vo2);
		
		System.out.println();
		System.out.println("--- dao.insertOne(vo) �׽�Ʈ ---");
//		dao.insertOne(vo3);
		
		System.out.println("--- dao.checkIdPassword(id,password) �׽�Ʈ ---");
		dao.checkIdPassword("Shin", "1234");
	}

}

