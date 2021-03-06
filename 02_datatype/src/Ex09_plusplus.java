public class Ex09_plusplus {
	public static void main(String[] args) {
		//증강연산자 : ++, --
		//사용형태 : ++변수명, 변수명++, --변수명, 변수명--
		// ++ : 값을 1 증가시킴
		// -- : 값을 1 감소시킴
		// ++num -> num = num + 1;
		int num1 = 100;
		num1 = num1 + 1; // ++num1; 또는 num1++; 대체
		System.out.println("num : " + num1);
		
		num1 = 100;
		++num1;
		System.out.println("num : " + num1);
		
		num1 = 100;
		num1++;
		System.out.println("num : " + num1);
		
		System.out.println("---------------");
		int sum = 0;
		num1 = 100;
		sum = ++num1 + 1;
		//sum값 출력
		//num1값 출력
		
		System.out.println("sum : " + sum);
		System.out.println("num1 : " + num1);
		
		num1 = 100;
		sum = num1++ + 1;
		//sum 값 출력
		//num1 값 출력
		
		System.out.println("sum : " + sum);
		System.out.println("num1 : " + num1);
		
		
		System.out.println("----------------");
		num1 = 100;
		System.out.println("num1 : " + num1);
		System.out.println("++num1 : " + ++num1);
		num1 = 100;
		System.out.println("num1 : " + num1);
		System.out.println("num1++ : " + num1++);
		
		System.out.println("-------------------");
		num1 = 100;
//		num1--;
//		--num1;
		--num1;
		int num2 = num1;
		System.out.println("num2 : " + num2);
		
		num1 = 100;
		num2 = 200;
		sum = 0;
		sum = ++num1 + --num2;
		System.out.println("sum : " + sum);
		/* 
		  ++num + 1 = 원래의 num값에 1을 증가한 후 + 1을 더해줌으로써 102라는 값이 나오고
		  num++ + 1 = 원래의 num값에 1만 더함으로써 101이라는 값이 나옴
		*/
		
		System.out.println("=================");
		num1 = 100;
		num2 = 200;
		sum = 0;
		sum = num1++ + ++num2; // num1의 값은 그대로 100 + num 2의 값은 변한 값 201 = 301
		System.out.println("sum : " + sum);
		
		System.out.println("-------------------");
		num1 = 100;
		num2 = 200;
		sum = 0;
		++num2;
		sum = num1 + num2;
		num1++;
		System.out.println("sum : " + sum);
		
	}
}
