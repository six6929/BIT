package com.mystudy.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Select {

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
		//1. JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("[예외] 드라이버 로딩 실패!");
		}
		
		//2. DB연결 - Connection 객체 생성
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
			System.out.println(">> DB연결성공");
		} catch (SQLException e) {
			System.out.println("[예외] DB연결 실패(connection fail)");
		}
		
		//3. Statement문 실행(SQL문 실행)
		Statement stmt = null;
		ResultSet rs = null;
		try {
			///Conncetion 객체로부터 Statement 객체 생성
			stmt = conn.createStatement();
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "  FROM STUDENT ";
			sql += "ORDER BY NAME";
			
			rs = stmt.executeQuery(sql);
			
			//4. SQL 실행 결과에 대한 처리
			//   -SELECT : 조회(검색) 데이터 결과 값에 대한 처리
			//   -INSERT, UPDATE, DELETE : int값(건수) 처리
			while (rs.next()) {
				String str = "";
				str += rs.getString("ID") + "\t";
				//str += res.getStirng(1) + "\t"; 인덱스값을 사용하는 대신 순서가 바뀌게 되면 영향을 받을 수가 있다.
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
		
		
		//5. 클로징 처리에 의한 자원 반납
		//--클로징 처리시 생성순서와 역순으로 진행
		try {
			rs.close();
			System.out.println(">>ResultSet 객체 close 처리");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			stmt.close();
			System.out.println(">>Statement 객체 close 처리");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn.close();
			System.out.println(">>Connenction 객체 close 처리");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
