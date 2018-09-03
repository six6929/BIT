package com.mystudy.io5_data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamExam {

	public static void main(String[] args) {
		//�⺻������ Ÿ�� ������� ����, �б�
		//DataInputStream, DataOutputStream
		File file = new File("file/data_io_stream.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		DataInputStream dis = null;
		DataOutputStream dos = null;

		//���Ͽ� ����, ����� �����͸� �о����
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			//�⺻ ������ Ÿ������ ������ ����
			dos.writeInt(10000);
			dos.writeBoolean(true);
			dos.writeByte(127);
			dos.writeDouble(3.141592);
			dos.writeBoolean(false);
			dos.writeUTF("abc�ѱ۹��ڿ�");
			
			
			//---------------------------
			//����� ������ �о����
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			System.out.println("dis.readInt() : " + dis.readInt());
			System.out.println("dis.readBoolean() : " + dis.readBoolean());
			System.out.println("dis.readByte() : " + dis.readByte());
			System.out.println("dis.readDouble() : " + dis.readDouble());
			System.out.println("dis.readBoolean() : " + dis.readBoolean());
			System.out.println("dis.readUTF() : " + dis.readUTF());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
