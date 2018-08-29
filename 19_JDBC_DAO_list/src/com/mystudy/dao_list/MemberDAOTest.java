package com.mystudy.dao_list;

import java.util.ArrayList;

public class MemberDAOTest {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = new ArrayList<>();
		MemberVO vo = new MemberVO("Shin11", "신원호", "1234", "010-1234-1234", "신촌");
		MemberVO vo1 = new MemberVO("Shin12", "신원호1", "1234", "010-1234-1234", "신촌");
		MemberVO vo2 = new MemberVO("Shin13", "신원호2", "1234", "010-1234-1234", "신촌");
		
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
