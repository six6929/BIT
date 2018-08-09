package com.mystudy.am03_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//ť (Queue) �������̽� - LinkedList Ŭ����
// - ���»� ������ ���(���Լ���)

//����(Stack)
//���»����� �ٴ��� ���� ���� ����(���Լ���)

public class Stack_Queue {

	public static void main(String[] args) {
		// ť(Queue) : ���Լ���
		System.out.println("---- ť(Queue) : ���Լ��� ----");
		Queue que = new LinkedList();
		que.offer("1.ù°"); //add ����
		que.offer("2.��°"); //add ����
		que.offer("3.��°"); //add ����
		que.offer("4.��°"); //add ����
		System.out.println(que);
		System.out.println("----- peek() --------");
		//peek()�� Queue�ȿ� ������ִ°��� �б⸸ �ϴ°�
		System.out.println("que.peek() : " + que.peek());
		System.out.println("que.peek() : " + que.peek());
		
//		System.out.println("----- poll() --------");
//		//pool() : Queue�ȿ� ������ִ°��� ������ ��, �����Ͱ� ������ null ����
//		System.out.println("que.poll() : " + que.poll());
//		System.out.println("que.poll() : " + que.poll());
//		System.out.println("que.poll() : " + que.poll());
//		System.out.println("que.poll() : " + que.poll());
//		System.out.println("que.poll() : " + que.poll());
//		
		//��ü ������ ����
		System.out.println("--- ��ü ������ ���� ---");
		System.out.println("que.isEmpty() : " + que.isEmpty());
		System.out.println("que.size() : " + que.size());
		//ť�� ������� ������ ������ ����
		
//		while (que.isEmpty() == false) {
		while (!que.isEmpty()) {
			System.out.println(que.poll());
		}
		System.out.println("que.size() : " + que.size());
		
		///////////////////////////////////////////////////////////
		System.out.println("=========����(Stack) : LIFO(���Լ���) ============");
		Stack st = new Stack();
		st.push("1.ù°");
		st.push("2.��°");
		st.push("3.��°");
		st.push("4.��°");
		System.out.println(st);
		System.out.println("st.peek() : " + st.peek());
		System.out.println("st.size() : " + st.size());
		
		//peek(), pop() ������ ��ȸ �Ǵ� ������ �� �� ������ EmptyStackException ���� �߻�
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop()); //Empty
//		System.out.println("st.peek() : " + st.peek()); // Emp
		System.out.println("--- ��ü ������ ��ȸ ---");
		System.out.println(st.isEmpty());
		System.out.println(st.empty());
		System.out.println("st.size() : " + st.size());
		while (!st.isEmpty()) { //������� ������ 
			System.out.println(st.pop());
//			System.out.println(st.peek());
		}
		System.out.println("st.size() : " + st.size());
		
		
	}
}
