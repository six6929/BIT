package com.mystudy.pm;

public class Ex01 {

	public static void main(String[] args) {
		//������ ��ȯ�ϱ�
		int i = 100;
		int k = 200;
		System.out.println("i : " + i + ", k : " + k);
		
		int j = 0;
		j = i;
		i = k;
		k = j;
		System.out.println("i : " + i + ", k : " + k);
		
		/////////////////////////////////
		//             0    1    2    3    4
		int[] nums = {100, 200, 300, 400, 500};
		System.out.println("�迭�� ũ�� : " + nums.length);
		// nums[0] < - > nums[4]
		int temp = 0;
		temp = nums[0];
		nums[0] = nums[4];
		nums[4] = temp;
		printArray(nums);

		
		//nums[1] < - > nums[3]
		temp = nums[1];
		nums[1] = nums[3];
		nums[3] = temp;
		printArray(nums);
		
		//�迭�� ���� �� ���� �Ǿ��� 
	
	}
	static void printArray(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
