package com.mystudy.ojdbc3_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentManager_Update {

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
		
		//JDBC�� �̿��Ͽ� STUDENT ���̺��� �����͸� ������Ʈ�ϴ� ���α׷� �ۼ�
		//ID�� ã�Ƽ� NAME, KOR, ENG, MATH, TOT, AVG�� ����
		
		//0. JDBC ���̺귯�� ����ȯ�� ����(�����ο� ���)
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//1. JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2.DB���� - Connection ��ü ����
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
			
			//3. Statement�� ����
			String sql = "";
			sql += " UPDATE STUDENT ";
			sql += "    SET NAME = ? ";
			sql += "       , KOR = ?";
			sql += "       , ENG = ?";
			sql += "       , MATH = ?";
			sql += "       , TOT = ?";
			sql += "       , AVG = ?";
			sql += " WHERE ID = ? ";
			
			//3-1. SQL ���� ���� �غ�
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ���Է�
			String id = "2018006";
			String name = "�������";
			int kor = 99;
			int eng = 89;
			int math = 97;
			int tot = kor + eng + math;
			double avg = tot / 3;
			
			pstmt.setString(1, name);
			pstmt.setInt(2, kor);
			pstmt.setInt(3, eng);
			pstmt.setInt(4, math);
			pstmt.setInt(5, tot);
			pstmt.setDouble(6, avg);
			pstmt.setString(7, id);
			
			int cnt = pstmt.executeUpdate();
			
			System.out.println(">> ������Ʈ �Ǽ� : " + cnt);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
				pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn != null) {
				conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
