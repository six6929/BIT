
public class Ex04_short {

	public static void main(String[] args) {
		// ������ short : 2byte(���� : 65536��, ���� : -32768 ~ 32767)
		// �ڵ������� ���� ��ȯ�Ǵ� ���� �������� ����ȯ�̶�� ��
		short short1 = 20000;
		short short2 = 30000;
		System.out.println("short1: " + short1);
		System.out.println("short2: " + short2);
		
		//�� ��ȯ�� ���ִ� ���� ������� ����ȯ�̶�� ��
		short sum =(short)(short1 + short2);
		System.out.println("short sum <- short1 + short2: " + sum);
		
		int sumInt = short1 + short2;
		System.out.println("int sumInt <- short1 + short2: " + sumInt);
	}

}
