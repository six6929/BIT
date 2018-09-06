package com.mystudy.project_login;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSelectTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentSelect sdao = new StudentSelect();
		ArrayList<StudentVO> list = sdao.selectAll();
		System.out.println("[학생 데이터 조회]");
		for (StudentVO svo : list) {
			System.out.println(svo);			
		}
		
//		System.out.println("-------------------------------");
//		System.out.println("[학생 데이터 수정]");
//		StudentVO upvo = new StudentVO("KMS", "김민성", 45678, "010-9961-2241", "enclumek23@naver.com", 26, "M", "UI/UX기반의 자바개발자 양성과정");
//		sdao.updateData(upvo);
//		list = sdao.selectAll();
//		for (StudentVO svo : list) {
//			System.out.println(svo);			
//		}
		
		System.out.println("[이름 변경]");
		sdao.updateName(scan.next(), scan.next());
		
		System.out.println("[패스워드 변경]");
		sdao.updatePw(scan.nextInt(), scan.next());
		
		System.out.println("[연락처 변경]");
		sdao.updatePhone(scan.next(), scan.next());
		
		System.out.println("[메일 변경]");
		sdao.updateMail(scan.next(), scan.next());
		
		System.out.println("[나이 변경]");
		sdao.updateAge(scan.nextInt(), scan.next());
		
		System.out.println("[성별 변경]");
		sdao.updateGender(scan.next(), scan.next());
		
		System.out.println("[강의명 변경]");
		sdao.updateLecturename(scan.next(), scan.next());
	}
}
