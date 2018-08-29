package com.mystudy.ojdbc3_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentManager_Select {

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
		ResultSet rs = null;
		
		try {
			//1. JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. DB���� - Connection ��ü ����
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
			
			//3-1. Connection ��ü�κ��� Statement�� ����
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "   FROM STUDENT ";
			sql += "   WHERE NAME LIKE ?";
			sql += "   ORDER BY ID";
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(���ε庯��)�� �� ����
			String name = "%";
			pstmt.setString(1, name);
			
			//3-3. Statement(PreparedStatement) �� ����
			rs = pstmt.executeQuery();
			
			//4. SQL ������ó��
			while (rs.next()) {
				String str = "";
				str += rs.getString(1) + "\t";
				str += rs.getString(2) + "\t";
				str += rs.getInt(3) + "\t";
				str += rs.getInt(4) + "\t";
				str += rs.getInt(5) + "\t";
				str += rs.getInt(6) + "\t";
				str += rs.getDouble(7);
				System.out.println(str);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("[����] ����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("[����] DB�������!!!");
			e.printStackTrace();
		} finally {
			//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
			try {
				if(rs != null) {
				rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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