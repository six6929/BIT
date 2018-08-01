package com.mystudy.sort;

public class ArraySelectionSort {

	public static void main(String[] args) {
		//배열에 저장된 숫자 정렬(오름차순 : ASC)
		//30, 20, 50, 40, 10
		int[] num = {30, 20, 50, 40, 10};
		
		//데이터 확인
//		for(int i=0; i<num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
		printData(num);
		
		System.out.println("--- 정렬시작 ---");
		//첫번째 값 기준으로 비교 작업(0인덱스 - 1인덱스)
		int temp;
/*
		if(num[0] > num[1]) {
			temp = num[0];
			num[0] = num[1];
			num[1] = temp;
		} 
		printData(num);
		//첫번째 값 기준으로 비교 작업(0인덱스 - 2인덱스)
		if(num[0] > num[2]) {
			temp = num[0];
			num[0] = num[2];
			num[2] = temp;
		} 
		printData(num);
		//첫번째 값 기준으로 비교 작업(0인덱스 - 3인덱스)
		if(num[0] > num[3]) {
			temp = num[0];
			num[0] = num[3];
			num[3] = temp;
		} 
		printData(num);
		//첫번째 값 기준으로 비교 작업(0인덱스 - 4인덱스)
		if(num[0] > num[4]) { //인덱스 : num.length-1
			temp = num[0];
			num[0] = num[4];
			num[4] = temp;
		} 
		printData(num);
		
		//반복문으로 변경처리
		//첫번째 값을 기준으로 정렬(인덱스 : 0이 기준)
		for(int i=1; i<=4; i++) {
			if(num[0] > num[i]) {
				temp = num[0];
				num[0] = num[i];
				num[i] = temp;
			} 
		}
		printData(num);
		
		//두번째 값을 기준으로 정렬(인덱스 : 1이 기준)
		for(int i=2; i<=4; i++) {
			if(num[1] > num[i]) {
				temp = num[1];
				num[1] = num[i];
				num[i] = temp;
			} 
		}
		printData(num);
		
		//세번째 값을 기준으로 정렬(인덱스 : 2이 기준)
		for(int i=3; i<=4; i++) {
			if(num[2] > num[i]) {
				temp = num[2];
				num[2] = num[i];
				num[i] = temp;
			} 
		}
		printData(num);

		//네번째 값을 기준으로 정렬(인덱스 : 3이 기준)
		for(int i=4; i<=4; i++) {
			if(num[3] > num[i]) {
				temp = num[3];
				num[3] = num[i];
				num[i] = temp;
			} 
		}
		printData(num);
*/		
/*		
		//반복문 처리
		System.out.println("--- 이중 for문으로 처리 ---");
		int baseIdx = 0;
		for(int dest=1; dest<=4; dest++) {
			for(int i=dest; i<=4; i++) {
				if(num[baseIdx] > num[i]) {
					temp = num[baseIdx];
					num[baseIdx] = num[i];
					num[i] = temp;
				} 
			}
			baseIdx++;
		}
		printData(num);
*/		
/*		
		//바깥쪽 기준 for문은 시작(0인덱스)부터 마지막인덱스 전까지
		int lastValue = num.length-1;
		for(int gijun=0; gijun < lastValue; gijun++) {
			//for문의 시작은 기준인덱스 + 1 값으로 시작하고 마지막인덱스까지
			for (int i=gijun+1; i<num.length; i++) {
				if(num[gijun] > num[i]) { // 내림차순하려면 부호만 바꾸면 됨.
					temp = num[gijun];
					num[gijun] = num[i];
					num[i] = temp;
				} 
			}
		}
		printData(num);
*/	
		////////////////////////////////////////////////////
		//값 비교후 위치값만 확인하고 마지막에 교환 한번만 실행
		
		printData(num);
		
		System.out.println("--- 정렬 시작 ---");
		int lastValue = num.length-1;
		int changeIdx ; //변경할 대상이 되는 인덱스 값 저장용
		for(int gijun=0; gijun < lastValue; gijun++) {
			changeIdx = gijun;
			//for문의 시작은 기준인덱스 + 1 값으로 시작하고 마지막인덱스까지
			for (int i=gijun+1; i<num.length; i++) {
				//0, 1
				if(num[changeIdx] > num[i]) { // 내림차순하려면 부호만 바꾸면 됨.
					changeIdx = i;
				} 
			}
			//기준값과 최종 인덱스된 위치값과 교환
			if(gijun != changeIdx) {
				System.out.println(gijun + " <-> " + changeIdx);
				temp = num[gijun];
				num[gijun] = num[changeIdx];
				num[changeIdx] = temp;
			}
			
			printData(num);
		}
		
	}
	
	//정열된 10,20,30,40,50을 내림차순으로 바꾸고 싶으면 1,5을 바꾸고 2,4을 교환작업을 해주면된다.
	
	
	static void printData(int[] num) {
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

}
