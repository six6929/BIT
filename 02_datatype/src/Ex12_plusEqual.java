
public class Ex12_plusEqual {

	public static void main(String[] args) {
		//���Կ����� : =, +=, -=, +=, /=, %=
		//������� : �����Һ��� ���Կ����� �����Ұ�(���) �Ǵ� ����
		//��) num += 2; ---> num = num + 2;
		//   num�� �������� 2�� ������Ŵ
//		int num1; //��������
//		num1 = 10; //�ʱⰪ ����	
		int num1 = 10; 
		int num2 = 20;
		int result = 0;
		
		System.out.println("result : " + result);
		result += 15; // result = result + 15;
		System.out.println("result += 15 : " + result);
		//�ѹ� �� ���Ͽ���
		result += 15; // result = result + 15;
		System.out.println("result += 15 : " + result);
		
		System.out.println("--- -= ���� ---");
		result -= 10; // result = result - 10;
		System.out.println("result -= 10 : " + result);
		System.out.println(); //���� �ϳ� �߰�
		
		result *= 10;
		System.out.println("result *= 10 : " + result);
		
		result /= 130; //result = result / 130;
		System.out.println("result /= 130 : " + result);
		
		result = 10;
		System.out.println("result : " + result);
		result %= 3;
		System.out.println("result %= 3 : " + result);
		
		System.out.println("--------------------------------");
		System.out.println("num1: " + num1 + ", num2 : " + num2);
		System.out.println("result : " + result);
		result += num2;
		System.out.println("result += num2 : " + result);
		result -= num1;
		System.out.println("result -= num1 : " + result);
		
		System.out.println("-------------");
		System.out.println(10/3); //������ ������ ������ ���� ����
		System.out.println(10/3.0); //
	} 

}
