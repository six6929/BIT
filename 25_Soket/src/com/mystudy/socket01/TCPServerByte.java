package com.mystudy.socket01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerByte {

	public static void main(String[] args) {
		// ������ : ServerSocket ��ü�� Ŭ���̾�Ʈ�� ������ ��ٸ���.
		ServerSocket server = null;
		try {
			System.out.println("[����] ����");
			//�����ʿ��� 10000�� ��Ʈ�� ���� ���� ����ϰڴٶ�� �ǹ�.
			server = new ServerSocket(10000);
			
			//�������� �ش���Ʈ�� ������ Ŭ���̾�Ʈ�� �������� ����
			Socket socket = server.accept();
			
			System.out.println("[����] Ŭ���̾�Ʈ ����");
			
			//�������κ��� Input, Output ��Ʈ�� ��ü ����
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			//InputStream ��ü�� �̿��ؼ� �о���̴� �۾�
			byte[] buf = new byte[100];
			
			while(true) {
				int readValue = is.read(buf);
				if(readValue == -1) break;
				String msg = new String(buf);
				System.out.println("�����޽���: " + msg);
			}
			
//			is.read(buf);
//			System.out.println("���� �޼��� : " + new String(buf));
			
			is.close();
			os.close();
			
			
			System.out.println("[����] ����");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
