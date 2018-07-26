
public class Ex06_long {
	public static void main(String[] args) {
		//������ long : 8byte
		//���� : -9,223,372,036,854,775,808
		//    ~ 9,223,372,036,854,775,807
		//long Ÿ�԰� ����� ǥ�� : ���� + L �Ǵ� l(��ҹ��� ��)
		//�ƹ��� ��ȣ�� ������ int Ÿ��
		long num1 = 200000000000L;
		long num2 = 300000000000l;
		long sum = num1 + num2;
		//��� : num1 + num2 = sum
		System.out.println(num1 + "+" + num2 + "=" + (sum));
		
		System.out.println("------------------------");
		byte numByte = 100;
		short numShort = 3000;
		int numInt = 30000000;
		long numLong = 50000000000L;
		//����� �� - �ȳ��޽���!!(���� �ϰ� ������� ���� �͵鿡 ǥ���� ��)
		
		System.out.println("numByte: " + numByte);
		System.out.println("numShort: " + numShort);
		
		numByte = (byte) numShort; //������ ����ȯ(2byte) -> byte(1byte)
		System.out.println("numByte: " + numByte);
		System.out.println("numShort: " + numShort);
		
		System.out.println("----------------------");
		
		numInt = numShort; //�ڵ� ����ȯ(���������� Ÿ�� -> ū ������ Ÿ��)
		
		numInt = (int)numLong; //long(8byte) -> int(4type)
		System.out.println("numInt = (int)numLong : " + numInt);

	}
}
