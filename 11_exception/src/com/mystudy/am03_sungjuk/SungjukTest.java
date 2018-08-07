package com.mystudy.am03_sungjuk;

public class SungjukTest {

	public static void main(String[] args) {
		System.out.println("---- main() ���� ----");
		
		SungjukVO stu = new SungjukVO("ȫ�浿", 100,90,80,270,90.0);
		System.out.println(stu.toString());
		stu.setKor(999);
		System.out.println(stu.toString());

		System.out.println("���� ���� ó��");
		try {
			stu.setEng(999);
		} catch (JumsuOutOfValueException e) {
//			e.printStackTrace();
			System.out.println(">> main()���� ���ܸ� catch ó�� : " + e.getMessage());
		}
		
		System.out.println(stu.toString());
		System.out.println("---- main() ���� ----");
	}

}
