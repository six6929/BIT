package com.mystudy.jdbc_dao_impl;

public class MemberImplTest {

	public static void main(String[] args) {
		MemberImpl mi = new MemberImpl();
		MemberVO vo = new MemberVO("hong", "1234", "ȫ�浿", null, null);
		MemberVO vo1 = new MemberVO("Shin", "1234", "�ſ�ȣ", "010-3516-6929" , "����� ���ϱ�");
		MemberVO vo2 = new MemberVO("Shin1", "1234", "�ſ�ȣ1", "010-3516-6929" , "����� ���ϱ� ���ϵ�");
		MemberVO vo3 = new MemberVO("Shin2", "1234", "�ſ�ȣ", "010-1234-5678", "�泲 �о��");
		
		System.out.println("--- saselectAll �׽�Ʈ ---");
		mi.selectAll();
	
		System.out.println();
		System.out.println("--- selectAll �׽�Ʈ ---");
		mi.selectOne("hong");
		
		System.out.println();
		System.out.println("--- selectAll �׽�Ʈ ---");
		System.out.println(mi.selectOne(vo));
		
		System.out.println("--- insertOne �׽�Ʈ ---");
//		mi.insertOne(vo2);
//		mi.insertOne(vo3);
		
		System.out.println("--- updateOne �׽�Ʈ ---");
		mi.updateOne(vo2);
		
		System.out.println("--- deleteOne �׽�Ʈ ---");
		mi.deleteOne(vo2);
		
		System.out.println("--- selectName �׽�Ʈ ---");
		mi.selectName("�ſ�ȣ");
		
	}
	

}
