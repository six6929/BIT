package com.mystudy.am03_interface;

//�������̽�(�߻�ü)
public interface I_Phone {
	//�߻�޼ҵ�(�������� ���� �޼ҵ�) - ���Ǹ� �Ǿ� �ִ� ��
	void view(); 			//0. ��ȭ���� Ȯ��
	void call(); 			//1. ��ȭ�ɱ�
	void receiveCall(); 	//2.��ȭ�ޱ�
	void sendMsg(); 		//3.�޽��� ������
	void receiveMsg(); 		//4.�޽��� �ޱ�
}
