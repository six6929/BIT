
public class Ex03_if_sungjuk {

	public static void main(String[] args) {
		// ����ó��
		// ����(kor), ����(eng), ����(math) ����
		// ����(tot) = ���� + ����  + ����
		// ���(avg) = ���� / 3
		//----------------------------------
		//������� ������ ���� ���� �ο�
		//90 ~ 100 : A
		//80 ~ 89  : B
		//70 ~ 79  : C
		//60 ~ 69  : D
		//60 �̸� (0~59) : F + �޽���(������ϼ���)
		//////////////////////////////////////
		//��� ����
		//�����հ� : 270
		//������� : 90
		//<�򰡰��>
		//A ����
		
		int kor = 50;
		int eng = 50;
		int math = 10;
		int tot = 0;
		int avg = 0;
		
		//���� ���ϱ�
		tot = kor + eng + math;
		System.out.println("�����հ� : " + tot);
		//��� ���ϱ�
		avg = tot / 3;
		System.out.println("������� : " + avg);
		//���� ���ϱ�
		System.out.println("<�򰡰��>");
		String hakjum = "Z";
		if (avg >= 90) {
			System.out.println("A");
			hakjum = "A";
		} else if (avg >= 80 && avg <= 89){
			System.out.println("B");
			hakjum = "B";
		} else if (avg >= 70 && avg <= 79) {
			System.out.println("C");
			hakjum = "C";
		} else if (avg >= 60 && avg <= 69) {
			System.out.println("D");
			hakjum = "D";
		} else {
			System.out.println("F" + " ������ϼ���.");
			hakjum = "F";
			
		}
		
		System.out.println("=======================");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("-------------");
		
		System.out.println("�����հ� : " + tot);
		System.out.println("������� : " + avg);
		System.out.println("<�򰡰��>");
		if (hakjum == "F") {
			System.out.println(hakjum + "����(������ϼ���.)");			
		} else {
			System.out.println(hakjum + "����");
		}

	}

}
