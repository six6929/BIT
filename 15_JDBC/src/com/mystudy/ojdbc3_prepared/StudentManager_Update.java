package com.mystudy.ojdbc3_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
		
		//JDBC를 이용하여 STUDENT 테이블의 데이터를 업데이트하는 프로그램 작성
		//ID를 찾아서 NAME, KOR, ENG, MATH, TOT, AVG를 업뎃
		
		//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2.DB연결 - Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
			
			//3. Statement문 실행
			String sql = "";
			sql += " UPDATE STUDENT ";
			sql += "    SET NAME = ? ";
			sql += "       , KOR = ?";
			sql += "       , ENG = ?";
			sql += "       , MATH = ?";
			sql += "       , TOT = ?";
			sql += "       , AVG = ?";
			sql += " WHERE ID = ? ";
			
			//3-1. SQL 문장 실행 준비
			pstmt = conn.prepareStatement(sql);
			
			//3-2. 값입력
			String id = "2018006";
			String name = "세종대왕";
			int kor = 99;
			int eng = 89;
			int math = 97;
			int tot = kor + eng + math;
			double avg = tot / 3;
			
			pstmt.setString(1, name);
			pstmt.setInt(2, kor);
			pstmt.setInt(3, eng);
			pstmt.setInt(4, math);
			pstmt.setInt(5, tot);
			pstmt.setDouble(6, avg);
			pstmt.setString(7, id);
			
			int cnt = pstmt.executeUpdate();
			
			System.out.println(">> 업데이트 건수 : " + cnt);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
		
		
	}

}
