package com.mystudy.project_login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class functionMethod {
	
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "Project";
	private static final String PASSWORD = "projectpw";
	
	private Connection conn;
	private PreparedStatement pstmt;
	
	
	public String insertRollbook(String id) {
		String result = null;
		
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql += "UPDATE PROJECT_ROLLBOOK ";
			sql += "   SET TODAYATTENDENCE = ";
//			sql += "   CASE WHEN "
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
	}
}
