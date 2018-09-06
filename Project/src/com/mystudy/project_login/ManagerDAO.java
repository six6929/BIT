package com.mystudy.project_login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import common_util.JDBC_Close;

public class ManagerDAO {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "Project";
	private static final String PASSWORD = "projectpw";
		
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		try {
			Class.forName(DRIVER);
			System.out.println("JDBC 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩 실패");
			e.printStackTrace();
		}
	}

	
	//2-1. 관리자 - (학생 데이터 조회)
	public ArrayList<ManagerVO> selectAll() {
		ArrayList<ManagerVO> list = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			StringBuilder sb = new StringBuilder();
			sb.append(" SELECT ID, NAME, PW, PHONE, MAIL, AGE, GENDER, LECTURENAME ");
			sb.append("   FROM PROJECT_MEMBER ");
			
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			list = new ArrayList<>();
			while (rs.next()) {
				list.add(new ManagerVO (
						rs.getString("id"), 
						rs.getString("name"), 
						rs.getInt("pw"), 
						rs.getString("phone"), 
						rs.getString("mail"),
						rs.getInt("age"),
						rs.getString("gender"),
						rs.getString("lecturename")));
			}	
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		return list;
	}
	
	//2-2. 관리자 - (목록별 해당 학생 조회 : ID)
	public ManagerVO selectId(String id) {
		ManagerVO mvo = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "";
			sql += " SELECT ID, NAME, PW, PHONE, MAIL, AGE, GENDER, LECTURENAME";
			sql += "  FROM PROJECT_MEMBER ";
			sql += " WHERE ID = ? ";
			
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				mvo = new ManagerVO(
						rs.getString("id"),
						rs.getString("name"),
						rs.getInt("pw"),
						rs.getString("phone"),
						rs.getString("mail"),
						rs.getInt("age"),
						rs.getString("gender"),
						rs.getString("lecturename")
						);
			
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		
			
		}

		return mvo;
	}

	
	//2-2. 관리자 - (목록별 해당 학생 조회 : NAME)
	public ManagerVO selectName(String name) {
		ManagerVO mvo = null;
		
		try {			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "";
			sql += " SELECT ID, NAME, PW, PHONE, MAIL, AGE, GENDER, LECTURENAME";
			sql += "  FROM PROJECT_MEMBER ";
			sql += " WHERE NAME = ? ";
			
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				mvo = new ManagerVO(
						rs.getString("id"),
						rs.getString("name"),
						rs.getInt("pw"),
						rs.getString("phone"),
						rs.getString("mail"),
						rs.getInt("age"),
						rs.getString("gender"),
						rs.getString("lecturename")
						);
			
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		
			
		}

		return mvo;
	}

	
	//2-2. 관리자 - (목록별 해당 학생 조회 : PHONE)
	public ManagerVO selectPhone(String phone) {
		ManagerVO mvo = null;
		
		try {			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "";
			sql += " SELECT ID, NAME, PW, PHONE, MAIL, AGE, GENDER, LECTURENAME";
			sql += "  FROM PROJECT_MEMBER ";
			sql += " WHERE PHONE = ? ";
			
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, phone);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				mvo = new ManagerVO(
						rs.getString("id"),
						rs.getString("name"),
						rs.getInt("pw"),
						rs.getString("phone"),
						rs.getString("mail"),
						rs.getInt("age"),
						rs.getString("gender"),
						rs.getString("lecturename")
						);
			
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		
			
		}

		return mvo;
	}
	
	//2-2. 관리자 - (목록별 해당 학생 조회 : MAIL)
	public ManagerVO selectMail(String mail) {
		ManagerVO mvo = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "";
			sql += " SELECT ID, NAME, PW, PHONE, MAIL, AGE, GENDER, LECTURENAME";
			sql += "  FROM PROJECT_MEMBER ";
			sql += " WHERE MAIL = ? ";
			
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, mail);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				mvo = new ManagerVO(
						rs.getString("id"),
						rs.getString("name"),
						rs.getInt("pw"),
						rs.getString("phone"),
						rs.getString("mail"),
						rs.getInt("age"),
						rs.getString("gender"),
						rs.getString("lecturename")
						);
			
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		
			
		}

		return mvo;
	}

	
	//2-3. 관리자 - 회원등록 및 삭제기능 (등록)
	public int insertData(String id, String name, int pw, String phone, String mail, int age, String gender, String lecturename) {
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "";
			sql += " INSERT INTO PROJECT_MEMBER ";
			sql += "        (ID, NAME, PW, PHONE, MAIL, AGE, GENDER, LECTURENAME) ";
			sql += " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, pw);
			pstmt.setString(4, phone);
			pstmt.setString(5, mail);
			pstmt.setInt(6, age);
			pstmt.setString(7, gender);
			pstmt.setString(8, lecturename);
					
			result = pstmt.executeUpdate();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		
		return result;
		
	}
	//2-3. 관리자 - 회원등록 및 삭제기능 (삭제)
	public int deleteOne(String id) {
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			StringBuilder sb = new StringBuilder();
			sb.append("DELETE FROM PROJECT_MEMBER WHERE ID = ?");
			
			pstmt = conn.prepareStatement(sb.toString());
			
			pstmt.setString(1, id);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		
		
		
		return result;
		
	}
	
	public ManagerVO selectPayment(int payment) {
		
		
		
		return null;
		
		
	}
}
