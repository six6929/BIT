package com.mystudy.project_login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LoginTest {

	static String id = "";
	static String pw = "";
	static int num = 0;
	static Scanner sc = new Scanner(System.in);
	static StudentSelect ss = new StudentSelect();

	public static void main(String[] args) {
		Login();
		
	}

	
	public static void Login() {
		HashMap<String, String> map = new HashMap<String, String>();
		
		MemberDAO mdao = new MemberDAO();
		ArrayList<MemberVO> member = mdao.getList();
		
		for(int i=0; i<member.size(); i++) {
			map.put(member.get(i).getId(), member.get(i).getPw());
		}
		
		while(true) {
			System.out.println("---------------");
			System.out.println("ȯ �� �� �� �� ~~~~~");
			System.out.print("ID : ");
			id = sc.next().trim();
			
			System.out.print("PW : ");
			pw = sc.next().trim();
			System.out.println("--------------");

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
		Menu();
	}
	
	
	public static boolean Menu() {
		boolean result = true;
			if(id.equals("admin")) {
				System.out.println("������ID�� �α����ϼ̽��ϴ�.");
				System.out.println("---------------------");
				System.out.println("<<�޴��� �����ϼ���>>");
				System.out.println("1.��ȸ \t2.�Է�\t3.����\t0.����");
				System.out.println("---------------------");
				System.out.print("��ȣ ���� : ");
				
				num = sc.nextInt();
				
				switch (num) {
				case 1 :
					System.out.println("1�� ��ȸ�� �����ϼ̽��ϴ�.");
					break;
					
				case 2 :
					System.out.println("2�� �Է��� �����ϼ̽��ϴ�.");
					break;
				
				case 3 : 
					System.out.println("3�� ������ �����ϼ̽��ϴ�.");
					break;
					
				case 0 :
					System.out.println("����Ǿ����ϴ�.");
					result = false;
					break;
				
				default :
					System.out.println("0~3������ ���ڸ� �������ּ���.");
				}
			} else {
				System.out.println(id + "�� �α��� �����ϼ̽��ϴ�.");
				System.out.println("---------------------");
				System.out.println("<<�޴��� �����ϼ���>>");
				System.out.println("1.��ȸ \t2.����\t0.����\t-1.�α׾ƿ�");
				System.out.println("---------------------");
				System.out.println("��ȣ ���� : ");
				num = sc.nextInt();
				
				switch (num) {
				case 1:
				System.out.println("1�� ��ȸ�� �����ϼ̽��ϴ�.");
					if(num == 1) {
						System.out.println("1.����������ȸ\t 2.���������ȸ\t0.�ڷΰ���");
						num = sc.nextInt();
						switch (num) {
						case 1 :
							System.out.println(id + "ȸ������ �����Դϴ�.");
							ArrayList<StudentVO> list = ss.selectAll();
							
							System.out.println(id + "���� ������");
							for(StudentVO svo : list) {
								if(svo.getId().equals(id)) {
									System.out.println(svo);
								}
							}
							break;
							
						case 2 : 
							System.out.println(id + "���� ��������Դϴ�.");
							break;

						default :
							System.out.println("1 �Ǵ� 2�� �������ּ���.");
						}
						Menu();
					}						
				break;
				
				case 2 :
					System.out.println("2�� ������ �����ϼ̽��ϴ�.");
					Menu();
					break;
					
				case 0 :
					System.out.println("����Ǿ����ϴ�.");
					result = false;
					break;
				case -1 :
					Logout();
					break;
				default :
					System.out.println("0~2�������� ���ڸ� �������ּ���.");
				}
			}
			return result;
			
	}
	
	public static void Logout() {
		System.out.println("�α׾ƿ� �Ͻðڽ��ϱ�?");
		System.out.println("1.Yes\t2.No");
		num = sc.nextInt();
		if(num == 1) {
			Login();
		}
		if(num == 2) {
			Menu();
		}
	}
}