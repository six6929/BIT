
public class Ex04_short {

	public static void main(String[] args) {
		// 정수형 short : 2byte(갯수 : 65536개, 범위 : -32768 ~ 32767)
		// 자동적으로 형을 변환되는 것이 묵시적인 형변환이라고 함
		short short1 = 20000;
		short short2 = 30000;
		System.out.println("short1: " + short1);
		System.out.println("short2: " + short2);
		
		//형 변환을 해주는 것이 명시적인 형변환이라고 함
		short sum =(short)(short1 + short2);
		System.out.println("short sum <- short1 + short2: " + sum);
		
		int sumInt = short1 + short2;
		System.out.println("int sumInt <- short1 + short2: " + sumInt);
	}

}
