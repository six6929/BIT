import java.util.Scanner;

public class ScannerGame2 {

	public static void main(String[] args) {
		// ��ǻ�Ͱ� �������� 1~100���� �ϳ��� ���� ����
		// �����Է� : ~~
		// ��ǻ�� : ~~�� ���ں��� ũ��
		// �����Է� : ~~~
		// ��ǻ�� : ~~~ �� �۴�.
		// ...
		// 5�� ��ȸ �ȿ� �����ϸ� ���� // �����ϸ� �����ϸ鼭 ����˷��ֱ�
		
		
		//��ǻ�Ͱ� �������� 1~100���� �ϳ��� ���� ����
		
		int rNum = 1;
		
		rNum = (int)(Math.random() * 100);
		
		int Cnt = 1;
			
		while(Cnt <= 5) {
			
			//�����Է�
			System.out.println("1~100���� ���� �� �ϳ��� �����ϼ���.");	
			Scanner sc = new Scanner(System.in);
			int numSelect = (Integer.parseInt(sc.nextLine()));
			
			if(rNum > numSelect) {
				System.out.println(numSelect + "���� ū �����Դϴ�.\n");
			} else if (rNum < numSelect) {
				System.out.println(numSelect + "���� ���� �����Դϴ�.\n");
			} else if (rNum == numSelect) {
				System.out.println("5�� �ȿ� ������ ���߾����ϴ�.\n");
				return;
			} else if (numSelect < 0 || numSelect > 100) {
				System.out.println("1~100�� ��� �����Դϴ�.");
				continue;
			}
			Cnt++;
		}	
		System.out.println("5�� �ȿ� ������ ������ ���Ͽ����ϴ�. ���� ������ ���ڴ� : " + rNum);
		
//		System.out.println("�ٽ� �����Ͻðڽ��ϱ�? (Y,N)");
//		
//		String replay = "";
//		
//		Scanner sc1 = new Scanner(System.in);
//		String Y = sc1.nextLine();
//		
//		if (replay == Y) {
//			rNum = 1;
//			
//			rNum = (int)(Math.random() * 100);
//			
//			Cnt = 1;
//				
//			while(Cnt <= 5) {
//				
//				//�����Է�
//				System.out.println("1~100���� ���� �� �ϳ��� �����ϼ���.");	
//				Scanner sc = new Scanner(System.in);
//				int numSelect = (Integer.parseInt(sc.nextLine()));
//				
//				if(rNum > numSelect) {
//					System.out.println(numSelect + "���� ū �����Դϴ�.\n");
//				} else if (rNum < numSelect) {
//					System.out.println(numSelect + "���� ���� �����Դϴ�.\n");
//				} else if (rNum == numSelect) {
//					System.out.println("5�� �ȿ� ������ ���߾����ϴ�.\n");
//					return;
//				} else if (numSelect < 0 || numSelect > 100) {
//					System.out.println("1~100�� ��� �����Դϴ�.");
//					continue;
//				}
//				Cnt++;
//			}	
//			System.out.println("5�� �ȿ� ������ ������ ���Ͽ����ϴ�.���� ������ ���ڴ� : " + rNum);
//		
//		} else if (replay != Y) {
//			System.out.println("����Ǿ����ϴ�.");
//			return;
//		}
	
		
		
	}
}