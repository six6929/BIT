import java.util.Scanner;

public class SungjukProcess {
	
	int num = 0;
	Scanner sc = new Scanner(System.in);
	StudentManager sm = new StudentManager();
	
	public static void main(String[] args) {
		
	/* **** ����ó��(ȭ���۾�)
	����ó��(ver 1.0)
	-------------------------------
	 1.��ȸ   2.�Է�   3.����   4.����    0.���� 
	-------------------------------
	>>�۾�����: 
	****************************/
	SungjukProcess sp = new SungjukProcess();
	sp.managementRecord();
		
	} //���� ����
	
	
	//��ü ����ó��
	public boolean managementRecord() {
		boolean result = true;
		printTitle();
		num = Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 1 :
			System.out.println("������ȸ�� �����ϼ̽��ϴ�.");
			checkRecord();
		}
		
		return result;
	}
	
	//1. ��ȸ
	void checkRecord() {
		sm.selectAll();
	}
	
	//2. �Է�
	void insertRecord() {
		System.out.println("�����Է��� �Ϸ�Ǿ����ϴ�.");
	}
	//3. ���� 
	void correctRecord() {
		
	}
	
	//4. ����
	void deleteRecord() {
		
	}
	
	//Title
	void printTitle() {
		System.out.println("����ó��(ver1.0)");
		System.out.println("-------------------------------------");
		System.out.println("1.��ȸ \t 2.�Է� \t 3.���� \t 4.���� \t 0.����");
		System.out.println("-------------------------------------");
		System.out.println(">> �۾����� : ");
	}
	
}
