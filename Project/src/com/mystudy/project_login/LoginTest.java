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
			System.out.println("============================================");
			System.out.println("\t\t << �α��� >> ");
			System.out.print("\tID : ");
			id = sc.next().trim();
			
			System.out.print("\tPW : ");
			pw = sc.next().trim();
			System.out.println("============================================");

			if(!map.containsKey(id)) {
				System.out.println("\t   >> ID�� ��ġ���� �ʽ��ϴ�.");
				continue;
			} else {
				if(!map.get(id).equals(pw)) {
					System.out.println("\t   >> ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				} else {
					System.out.println("\t   >> �α��ο� �����ϼ̽��ϴ�.");
					System.out.println();
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
				System.out.println();
				System.out.println("\t >> ������ID�� �α����ϼ̽��ϴ�.");
				System.out.println("============================================");
				System.out.println("\t     <<�޴��� �����ϼ���>>");
				System.out.println("1.��ȸ \t2.�Է�\t3.����\t0.����\t-1.�α׾ƿ�");
				System.out.println("============================================");
				System.out.print("��ȣ ���� : ");
				
				num = sc.nextInt();
				
				switch (num) {
				case 1 :
					System.out.println("============================================");
					System.out.println("\t  >> 1�� ��ȸ�� �����ϼ̽��ϴ�.");
					System.out.println();
					System.out.println("\t  >> ��ȸ�Ͻ� �׸��� �������ּ���.");
					System.out.println("1.ID   2. NAME   3.PHONE   4. MAIL   5. ��ü");
					System.out.println("============================================");
					System.out.print("��ȣ ���� : ");
					num = sc.nextInt();
					switch(num) {
					case 1 :
						System.out.print("ID �Է� : ");
						ManagerVO mvo = mdao.selectId(sc.next());
						System.out.println("============================================");
						System.out.println(mvo);
						System.out.println("============================================");
						break;
					
					case 2 :
						System.out.print("�̸� �Է� : ");
						mvo = mdao.selectName(sc.next());
						System.out.println("============================================");
						System.out.println(mvo);
						System.out.println("============================================");
						break;
					
					case 3 :
						System.out.print("�޴���ȭ �Է� : ");
						mvo = mdao.selectPhone(sc.next());
						System.out.println("============================================");
						System.out.println(mvo);
						System.out.println("============================================");
						break;
					
					case 4 :
						System.out.print("���� �Է� : ");
						mvo = mdao.selectMail(sc.next());
						System.out.println("============================================");
						System.out.println(mvo);
						System.out.println("============================================");
						break;
					
					case 5 :
						ArrayList<ManagerVO> list = mdao.AttendanceList();
//						ArrayList<String> names = new ArrayList<String>();
						for (ManagerVO mavo : list) {
							System.out.println("============================================");
//							names.add(mavo.getName());
							System.out.println(mavo.stringForAtt());
							System.out.println("============================================");
						}
						
						break;
						
					default :
						System.out.println("============================================");
						System.out.println(" >> 1~5������ ���ڸ� �������ּ���.");
						System.out.println("============================================");
					}
					Menu();
					break;
					
				case 2 :
					System.out.println("============================================");
					System.out.println("\t  >> 2�� �Է��� �����ϼ̽��ϴ�.");
					System.out.println("\t  >> ���ο� �л��� ������ �Է����ּ���");
					System.out.println("(���Ǹ�, ID,  �̸�,  ��ȣ, ��ȭ��ȣ, ����, ����,  ����)");
					System.out.println("============================================");

					ManagerVO mvo = new ManagerVO();
					
					sc.nextLine(); // ���๮�� ���� ���� �ڵ�
					System.out.print("�Ʒ� ���� : ");
					mvo.setLecture(sc.nextLine());
					System.out.println();
					
					System.out.print("ID : ");
					mvo.setId(sc.next());
					System.out.println();
					
					System.out.print("�̸�  : ");
					mvo.setName(sc.next());
					System.out.println();
					
					System.out.print("��й�ȣ : ");
					mvo.setPw(sc.nextInt());
					System.out.println();
					
					System.out.print("��ȭ��ȣ : ");
					mvo.setPhone(sc.next());
					System.out.println();
					
					System.out.print("�̸��� : ");
					mvo.setMail(sc.next());
					System.out.println();
					
					System.out.print("����  : ");
					mvo.setAge(sc.nextInt());
					System.out.println();
					
					System.out.print("����  : ");
					mvo.setGender(sc.next());
					System.out.println();
					
					mdao.insertData(mvo);
					System.out.print("�Է��� �Ϸ�Ǿ����ϴ�.");
					Menu();
					break;
				
				case 3 :
					System.out.println("============================================");
					System.out.println("\t  >> 3�� ������ �����ϼ̽��ϴ�.");
					System.out.print("\t  >> ������ ���̵� �Է� : ");
					mdao.deleteOne(sc.next());
					System.out.println("\t  >> �����Ϸ�Ǿ����ϴ�.");
					System.out.println("============================================");
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
					System.out.println("============================================");
					System.out.println("\t  >> 0~3������ ���ڸ� �������ּ���.");
					System.out.println("============================================");
					Menu();
				}
			} else {
				System.out.println();
				System.out.println("\t >> " + id + "�� �α��� �����ϼ̽��ϴ�.");
				System.out.println("============================================");
				System.out.println("\t     <<�޴��� �����ϼ���>>");
				System.out.println("     1.��ȸ \t2.����\t0.����\t-1.�α׾ƿ�");
				System.out.println("============================================");
				System.out.print("��ȣ ���� : ");
				num = sc.nextInt();
				
				switch (num) {
				case 1:
				System.out.println("============================================");
				System.out.println("\t  >> 1�� ��ȸ�� �����ϼ̽��ϴ�.");
					if(num == 1) {
						
						System.out.println("\t1.����������ȸ\t 2.���������ȸ");
						System.out.println("============================================");
						System.out.print("��ȣ ���� : ");
						num = sc.nextInt();
						switch (num) {
						case 1 :
							System.out.println("============================================");
							System.out.println("\t >> " + id + "ȸ������ �����Դϴ�.");
							System.out.println("============================================");
							ArrayList<StudentVO> list = ss.selectAll();
							
							System.out.println("\t >> " + id + "���� ������");
							System.out.println("============================================");
							for(StudentVO svo : list) {
								if(svo.getId().equals(id)) {
									System.out.println(svo);
								}
							}
							System.out.println("============================================");
							break;
							
						case 2 : 
							System.out.println("\t >> " + id + "���� ��������Դϴ�.");
							ArrayList<StudentVO> list1 = ss.AttendanceList();
							
							for(StudentVO svo : list1) {
									if(svo.getId().equals(id)) {
										System.out.println("============================================");
										System.out.println(svo.stringForAtt());
										System.out.println("============================================");
									}
							}
							
							break;

						default :
							System.out.println("\t  >> 1 �Ǵ� 2�� �������ּ���.");
						}
						Menu();
					}						
				break;
				
				case 2 :
					System.out.println("============================================");
					System.out.println("\t  >> 2�� ������ �����ϼ̽��ϴ�.");
					System.out.println("\t  >> ������ �׸��� �������ּ���.");
					System.out.println("1.�̸�   2.��ȣ   3.�޴���ȭ   4.����   5.����   6.��    7.�Ʒø�");
					System.out.println("============================================");
					System.out.print("��ȣ ���� : ");
					num = sc.nextInt();
					switch(num) {
					case 1:
						System.out.println("============================================");
						System.out.print("������ �̸� �Է� : ");
						ss.updateName(id, sc.next());
						System.out.println("============================================");
						System.out.println("\t  >> ������ �Ϸ�Ǿ����ϴ�.");
						break;
						
					case 2:
						
						System.out.println("============================================");
						System.out.print("������ ID �Է� : ");
						ss.updatePw(sc.nextInt(), id);
						System.out.println("============================================");
						System.out.println("\t  >> ������ �Ϸ�Ǿ����ϴ�.");
						break;
						
					case 3 :
						System.out.println("============================================");
						System.out.print("������ �޴���ȭ �Է� : ");
						ss.updatePhone(sc.next(), id);
						System.out.println("============================================");
						System.out.println("\t  >> ������ �Ϸ�Ǿ����ϴ�.");
						break;
						
					case 4 :
						System.out.println("============================================");
						System.out.print("������ ���� �Է� : ");
						ss.updateMail(sc.next(), id);
						System.out.println("============================================");
						System.out.println("\t  >> ������ �Ϸ�Ǿ����ϴ�.");
						break;
					
					case 5 :
						System.out.println("============================================");
						System.out.print("������ ���� �Է� : ");
						ss.updateAge(sc.nextInt(), id);
						System.out.println("============================================");
						System.out.println("\t  >> ������ �Ϸ�Ǿ����ϴ�.");
						break;
					
					case 6 :
						System.out.println("============================================");
						System.out.print("������ ���� �Է� : ");
						ss.updateGender(sc.next(), id);
						System.out.println("============================================");
						System.out.println("\t  >> ������ �Ϸ�Ǿ����ϴ�.");
						break;
						
					case 7 :
						System.out.println("============================================");
						System.out.print("������ �Ʒø� �Է� : ");
						ss.updateLecturename(sc.next(), id);
						System.out.println("============================================");
						System.out.println("\t  >> ������ �Ϸ�Ǿ����ϴ�.");
						break;
						
					default :
						System.out.println("\t  >> 1~7������ ���ڸ� �������ּ���.");
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
					System.out.println("\t  >> 0~2�������� ���ڸ� �������ּ���.");
				}
			}
			return result;
			
	}

	
	public static void Logout() {
		System.out.println("============================================");
		System.out.println("\t      >> �α׾ƿ� �Ͻðڽ��ϱ�?");
		System.out.println("\t        1.Yes\t2.No");
		System.out.println("============================================");
		System.out.print("��ȣ ���� : ");
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
		System.out.println("============================================");
		System.out.println("\t      >> �Խ��Ͻðڽ��ϱ�?");
		System.out.println("\t        1.Yes  2.No");
		System.out.println("============================================");
		System.out.print("��ȣ ���� : ");
		num = sc.nextInt();
		if(num == 1) {
			rbdao.insertIntime(id);
			System.out.println("\t   >> �Խ�ó�� �Ǿ����ϴ�.");
			
		}
		if(num == 2) {
			Login();
		}
	}
	
	
	public static void Exit() {
		System.out.println("============================================");
		System.out.println("\t      >> ����Ͻðڽ��ϱ�?");
		System.out.println("\t        1.Yes\t2.No");
		System.out.println("============================================");
		System.out.print("��ȣ ���� : ");
		num = sc.nextInt();
		if(num == 1) {
			rbdao.updateOutTime(id);
			System.out.println("\t      >> ���ó���Ǿ����ϴ�.");
			Login();
		}
		if(num == 2) {
			Menu();
		}
	}
}