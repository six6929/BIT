package com.mystudy.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		
		//0. JDBC ���̺귯�� ����ȯ�� ����(�����ο� ���)
		//1. JDBC ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> ����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("[����] ����̹� �ε� ����!");
		}
		
		//2. DB���� - Connection ��ü ����
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
			System.out.println(">> DB���Ἲ��");
		} catch (SQLException e) {
			System.out.println("[����] DB���� ����(connection fail)");
		}
		
		//3. Statement�� ����(SQL�� ����)
		Statement stmt = null;
		ResultSet rs = null;
		try {
			///Conncetion ��ü�κ��� Statement ��ü ����
			stmt = conn.createStatement();
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "  FROM STUDENT ";
			sql += "ORDER BY NAME";
			
			rs = stmt.executeQuery(sql);
			
			//4. SQL ���� ����� ���� ó��
			//   -SELECT : ��ȸ(�˻�) ������ ��� ���� ���� ó��
			//   -INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
			while (rs.next()) {
				String str = "";
				str += rs.getString("ID") + "\t";
				str += rs.getString("NAME") + "\t";
				str += rs.getInt("KOR") + "\t";
				str += rs.getInt("ENG") + "\t";
				str += rs.getInt("MATH") + "\t";
				str += rs.getInt("TOT") + "\t";
				str += rs.getDouble("AVG") + "\t";
				System.out.println(str);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
		//--Ŭ��¡ ó���� ���������� �������� ����
		try {
			rs.close();
			System.out.println(">>ResultSet ��ü close ó��");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			stmt.close();
			System.out.println(">>Statement ��ü close ó��");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn.close();
			System.out.println(">>Connenction ��ü close ó��");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
