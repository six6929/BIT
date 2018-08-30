package com.mystudy.am01_random;

import java.util.Random;

public class RandomExam01 {

	public static void main(String[] args) {
		//Random Ŭ���� : ������ �����ϴ� Ŭ����
		//�������� : nextInt() - intŸ���� ���� �߻�
		//        nextInt(10) - 0 ~ 9 ������ ���� �߻�
		//        nextLong() - long Ÿ���� ���� �߻�
		//�Ǽ����� : nextFloat() - �Ǽ��� float Ÿ�� ���� �߻�
		//        nextDouble() - �Ǽ��� double Ÿ�� ���� �߻�
		//�������� : nextBoolean() - true, false �� �� �ϳ� �߻�
		
		Random ran = new Random();
		
		System.out.println("���� nextBoolean() : " + ran.nextBoolean());
		System.out.println("���� nextBoolean() : " + ran.nextBoolean());
		
		System.out.println("--- nextInt() ---");
		System.out.println("����nextInt() : " + ran.nextInt(3));
		System.out.println("����nextInt() : " + ran.nextInt(3));
		System.out.println("����nextInt() : " + ran.nextInt(3));
	
		
		System.out.println("--- nextFloat() ---");
		System.out.println("����nextFloat() : " + ran.nextFloat());
		System.out.println("����nextFloat() : " + ran.nextFloat());
		System.out.println("����nextFloat() : " + ran.nextFloat());
		
		System.out.println("--- nextDouble() ---");
		System.out.println("����nextDouble() : " + ran.nextDouble());
		System.out.println("����nextDouble() : " + ran.nextDouble());
		System.out.println("����nextDouble() : " + ran.nextDouble());
	}

}
