public class Ex05_int {

	public static void main(String[] args) {
		//������ int : 4byte, ����(-2,147,483,648 ~ 2,147,483,647)
		int num1 = 70000;
		int num2 = 30000;
		int sum = num1 + num2; // sum <- num1 + num2
		//num1 + num2 = sum
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		//% ������ : ������ ���� �� ������ ���� ����
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		
		//0���� ������ ���
		int num3 = -1;
		System.out.println(num1 + "/ 0 " + (num1 / num3));
		
		System.out.println(">>> ���α׷��� ��");

	}

}
