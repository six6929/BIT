package com.mystudy.ojdbc4_CRUD;

import java.util.ArrayList;

public class StudentCRUDTest {

	public static void main(String[] args) {
		StudentCRUD crud = new StudentCRUD();
		crud.dispData("2018001");
		StudentVO vo = crud.selectId("2018001");
		System.out.println("2018001 데이터 - " + vo);
		
		System.out.println("--------------------------");
		//존재하지 않는 데이터 조회
		vo = crud.selectId("2018111");
		if(vo == null) {
			System.out.println("2018111 데이터없음");		
		} else {
			System.out.println("2018111데이터 - : " + vo);			
		}
		
		//전체데이터 조회
		ArrayList<StudentVO> list = crud.selectAll();
		System.out.println("--- 전체데이터 조회 결과 ---");
//		System.out.println(list);
		for(StudentVO sto : list) {
			crud.dispData(sto.getId());
		}
	}

}
