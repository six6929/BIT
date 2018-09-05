package com.mystudy.project_login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAO {

	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "Project";
	private static final String PASSWORD = "projectpw";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	ArrayList<StudentVO> student;
	
	StudentDAO(){
		try {
			Class.forName(DRIVER);
			System.out.println(">> 오라클 JDBC 드라이버 로딩 성공!!");
			Login();
		} catch (ClassNotFoundException e) {
			System.out.println("[예외] 드라이버 로딩실패");
			e.printStackTrace();
		}
	}
	public ArrayList<StudentVO> getList(){
		return student;
	}
	
	public ArrayList<StudentVO> Login() {
		student = new ArrayList<>();
		StudentVO stu;
		
		try {
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql += "SELECT ID, PW ";
			sql += "  FROM PROJECT_STUDENT";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				stu = new StudentVO();
				
				stu.setId(rs.getString("id"));
				stu.setPw(rs.getString("pw"));
				
				student.add(stu);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
				rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
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
		
		return student;
	}

}
