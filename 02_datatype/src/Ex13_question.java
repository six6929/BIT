
public class Ex13_question {

	public static void main(String[] args) {
		//���׿�����(Ternary Operator)
		//������� : ���� ? true�϶� ���๮�� : flase�� �� ���๮��;
		int num1 = 30;
		int num2 = 20;
		boolean big = num1 > num2;
		System.out.println(big);
		
		String str = "���ڿ����� StringŸ��";
		System.out.println("str : " + str);
		
		System.out.println("--- ��Ȳ������ ���� ��� ----");
		str = (num1 > num2) ? "num1ũ��" : "num1�� ũ�� �ʴ�" ;
		System.out.println("num1 > num2 ���  : " + str);

	}

}
