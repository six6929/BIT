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
			checkRecord();
			break;
			
		case 2 :
			
			break;
			
		case 3 :
			
			break;
			
		case 4 :
			
			break;
			
		case 0 :
			
			break;
		}
		
		return result;
	}
	
	
	
	//1. ��ȸ
	void checkRecord() {
		System.out.println("��ȸ�� �����ϼ̽��ϴ�.");
		System.out.println("���ϴ� ���񽺸� �����Ͻʽÿ�.");
		while(true) {
			System.out.println("1. �� ��ü ���� ��ȸ \t 2. �л� ���� ���� ��ȸ \t 0. ����");
			
			num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1 :
				sm.selectAll();
				break;
			
			case 2 :
				//System.out.println("�л� ���� ���� ��ȸ�� �����ϼ̽��ϴ�.");
				System.out.println("��ȸ�ϰ� ���� �л��� ID�� �Է��Ͻʽÿ�.");
				break;
			
			case 0 : 
				System.out.println("����");
				return;
				
			default : 
				System.out.println("[����] 0�� 2 ������ ���ڸ� �������ּ���.");
				continue;
			}
		}
		
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
	
	//5. ����
	void Exit() {
		
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
