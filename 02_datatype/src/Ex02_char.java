
public class Ex02_char {

	public static void main(String[] args) {
		//������(character - char) : 2byte, ���� 1���� ����(65536��)
		//�ڹ� ����ó�� �����ڵ�(Unicode) ����
		char ch1 = 'A'; //"A"�� ���ڿ�(String)
		System.out.println("ch1 : " + ch1); //A : �ƽ�Ŷ�ڵ尪 65
		System.out.println(ch1);
		System.out.println(ch1 + 1); //65 + 1
		System.out.println((char)(ch1 + 1));
		System.out.println((char)(67));
		
		char ch2 = '��';
		System.out.println("ch2: " + ch2);
		System.out.println((ch2 + 1));
		System.out.println((char)(ch2 + 1));
		
		//�����ڵ� ǥ����� : \uAC00 - ��
		char ch3 = '\uAC01';
		System.out.println("ch3: " + ch3);
		
		ch3 = '\uD7A3';
		System.out.println("ch3: " + ch3);
	}

}
