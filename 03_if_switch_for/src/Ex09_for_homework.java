
public class Ex09_for_homework {

	public static void main(String[] args) {
		// 2~9�ܱ��� ������ ���η� ����
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				int avg = i*j;
				System.out.print(j + "*" + i + "=" + avg +"\t");
			}
			System.out.println();
		}

	}

}
