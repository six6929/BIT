
public class Ex10_gt_lt {

	public static void main(String[] args) {
		//�񱳿����� : >, <, >=, <= (ũ�ų� ����), <= (�۰ų� ����)
		//         == (����), != (���� �ʴ�, �ٸ���)
		//�� ������ ��� : true, false
		int num1 = 10;
		int num2 = 20;
		int num3 = 20;
		//num1 > num : ??
		System.out.println(num1 + ">" + num2 + " : " + (num1 > num2));
		System.out.println(num1 + "<" + num2 + " : " + (num1 < num2));
		System.out.println(num1 + ">=" + num2 + " : " + (num1 >= num2));
		System.out.println(num1 + "<=" + num2 + " : " + (num1 <= num2));
		System.out.println(num1 + "!=" + num2 + " : " + (num1 != num2));
		//num2 == num3 : ??
		System.out.println(num2 + "==" + num3 + " : " + (num2 == num3));
		
		
		System.out.println("-------------------------");
		//������ �ǹ� : ! (not)
		boolean power = true; // power���ٰ� true���� �ָ� ������ ������ �ǹ�
		System.out.println("power : " + power);
		power = !power;
		System.out.println("power : " + power);
		power = !power;
		System.out.println("power : " + power);
		
		power = true;
		// power ���� ture�� �� if �� ����
		
		if(power) { // power�� true���� ������ ����
			System.out.println("power���� true : ���� ON �����Դϴ�. ");
		} 
		// power ���� false�� �� if�� ����
		if(!power) { //power ���� true�� �� ������� �ʰ�, false�� �� ����
			System.out.println("power���� false : ���� OFF �����Դϴ�. ");
		}
		System.out.println(">>> ���α׷� ��");

	}

}
