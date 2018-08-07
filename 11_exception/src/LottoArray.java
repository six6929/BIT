
public class LottoArray {

	public static void main(String[] args) {
		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i + 1;
		}
		
		int temp;
		int randomNum;
		for(int i=1; i<lotto.length; i++) {
			randomNum = (int)(Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[randomNum];
			lotto[randomNum] = temp;
		}
		
		printArray(lotto);
		
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}

		static void printArray(int lotto[]) {
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i] + " ");
		}
		System.out.println();
	}
}
