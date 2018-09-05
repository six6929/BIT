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
		//클라이언트에서 보내는 메시지를 받고 보내고 반복 처리
		//수신(Input)후에 수신메시지 화면출력 후 클라이언트로 전송(Output)
		ServerSocket server = null;
		
		//데이터를 읽기 위한 객체를 저장할 변수 선언
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
					
		//데이터를 쓰기 위한 객체를 저장할 변수 선언
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;

		
		try {
			
			System.out.println(">> 서버시작");
			server = new ServerSocket(10000);
				
			System.out.println(">> 서버 대기중");
			Socket socket = server.accept();
			
			while(true) {
				//연결된 소켓과 데이터를 주고 받기 위한 I/O 객체 생성
				is = socket.getInputStream();
				os = socket.getOutputStream();
				
				//필터 추가 : 바이트(byte) 단위 처리 객체를 문자(char)단위 처리 객체로 전환
				isr = new InputStreamReader(is);
				osw = new OutputStreamWriter(os);

				//필터 추가 : 버퍼(buffer)사용으로 편리하게 라인단위 입출력
				br = new BufferedReader(isr);
				pw = new PrintWriter(osw);
				
				
				System.out.println(">> 데이터 읽기");
				
				while (true) {
				String msg = br.readLine();
				System.out.println("받은 메시지 출력 : " + msg);
				
				//클라이언트가 작업 종료(exit 입력)하면 반복 종료
				if("exit".equalsIgnoreCase(msg)) {
					break;
				}
				
				//클라이언트에게 받은메시지 되돌려보내기
				pw.println("[서버에서 보냄] " + msg);
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
