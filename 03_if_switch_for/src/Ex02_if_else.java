
public class Ex02_if_else{
	public static void main(String[] args) {
		//if�� 3����
		//1. if (����) {}
		//2. if (����) {} else {}
		//3. if (����) {} else if () {} else if {}...
		int num1 = 30;
		int num2 = 20;
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
		//1. if (����) {}
		if (num1 > num2) {
			System.out.println("num1�� num2���� ũ��.");
		}
		System.out.println("if()��");
		
		System.out.println("--------------------");
		//2. if (����) {} else {}
		if(num1 > num2) {
			System.out.println("num1�� num2���� ũ��.");
		} else {
			System.out.println("num1�� num2���� �۰ų� ����.");
		}
		
		System.out.println(">>>>");
//		if(num1 > num2) {
//			System.out.println("num1�� num2���� ũ��.");
//		} else {
//			System.out.println("num1�� num2���� �۰ų� ����.");
//		}
		
		System.out.println("----------------------------");
		if(num1 > num2) {
			System.out.println("num1�� num2���� ũ��.");
		} else if (num1 == num2) {
			System.out.println("num1�� num2�� ����.");
		} else {
			System.out.println("num1�� num2���� �۴�.");
		}
		System.out.println("----------------------------");
		if(num1 > num2) {
			System.out.println("num1�� num2���� ũ��.");
		} else if (num1 == num2) {
			System.out.println("num1�� num2�� ����.");
		} else if (num1 < num2) {
			System.out.println("num1�� num2���� �۴�.");
		} else { //��� ���� ������� �ʴ� ����
			System.out.println("������� �ʴ� ����");
		}
		
		//=========================================
	}
	

}
