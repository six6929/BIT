package com.mystudy.thread;

//쓰레드를 만드는 방법1
class ThreadTest extends Thread{
	int num = 10;
	
	ThreadTest() {

	}
	
	ThreadTest(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		//Thread 클래스의 run() 메소드를 오버라이딩해서
		//쓰레드로 하려는 작업을 작성
		System.out.println(">> run() 시작");
		
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
		
		System.out.println(">> run() 종료");
	}
}

public class ThreadExtendsExam {

	public static void main(String[] args) {
		System.out.println("--- main() 시작 ---");
		ThreadTest th1 = new ThreadTest();
		
//		th1.run(); //메소드호출일뿐 쓰레드로 동작하지 않음
//		쓰레드로 동작시키려면 Thread클래스가 구현한 start() 메소드 호출
		th1.start();
		
		//쓰레드 하나 더 생성
		ThreadTest th2 = new ThreadTest(20);
		th2.start();
		
		System.out.println("--- main() 종료 ---");

	}

}
