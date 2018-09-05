package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEcho {

	public static void main(String[] args) {
		// ���� : Ŭ���̾�Ʈ���� �޽����� �ް� �ٽ� �ǵ�����
		// Ŭ���̾�Ʈ�κ��� �޽����� �а�, Ŭ���̾�Ʈ ������ ����
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
			
			System.out.println(">>> �����...");
			Socket socket = server.accept();
			
			//������ �б�(Input, read)
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			System.out.println(">>> �޽��� �б�");
			String msg = br.readLine();
			System.out.println("���� �޽������ : " + msg);
			
			//--------------------------------------
			//������ ����(Output, write)
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			
			pw.println("[�������� ����]" + msg);
			pw.flush();
			
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
		
		System.out.println(">> ��������");
		
	}

}
