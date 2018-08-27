package com.mystudy.ojdbc2_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Delete {

	public static void main(String[] args) {
		//(�ǽ�) mystudy ������ �����ؼ� STUDENT ���̺� �ִ�
		//ID - 2018005 : ȫ�淡 ������ ���� ���α׷� �ۼ�
		
		
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
			
			//2. DB���� - Connection ��ü ����
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
			
			//3. Statement�� ����
			stmt = conn.createStatement();
			
			String sql = "";
			String id = "2018005";
//			String name = "��������";
			
			sql += " DELETE FROM STUDENT ";
			sql += " WHERE ID = '" + id + "'";
//			sql += " WHERE NAME = '" + name + "'";
			System.out.println("sql : " + sql);
			
			int result = stmt.executeUpdate(sql);
			
			System.out.println(">> �����Ǽ� : " + result);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
