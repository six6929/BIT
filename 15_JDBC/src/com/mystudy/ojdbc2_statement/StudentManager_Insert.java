package com.mystudy.ojdbc2_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Insert {

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
		Connection conn = null;
		Statement stmt = null;
		
		//1. JDBC ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
			
			//3-1. Connection ��ü�� ���� Statement ��ü �����ϰ�,
			stmt = conn.createStatement();
			
			//3-2. Statement�� ����(SQL�� ����)
			String sql = "";
			String id = "2018005";
			String name = "ȫ�淡";
			int kor = 100;
			int eng = 90;
			int math = 80;
			
			sql += " INSERT INTO STUDENT";
			sql += "        (ID, NAME, KOR, ENG, MATH) ";
			sql += "VALUES ('" + id + "', '" + name + "', " + kor + ", " + eng + "," + math+ ")";
			System.out.println("sql : " + sql);		
			
			int cnt = stmt.executeUpdate(sql);
			//4. SQL ���� ����� ���� ó��
			System.out.println(">> �Է°Ǽ� : " + cnt);
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		
			try {
				if(stmt != null) {
				stmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(conn != null) {
				conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		
	}

}