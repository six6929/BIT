
public class Ex01_if {

	public static void main(String[] args) {
		//���-�б⹮(�񱳹�)
		//if��
		//if (�񱳹�) { �񱳰�� true�� �� ������ �����; }
		/*
		 if (�񱳹�) {
		         ������ ����;
		 }
		 */
		
		int num1 = 10;
		int num2 = 20;
		if(num1 < num2) {
			System.out.println("num1�� num2���� �۴�.");
		}
		System.out.println(">>> ���۾� ��");
		
		System.out.println("------------");
		boolean result = num1 < num2;
		if(result) {
			System.out.println("num1�� num2���� �۴�.");
		}
		
		//-------------------------------------
		//���� �� ��� : ��, ��, ��, ��, ��
		//100 ~ 90 : ��
		// 89 ~ 80 : ��
		// 79 ~ 70 : ��
		// 69 ~ 60 : ��
		// 59 ~    : ��
		
		int jumsu = 30;
		if (jumsu >= 90) {
			System.out.println("���� : ��");
		}else if(jumsu >= 80 && jumsu <= 89) {
			System.out.println("���� : ��");
		}else if(jumsu >= 70 && jumsu <= 79) {
			System.out.println("���� : ��");
		}else if(jumsu >= 60 && jumsu <= 69) {
			System.out.println("���� : ��");
		}else {
			System.out.println("���� : ��");
		}
		System.out.println(">>> ����ó�� ��");
		
		
 
	}

}
