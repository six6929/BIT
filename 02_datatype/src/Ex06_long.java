
public class Ex06_long {
	public static void main(String[] args) {
		//정수형 long : 8byte
		//범위 : -9,223,372,036,854,775,808
		//    ~ 9,223,372,036,854,775,807
		//long 타입값 명시적 표현 : 숫자 + L 또는 l(대소문자 엘)
		//아무도 부호가 없으면 int 타입
		long num1 = 200000000000L;
		long num2 = 300000000000l;
		long sum = num1 + num2;
		//출력 : num1 + num2 = sum
		System.out.println(num1 + "+" + num2 + "=" + (sum));
		
		System.out.println("------------------------");
		byte numByte = 100;
		short numShort = 3000;
		int numInt = 30000000;
		long numLong = 50000000000L;
		//노란색 줄 - 안내메시지!!(선언만 하고 사용하지 않은 것들에 표현이 됨)
		
		System.out.println("numByte: " + numByte);
		System.out.println("numShort: " + numShort);
		
		numByte = (byte) numShort; //강제로 형변환(2byte) -> byte(1byte)
		System.out.println("numByte: " + numByte);
		System.out.println("numShort: " + numShort);
		
		System.out.println("----------------------");
		
		numInt = numShort; //자동 형변환(작은데이터 타입 -> 큰 데이터 타입)
		
		numInt = (int)numLong; //long(8byte) -> int(4type)
		System.out.println("numInt = (int)numLong : " + numInt);

	}
}
