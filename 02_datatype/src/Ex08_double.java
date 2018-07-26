public class Ex08_double {

	public static void main(String[] args) {
		//실수형 double : 8byte(범위 -1.7E308 ~ 1.7E308)
		//표시형식 : 숫자.숫자  / 숫자.숫자 + D 또는 d (대소문자)
		double d1 = 1.1;
		double d2 = 1.12345678901234567890;
		System.out.println("double 1.1 : " + d1);
		System.out.println("double 1.12345678901234567890d : " + d2);
		//double d2 : 1.1234567890123457 -> 6이 나와야하지만 반올림되어 7로 표기(15자리까지 정확도 보장)
		
		double sum = d1 + d2;
		System.out.println("d1 + d2 : " + sum);
		
		System.out.println("3.4d + 3.2d : " + (3.4d + 3.2d));
		
		float f1 = 3.4f;
		
		d1 = f1; //double <- float : 자동 형변환
		
		//정수형 <-> 실수행
		f1 = 123456789012345.0f;
		System.out.println("123456789012345.0f : " + f1);
		
		d1 = 123456789012345.0d;
		System.out.println("123456789012345.0d -> double : " + d1);
		
		int numInt = 1234567890;
		f1 = numInt; // 자동 형변환 (같은 4바이트지만 int타입보단 float타입이 표현할 수 있는 범위가 더 큼)
		System.out.println("1234567890 -> float : " + f1);
		
		// numInt = f1; 자동 형변환 되지 않음 : float 표현범위가 int 보다 크기 때문이다.
		// char를 int로 넣을때는 자동 형변환이 됨
		
		
		
	}

}
