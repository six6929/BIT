package com.mystudy.ojdbc4_CRUD;

import java.util.ArrayList;

public class StudentCRUDTest {

	public static void main(String[] args) {
		StudentCRUD crud = new StudentCRUD();
		crud.dispData("2018001");
		StudentVO vo = crud.selectId("2018001");
		System.out.println("2018001 ������ - " + vo);
		
		System.out.println("--------------------------");
		//�������� �ʴ� ������ ��ȸ
		vo = crud.selectId("2018111");
		if(vo == null) {
			System.out.println("2018111 �����;���");		
		} else {
			System.out.println("2018111������ - : " + vo);			
		}
		
		//��ü������ ��ȸ
		ArrayList<StudentVO> list = crud.selectAll();
		System.out.println("--- ��ü������ ��ȸ ��� ---");
//		System.out.println(list);
		for(StudentVO sto : list) {
			crud.dispData(sto.getId());
		}
	}

}
