package com.mystudy.project_login;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import common_util.JDBC_Close;



public class RollbookDAO {
	
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "Project";
	private static final String PASSWORD = "projectpw";
		
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	RollbookDAO() {
		try {
			Class.forName(DRIVER);
//			System.out.println("DB연동성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public int insertIntime(String id) {
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql += "INSERT INTO ROLLBOOK ";
			sql += "       (DAYS, INTIME, ID) ";
			sql += " VALUES(TO_CHAR(SYSDATE, 'YYYYMMDD'), TO_CHAR(SYSDATE,'HH24:MI:SS'),  ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			result = pstmt.executeUpdate();
			
			System.out.println("\t   >> 입력이 완료되었습니다.");
		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("\t   >> 이미 입실되었습니다");
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return result;
	}
	
	
	public int updateOutTime(String id) {
		int result = 0;
		Date sqlDate = new Date(System.currentTimeMillis());
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyyMMdd");
		String day = transFormat.format(sqlDate);
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			
			sql += "UPDATE ROLLBOOK ";
			sql += "   SET OUTTIME = TO_CHAR(SYSDATE, 'HH24:MI:SS') ";
			sql += "   WHERE ID = ? ";
			sql += "   AND DAYS = TO_CHAR(SYSDATE , 'YYYYMMDD')";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			result = pstmt.executeUpdate();
			
//			System.out.println("이 완료되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			updateStudyTime(day);
			updateAttendance(day);
			
		}
		
		
		return result;
	}
	
	public int updateStudyTime(String days) {
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql += "UPDATE ROLLBOOK ";
			sql += "   SET STUDYTIME = TRUNC((TO_DATE(OUTTIME,'HH24:MI:SS') - TO_DATE(INTIME, 'HH24:MI:SS')) * 24 * 60) - 60 ";
			sql += "   WHERE DAYS = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, days);
			
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return result;
		
	}
	
	//출결정보(ROLLBOOK) 조회
//		public ArrayList<RollbookVO> AttendanceList() {
//			ArrayList<RollbookVO> list = null;
//			try {
//				conn = DriverManager.getConnection(URL, USER, PASSWORD);
//				StringBuilder sb = new StringBuilder();
//				sb.append(" SELECT DISTINCT M.NAME, R.DAYS, R.INTIME, R.OUTTIME, R.STUDYTIME, A.RATE, A.PAYMENT ");
//				sb.append("   FROM ATTENDANCEDATE A, MEMBER M, ROLLBOOK R ");
//				sb.append("  WHERE A.ID = R.ID AND R.ID = M.ID ");
//				sb.append("  ORDER BY DAYS");
//				
//					
//				pstmt = conn.prepareStatement(sb.toString());
//				rs = pstmt.executeQuery();
//				list = new ArrayList<>();
//				while (rs.next()) {
//					list.add(new RollbookVO (
//							rs.getString("name"), 
//							rs.getString("days"), 
//							rs.getString("intime"), 
//							rs.getString("outtime"), 
//							rs.getInt("studytime"), 
//							rs.getInt("rate"),
//							rs.getString("payment")));
//					}	
//					
//					
//				} catch (SQLException e) {
//					e.printStackTrace();
//				} finally {
//					JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
//				}
//				return list;
//			}


	
		
		//  출석일수(ATTENDANCE) 업데이트 (CHECKDATE = 1 -> +1 )

		public int updateAttendance(String days) {
			int result = 0;
			try {  // CHECKDATE, ATTENDANCE 조회
				conn = DriverManager.getConnection(URL, USER, PASSWORD);

				String sql = "";
				sql += "UPDATE ROLLBOOK ";
				sql += "SET CHECKDATE = (CASE WHEN (STUDYTIME >= 240) THEN 1 ELSE 0 END) ";
				sql += "WHERE DAYS = ? ";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, days);

				result = pstmt.executeUpdate();
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JDBC_Close.closeConnStmt(conn, pstmt);
			}

			return result;
		}
		
		
}