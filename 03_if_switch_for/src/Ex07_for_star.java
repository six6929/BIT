
public class Ex07_for_star {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 중첩 for문 사용
		// *****
		// *****
		// *****
		// *****
		// *****
//		System.out.print("*");
		
		System.out.println("--- 중첩 이중 for문 사용 ---");
		for(int j=1; j<=5; j++) {
			for(int i=1; i<=3; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		/*
		  삼각형 그리기
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
