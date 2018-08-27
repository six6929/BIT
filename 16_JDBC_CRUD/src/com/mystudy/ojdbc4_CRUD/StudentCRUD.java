package com.mystudy.ojdbc4_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeMap;

//JDBC를 이용한 DB 프로그래밍 방법
//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)
//1. JDBC 드라이버 로딩
//2. DB연결  - Connection 객체 생성 <-DriverManager
//3. Statement문 실행(SQL문 실행)
//4. SQL 실행 결과에 대한 처리
//   -SELECT : 조회(검색) 데이타 결과 값에 대한 처리
//   -INSERT, UPDATE, DELETE : int값(건수) 처리
//5. 클로징 처리에 의한 자원 반납
//////////////////////////////////////
public class StudentCRUD {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	StudentCRUD() {
		try {
			//1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//SELECT : ID
	public void dispData(String id) {
		try {
			//2. DB연결  - Connection 객체 생성 <-DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			
			//3. Statement문 실행(SQL문 실행)
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "  FROM STUDENT ";
			sql += " WHERE ID = ? ";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			//4. SQL 실행 결과에 대한 처리
			//primary key 조회 결과 : 0, 1
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
			//5. 클로징 처리에 의한 자원 반납
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
			//2. DB연결  - Connection 객체 생성 <-DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			
			//3. Statement문 실행(SQL문 실행)
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "  FROM STUDENT ";
			sql += " WHERE ID = ? ";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			//4. SQL 실행 결과에 대한 처리
			//primary key 조회 결과 : 0, 1
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
			//5. 클로징 처리에 의한 자원 반납
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
	
	//전체 데이타 조회
	public ArrayList<StudentVO> selectAll() {
		ArrayList<StudentVO> list = null;
		
		try {
			//2. DB연결  - Connection 객체 생성 <-DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			
			//3. Statement문 실행(SQL문 실행)
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "  FROM STUDENT ";
			sql += " ORDER BY ID "; 
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			//4. SQL문 실행 결과에 대한 처리
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
			//5. 클로징 처리에 의한 자원 반납
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
	
	//전체 데이타 조회
	//             ID
	public TreeMap<String, StudentVO> selectAllMap() {
		TreeMap<String, StudentVO> stus = null;
		
		
		
		
		return stus;
	}
	
	//이름으로 조회
	
	//StudentVO 데이타를 받아서 수정
	
	//id값 받아서 삭제
	
	//이름 값 받아서 삭제
	
	//StudentVO 데이타를 받아서 삭제
	
}













