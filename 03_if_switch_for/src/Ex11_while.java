
public class Ex11_while {

	public static void main(String[] args) {
		// �ݺ��� : for, while, do ~ while(ũ�� ���� for, while�� �ִ� ��)
		// break : �ݺ����� �����ϰ� ��������(���� �������� �ݺ������� ��������)
		/* while
		 �ʱⰪ ����
		 while (����/�������ǹ�) {
		 	���ǹ����� ��������(�ݺ����������� - ����)
		 	������ ����;
		 	���ǹ����� ��������(�ݺ������������� - ����)
		 }
		 */
		
		//1~10 ���
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//while�� ����
		int num = 1;
		while (num <= 10) {
			System.out.print(num + " ");
			num++;
		}
		System.out.println();
		
		System.out.println("--- while�� ���ѹݺ� -----");
		num = 1;
		while(true) {
			System.out.print(num + " ");
			if(num == 10) break; // �ݺ� �����ϰ� ��������
			num++;
		} // ����ġ�� ������ ��� �����ϴ��Ŀ� ���� ���� �޶��� �� �ִ�.
		
		//------------------------------------------
		//do ~ while : ������ 1���� ����
		/*
		 �ʱⰪ ����;
		do {
			����ġ ����(�����ɹ� ��/��)
			������ ��ɹ�;
		} while (���ǹ�); 
		 */
		System.out.println("\n===================");
		//1~10���� ���
		num = 0;
		do {
			num++;
			System.out.println("do~while : " + num);
		} while(num <= 10); 
		
		System.out.println("==== break, continue ======");
		
		
		///////////////////////////////////
		// break : ���� �������� �ݺ����� �����ϰ� ��������
		// continue : �ݺ����� ������ �̵��� ������ �Ǵ� ���ǹ� ó��
		//			(continue �� ������ ���๮�� �������� ����)
		
		// 1~10���� ���(7���� ��� �� �ߴ�)
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
			if (i == 7) break; //7���� ��� �� �ݺ� ����
		}
		System.out.println();
		
		//1~10���� ���(7�� ������� �ʴ´�)
		for(int i=1; i<=10; i++) {
			if (i != 7) {
				System.out.print(i + " ");				
			}
		}
		
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			if (i == 7) continue; //������ġ���� ���� �ݺ��� ����
				System.out.print(i + " ");				
		}
		System.out.println("\n------------------------");
		int num2 = 0;
		while(num2 < 10) {
			num2++;
			if(num2 == 7) continue; // while������ ���� ������ ó�� ���� ���
			System.out.print(num2 + " ");
		}
		System.out.println();
		
		////////////////////////////
		//��ø �ݺ������� break ���
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println("i : " + i + ", j : " + j);
				if(j == 3) break; //���ʿ� �ִ� for���� ��������
			}
		}
		System.out.println();
		//��ø �ݺ����� ��� �����ϴ� ���(��ġ����)
		outFor : //������
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println("i : " + i + ", j : " + j);
				if(j == 4) break outFor; //outFor �̸��� �ִ� for���� ��������
			}
		}
		
		System.out.println("===============");
		////////////////////////////////////
		//��ø �ݺ��� while
		//�ʱⰪ ����
		int outNum = 1;
		while(outNum <= 3) { // ���� ���ǽ� ����
			int inNum = 1;
			while(inNum <= 5) {
				System.out.println("inNum : " + inNum);
				inNum++;
			}
			//����ġ ����
			outNum++;
		}
	}// main �޼ҵ� ����
}// class ����

