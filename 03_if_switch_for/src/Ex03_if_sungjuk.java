
public class Ex03_if_sungjuk {

	public static void main(String[] args) {
		// 성적처리
		// 국어(kor), 영어(eng), 수학(math) 점수
		// 총점(tot) = 국어 + 영어  + 수학
		// 평균(avg) = 총점 / 3
		//----------------------------------
		//평균점수 구간에 따라 학점 부여
		//90 ~ 100 : A
		//80 ~ 89  : B
		//70 ~ 79  : C
		//60 ~ 69  : D
		//60 미만 (0~59) : F + 메시지(재수강하세요)
		//////////////////////////////////////
		//출력 형태
		//성적합계 : 270
		//평균점수 : 90
		//<평가결과>
		//A 학점
		
		int kor = 50;
		int eng = 50;
		int math = 10;
		int tot = 0;
		int avg = 0;
		
		//총점 구하기
		tot = kor + eng + math;
		System.out.println("성적합계 : " + tot);
		//평균 구하기
		avg = tot / 3;
		System.out.println("평균점수 : " + avg);
		//학점 구하기
		System.out.println("<평가결과>");
		String hakjum = "Z";
		if (avg >= 90) {
			System.out.println("A");
			hakjum = "A";
		} else if (avg >= 80 && avg <= 89){
			System.out.println("B");
			hakjum = "B";
		} else if (avg >= 70 && avg <= 79) {
			System.out.println("C");
			hakjum = "C";
		} else if (avg >= 60 && avg <= 69) {
			System.out.println("D");
			hakjum = "D";
		} else {
			System.out.println("F" + " 재수강하세요.");
			hakjum = "F";
			
		}
		
		System.out.println("=======================");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("-------------");
		
		System.out.println("성적합계 : " + tot);
		System.out.println("평균점수 : " + avg);
		System.out.println("<평가결과>");
		if (hakjum == "F") {
			System.out.println(hakjum + "학점(재수강하세요.)");			
		} else {
			System.out.println(hakjum + "학점");
		}

	}

}
