
public class Ex05_for {

	public static void main(String[] args) {
		//��� - �ݺ���(for, while, do~while)
		//for ��
		//for (�ʱⰪ; ����(����)���ǹ�; ����ġ) {}
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("---------------------");
		
		for(int i=1; i<=5; i++) {
			System.out.println("*");
		}
		System.out.println("---------------------------");
		
		for(int i=1; i<=5; i+=1) {
			System.out.println("*");
		}
		
		System.out.println("---------------------------");
		/////////////////////////////////////////////////////
		//
		
		System.out.println("*****");
		
		//10�� �ݺ� ���۰��� 0���� �����ϰ� 1�� ������Ű�鼭 10ȸ �ݺ� ���
		
		for(int i=0; i<10; i++) {
			System.out.println("*****");
		}
		System.out.println("------------------------");
		
		//1~10���� ���ڸ� ����ϼ���
		//1
		//2
		//3
		//4
		//5
		//...
		//10
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		} // �������� ����
		
		System.out.println("----------");
		int num =1; // �� num�� ���������̹Ƿ� �� �������� ȣ�Ⱑ��
		
		for(int i = 0; i<10; i++) {
			System.out.println(num);
			num = num + 1;
		} // ���������鿡���� �̰� �� �����ϴ�
		// for�� ������ �߰�ȣ�ȿ����� ����.\
//		System.out.println(i); -> �� i�� �߰�ȣ �ۿ� ��� i�̹Ƿ� ����Ǿ����� �ʴ´�.
		
		//���ǻ���
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			i++; //for�� ������ i�� ����
		}
		
	}
}
