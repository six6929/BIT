package com.mystudy.socket04_echo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEchoWhile {

	public static void main(String[] args) {
		//Ŭ���̾�Ʈ���� ������ �޽����� �ް� ������ �ݺ� ó��
		//����(Input)�Ŀ� ���Ÿ޽��� ȭ����� �� Ŭ���̾�Ʈ�� ����(Output)
		ServerSocket server = null;
		
		//�����͸� �б� ���� ��ü�� ������ ���� ����
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
					
		//�����͸� ���� ���� ��ü�� ������ ���� ����
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;

		
		try {
			
			System.out.println(">> ��������");
			server = new ServerSocket(10000);
				
			System.out.println(">> ���� �����");
			Socket socket = server.accept();
			
			while(true) {
				//����� ���ϰ� �����͸� �ְ� �ޱ� ���� I/O ��ü ����
				is = socket.getInputStream();
				os = socket.getOutputStream();
				
				//���� �߰� : ����Ʈ(byte) ���� ó�� ��ü�� ����(char)���� ó�� ��ü�� ��ȯ
				isr = new InputStreamReader(is);
				osw = new OutputStreamWriter(os);

				//���� �߰� : ����(buffer)������� ���ϰ� ���δ��� �����
				br = new BufferedReader(isr);
				pw = new PrintWriter(osw);
				
				
				System.out.println(">> ������ �б�");
				
				while (true) {
				String msg = br.readLine();
				System.out.println("���� �޽��� ��� : " + msg);
				
				//Ŭ���̾�Ʈ�� �۾� ����(exit �Է�)�ϸ� �ݺ� ����
				if("exit".equalsIgnoreCase(msg)) {
					break;
				}
				
				//Ŭ���̾�Ʈ���� �����޽��� �ǵ���������
				pw.println("[�������� ����] " + msg);
				pw.flush();
			}
		}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
