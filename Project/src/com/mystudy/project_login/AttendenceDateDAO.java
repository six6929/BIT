package com.mystudy.project_login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AttendenceDateDAO {
	
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "Project";
	private static final String PASSWORD = "projectpw";
		
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public static void main(String[] args) {
		//DB ¿¬µ¿
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void insertValue() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
//			sql += "INSERT INTO "
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
