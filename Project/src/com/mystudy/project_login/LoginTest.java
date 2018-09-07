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
	static ManagerDAO mdao = new ManagerDAO();
	static RollbookDAO rbdao = new RollbookDAO();
	
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
		Enter();
		Menu();
		
	}
	
	
	public static boolean Menu() {
		boolean result = true;
			if(id.equals("admin")) {
				System.out.println("������ID�� �α����ϼ̽��ϴ�.");
				System.out.println("---------------------");
				System.out.println("<<�޴��� �����ϼ���>>");
				System.out.println("1.��ȸ \t2.�Է�\t3.����\t0.����\t-1.�α׾ƿ�");
				System.out.println("---------------------");
				System.out.print("��ȣ ���� : ");
				
				num = sc.nextInt();
				
				switch (num) {
				case 1 :
					System.out.println("1�� ��ȸ�� �����ϼ̽��ϴ�.");
					System.out.println("��ȸ�Ͻ� �׸��� �������ּ���.");
					System.out.println("1.ID \t 2. NAME  \t 3.PHONE \t 4. MAIL \t 5. ��ü");
					num = sc.nextInt();
					switch(num) {
					case 1 :
						ManagerVO mvo = mdao.selectId(sc.next());
						System.out.println(mvo);
						break;
					
					case 2 :
						mvo = mdao.selectName(sc.next());
						System.out.println(mvo);
						break;
					
					case 3 :
						mvo = mdao.selectPhone(sc.next());
						System.out.println(mvo);
						break;
					
					case 4 :
						mvo = mdao.selectMail(sc.next());
						System.out.println(mvo);
						break;
					
					case 5 :
						ArrayList<ManagerVO> list = mdao.selectAll();
						for (ManagerVO mavo : list) {
							System.out.println(mavo);
						}
						
						break;
						
					default :
						System.out.println("1~5������ ���ڸ� �������ּ���.");
					}
					Menu();
					break;
					
				case 2 :
					System.out.println("2�� �Է��� �����ϼ̽��ϴ�.");
					System.out.println("���ο� �л��� ������ �Է����ּ���.");
					System.out.println("(ID, NAME, PW, PHONE, MAIL, AGE, GENDER, LECTURENAME)");
					int cnt = mdao.insertData(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next());
					System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
					break;
				
				case 3 : 
					System.out.println("3�� ������ �����ϼ̽��ϴ�.");
					mdao.deleteOne(sc.next());
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				case 0 :
					System.out.println("����Ǿ����ϴ�.");
					result = false;
					break;
				
				case -1 :
					Logout();
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
						System.out.println("1.����������ȸ\t 2.���������ȸ");
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
//							ss.selectAttendance();
							break;

						default :
							System.out.println("1 �Ǵ� 2�� �������ּ���.");
						}
						Menu();
					}						
				break;
				
				case 2 :
					System.out.println("2�� ������ �����ϼ̽��ϴ�.");
					System.out.println("������ �׸��� �������ּ���.");
					System.out.println("1.�̸�\t2.��й�ȣ\t3.�޴���ȭ\t4.����\t5.����\t6.��\t7.���Ǹ���");
					num = sc.nextInt();
					switch(num) {
					case 1:
						ss.updateName(id, sc.next());
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						break;
						
					case 2:
						ss.updatePw(sc.nextInt(), id);
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						break;
						
					case 3 :
						ss.updatePhone(sc.next(), id);
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						break;
						
					case 4 :
						ss.updateMail(sc.next(), id);
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						break;
					
					case 5 :
						ss.updateAge(sc.nextInt(), id);
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						break;
					
					case 6 :
						ss.updateGender(sc.next(), id);
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						break;
						
					case 7 :
						ss.updateLecturename(sc.next(), id);
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						break;
						
					default :
						System.out.println("1~7������ ���ڸ� �������ּ���.");
					}
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
			Exit();
			Login();
		}
		if(num == 2) {
			Menu();
		}
	}
	
	public static void Enter() {
		System.out.println("�Խ��Ͻðڽ��ϱ�?");
		System.out.println("1.Yes\t2.No");
		num = sc.nextInt();
		if(num == 1) {
			rbdao.insertIntime(id);
			System.out.println("�Խ�ó�� �Ǿ����ϴ�.");
			
		}
		if(num == 2) {
			Login();
		}
	}
	
	
	public static void Exit() {
		System.out.println("����Ͻðڽ��ϱ�?");
		System.out.println("1.Yes\t2.No");
		num = sc.nextInt();
		if(num == 1) {
			rbdao.updateOutTime(id);
			System.out.println("���ó���Ǿ����ϴ�.");
			Login();
		}
		if(num == 2) {
			Menu();
		}
	}
}