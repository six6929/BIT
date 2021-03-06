package com.mystudy.ojdbc2_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Update {

	public static void main(String[] args) {
		//JDBC를 이용한 DB 프로그래밍 방법
		//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)
		//1. JDBC 드라이버 로딩
		//2. DB연결 - Connection 객체 생성
		//3. Statement문 실행(SQL문 실행)
		//4. SQL 실행 결과에 대한 처리
		//   -SELECT : 조회(검색) 데이터 결과 값에 대한 처리
		//   -INSERT, UPDATE, DELETE : int값(건수) 처리
		//5. 클로징 처리에 의한 자원 반납
		///////////////////////////////////////////////
		
		//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)
		Connection conn = null;
		Statement stmt = null;
		
		//1. JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
			
			//3-1. Connection 객체로 부터 Statement 객체 생성하고,
			stmt = conn.createStatement();
			
			//3-2. Statement문 실행(SQL문 실행)
			String sql = "";
			String id = "2018005";
			String name = "홍경래";
			int kor = 100;
			int eng = 100;
			int math = 100;
			sql += " UPDATE STUDENT";
			sql += "    SET KOR = " + kor;
			sql += "      , ENG = " + eng;
			sql += "      , MATH = " + math;
			sql += " WHERE ID = '" + id + "' ";
			System.out.println("sql : " + sql);		
			
			int cnt = stmt.executeUpdate(sql);
			//4. SQL 실행 결과에 대한 처리
			System.out.println(">> 수정건수 : " + cnt);
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		
			try {
				if(stmt != null) {
				stmt.close();
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
