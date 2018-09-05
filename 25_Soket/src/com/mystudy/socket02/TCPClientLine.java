package com.mystudy.socket02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClientLine {

	public static void main(String[] args) {
		System.out.println(">>> Ŭ���̾�Ʈ ����");
		//0. ����� ����(Socket) ���� ����
		Socket socket = null;
		
		//1. ���ϻ���(Socket) : ������ ���� IP, ��Ʈ(port) ������ ����
		try {
			System.out.println("������ǻ��IP : " + InetAddress.getLocalHost());
			System.out.println(">> ������ ����");
			socket = new Socket(InetAddress.getLocalHost(), 10000);
			
			//2. �������κ��� in, out ���� - InputStream, OutputStream
			InputStream is = socket.getInputStream();
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			//3. ����(in) �����Ͱ� ������ �а�(read)
			//��������
			
			//4. ������ �����Ͱ� ������ ����(write)
			String msg = "�ȳ��ϼ���~ ������ �ݰ����ϴ�. ������� ������!!!";
			pw.println(msg); // ���������� ����
			System.out.println(">> ���޸޽��� : " + msg);
			
			//5. �ڿ��ݳ�(close)
			pw.close();
			is.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
