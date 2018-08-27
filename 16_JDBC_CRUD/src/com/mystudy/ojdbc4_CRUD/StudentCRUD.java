package com.mystudy.ojdbc4_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeMap;

//JDBC�� �̿��� DB ���α׷��� ���
//0. JDBC ���̺귯�� ����ȯ�� ����(�����ο� ���)
//1. JDBC ����̹� �ε�
//2. DB����  - Connection ��ü ���� <-DriverManager
//3. Statement�� ����(SQL�� ����)
//4. SQL ���� ����� ���� ó��
//   -SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
//   -INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
//////////////////////////////////////
public class StudentCRUD {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	StudentCRUD() {
		try {
			//1. JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//SELECT : ID
	public void dispData(String id) {
		try {
			//2. DB����  - Connection ��ü ���� <-DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			
			//3. Statement�� ����(SQL�� ����)
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "  FROM STUDENT ";
			sql += " WHERE ID = ? ";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			//4. SQL ���� ����� ���� ó��
			//primary key ��ȸ ��� : 0, 1
			if (rs.next()) {
				
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
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	public StudentVO selectId(String id) {
		StudentVO stu = null;
		
		try {
			//2. DB����  - Connection ��ü ���� <-DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			
			//3. Statement�� ����(SQL�� ����)
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "  FROM STUDENT ";
			sql += " WHERE ID = ? ";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			//4. SQL ���� ����� ���� ó��
			//primary key ��ȸ ��� : 0, 1
			if (rs.next()) {
				stu = new StudentVO(id,
						rs.getString("NAME"),
						rs.getInt("KOR"),
						rs.getInt("ENG"),
						rs.getInt("MATH")
						);
				/*
				stu = new StudentVO(id,
						rs.getString("NAME"),
						rs.getInt("KOR"),
						rs.getInt("ENG"),
						rs.getInt("MATH"),
						rs.getInt("TOT"),
						rs.getDouble("AVG")
						);
				*/
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return stu;
	}
	
	//��ü ����Ÿ ��ȸ
	public ArrayList<StudentVO> selectAll() {
		ArrayList<StudentVO> list = null;
		
		try {
			//2. DB����  - Connection ��ü ���� <-DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			
			//3. Statement�� ����(SQL�� ����)
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "  FROM STUDENT ";
			sql += " ORDER BY ID "; 
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			//4. SQL�� ���� ����� ���� ó��
			list = new ArrayList<>(); 
			while (rs.next()) {
				StudentVO vo = new StudentVO(
						rs.getString("ID"),
						rs.getString("NAME"),
						rs.getInt("KOR"),
						rs.getInt("ENG"),
						rs.getInt("MATH"),
						rs.getInt("TOT"),
						rs.getDouble("AVG")
						);
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	//��ü ����Ÿ ��ȸ
	//             ID
	public TreeMap<String, StudentVO> selectAllMap() {
		TreeMap<String, StudentVO> stus = null;
		
		
		
		
		return stus;
	}
	
	//�̸����� ��ȸ
	
	//StudentVO ����Ÿ�� �޾Ƽ� ����
	
	//id�� �޾Ƽ� ����
	
	//�̸� �� �޾Ƽ� ����
	
	//StudentVO ����Ÿ�� �޾Ƽ� ����
	
}













