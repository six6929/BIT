import java.util.Scanner;

public class SungjukProcess {
	
	int num = 0; // 입력할 숫자를 위한 변수
	String tyId = ""; //Id를 입력할 변수
	Scanner sc = new Scanner(System.in);
	StudentManager sm = new StudentManager();
	
	
	
	public static void main(String[] args) {
		
	/* **** 성적처리(화면작업)
	성적처리(ver 1.0)
	-------------------------------
	 1.조회   2.입력   3.수정   4.삭제    0.종료 
	-------------------------------
	>>작업선택: 
	****************************/
		SungjukProcess sp = new SungjukProcess();
		
		while(true) {
			if(sp.managementRecord() == false) {
				break;
			}
		}
	} //메인 종료
	
	
	
	
	//전체 성적처리
	public boolean managementRecord() {
		boolean result = true;
		printTitle();
			num = Integer.parseInt(sc.nextLine());
			
		while(true) {
			switch(num) {
			case 1 :
				checkRecord();
				break;
				
			case 2 :
				insertRecord();
				break;
				
			case 3 :
				correctRecord();
				break;
				
			case 4 :
				deleteRecord();
				break;
				
			case 0 :
				Exit();
				result = false;
				break;
			
			default :
				System.out.println("[예외] 0~4사이의 숫자를 선택해주세요");
				continue;
			}
			return result;
		}
	}
	
	
	
	
	//1. 조회
	void checkRecord() {
		System.out.println("1번 조회를 선택하셨습니다.");
		System.out.println("원하는 서비스를 선택하십시오.");
		while(true) {
			System.out.println("1. 반 전체 성적 조회 \t 2. 학생 개인 성적 조회 \t 0. 종료");
			
			num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1 :
				checkRecordAll();
				break;
			
			case 2 :
				checkRecordEach();
				break;
			
			case 0 : 
				System.out.println("종료");
				return;
				
			default : 
				System.out.println("[예외] 0과 2 사이의 숫자를 선택해주세요.");
				continue;
			}
		}
		
	}
	
	
	//1-1. 반 전체 조회
	void checkRecordAll() {
		System.out.println("반 전체 데이터 조회 결과 >>");
		sm.selectAll();
		return;
	}
	
	//1-2. 개개인의 학생 조회
	void checkRecordEach() {
		System.out.println("조회하고 싶은 학생의 ID를 입력하십시오.");
		tyId = sc.next();
		sm.selectOne(tyId);
		return;
	}
	
	//2. 입력
	void insertRecord() {
		System.out.println("2번 입력을 선택하셨습니다.");
		System.out.println("차례대로 입력해주십시오.");
		
		System.out.println("ID를 입력하십시오.");
		String ID = sc.next().trim();
		System.out.println("Name을 입력하십시오.");
		String Name = sc.next().trim();
		System.out.println("Kor를 입력하십시오.");
		int Kor = Integer.parseInt(sc.next().trim());
		System.out.println("Eng를 입력하십시오.");
		int Eng = Integer.parseInt(sc.next().trim());
		System.out.println("Math를 입력하십시오.");
		int Math = Integer.parseInt(sc.next().trim());	
		
		StudentVO stu = new StudentVO(ID, Name, Kor, Eng, Math);
		sm.insert(stu);
		
		System.out.println("입력 완료되었습니다.");
		}
	
	//3. 수정 
	void correctRecord() {
		System.out.println("3번 수정을 선택하셨습니다.");
		System.out.println("ID를 입력하십시오.");
		String ID = sc.next();
		System.out.println("Name을 입력하십시오.");
		String Name = sc.next();
		System.out.println("Kor를 입력하십시오.");
		int Kor = Integer.parseInt(sc.next());
		System.out.println("Eng를 입력하십시오.");
		int Eng = Integer.parseInt(sc.next());
		System.out.println("Math를 입력하십시오.");
		int Math = Integer.parseInt(sc.next());	
		
		StudentVO stu = new StudentVO(ID, Name, Kor, Eng, Math);
		sm.update(stu);
		
	}
	
	//4. 삭제
	void deleteRecord() {
		System.out.println("4번 삭제를 선택하셨습니다.");
		System.out.println("ID를 입력하십시오.");
		String ID = sc.next();
		sm.delete(ID);
		
	}
	
	//5. 종료
	void Exit() {
		System.out.println("시스템을 종료하셨습니다.");
	}
	
	//Title
	void printTitle() {
		System.out.println("성적처리(ver1.0)");
		System.out.println("-------------------------------------");
		System.out.println("1.조회 \t 2.입력 \t 3.수정 \t 4.삭제 \t 0.종료");
		System.out.println("-------------------------------------");
		System.out.println(">> 작업선택 : ");
	}
	
}