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
		//메시지를 작성해서 서버로 전송하고, 서버로부터 전달받은 메시지 수신 반복
		//전송(Output) 후에 수신(Input)
		//메시지 작성 : Scanner 객체 사용해서 콘솔창에서 입력
		Socket socket = null;
		
		InputStream is = null;
		OutputStream os = null;
		
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;

		BufferedReader br = null;
		
		PrintWriter pw = null;
		
		
		try {
			System.out.println("클라이언트 접속");
			socket = new Socket("127.0.0.1", 10000);
			
		
			//연결된 소켓과 데이터를 주고 받기 위한 I/O 객체 생성
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//필터 추가 : 바이트(byte) 단위 처리 객체를 문자(char)단위 처리 객체로 전환
			isr = new InputStreamReader(is);
			osw = new OutputStreamWriter(os);
			
			br = new BufferedReader(isr);
			pw = new PrintWriter(osw);
			
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("보낼 메세지를 작성해주세요.");
				String sendMsg = sc.nextLine();
				pw.println("[클라이언트]" + sendMsg);
				pw.flush();
				
				if("exit".equalsIgnoreCase(sendMsg)) {
					break;
				}
				
				String receiveMsg = br.readLine();
				System.out.println(">> 받은 메시지 " + receiveMsg);
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
