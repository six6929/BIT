
public class Ex01_if {

	public static void main(String[] args) {
		//제어문-분기문(비교문)
		//if문
		//if (비교문) { 비교결과 true일 때 실행할 문장들; }
		/*
		 if (비교문) {
		         실행할 문장;
		 }
		 */
		
		int num1 = 10;
		int num2 = 20;
		if(num1 < num2) {
			System.out.println("num1이 num2보다 작다.");
		}
		System.out.println(">>> 비교작업 끝");
		
		System.out.println("------------");
		boolean result = num1 < num2;
		if(result) {
			System.out.println("num1이 num2보다 작다.");
		}
		
		//-------------------------------------
		//점수 평가 결과 : 수, 우, 미, 양, 가
		//100 ~ 90 : 수
		// 89 ~ 80 : 우
		// 79 ~ 70 : 미
		// 69 ~ 60 : 양
		// 59 ~    : 가
		
		int jumsu = 30;
		if (jumsu >= 90) {
			System.out.println("성적 : 수");
		}else if(jumsu >= 80 && jumsu <= 89) {
			System.out.println("성적 : 우");
		}else if(jumsu >= 70 && jumsu <= 79) {
			System.out.println("성적 : 미");
		}else if(jumsu >= 60 && jumsu <= 69) {
			System.out.println("성적 : 양");
		}else {
			System.out.println("성적 : 가");
		}
		System.out.println(">>> 성적처리 끝");
		
		
 
	}

}
