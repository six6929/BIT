//public class는 class이름과 파일명 이름이 같아야만 한다. 
public class Ex01_boolean {
	public static void main(String[] args) {
		//변수선언 형태 : 데이터타입 변수명
        //boolean타입 : true, false 값을 가짐
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println("bool1 : " + bool1);
		System.out.println("bool2 : " + bool2);
		System.out.println("-----------------");
		
		//비교연산을 하게 되면 참/거짓을 판별할 수 있기 때문에 변수로 사용가능 
		bool1 = false;
		bool1 = 100 > 200; //비교연산 결과값 저장
		if (bool1) {
			System.out.println("bool1의 값이 true");
		} else {
			System.out.println("bool1의 값은 false");
		}
	}
}
