
public class Ex08_for_star_ex {

	public static void main(String[] args) {
		//���� ---------------------------
		//*****
		//****
		//***
		//**
		//*
		
		//���� ��
		for(int i=1; i<=5; i++) {
			for(int j=6; j-i>0; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println("==================");
		
		//����� ��
		int lineCnt = 5;
		int starCnt = lineCnt;
		String dispChar = "&";
		for(int line=1; line<=lineCnt; line++) {
			for(int star=1; star<=starCnt; star++) {
				System.out.print(dispChar);
			}
		System.out.println();
		starCnt--;
		}
		
		System.out.println("==================");
		//����-----------------------------
		//    *
		//   **
		//  ***
		// ****
		//*****
		//My answer
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if((i+j)>=4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}	

		System.out.println("===================");
		
		int spaceCnt = 4;
		starCnt = 1;
		//����� ��
		for(int line=1; line<=5; line++) {
		for(int space=1; space<=spaceCnt; space++) {
			System.out.print(" ");
		}
		for(int star=1; star<=starCnt; star++) {
			System.out.print("*");
		}
		System.out.println();
		spaceCnt--;
		starCnt++;
		}
		//����-----------------------------
		//*****
		// ****
	    //  ***
		//   **
		//    *
		
		System.out.println("--------------");
		//���� ��
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i<=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("-------------------");
		//����� ��
		
		spaceCnt = 0;
		starCnt = 5;
		for(int line=1; line<=5; line++) {
		for(int space=1; space<=spaceCnt; space++) {
			System.out.print(" ");
		}
		for(int star=1; star<=starCnt; star++) {
			System.out.print("*");
		}
		System.out.println();
		spaceCnt++;
		starCnt--;
		}
		
		System.out.println("=======================");
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<12-i; j++) {
				if(j<1+i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				}
			System.out.println("");
			}
		
		System.out.println("----------------------");
		for(int i=0; i<6; i++) {
			for(int j=0; j<6+i; j++) {
				if(j<5-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		//���� ------------------------------------------
		//���ڿ� ���� ������ tab ���
		//1
		//1	2
		//1	2 3
		//1	2 3	4

		//���� ��
//		int num = 1;
//		for(int i=4; i>0; i--) {
//			for(int j=5; j-i>0; j--) {
//				System.out.print(num + " ");
//			}
//			num++;
//			System.out.println("");
//		}
//		System.out.println("==========");
		//����� ��
		for(int line=1; line<=4; line++) {
			for(int dispNum=1; dispNum<=line; dispNum++) {
				System.out.print(dispNum);
				System.out.print(" ");
			}
		System.out.println();
		}
	
		
 		System.out.println("===================");
 		
 		//���Ǵ�
		int num = 1;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println("");
		}
		
		System.out.println("===============");
		
		//����� ��
		int dispNum = 1;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(dispNum);
				System.out.print(" ");
				dispNum++;
			}
			System.out.println("");
		}
		
		
		
	}
	
}
	
