
public class Ex03_byte {

	public static void main(String[] args) {
		// ������ byte : ���� ���� ���� 256����(-128~127)
		byte byte1 = 100;
		byte byte2 = 30;
		byte byte3 = 0;
		
		//sysout �� ctrl + spacebar Ŭ��
		System.out.println("byte1: " + byte1);
		//ctrl + alt + ȭ��ǥ�Ʒ�
		System.out.println("byte1: " + byte2);
		
		//�������� int���� �Ǳ� ������ ������ ���� �׷��� ��ȣ�� �ٽ� byte���� �������־�� ��
		//������ �� ���� �� ��ȯ�� ���־�� ��
		byte3 = (byte)(byte1 + byte2);
		System.out.println("byte1 +byte2 : " + byte3);
	}

}
