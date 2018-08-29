import java.util.Scanner;

public class SungjukProcess {
	
	int num = 0;
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
	sp.managementRecord();
		
	} //메인 종료
	
	
	
	
	//전체 성적처리
	public boolean managementRecord() {
		boolean result = true;
		printTitle();
		num = Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 1 :
			checkRecord();
			break;
			
		case 2 :
			
			break;
			
		case 3 :
			
			break;
			
		case 4 :
			
			break;
			
		case 0 :
			
			break;
		}
		
		return result;
	}
	
	
	
	//1. 조회
	void checkRecord() {
		System.out.println("조회를 선택하셨습니다.");
		System.out.println("원하는 서비스를 선택하십시오.");
		while(true) {
			System.out.println("1. 반 전체 성적 조회 \t 2. 학생 개인 성적 조회 \t 0. 종료");
			
			num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1 :
				sm.selectAll();
				break;
			
			case 2 :
				//System.out.println("학생 개인 성적 조회를 선택하셨습니다.");
				System.out.println("조회하고 싶은 학생의 ID를 입력하십시오.");
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
	
	//2. 입력
	void insertRecord() {
		System.out.println("성적입력이 완료되었습니다.");
	}
	//3. 수정 
	void correctRecord() {
		
	}
	
	//4. 삭제
	void deleteRecord() {
		
	}
	
	//5. 종료
	void Exit() {
		
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
