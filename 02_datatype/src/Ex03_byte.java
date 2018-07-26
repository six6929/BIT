
public class Ex03_byte {

	public static void main(String[] args) {
		// 정수형 byte : 정수 숫자 저장 256가지(-128~127)
		byte byte1 = 100;
		byte byte2 = 30;
		byte byte3 = 0;
		
		//sysout 후 ctrl + spacebar 클릭
		System.out.println("byte1: " + byte1);
		//ctrl + alt + 화살표아래
		System.out.println("byte1: " + byte2);
		
		//연산결과는 int값이 되기 때문에 오류가 생성 그래서 괄호로 다시 byte값을 지정해주어야 함
		//연산을 할 때는 형 변환을 해주어야 함
		byte3 = (byte)(byte1 + byte2);
		System.out.println("byte1 +byte2 : " + byte3);
	}

}
