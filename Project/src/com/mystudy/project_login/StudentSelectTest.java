package com.mystudy.project_login;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSelectTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentSelect sdao = new StudentSelect();
		ArrayList<StudentVO> list = sdao.selectAll();
		System.out.println("[�л� ������ ��ȸ]");
		for (StudentVO svo : list) {
			System.out.println(svo);			
		}
		
//		System.out.println("-------------------------------");
//		System.out.println("[�л� ������ ����]");
//		StudentVO upvo = new StudentVO("KMS", "��μ�", 45678, "010-9961-2241", "enclumek23@naver.com", 26, "M", "UI/UX����� �ڹٰ����� �缺����");
//		sdao.updateData(upvo);
//		list = sdao.selectAll();
//		for (StudentVO svo : list) {
//			System.out.println(svo);			
//		}
		
		System.out.println("[�̸� ����]");
		sdao.updateName(scan.next(), scan.next());
		
		System.out.println("[�н����� ����]");
		sdao.updatePw(scan.nextInt(), scan.next());
		
		System.out.println("[����ó ����]");
		sdao.updatePhone(scan.next(), scan.next());
		
		System.out.println("[���� ����]");
		sdao.updateMail(scan.next(), scan.next());
		
		System.out.println("[���� ����]");
		sdao.updateAge(scan.nextInt(), scan.next());
		
		System.out.println("[���� ����]");
		sdao.updateGender(scan.next(), scan.next());
		
		System.out.println("[���Ǹ� ����]");
		sdao.updateLecturename(scan.next(), scan.next());
	}
}
