package com.mystudy.project_login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common_util.JDBC_Close;

public class StudentSelect {
	
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "Project";
	private static final String PASSWORD = "projectpw";
		
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	
	
	public static void main(String[] args) {
		try {
			Class.forName(DRIVER);
			System.out.println("JDBC 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩 실패");
			e.printStackTrace();
		}
	}

	
	//3-1. 학생 데이터 조회 (개인정보)
	public ArrayList<StudentVO> selectAll() {
		ArrayList<StudentVO> list = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			StringBuilder sb = new StringBuilder();
			sb.append(" SELECT ID, NAME, PW, PHONE, MAIL, AGE, GENDER, LECTURENAME ");
			sb.append("   FROM MEMBER ");
			
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			list = new ArrayList<>();
			while (rs.next()) {
				list.add(new StudentVO (
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
			JDBC_Close.closeConnStmt(conn, pstmt);		}
		return list;
		
			
	}
	//3-1. 학생 데이터 조회 (출결정보)
	public ArrayList<StudentVO> selectAttendance() {
		ArrayList<StudentVO> list = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			StringBuilder sb = new StringBuilder();
			sb.append(" SELECT ALLDATE, ATTENDANCERATE, DAYS, PHONE, MAIL, AGE, GENDER, LECTURENAME ");
			sb.append("   FROM MEMBER ");
			
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			list = new ArrayList<>();
			while (rs.next()) {
				list.add(new StudentVO (
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
			JDBC_Close.closeConnStmt(conn, pstmt);		}
		return list;
	}

	public ArrayList<StudentVO> AttendanceList() {
		ArrayList<StudentVO> list = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			StringBuilder sb = new StringBuilder();
			sb.append(" SELECT DISTINCT M.ID, M.NAME, R.DAYS, R.INTIME, R.OUTTIME, R.STUDYTIME, A.RATE, A.PAYMENT ");
			sb.append("   FROM ATTENDANCEDATE A, MEMBER M, ROLLBOOK R ");
			sb.append("  WHERE A.ID = R.ID AND R.ID = M.ID ");
			sb.append("  ORDER BY DAYS");
			
				
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			list = new ArrayList<>();
			while (rs.next()) {
				list.add(new StudentVO (
						rs.getString("id"),
						rs.getString("name"), 
						rs.getString("days"), 
						rs.getString("intime"), 
						rs.getString("outtime"), 
						rs.getInt("studytime"), 
						rs.getInt("rate"),
						rs.getString("payment")));
				}	
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
			}
			return list;
		}
		
	
	//3-2. 개인정보수정 (전체 데이터 입력)
	public int updateData (StudentVO svo) {
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "";
			sql += " UPDATE MEMBER ";
			sql += "    SET NAME = ? ";
			sql += "      , PW = ? ";
			sql += "      , PHONE = ? ";
			sql += "      , MAIL = ? ";
			sql += "      , AGE = ? ";
			sql += "      , GENDER = ? ";
			sql += "      , LECTURENAME = ? ";
			sql += "  WHERE ID = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setString(1, svo.getName());
			pstmt.setInt(2, svo.getPw());
			pstmt.setString(3, svo.getPhone());
			pstmt.setString(4, svo.getMail());
			pstmt.setInt(5, svo.getAge());
			pstmt.setString(6, svo.getGender());
			pstmt.setString(7, svo.getLecture());
			pstmt.setString(8, svo.getId());
			
			
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		return result;
	}
	
	
	
	//3-2 개인정보 수정 (Name)
	public int updateName (String name, String id) {
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "";
			sql += " UPDATE MEMBER ";
			sql += "    SET NAME = ? ";
			sql += "  WHERE ID = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, name);

	
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		return result;
		
	}
	
	
	//3-2 개인정보 수정 (pw)
	public int updatePw (int pw, String id) {
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "";
			sql += " UPDATE MEMBER ";
			sql += "    SET PW = ? ";
			sql += "  WHERE ID = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, pw);
			pstmt.setString(2, id);
	
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		return result;
		
	}
	
	
	//3-2 개인정보 수정 (phone)
	public int updatePhone (String phone, String id) {
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "";
			sql += " UPDATE MEMBER ";
			sql += "    SET PHONE = ? ";
			sql += "  WHERE ID = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, phone);
			pstmt.setString(2, id);
	
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		return result;
		
	}
	
	
	
	//3-2 개인정보 수정 (mail)
	public int updateMail (String mail, String id) {
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "";
			sql += " UPDATE MEMBER ";
			sql += "    SET MAIL = ? ";
			sql += "  WHERE ID = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, mail);
			pstmt.setString(2, id);
	
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		return result;
		
	}
	
	
	//3-2 개인정보 수정 (age)
	public int updateAge (int age, String id) {
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "";
			sql += " UPDATE MEMBER ";
			sql += "    SET AGE = ? ";
			sql += "  WHERE ID = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, age);
			pstmt.setString(2, id);
	
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		return result;
		
	}
	
	
	
	
		//3-2 개인정보 수정 (Gender)
		public int updateGender (String gender, String id) {
			int result = 0;
			
			try {
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				String sql = "";
				sql += " UPDATE MEMBER ";
				sql += "    SET GENDER = ? ";
				sql += "  WHERE ID = ? ";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, gender);
				pstmt.setString(2, id);
		
				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JDBC_Close.closeConnStmt(conn, pstmt);
			}
			return result;
			
		}
	
		//3-2 개인정보 수정 (Lecturename)
		public int updateLecturename (String lecturename, String id) {
			int result = 0;
			
			try {
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				String sql = "";
				sql += " UPDATE MEMBER ";
				sql += "    SET LECTURENAME = ? ";
				sql += "  WHERE ID = ? ";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, lecturename);
				pstmt.setString(2, id);
		
				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JDBC_Close.closeConnStmt(conn, pstmt);
			}
			return result;
			
		}
	

}
