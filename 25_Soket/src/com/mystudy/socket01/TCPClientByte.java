package com.mystudy.socket01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClientByte {

	public static void main(String[] args) {
		// Ŭ���̾�Ʈ : Socket�� �̿��ؼ� ������ ����(����IP�ּ�, ������Ʈ��ȣ)
		Socket socket = null;
		try {
			System.out.println("---- Ŭ���̾�Ʈ ----");
			//                   localhost  , port
			socket = new Socket("127.0.0.1", 10000);
			
			//������ Socket���κ��� Input, Oupput ��Ʈ�� ����
			OutputStream os = socket.getOutputStream();
			InputStream is = socket.getInputStream();
			
			//OutputStream �̿��ؼ� ����
			byte[] buf = "�ȳ��ϼ���~ �ݰ����ϴ�.".getBytes();
			
			System.out.println(">> �޽������� : " + new String(buf));
			os.write(buf);
			os.flush();
			
			os.close();
			is.close();
			socket.close();
			
			System.out.println(">>> Ŭ���̾�Ʈ ����");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
