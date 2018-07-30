
public class Ex05_for {

	public static void main(String[] args) {
		//제어문 - 반복문(for, while, do~while)
		//for 문
		//for (초기값; 실행(종결)조건문; 증감치) {}
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("---------------------");
		
		for(int i=1; i<=5; i++) {
			System.out.println("*");
		}
		System.out.println("---------------------------");
		
		for(int i=1; i<=5; i+=1) {
			System.out.println("*");
		}
		
		System.out.println("---------------------------");
		/////////////////////////////////////////////////////
		//
		
		System.out.println("*****");
		
		//10번 반복 시작값을 0부터 시작하고 1씩 증가시키면서 10회 반복 출력
		
		for(int i=0; i<10; i++) {
			System.out.println("*****");
		}
		System.out.println("------------------------");
		
		//1~10까지 숫자를 출력하세요
		//1
		//2
		//3
		//4
		//5
		//...
		//10
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		} // 가독성이 높음
		
		System.out.println("----------");
		int num =1; // 이 num은 전역변수이므로 전 범위에서 호출가능
		
		for(int i = 0; i<10; i++) {
			System.out.println(num);
			num = num + 1;
		} // 유지보수면에서는 이게 더 유용하다
		// for문 범위는 중괄호안에서만 사용됨.\
//		System.out.println(i); -> 이 i는 중괄호 밖에 벗어난 i이므로 실행되어지지 않는다.
		
		//주의사항
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			i++; //for문 내에서 i값 변경
		}
		
	}
}
