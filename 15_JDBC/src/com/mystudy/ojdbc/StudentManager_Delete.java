package com.mystudy.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Delete {

	public static void main(String[] args) {
		//JDBC�� �̿��� DB ���α׷��� ���
		//0. JDBC ���̺귯�� ����ȯ�� ����(�����ο� ���)
		//1. JDBC ����̹� �ε�
		//2. DB���� - Connection ��ü ����
		//3. Statement�� ����(SQL�� ����)
		//4. SQL ���� ����� ���� ó��
		//   -SELECT : ��ȸ(�˻�) ������ ��� ���� ���� ó��
		//   -INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
		//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
		///////////////////////////////////////////////

		//0. JDBC ���̺귯�� ����ȯ�� ����(�����ο� ���)
		//1. JDBC ����̹� �ε�
		
		//���� ����̹������ ���߰ų� ��Ű���� Ŭ�������� �߸������� �� ���ܹ߻����ɼ� ŭ
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> ����̹��ε� ����");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("[����] ����̹��ε� ����");
		}
		
		//2. DB���� - Connection ��ü ����
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. Connection ��ü�� ����ؼ� SQL�� ����
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			
			String sql = "";
			sql += " DELETE FROM STUDENT ";
			sql += " WHERE ID = '2018003'";
			
			int result = stmt.executeUpdate(sql);
			
			System.out.println(">> DELETE ���� �Ǽ� : " + result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
		//--Ŭ��¡ ó���� ���������� �������� ����
		try {
			stmt.close();
			System.out.println(">>Statement ��ü close ó��");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conn.close();
			System.out.println(">>Connection ��ü close ó��");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}
}