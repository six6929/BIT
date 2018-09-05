package com.mystudy.thread2_runnable;

class ThreadParent {
	void print() {
		System.out.println("���� Thread Ŭ������ ParentŬ����");
	}
}


//������(Thread)�� �����ϴ� Ŭ���� ����� ���2
//Runnable �������̽��� ����(implements)�ϴ� ������� �����
class ThreadImpl extends ThreadParent implements Runnable {

	@Override
	public void run() {
		super.print();
		System.out.println("ThreadImpl.run() : Runnable �������̽� ������");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
}

public class ThreadImplRunnable {

	public static void main(String[] args) {
		System.out.println("---- main() ���� ----");
		Thread thMain = Thread.currentThread();
		System.out.println(thMain.toString());
		
		//Runnable �������̽��� ������ ��ü�� ������� ����ϱ� ���ؼ���
		//Thread Ŭ������ �����ڿ� Runnable ������ü�� �����ؼ� 
		//������ ��ü ����
		ThreadImpl thrImpl = new ThreadImpl();
		
		Thread th = new Thread(thrImpl); //new Thread(Runnable ��ü)
		
		th.start(); //������� ���۽�Ŵ
				

		System.out.println("---- main() ���� ----");
	}

}






