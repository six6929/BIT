package com.mystudy.pm04_abstract_class;

public class Cat extends Animal {
	
	
	//�޼ҵ� �������̵�(Overriding)
	//��Ӱ��迡 �ִ� Ŭ�������� 
	//�θ�Ÿ�Կ� �ִ� �޼ҵ带 �ڽ�Ÿ���� Ŭ�������� ������ 
	//������ �����ϰ� ��ɸ� �ٸ��� ����
	//������ �����ϴ� : ����Ÿ��, �޼ҵ��, �Ķ���Ͱ� ����(�Ķ���� ����, ����, Ÿ����ġ)
	@Override
	void sound() {
		System.out.println("�߿� �߿�~");
	}
	
	
}
