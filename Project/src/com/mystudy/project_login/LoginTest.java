package com.mystudy.project_login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		StudentDAO sdao = new StudentDAO();
		ArrayList<StudentVO> student = sdao.getList();
		

		for(int i=0; i<student.size(); i++) {
			map.put(student.get(i).getId(), student.get(i).getPw());
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------");
			System.out.println("ȯ �� �� �� �� ~~~~~");
			System.out.println("ID : ");
			String id = sc.nextLine().trim();
			
			System.out.println("PW : ");
			String pw = sc.nextLine().trim();
			System.out.println("--------------");
//			System.out.println(map.get("SIX6929"));
			if(!map.containsKey(id)) {
				System.out.println("ID�� ��ġ���� �ʽ��ϴ�.");
				continue;
			} else {
				if(!map.get(id).equals(pw)) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				} else {
					System.out.println("�α��ο� �����ϼ̽��ϴ�.");
					break;
				}
			}

		}
		

	}

}
