import java.util.Scanner;

public class SungjukProcess {
	
	int num = 0; // �Է��� ���ڸ� ���� ����
	String tyId = ""; //Id�� �Է��� ����
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
		
		while(true) {
			if(sp.managementRecord() == false) {
				break;
			}
		}
	} //���� ����
	
	
	
	
	//��ü ����ó��
	public boolean managementRecord() {
		boolean result = true;
		printTitle();
			num = Integer.parseInt(sc.nextLine());
			
		while(true) {
			switch(num) {
			case 1 :
				checkRecord();
				break;
				
			case 2 :
				insertRecord();
				break;
				
			case 3 :
				correctRecord();
				break;
				
			case 4 :
				deleteRecord();
				break;
				
			case 0 :
				Exit();
				result = false;
				break;
			
			default :
				System.out.println("[����] 0~4������ ���ڸ� �������ּ���");
				continue;
			}
			return result;
		}
	}
	
	
	
	
	//1. ��ȸ
	void checkRecord() {
		System.out.println("1�� ��ȸ�� �����ϼ̽��ϴ�.");
		System.out.println("���ϴ� ���񽺸� �����Ͻʽÿ�.");
		while(true) {
			System.out.println("1. �� ��ü ���� ��ȸ \t 2. �л� ���� ���� ��ȸ \t 0. ����");
			
			num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1 :
				checkRecordAll();
				break;
			
			case 2 :
				checkRecordEach();
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
	
	
	//1-1. �� ��ü ��ȸ
	void checkRecordAll() {
		System.out.println("�� ��ü ������ ��ȸ ��� >>");
		sm.selectAll();
		return;
	}
	
	//1-2. �������� �л� ��ȸ
	void checkRecordEach() {
		System.out.println("��ȸ�ϰ� ���� �л��� ID�� �Է��Ͻʽÿ�.");
		tyId = sc.next();
		sm.selectOne(tyId);
		return;
	}
	
	//2. �Է�
	void insertRecord() {
		System.out.println("2�� �Է��� �����ϼ̽��ϴ�.");
		System.out.println("���ʴ�� �Է����ֽʽÿ�.");
		
		System.out.println("ID�� �Է��Ͻʽÿ�.");
		String ID = sc.next().trim();
		System.out.println("Name�� �Է��Ͻʽÿ�.");
		String Name = sc.next().trim();
		System.out.println("Kor�� �Է��Ͻʽÿ�.");
		int Kor = Integer.parseInt(sc.next().trim());
		System.out.println("Eng�� �Է��Ͻʽÿ�.");
		int Eng = Integer.parseInt(sc.next().trim());
		System.out.println("Math�� �Է��Ͻʽÿ�.");
		int Math = Integer.parseInt(sc.next().trim());	
		
		StudentVO stu = new StudentVO(ID, Name, Kor, Eng, Math);
		sm.insert(stu);
		
		System.out.println("�Է� �Ϸ�Ǿ����ϴ�.");
		}
	
	//3. ���� 
	void correctRecord() {
		System.out.println("3�� ������ �����ϼ̽��ϴ�.");
		System.out.println("ID�� �Է��Ͻʽÿ�.");
		String ID = sc.next();
		System.out.println("Name�� �Է��Ͻʽÿ�.");
		String Name = sc.next();
		System.out.println("Kor�� �Է��Ͻʽÿ�.");
		int Kor = Integer.parseInt(sc.next());
		System.out.println("Eng�� �Է��Ͻʽÿ�.");
		int Eng = Integer.parseInt(sc.next());
		System.out.println("Math�� �Է��Ͻʽÿ�.");
		int Math = Integer.parseInt(sc.next());	
		
		StudentVO stu = new StudentVO(ID, Name, Kor, Eng, Math);
		sm.update(stu);
		
	}
	
	//4. ����
	void deleteRecord() {
		System.out.println("4�� ������ �����ϼ̽��ϴ�.");
		System.out.println("ID�� �Է��Ͻʽÿ�.");
		String ID = sc.next();
		sm.delete(ID);
		
	}
	
	//5. ����
	void Exit() {
		System.out.println("�ý����� �����ϼ̽��ϴ�.");
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