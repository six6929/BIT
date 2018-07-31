package com.mystudy.am;

public class Ex02_array2 {

	public static void main(String[] args) {
		// 1~100까지의 수 중에 홀수의 합 구하기(배열사용)
		
		// 문제1. 배열에 저장공간 50개 사용
		// 저장공간만들기 int 타입의 값을 저장할 수 있는 크기 50인 배열 생성
		// 1~100 숫자 중 홀수값만 배열에 저장
		// 배열에 저장된 값을 모두 더한 후 결과 출력
		
		//변수선언
		int[] odd = new int[50];
		int sum = 0;
		for(int i=0; i<odd.length; i++) {
			odd[i] = i * 2 + 1; //1, 3, 5, 7, 9
		}
		
		//배열값 출력
		for(int i=0; i<odd.length; i++) {
			System.out.println("인덱스 : " + i + " 값 : " + odd[i] + " ");
		}
		System.out.println();
		
		//배열의 값을 sum에 합산해서 출력
		//1~100까지 숫자 중 홀수 합계 : ?
		
		for(int i=0; i<odd.length; i++) {
			sum += odd[i];
		}
		System.out.println("1~100까지 숫자 중 홀수 합계 : " + sum);
		
		//////////////////////////////
		//1~100까지의 수 중에서 홀수의 합 구하기(배열사용)
		//1~100까지의 숫자를 배열에 저장
		//1. 배열선언
		//2. 배열 초기화
		//3. 배열 값 중 홀수 값 추출해서 합산
		
		System.out.println("====================================================");
		//홀수값들의 합
		//1. 배열선언(int 타입의 값 100개 저장)
		int[] num = new int[100];
		System.out.println("nums의 크기 : " + num.length);
		
		System.out.println("-----------------------");
		
		//2-1. 입력된 값 확인
		for (int i=0; i<num.length; i++) {
			num[i] = i + 1;
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		//3. 배열 값 중 홀수 값 추출해서 합산
		sum = 0;
		for (int i=0; i<num.length; i+=2) {
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		System.out.println();
		System.out.println("홀수 합 : " + sum);
		
		
		
		System.out.println("=================");
		sum = 0;
		for (int i=0; i<num.length; i++) {
			if(num[i] % 2 == 1) {
				sum += num[i];
			}
		}
		System.out.println("홀수 합 : " + sum);
		
		//배열에 있는 값 중 짝수는 짝수끼리 합산, 홀수는 홀수끼리 합산해서 결과 출력
		
		int oddSum = 0;
		int evenSum = 0;
		for(int i=0; i<num.length; i++) {
			if(num[i] % 2 == 1) {
				oddSum += num[i];
			} else {
				evenSum += num[i];
			}
		}
		System.out.println("홀수 합 : " + oddSum);
		System.out.println("짝수 합 : " + evenSum);
		

	}
	
}


