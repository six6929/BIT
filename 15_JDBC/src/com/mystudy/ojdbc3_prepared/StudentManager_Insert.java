package com.mystudy.ojdbc3_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		//1. JDBC ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. DB���� - Connection ��ü ����
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
			
			//3. Statement�� ����
			String sql = "";
			sql += "INSERT INTO STUDENT ";
			sql += "       (ID, NAME, KOR, ENG, MATH) ";
			sql += "VALUES (?, ?, ?, ?, ?) ";
			//3-1. SQL ���� �����غ�
			pstmt = conn.prepareStatement(sql);
			
			//3-2. SQL ������ ? ��ġ�� �� ��Ī
			String id = "2018006";
			String name = "������";
			int kor = 100;
			int eng = 88;
			int math = 75;
			
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, kor);
			pstmt.setInt(4, eng);
			pstmt.setInt(5, math);
			
			//3-3 �غ�� SQL ���� ���� ó��
			int cnt = pstmt.executeUpdate();
			
			//4. SQL ���� ����� ���� ó��
			System.out.println(">> �Է� �Ǽ� : " + cnt);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
			
			try {
				if(pstmt != null) {
				pstmt.close();
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
