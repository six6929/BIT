package com.mystudy.am;

public class Ex01_array {

	public static void main(String[] args) {
		// �迭(Array) : ������ Ÿ�Գ����� ����
		// �迭�� ���� : �ڷ���[] ������
		// ������ �� ���� : �迭������[index] = ��;
		/* �迭 ���� �� ���� 
		 1. �ڷ���[] = ������ = new �ڷ���[����];
		          �ڷ��� ������[] = new �ڷ���[����];
		 2. �ڷ���[] ������ = new �ڷ���[]{100,200,300};
		 3. �ڷ���[] ������ = {100,200,300}; //ũ�Ⱑ 3�� ���������� ����
		 */
		
		//�迭�� �����ϰ� ���
		//���� ������ 5���� ������ �� �ִ� �迭
		int[] arr = new int[6];
		System.out.println("arr : " + arr);
		arr[0] = 100;
		System.out.println("arr[0] : " + arr[0]);
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		arr[5] = 600;
//		arr[5] = 600; //�迭�� ���丮���� �Ѿ�� ������ ������ ���� ��.
		System.out.println("arr[4] : " + arr[4]);
		int sum = 0;
		sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		System.out.println("sum : " + sum);
		
		
		System.out.println("--- �迭�� for ��� �հ� ----");
		sum = 0;
		for(int idx=0; idx<5; idx++) {
//			System.out.println(arr[idx]);
			sum += arr[idx];
		}
		System.out.println("sum : " + sum);
		
		//�迭�� ũ�� �� Ȯ��
		System.out.println("arr�迭�� ũ�� : " + arr.length);
		System.out.println("----------");
		for(int i=0; i < arr.length; i++) {
			System.out.println("arr[i] : " + arr[i]);
		}
		
		//===========================================
		System.out.println("---���� ���ĺ� ���---");
		char[] ch = new char[26]; // �迭 ���� �� ũ�� ����
		ch[0] = 'A'; // int������ 65
		System.out.println("ch[0] : " + ch[0]);
		ch[1] = 'B'; //'A' + 1
		System.out.println("ch[1] : " + ch[1]);
		ch[2] = 'B' + 1; 
		System.out.println("ch[2] : " + ch[2]);
		
		//ch�迭������ 'A'~'Z' ���� ����
		for(int i=0; i<26; i++) {
			ch[i] = (char)('A' + i);
		}
		
		//ch �迭�� ����� �� ��ȸ(���)
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		
		////////////////////////////////////
		//�迭 ���� ���º� ���
		System.out.println("--- �迭 ���� ����2 ----");
		//�迭�� �ʱⰪ ������ ũ����� �����ϴ� ����
		int[] num = new int[] {0, 1, 2, 3, 4};
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		System.out.println("--- �迭 ���� ����3 ----");
		//new Ű���� ����{} �ȿ� ���� �����ؼ� �迭�� �ʱⰪ�� ũ������
		int arr3[] = {0, 1, 2, 3, 4};
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
	

}
