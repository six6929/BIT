package com.mystudy.jdbc_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//DAO / Dao : Data Access Object / Database Access Object
//����Ÿ���̽��� �����ؼ� CRUD�� �����ϴ� Ŭ����
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
			System.out.println(">> ����Ŭ JDBC ����̹� �ε� ����!!");
		} catch (ClassNotFoundException e) {
			System.out.println("[���ܹ߻�] ����̹� �ε� ����!!!");
		}
	}
	
	
	//SELECT : ���̺� �ִ� ����Ÿ ��ü ��ȸ -selectAll : ArrayList<MemberVO>
	public ArrayList<MemberVO> selectAll() {
		ArrayList<MemberVO> list = null;
		try {
			//DB���� - Connection ��ü ����
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, PASSWORD, NAME, PHONE, ADDRESS ");
			sb.append("  FROM MEMBER ");
			sb.append(" ORDER BY ID ");
			
			//Connection ��ü�� ���� PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sb.toString());
			
			//SQL���� ����
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
	
	//SELECT : �ϳ��� ����Ÿ ��ȸ(ID) - selectOne : MemberVO
	public MemberVO selectOne(String id) {
		MemberVO mvo = null;
		try {
			//DB���� - Connection ��ü ����
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
	
	//SELECT : �ϳ��� ����Ÿ ��ȸ(VO) - selectOne : MemberVO
	public MemberVO selectOne(MemberVO member) {
		MemberVO mvo = null;
		
		
		return mvo;
	}
	
	//INSERT : VO ��ü�� �޾Ƽ� �Է� - insertOne : int
	public int insertOne(MemberVO member) {
		int result = 0;
		
		
		return result;
	}
	
	//UPDATE : VO ��ü�� �޾Ƽ� ���� - updateOne : int
	public int updateOne(MemberVO member) {
		int result = 0;
		
		
		return result;
	}
	
	//DELETE : VO ��ü�� �޾Ƽ� ���� - deleteOne : int
	public int deleteOne(MemberVO member) {
		int result = 0;
		
		
		return result;
	}
	
	//DELETE : ID �޾Ƽ� ���� - deleteOne : int
	public int deleteOne(String id) {
		int result = 0;
		
		
		return result;
	}
	
	//�α��� ó�� : ID, PASSWORD ���� �޾Ƽ� ������ ����Ÿ ������ true, ������ false ����
	//boolean checkIdPassword(id, password)
	public boolean checkIdPassword(String id, String password) {
		boolean result = false;
		
		
		return result;
	}
	
	
	
	
	
	
}
