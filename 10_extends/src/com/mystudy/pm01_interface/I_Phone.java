package com.mystudy.pm01_interface;

//�������̽� ���� ���(���ȭ�� Ŭ��������, �߻�޼ҵ�)
//Ŭ������� : public static final Ÿ�� ������
//�߻�޼ҵ� : ����θ� �ִ� �޼ҵ�
//         public abstract ����Ÿ�� �޼ҵ��();
// - �޼ҵ忡 ������ {} �� ����
public interface I_Phone {
	//����(Ŭ���� ���)
	public static final boolean TRUE = true;
	boolean FAIL = false; //public static final ����
	
	//�߻�޼ҵ�
	public abstract String getType();
	public String toString();
	void call(); //public abstract ����
	void receiveCall();
	void sendMsg();
	void receiveMsg();
	
	
}
