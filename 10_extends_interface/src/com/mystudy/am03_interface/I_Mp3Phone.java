package com.mystudy.am03_interface;

public interface I_Mp3Phone extends I_Phone { //extends I_Phone�� ���� ������  I_Phone�� �ִ� �޼������ ������ �� �ۼ��������

// ------------- I_Phone -------------------	
//	//�߻�޼ҵ�(�������� ���� �޼ҵ�) - ���Ǹ� �Ǿ� �ִ� ��
//		void view(); 			//0. ��ȭ���� Ȯ��
//		void call(); 			//1. ��ȭ�ɱ�
//		void receiveCall(); 	//2.��ȭ�ޱ�
//		void sendMsg(); 		//3.�޽��� ������
//		void receiveMsg(); 		//4.�޽��� �ޱ�
// ------------------------------------------	
	
	void playMusic();
}
