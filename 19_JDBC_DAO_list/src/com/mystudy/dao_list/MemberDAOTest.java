package com.mystudy.dao_list;

import java.util.ArrayList;

public class MemberDAOTest {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = new ArrayList<>();
		MemberVO vo = new MemberVO("Shin11", "�ſ�ȣ", "1234", "010-1234-1234", "����");
		MemberVO vo1 = new MemberVO("Shin12", "�ſ�ȣ1", "1234", "010-1234-1234", "����");
		MemberVO vo2 = new MemberVO("Shin13", "�ſ�ȣ2", "1234", "010-1234-1234", "����");
		
		list.add(vo);
		list.add(vo1);
		
		dao.printDataAll();
		System.out.println();
//		dao.insertList(list);

		System.out.println("-------");
		dao.updateList(list);
		
		System.out.println("-------");
		dao.deleteList(list);
	}

}
