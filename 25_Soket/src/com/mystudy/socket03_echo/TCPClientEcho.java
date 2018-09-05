package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClientEcho {

	public static void main(String[] args) {
		Socket socket = null;
		
		//�Է� ó���� ��ü ���� ���� ����
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//��� ó���� ��ü ���� ���� ����
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		
		
		
		try {
			System.out.println("---- Ŭ���̾�Ʈ ----");
			System.out.println(">>> ������ ����");
			socket = new Socket("127.0.0.1", 10000);
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//���������� ����(Output)
			System.out.println(">>> �޽��� ����(client -> server)");
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			
			String sendMsg = "�ȳ��ϼ���~~ �ݰ����ϴ�.";
			System.out.println(">>������ �޽��� : " + sendMsg);
			pw.println(sendMsg);
			pw.flush();
			
			//------------------------------------------------
			//�����ʿ��� ������ �޽��� �б�
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String receiveMsg = br.readLine();
			System.out.println(">>���� �޽��� : " + receiveMsg);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			pw.close();
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("---Ŭ���̾�Ʈ ����---");
		}
		
		
		
		
		
		
		
		
	}

}
