package com.mystudy.jdbc_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//DAO / Dao : Data Access Object / Database Access Object
//데이타베이스와 연결해서 CRUD를 구현하는 클래스
public class MemberDAO_teacher {
	private static final String DRIVER = "oracle.jdbc.OracleDriver"; 
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; 
	private static final String USER = "mystudy"; 
	private static final String PASSWORD = "mystudypw"; 
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	static {
		try {
			Class.forName(DRIVER);
			System.out.println(">> 오라클 JDBC 드라이버 로딩 성공!!");
		} catch (ClassNotFoundException e) {
			System.out.println("[예외발생] 드라이버 로딩 실패!!!");
		}
	}
	
	
	//SELECT : 테이블에 있는 데이타 전체 조회 -selectAll : ArrayList<MemberVO>
	public ArrayList<MemberVO> selectAll() {
		ArrayList<MemberVO> list = null;
		try {
			//DB연결 - Connection 객체 생성
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, PASSWORD, NAME, PHONE, ADDRESS ");
			sb.append("  FROM MEMBER ");
			sb.append(" ORDER BY ID ");
			
			//Connection 객체로 부터 PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sb.toString());
			
			//SQL문장 실행
			rs = pstmt.executeQuery();
			
			list = new ArrayList<>();
			while (rs.next()) {
				//new MemberVO(id, password, name, phone, address)
				/*
				MemberVO mvo = new MemberVO(rs.getString("id"), 
						rs.getString("password"), 
						rs.getString("name"), 
						rs.getString("phone"), 
						rs.getString("address"));
				list.add(mvo);
				*/
				list.add(new MemberVO(rs.getString("id"), 
						rs.getString("password"), 
						rs.getString("name"), 
						rs.getString("phone"), 
						rs.getString("address")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		}
		
		return list;
	}
	
	//SELECT : 하나의 데이타 조회(ID) - selectOne : MemberVO
	public MemberVO selectOne(String id) {
		MemberVO mvo = null;
		try {
			//DB연결 - Connection 객체 생성
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT * FROM MEMBER WHERE ID = ?");
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			if (rs.next()) {
				mvo = new MemberVO(rs.getString("id"), 
						rs.getString("password"), 
						rs.getString("name"), 
						rs.getString("phone"), 
						rs.getString("address"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		}
		
		return mvo;
	}
	
	//SELECT : 하나의 데이타 조회(VO) - selectOne : MemberVO
	public MemberVO selectOne(MemberVO member) {
		MemberVO mvo = null;
		
		
		return mvo;
	}
	
	//INSERT : VO 객체를 받아서 입력 - insertOne : int
	public int insertOne(MemberVO member) {
		int result = 0;
		
		
		return result;
	}
	
	//UPDATE : VO 객체를 받아서 수정 - updateOne : int
	public int updateOne(MemberVO member) {
		int result = 0;
		
		
		return result;
	}
	
	//DELETE : VO 객체를 받아서 삭제 - deleteOne : int
	public int deleteOne(MemberVO member) {
		int result = 0;
		
		
		return result;
	}
	
	//DELETE : ID 받아서 삭제 - deleteOne : int
	public int deleteOne(String id) {
		int result = 0;
		
		
		return result;
	}
	
	//로그인 처리 : ID, PASSWORD 값을 받아서 동일한 데이타 있으면 true, 없으면 false 리턴
	//boolean checkIdPassword(id, password)
	public boolean checkIdPassword(String id, String password) {
		boolean result = false;
		
		
		return result;
	}
	
	
	
	
	
	
}
