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
			System.out.println("======================");
			System.out.println("\t로그인 ");
			System.out.print("ID : ");
			id = sc.next().trim();
			
			System.out.print("PW : ");
			pw = sc.next().trim();
			System.out.println("======================");

			if(!map.containsKey(id)) {
				System.out.println("ID가 일치하지 않습니다.");
				continue;
			} else {
				if(!map.get(id).equals(pw)) {
					System.out.println("비밀번호가 일치하지 않습니다.");
				} else {
					System.out.println("로그인에 성공하셨습니다.");
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
				System.out.println("\t관리자ID로 로그인하셨습니다.");
				System.out.println("============================================");
				System.out.println("\t     <<메뉴를 선택하세요>>");
				System.out.println("1.조회 \t2.입력\t3.삭제\t0.종료\t-1.로그아웃");
				System.out.println("============================================");
				System.out.print("번호 선택 : ");
				
				num = sc.nextInt();
				
				switch (num) {
				case 1 :
					System.out.println("1번 조회를 선택하셨습니다.");
					System.out.println("조회하실 항목을 선택해주세요.");
					System.out.println("1.ID \t 2. NAME  \t 3.PHONE \t 4. MAIL \t 5. 전체");
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
						ArrayList<ManagerVO> list = mdao.AttendanceList();
						for (ManagerVO mavo : list) {
							System.out.println("======================");
							System.out.println(mavo.stringForAtt());
							System.out.println("======================");
						}
						
						break;
						
					default :
						System.out.println("1~5사이의 숫자를 선택해주세요.");
					}
					Menu();
					break;
					
				case 2 :
					System.out.println("2번 입력을 선택하셨습니다.");
					System.out.println("새로운 학생의 정보를 입력해주세요.");
					System.out.println("(LECTURENAME, ID, NAME, PW, PHONE, MAIL, AGE, GENDER)");

					ManagerVO mvo = new ManagerVO();
					
					sc.nextLine(); // 개행문자 제거 위한 코드
					System.out.print("훈련 과목 : ");
					mvo.setLecture(sc.nextLine());
					System.out.println();
					
					System.out.print("ID : ");
					mvo.setId(sc.next());
					System.out.println();
					
					System.out.print("이름  : ");
					mvo.setName(sc.next());
					System.out.println();
					
					System.out.print("비밀번호 : ");
					mvo.setPw(sc.nextInt());
					System.out.println();
					
					System.out.print("전화번호 : ");
					mvo.setPhone(sc.next());
					System.out.println();
					
					System.out.print("이메일 : ");
					mvo.setMail(sc.next());
					System.out.println();
					
					System.out.print("나이  : ");
					mvo.setAge(sc.nextInt());
					System.out.println();
					
					System.out.print("성별  : ");
					mvo.setGender(sc.next());
					System.out.println();
					
					mdao.insertData(mvo);
					System.out.print("입력이 완료되었습니다.");
					Menu();
					break;
				
				case 3 : 
					System.out.println("3번 삭제를 선택하셨습니다.");
//					System.out.println("삭제가 완료되었습니다.");
					mdao.deleteOne(sc.next());
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
					System.out.println("0~3까지의 숫자를 선택해주세요.");
				}
			} else {
				System.out.println();
				System.out.println(id + "님 로그인 성공하셨습니다.");
				System.out.println("============================================");
				System.out.println("\t     <<메뉴를 선택하세요>>");
				System.out.println("1.조회 \t2.수정\t0.종료\t-1.로그아웃");
				System.out.println("============================================");
				System.out.println("번호 선택 : ");
				num = sc.nextInt();
				
				switch (num) {
				case 1:
				System.out.println("1번 조회를 선택하셨습니다.");
					if(num == 1) {
						System.out.println("1.개인정보조회\t 2.출결정보조회");
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
							ArrayList<StudentVO> list1 = ss.AttendanceList();
							
							for(StudentVO svo : list1) {
									if(svo.getId().equals(id)) {
										System.out.println("=======================");
										System.out.println(svo.stringForAtt());
										System.out.println("=======================");
									}
							}
							
							break;

						default :
							System.out.println("1 또는 2를 선택해주세요.");
						}
						Menu();
					}						
				break;
				
				case 2 :
					System.out.println("2번 수정을 선택하셨습니다.");
					System.out.println("수정할 항목을 선택해주세요.");
					System.out.println("1.이름\t2.비밀번호\t3.휴대전화\t4.메일\t5.나이\t6.성\t7.강의명변경");
					num = sc.nextInt();
					switch(num) {
					case 1:
						ss.updateName(id, sc.next());
						System.out.println("수정이 완료되었습니다.");
						break;
						
					case 2:
						ss.updatePw(sc.nextInt(), id);
						System.out.println("수정이 완료되었습니다.");
						break;
						
					case 3 :
						ss.updatePhone(sc.next(), id);
						System.out.println("수정이 완료되었습니다.");
						break;
						
					case 4 :
						ss.updateMail(sc.next(), id);
						System.out.println("수정이 완료되었습니다.");
						break;
					
					case 5 :
						ss.updateAge(sc.nextInt(), id);
						System.out.println("수정이 완료되었습니다.");
						break;
					
					case 6 :
						ss.updateGender(sc.next(), id);
						System.out.println("수정이 완료되었습니다.");
						break;
						
					case 7 :
						ss.updateLecturename(sc.next(), id);
						System.out.println("수정이 완료되었습니다.");
						break;
						
					default :
						System.out.println("1~7사이의 숫자를 선택해주세요.");
					}
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
			Exit();
			Login();
		}
		if(num == 2) {
			Menu();
		}
	}
	
	public static void Enter() {
		System.out.println("입실하시겠습니까?");
		System.out.println("1.Yes\t2.No");
		num = sc.nextInt();
		if(num == 1) {
			rbdao.insertIntime(id);
			System.out.println("입실처리 되었습니다.");
			
		}
		if(num == 2) {
			Login();
		}
	}
	
	
	public static void Exit() {
		System.out.println("퇴실하시겠습니까?");
		System.out.println("1.Yes\t2.No");
		num = sc.nextInt();
		if(num == 1) {
			rbdao.updateOutTime(id);
			System.out.println("퇴실처리되었습니다.");
			Login();
		}
		if(num == 2) {
			Menu();
		}
	}
}