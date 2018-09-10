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
			System.out.println("\t\t << 로그인 >> ");
			System.out.print("\tID : ");
			id = sc.next().trim();
			
			System.out.print("\tPW : ");
			pw = sc.next().trim();
			System.out.println("============================================");

			if(!map.containsKey(id)) {
				System.out.println("\t   >> ID가 일치하지 않습니다.");
				continue;
			} else {
				if(!map.get(id).equals(pw)) {
					System.out.println("\t   >> 비밀번호가 일치하지 않습니다.");
				} else {
					System.out.println("\t   >> 로그인에 성공하셨습니다.");
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
				System.out.println("\t >> 관리자ID로 로그인하셨습니다.");
				System.out.println("============================================");
				System.out.println("\t     <<메뉴를 선택하세요>>");
				System.out.println("1.조회 \t2.입력\t3.삭제\t0.종료\t-1.로그아웃");
				System.out.println("============================================");
				System.out.print("번호 선택 : ");
				
				num = sc.nextInt();
				
				switch (num) {
				case 1 :
					System.out.println("============================================");
					System.out.println("\t  >> 1번 조회를 선택하셨습니다.");
					System.out.println();
					System.out.println("\t  >> 조회하실 항목을 선택해주세요.");
					System.out.println("1.ID   2. NAME   3.PHONE   4. MAIL   5. 전체");
					System.out.println("============================================");
					System.out.print("번호 선택 : ");
					num = sc.nextInt();
					switch(num) {
					case 1 :
						System.out.print("ID 입력 : ");
						ManagerVO mvo = mdao.selectId(sc.next());
						System.out.println("============================================");
						System.out.println(mvo);
						System.out.println("============================================");
						break;
					
					case 2 :
						System.out.print("이름 입력 : ");
						mvo = mdao.selectName(sc.next());
						System.out.println("============================================");
						System.out.println(mvo);
						System.out.println("============================================");
						break;
					
					case 3 :
						System.out.print("휴대전화 입력 : ");
						mvo = mdao.selectPhone(sc.next());
						System.out.println("============================================");
						System.out.println(mvo);
						System.out.println("============================================");
						break;
					
					case 4 :
						System.out.print("메일 입력 : ");
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
						System.out.println(" >> 1~5사이의 숫자를 선택해주세요.");
						System.out.println("============================================");
					}
					Menu();
					break;
					
				case 2 :
					System.out.println("============================================");
					System.out.println("\t  >> 2번 입력을 선택하셨습니다.");
					System.out.println("\t  >> 새로운 학생의 정보를 입력해주세요");
					System.out.println("(강의명, ID,  이름,  암호, 전화번호, 메일, 나이,  성별)");
					System.out.println("============================================");

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
					System.out.println("============================================");
					System.out.println("\t  >> 3번 삭제를 선택하셨습니다.");
					System.out.print("\t  >> 삭제할 아이디 입력 : ");
					mdao.deleteOne(sc.next());
					System.out.println("\t  >> 삭제완료되었습니다.");
					System.out.println("============================================");
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
					System.out.println("============================================");
					System.out.println("\t  >> 0~3까지의 숫자를 선택해주세요.");
					System.out.println("============================================");
					Menu();
				}
			} else {
				System.out.println();
				System.out.println("\t >> " + id + "님 로그인 성공하셨습니다.");
				System.out.println("============================================");
				System.out.println("\t     <<메뉴를 선택하세요>>");
				System.out.println("     1.조회 \t2.수정\t0.종료\t-1.로그아웃");
				System.out.println("============================================");
				System.out.print("번호 선택 : ");
				num = sc.nextInt();
				
				switch (num) {
				case 1:
				System.out.println("============================================");
				System.out.println("\t  >> 1번 조회를 선택하셨습니다.");
					if(num == 1) {
						
						System.out.println("\t1.개인정보조회\t 2.출결정보조회");
						System.out.println("============================================");
						System.out.print("번호 선택 : ");
						num = sc.nextInt();
						switch (num) {
						case 1 :
							System.out.println("============================================");
							System.out.println("\t >> " + id + "회원님의 정보입니다.");
							System.out.println("============================================");
							ArrayList<StudentVO> list = ss.selectAll();
							
							System.out.println("\t >> " + id + "님의 데이터");
							System.out.println("============================================");
							for(StudentVO svo : list) {
								if(svo.getId().equals(id)) {
									System.out.println(svo);
								}
							}
							System.out.println("============================================");
							break;
							
						case 2 : 
							System.out.println("\t >> " + id + "님의 출결정보입니다.");
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
							System.out.println("\t  >> 1 또는 2를 선택해주세요.");
						}
						Menu();
					}						
				break;
				
				case 2 :
					System.out.println("============================================");
					System.out.println("\t  >> 2번 수정을 선택하셨습니다.");
					System.out.println("\t  >> 수정할 항목을 선택해주세요.");
					System.out.println("1.이름   2.암호   3.휴대전화   4.메일   5.나이   6.성    7.훈련명");
					System.out.println("============================================");
					System.out.print("번호 선택 : ");
					num = sc.nextInt();
					switch(num) {
					case 1:
						System.out.println("============================================");
						System.out.print("수정할 이름 입력 : ");
						ss.updateName(id, sc.next());
						System.out.println("============================================");
						System.out.println("\t  >> 수정이 완료되었습니다.");
						break;
						
					case 2:
						
						System.out.println("============================================");
						System.out.print("수정할 ID 입력 : ");
						ss.updatePw(sc.nextInt(), id);
						System.out.println("============================================");
						System.out.println("\t  >> 수정이 완료되었습니다.");
						break;
						
					case 3 :
						System.out.println("============================================");
						System.out.print("수정할 휴대전화 입력 : ");
						ss.updatePhone(sc.next(), id);
						System.out.println("============================================");
						System.out.println("\t  >> 수정이 완료되었습니다.");
						break;
						
					case 4 :
						System.out.println("============================================");
						System.out.print("수정할 메일 입력 : ");
						ss.updateMail(sc.next(), id);
						System.out.println("============================================");
						System.out.println("\t  >> 수정이 완료되었습니다.");
						break;
					
					case 5 :
						System.out.println("============================================");
						System.out.print("수정할 나이 입력 : ");
						ss.updateAge(sc.nextInt(), id);
						System.out.println("============================================");
						System.out.println("\t  >> 수정이 완료되었습니다.");
						break;
					
					case 6 :
						System.out.println("============================================");
						System.out.print("수정할 성별 입력 : ");
						ss.updateGender(sc.next(), id);
						System.out.println("============================================");
						System.out.println("\t  >> 수정이 완료되었습니다.");
						break;
						
					case 7 :
						System.out.println("============================================");
						System.out.print("수정할 훈련명 입력 : ");
						ss.updateLecturename(sc.next(), id);
						System.out.println("============================================");
						System.out.println("\t  >> 수정이 완료되었습니다.");
						break;
						
					default :
						System.out.println("\t  >> 1~7사이의 숫자를 선택해주세요.");
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
					System.out.println("\t  >> 0~2번사이의 숫자를 선택해주세요.");
				}
			}
			return result;
			
	}

	
	public static void Logout() {
		System.out.println("============================================");
		System.out.println("\t      >> 로그아웃 하시겠습니까?");
		System.out.println("\t        1.Yes\t2.No");
		System.out.println("============================================");
		System.out.print("번호 선택 : ");
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
		System.out.println("\t      >> 입실하시겠습니까?");
		System.out.println("\t        1.Yes  2.No");
		System.out.println("============================================");
		System.out.print("번호 선택 : ");
		num = sc.nextInt();
		if(num == 1) {
			rbdao.insertIntime(id);
			System.out.println("\t   >> 입실처리 되었습니다.");
			
		}
		if(num == 2) {
			Login();
		}
	}
	
	
	public static void Exit() {
		System.out.println("============================================");
		System.out.println("\t      >> 퇴실하시겠습니까?");
		System.out.println("\t        1.Yes\t2.No");
		System.out.println("============================================");
		System.out.print("번호 선택 : ");
		num = sc.nextInt();
		if(num == 1) {
			rbdao.updateOutTime(id);
			System.out.println("\t      >> 퇴실처리되었습니다.");
			Login();
		}
		if(num == 2) {
			Menu();
		}
	}
}