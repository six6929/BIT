
public class Ex11_AND_OR_NOT {

	public static void main(String[] args) {
		//���������� : && (AND),  || (OR), | (NOT)
		//����������(&&, ||)�� ��, �������� ture, false ���� �־�� ��
		int num1 = 10;
		int num2 = 20;
		int num3 = 20;
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println("---- && (AND) ----");
		System.out.println("true && true : " + (true && true));
		System.out.println("true && false : " + (true && false));
		
		System.out.println(">>>");
		System.out.println(bool1 + "&&" + bool2 + " : " +  (bool1 && bool2));
		
		System.out.println("---------");
		//num1 < num2 && bool1 : ??
		boolean result = num1 < num2 && bool1;
		System.out.println(num1 + " < " + num2 + " && " + bool1 + " : " + (result));
		
		//----------------------------
		// OR
		System.out.println("--- || (OR) ---");
		System.out.println("false || true : " + (false || true));
		result = num1 > num2 || bool2;
		System.out.println("num1 > num2 || bool2 : " + result);
		System.out.println(num1 + " > "  + num2 + " || " + bool2 + " : " + result);
		
		//---------------------------------------
		//NOT : !
		System.out.println("--- ! (NOT) ---");
		System.out.println("!true : " + !true);
		result = !(num1 > num2 || bool2);
		System.out.println("!(num1 > num2 || bool2) : " + result);
				
		
			
	}

}