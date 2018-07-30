import java.util.*;

public class Ex09_for_gugudan {

	public static void main(String[] args) {
		//화면에 구구단 2단
		/*
		 2*1=2
		 2*2=4
		 2*3=6
		 ...
		 2*9=18
		 */
		int num=1;
		System.out.println("2*" + num + "=" + (2*num));
		num++;
		System.out.println("2*" + num + "=" + (2*num));
		num++;
		
		System.out.println("--2단--");
		for(int i=1; i<=9; i++) {
			System.out.println("2*" + i + "=" + (2*i));
		}
		System.out.println("=======================");
		//1. 이름(중첩) for문을 사용해서 2~9단까지 출력
		int dan = 0;
		for(dan=2; dan<10; dan++) {
			System.out.println("---" + dan + "단 ---");
			for(int j=1; j<10; j++) {
				System.out.println(dan + "*" + j + "=" + (dan*j));
			}
			System.out.println("-------");
		}

		//2. 시작단과(startDan) 끝나는 단(endDan)을 입력하면 구구단 출력
		//나의답
//		System.out.println("startDan을 입력하세요 : ");
//		System.out.println("endDan을 입력하세요 : ");
//		int startDan = 0;
//		int endDan = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp1 = scanner.nextLine();
//		String tmp2 = scanner.nextLine();
//		startDan = Integer.parseInt(tmp1);
//		endDan = Integer.parseInt(tmp2);
//		
//		System.out.println(startDan + "*" + endDan + "=" + (startDan * endDan));
		
		//강사님 답
		int startDan = 2;
		int endDan = 9;
		for(dan=startDan; dan<=endDan; dan++) {
			System.out.println("---" + dan + "---");
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}
			System.out.println();
			
		}
		
//		System.out.println("=========================");
//		System.out.print("2*1=2 ");
//		System.out.print("3*1=3 ");
//		System.out.print("\n");
		
		
	}

}
