import java.util.*;

public class Ex10_Yaza {

	public static void main(String[] args) {
//		int input = 0;
//		int answer = 0;
//		
//		answer = (int)(Math.random() * 100) + 1; // 1~100사이의 임의의 수를 저장
//		Scanner scanner = new Scanner(System.in);
//		
//		
//		do {
//			System.out.println("1과 100사이의 정수를 입력하세요 : ");
//			input = scanner.nextInt();
//			
//			if(input>answer) {
//				System.out.println("더 작은 수로 다시 시도해보세요.");
//			} else {
//				System.out.println("더 큰수로 다시 시도해보세요.");
//			}
//		} while(input !=answer);
//		
//		System.out.println("정답입니다.");
//
//		
		//다른 예제
		System.out.println("============================");
		for(int i=1; i<=100; i++) {
			System.out.printf("i=%d ", i);
			
			int tmp = i;
			
			do {
				if(tmp%10%3 == 0 && tmp%10 != 0)
					System.out.print("짝");
			} while((tmp/=10)!=0);
			
			System.out.println();
		}
	}
}
