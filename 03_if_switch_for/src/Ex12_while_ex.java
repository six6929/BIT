
public class Ex12_while_ex {

	public static void main(String[] args) {
		//while���� ����ؼ� ó��
		//���� 1 : 1~10������ �հ�(sum) ���ϰ� ���
		int num = 1;
		int sum = 0;
		while(num <= 10) {
			sum += num;
			System.out.println(num);
			num++;
		}
		System.out.println();
		System.out.println("1~10������ �հ�� : " + sum);
		//���� 2
		/* �ﰢ�� �׸���
		 *
		 **
		 ***
		 ****
		 *****
		 */
		
		int i = 1;
		while(i <= 5) {
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

		System.out.println("--------");
		
		i = 1;
		while(i <= 5) {
			int j = 6;
			while(j-i > 0) {
				System.out.print("*");
				j--;
			}
			System.out.println();
			i++;
		}

	}

}
