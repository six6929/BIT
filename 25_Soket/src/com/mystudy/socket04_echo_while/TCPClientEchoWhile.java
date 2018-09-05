package com.mystudy.socket04_echo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientEchoWhile {

	public static void main(String[] args) {
		//�޽����� �ۼ��ؼ� ������ �����ϰ�, �����κ��� ���޹��� �޽��� ���� �ݺ�
		//����(Output) �Ŀ� ����(Input)
		//�޽��� �ۼ� : Scanner ��ü ����ؼ� �ܼ�â���� �Է�
		Socket socket = null;
		
		InputStream is = null;
		OutputStream os = null;
		
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;

		BufferedReader br = null;
		
		PrintWriter pw = null;
		
		
		try {
			System.out.println("Ŭ���̾�Ʈ ����");
			socket = new Socket("127.0.0.1", 10000);
			
		
			//����� ���ϰ� �����͸� �ְ� �ޱ� ���� I/O ��ü ����
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//���� �߰� : ����Ʈ(byte) ���� ó�� ��ü�� ����(char)���� ó�� ��ü�� ��ȯ
			isr = new InputStreamReader(is);
			osw = new OutputStreamWriter(os);
			
			br = new BufferedReader(isr);
			pw = new PrintWriter(osw);
			
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("���� �޼����� �ۼ����ּ���.");
				String sendMsg = sc.nextLine();
				pw.println("[Ŭ���̾�Ʈ]" + sendMsg);
				pw.flush();
				
				if("exit".equalsIgnoreCase(sendMsg)) {
					break;
				}
				
				String receiveMsg = br.readLine();
				System.out.println(">> ���� �޽��� " + receiveMsg);
			}
			
		
			
			
			
			
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
		}

	}

}
