import java.util.*;

public class Ex09_for_gugudan {

	public static void main(String[] args) {
		//ȭ�鿡 ������ 2��
		/*
		 2*1=2
		 2*2=4
		 2*3=6
		 ...
		 2*9=18
		 */
		int num=1;
		System.out.println("2*" + num + "=" + (2*num));
		num++;
		System.out.println("2*" + num + "=" + (2*num));
		num++;
		
		System.out.println("--2��--");
		for(int i=1; i<=9; i++) {
			System.out.println("2*" + i + "=" + (2*i));
		}
		System.out.println("=======================");
		//1. �̸�(��ø) for���� ����ؼ� 2~9�ܱ��� ���
		int dan = 0;
		for(dan=2; dan<10; dan++) {
			System.out.println("---" + dan + "�� ---");
			for(int j=1; j<10; j++) {
				System.out.println(dan + "*" + j + "=" + (dan*j));
			}
			System.out.println("-------");
		}

		//2. ���۴ܰ�(startDan) ������ ��(endDan)�� �Է��ϸ� ������ ���
		//���Ǵ�
//		System.out.println("startDan�� �Է��ϼ��� : ");
//		System.out.println("endDan�� �Է��ϼ��� : ");
//		int startDan = 0;
//		int endDan = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp1 = scanner.nextLine();
//		String tmp2 = scanner.nextLine();
//		startDan = Integer.parseInt(tmp1);
//		endDan = Integer.parseInt(tmp2);
//		
//		System.out.println(startDan + "*" + endDan + "=" + (startDan * endDan));
		
		//����� ��
		int startDan = 2;
		int endDan = 9;
		for(dan=startDan; dan<=endDan; dan++) {
			System.out.println("---" + dan + "---");
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}
			System.out.println();
			
		}
		
//		System.out.println("=========================");
//		System.out.print("2*1=2 ");
//		System.out.print("3*1=3 ");
//		System.out.print("\n");
		
		
	}

}
