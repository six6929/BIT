public class Ex09_plusplus {
	public static void main(String[] args) {
		//���������� : ++, --
		//������� : ++������, ������++, --������, ������--
		// ++ : ���� 1 ������Ŵ
		// -- : ���� 1 ���ҽ�Ŵ
		// ++num -> num = num + 1;
		int num1 = 100;
		num1 = num1 + 1; // ++num1; �Ǵ� num1++; ��ü
		System.out.println("num : " + num1);
		
		num1 = 100;
		++num1;
		System.out.println("num : " + num1);
		
		num1 = 100;
		num1++;
		System.out.println("num : " + num1);
		
		System.out.println("---------------");
		int sum = 0;
		num1 = 100;
		sum = ++num1 + 1;
		//sum�� ���
		//num1�� ���
		
		System.out.println("sum : " + sum);
		System.out.println("num1 : " + num1);
		
		num1 = 100;
		sum = num1++ + 1;
		//sum �� ���
		//num1 �� ���
		
		System.out.println("sum : " + sum);
		System.out.println("num1 : " + num1);
		
		
		System.out.println("----------------");
		num1 = 100;
		System.out.println("num1 : " + num1);
		System.out.println("++num1 : " + ++num1);
		num1 = 100;
		System.out.println("num1 : " + num1);
		System.out.println("num1++ : " + num1++);
		
		System.out.println("-------------------");
		num1 = 100;
//		num1--;
//		--num1;
		--num1;
		int num2 = num1;
		System.out.println("num2 : " + num2);
		
		num1 = 100;
		num2 = 200;
		sum = 0;
		sum = ++num1 + --num2;
		System.out.println("sum : " + sum);
		/* 
		  ++num + 1 = ������ num���� 1�� ������ �� + 1�� ���������ν� 102��� ���� ������
		  num++ + 1 = ������ num���� 1�� �������ν� 101�̶�� ���� ����
		*/
		
		System.out.println("=================");
		num1 = 100;
		num2 = 200;
		sum = 0;
		sum = num1++ + ++num2; // num1�� ���� �״�� 100 + num 2�� ���� ���� �� 201 = 301
		System.out.println("sum : " + sum);
		
		System.out.println("-------------------");
		num1 = 100;
		num2 = 200;
		sum = 0;
		++num2;
		sum = num1 + num2;
		num1++;
		System.out.println("sum : " + sum);
		
	}
}
