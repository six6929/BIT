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
			System.out.println("환 영 합 니 다 ~~~~~");
			System.out.print("ID : ");
			id = sc.next().trim();
			
			System.out.print("PW : ");
			pw = sc.next().trim();
			System.out.println("--------------");

			if(!map.containsKey(id)) {
				System.out.println("ID가 일치하지 않습니다.");
				continue;
			} else {
				if(!map.get(id).equals(pw)) {
					System.out.println("비밀번호가 일치하지 않습니다.");
				} else {
					System.out.println("로그인에 성공하셨습니다.");
					break;
				}
			}
		}
		Menu();
	}
	
	
	public static boolean Menu() {
		boolean result = true;
			if(id.equals("admin")) {
				System.out.println("관리자ID로 로그인하셨습니다.");
				System.out.println("---------------------");
				System.out.println("<<메뉴를 선택하세요>>");
				System.out.println("1.조회 \t2.입력\t3.삭제\t0.종료");
				System.out.println("---------------------");
				System.out.print("번호 선택 : ");
				
				num = sc.nextInt();
				
				switch (num) {
				case 1 :
					System.out.println("1번 조회를 선택하셨습니다.");
					break;
					
				case 2 :
					System.out.println("2번 입력을 선택하셨습니다.");
					break;
				
				case 3 : 
					System.out.println("3번 삭제를 선택하셨습니다.");
					break;
					
				case 0 :
					System.out.println("종료되었습니다.");
					result = false;
					break;
				
				default :
					System.out.println("0~3까지의 숫자를 선택해주세요.");
				}
			} else {
				System.out.println(id + "님 로그인 성공하셨습니다.");
				System.out.println("---------------------");
				System.out.println("<<메뉴를 선택하세요>>");
				System.out.println("1.조회 \t2.수정\t0.종료\t-1.로그아웃");
				System.out.println("---------------------");
				System.out.println("번호 선택 : ");
				num = sc.nextInt();
				
				switch (num) {
				case 1:
				System.out.println("1번 조회를 선택하셨습니다.");
					if(num == 1) {
						System.out.println("1.개인정보조회\t 2.출결정보조회\t0.뒤로가기");
						num = sc.nextInt();
						switch (num) {
						case 1 :
							System.out.println(id + "회원님의 정보입니다.");
							ArrayList<StudentVO> list = ss.selectAll();
							
							System.out.println(id + "님의 데이터");
							for(StudentVO svo : list) {
								if(svo.getId().equals(id)) {
									System.out.println(svo);
								}
							}
							break;
							
						case 2 : 
							System.out.println(id + "님의 출결정보입니다.");
							break;

						default :
							System.out.println("1 또는 2를 선택해주세요.");
						}
						Menu();
					}						
				break;
				
				case 2 :
					System.out.println("2번 수정을 선택하셨습니다.");
					Menu();
					break;
					
				case 0 :
					System.out.println("종료되었습니다.");
					result = false;
					break;
				case -1 :
					Logout();
					break;
				default :
					System.out.println("0~2번사이의 숫자를 선택해주세요.");
				}
			}
			return result;
			
	}
	
	public static void Logout() {
		System.out.println("로그아웃 하시겠습니까?");
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