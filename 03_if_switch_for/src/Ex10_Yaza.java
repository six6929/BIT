import java.util.*;

public class Ex10_Yaza {

	public static void main(String[] args) {
//		int input = 0;
//		int answer = 0;
//		
//		answer = (int)(Math.random() * 100) + 1; // 1~100������ ������ ���� ����
//		Scanner scanner = new Scanner(System.in);
//		
//		
//		do {
//			System.out.println("1�� 100������ ������ �Է��ϼ��� : ");
//			input = scanner.nextInt();
//			
//			if(input>answer) {
//				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
//			} else {
//				System.out.println("�� ū���� �ٽ� �õ��غ�����.");
//			}
//		} while(input !=answer);
//		
//		System.out.println("�����Դϴ�.");
//
//		
		//�ٸ� ����
		System.out.println("============================");
		for(int i=1; i<=100; i++) {
			System.out.printf("i=%d ", i);
			
			int tmp = i;
			
			do {
				if(tmp%10%3 == 0 && tmp%10 != 0)
					System.out.print("¦");
			} while((tmp/=10)!=0);
			
			System.out.println();
		}
	}
}
