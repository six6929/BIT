public class Ex08_double {

	public static void main(String[] args) {
		//�Ǽ��� double : 8byte(���� -1.7E308 ~ 1.7E308)
		//ǥ������ : ����.����  / ����.���� + D �Ǵ� d (��ҹ���)
		double d1 = 1.1;
		double d2 = 1.12345678901234567890;
		System.out.println("double 1.1 : " + d1);
		System.out.println("double 1.12345678901234567890d : " + d2);
		//double d2 : 1.1234567890123457 -> 6�� ���;������� �ݿø��Ǿ� 7�� ǥ��(15�ڸ����� ��Ȯ�� ����)
		
		double sum = d1 + d2;
		System.out.println("d1 + d2 : " + sum);
		
		System.out.println("3.4d + 3.2d : " + (3.4d + 3.2d));
		
		float f1 = 3.4f;
		
		d1 = f1; //double <- float : �ڵ� ����ȯ
		
		//������ <-> �Ǽ���
		f1 = 123456789012345.0f;
		System.out.println("123456789012345.0f : " + f1);
		
		d1 = 123456789012345.0d;
		System.out.println("123456789012345.0d -> double : " + d1);
		
		int numInt = 1234567890;
		f1 = numInt; // �ڵ� ����ȯ (���� 4����Ʈ���� intŸ�Ժ��� floatŸ���� ǥ���� �� �ִ� ������ �� ŭ)
		System.out.println("1234567890 -> float : " + f1);
		
		// numInt = f1; �ڵ� ����ȯ ���� ���� : float ǥ�������� int ���� ũ�� �����̴�.
		// char�� int�� �������� �ڵ� ����ȯ�� ��
		
		
		
	}

}
