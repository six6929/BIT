
public class Ex06_for_sum {

	public static void main(String[] args) {
		// ���� : 1���� 10������ �հ踦 ���Ͻÿ�.(ȭ�����)
		int startNum = 50;
		int endNum = 100;
		int sum = 0;
		int num = 0;
		for(int i=startNum; i<=endNum; i++) {
			sum = i+sum;
		}
		System.out.println(startNum + " ���� " +endNum + " ������ �� =" + sum);
		
		//-------------------------
		num = 1; // 1~10���� ���ϴ� ��
		sum = 0; // ������ ���� ������ ����
		
//		//�ݺ� : 1
//		sum = sum + num; // sum = 0 + 1;
//		System.out.println("sum : " + sum);
//		num = num + 1; // num : 2  -  num++, num += 1
//		
//		//�ݺ� : 2
//		sum = sum + num;
//		System.out.println("sum : " + sum);
//		num = num + 1; // num : 2  -  num++, num += 1
//		
//		//�ݺ� : 3
//		sum = sum + num; // sum = (0 + 1) + 2
//		System.out.println("sum : " + sum);
//		num = num + 1; // num : 2  -  num++, num += 1
//		
		for(int i=1; i<=10; i++) {
			sum = sum+num;
			System.out.println("i : " + i + " num : "+ num + " sum : " + sum);
			num = num + 1;
		}
		System.out.println("1~10������ �հ� : " + sum);
		
		System.out.println(">>>>>>");
		
		sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum+i;
			System.out.println("i : " + i + ", sum : " + sum);
		}
		System.out.println("1~10������ �հ� : " + sum);
		
		//-----------------------------------------------
		//10 ~ 1���� ���
		//10
		//9
		//...
		//1
		
		for(int i = 10; i>0; i--) {
			System.out.println(i);
		}
		
		System.out.println("========================");
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.println();
		System.out.println();
		System.out.print(4);
		System.out.print(5);
		
		
	}

}
