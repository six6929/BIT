
public class Ex07_for_star {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��ø for�� ���
		// *****
		// *****
		// *****
		// *****
		// *****
//		System.out.print("*");
		
		System.out.println("--- ��ø ���� for�� ��� ---");
		for(int j=1; j<=5; j++) {
			for(int i=1; i<=3; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		/*
		  �ﰢ�� �׸���
		  *
		  **
		  ***
		  ****
		  *****
		 */

		for(int i=5; i>0; i--) {
			for(int j=6; j-i>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
