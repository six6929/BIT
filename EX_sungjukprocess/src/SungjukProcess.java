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
			System.out.println("성적조회에 성공하셨습니다.");
			checkRecord();
		}
		
		return result;
	}
	
	//1. 조회
	void checkRecord() {
		sm.selectAll();
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
	
	//Title
	void printTitle() {
		System.out.println("성적처리(ver1.0)");
		System.out.println("-------------------------------------");
		System.out.println("1.조회 \t 2.입력 \t 3.수정 \t 4.삭제 \t 0.종료");
		System.out.println("-------------------------------------");
		System.out.println(">> 작업선택 : ");
	}
	
}
