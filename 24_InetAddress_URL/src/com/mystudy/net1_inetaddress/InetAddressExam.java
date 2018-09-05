package com.mystudy.net1_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam {

	public static void main(String[] args) throws UnknownHostException {
		//InetAddress : IP�ּ� ���� Ŭ����
		InetAddress iaddr = InetAddress.getLocalHost();
		System.out.printf("ȣ��Ʈ�̸� : %s \n", iaddr);
		System.out.printf("ȣ��Ʈ IP�ּ�: %s \n", iaddr.getHostAddress());
		
		//------------------------------
		System.out.println("---- ���̹� �ּ� �˻� ----");
		iaddr = InetAddress.getByName("www.naver.com");
		System.out.printf("ȣ��Ʈ�̸� : %s %n", iaddr.getHostName());
		System.out.printf("ȣ��ƮIP�ּ� : %s %n", iaddr.getHostAddress());

		//---------------------------------
		System.out.println("---- ���̹� IP�ּҵ� �˻� ----");
		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		
		
		for(InetAddress ia : iaArr) {
			System.out.printf("ȣ��Ʈ�̸� : %s %n", ia.getHostName());
			System.out.printf("ȣ��ƮIP�ּ� : %s %n", ia.getHostAddress());
		}

	}

}
