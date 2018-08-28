package com.mystudy.jdbc_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//DAO / Dao : Data Access Object / Database Access Object
//데이터베이스와 연결해서 CRUD를 구현하는 클래스

public class MemberDAO {
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
			System.out.println("[예외발생] 드라이버 로딩실패!!!");
			e.printStackTrace();
		}
	}
	
//	public MemberDAO() {
//		try {
//			Class.forName(DRIVER);
//			System.out.println(">> 오라클 JDBC 드라이버 로딩 성공!!");
//		} catch (ClassNotFoundException e) {
//			System.out.println("[예외발생] 드라이버 로딩실패!!!");
//			e.printStackTrace();
//		}
//	}
	
	//SELECT : 테이블에 있는 데이터 전체 조회 - selectAll : ArrayList<MemberVO>
	public ArrayList<MemberVO> selectAll() {
		ArrayList<MemberVO> result = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql += "SELECT ID, NAME, PASSWORD, PHONE, ADDRESS ";
			sql += "  FROM MEMBER";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			result = new ArrayList<>();
			
			while (rs.next()) {
				String str = "";
				str += rs.getString("ID") + "\t";
				str += rs.getString("NAME") + "\t";
				str += rs.getString("PASSWORD") + "\t";
				str += rs.getString("PHONE") + "\t";
				str += rs.getString("ADDRESS") + "\t";
				System.out.println(str);
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
		
		return result;
	}
	
	
	//SELECT : 하나의 데이터 조회(ID) - selectOne : MemberVO
	public MemberVO selectOne(String id) {
		MemberVO result = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql += "SELECT ID, NAME, PASSWORD, PHONE, ADDRESS ";
			sql += "  FROM MEMBER";
			sql += "  WHERE ID = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String str = "";
				str += rs.getString("ID") + "\t";
				str += rs.getString("NAME") + "\t";
				str += rs.getString("PASSWORD") + "\t";
				str += rs.getString("PHONE") + "\t";
				str += rs.getString("ADDRESS") + "\t";
				System.out.println(str);
			} else {
				System.out.println("데이터 없음");
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
		return result;
	}
	
	//SELECT : 하나의 데이터 조회(VO) - selectOne : MemberVO
	public MemberVO selectOne(MemberVO vo) {
		MemberVO result = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql += "SELECT ID, NAME, PASSWORD, PHONE, ADDRESS ";
			sql += "  FROM MEMBER";
			sql += "  WHERE ID = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getId());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String str = "";
				str += rs.getString("ID") + "\t";
				str += rs.getString("NAME") + "\t";
				str += rs.getString("PASSWORD") + "\t";
				str += rs.getString("PHONE") + "\t";
				str += rs.getString("ADDRESS") + "\t";
				System.out.println(str);
			} else {
				System.out.println("데이터 없음");
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
		return result;
	}
	//INSERT : VO 객체를 받아서 입력 - insertOne : int
	public int insertOne(MemberVO vo) {
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql += "INSERT INTO MEMBER ";
			sql += "       (ID, NAME, PASSWORD, PHONE, ADDRESS) ";
			sql += " VALUES(?, ?, ?, ?, ?) ";
			
			pstmt = conn.prepareStatement(sql);
			
			int i = 0;
			pstmt.setString(++i, vo.getId());
			pstmt.setString(++i, vo.getName());
			pstmt.setString(++i, vo.getPassword());
			pstmt.setString(++i, vo.getPhone());
			pstmt.setString(++i, vo.getAddress());
			
			result = pstmt.executeUpdate();
			
			System.out.println(">> 입력건수 : " + result);
			
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
	//UPDATE : VO 객체를 받아서 수정 - updateOne : int
	public int updateOne(MemberVO vo) {
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql += "UPDATE MEMBER ";
			sql += "   SET NAME = ? ";
			sql += "     , PASSWORD = ? ";
			sql += "     , PHONE = ? ";
			sql += "     , ADDRESS = ? ";
			sql += " WHERE ID = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			int i = 0;
			pstmt.setString(++i, vo.getName());
			pstmt.setString(++i, vo.getPassword());
			pstmt.setString(++i, vo.getPhone());
			pstmt.setString(++i, vo.getAddress());
			pstmt.setString(++i, vo.getId());
			
			result = pstmt.executeUpdate();
			
			System.out.println(">> 업데이트 건수 : " + result);
			
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
	//DELETE : VO 객체를 받아서 삭제 - deleteOne : int
	public int deleteOne(MemberVO vo) {
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql += "DELETE FROM MEMBER ";
			sql += "  WHERE ID = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			int i = 0;
			pstmt.setString(++i, vo.getId());
			
			result = pstmt.executeUpdate();
			
			System.out.println(">> 삭제 건수 : " + result);
			
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
	//DELETE : ID 받아서 삭제 - deleteOne : int
	public int deleteOne(String id) {
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql += "DELETE FROM MEMBER ";
			sql += "  WHERE ID = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			int i = 0;
			pstmt.setString(++i, id);
			
			result = pstmt.executeUpdate();
			
			System.out.println(">> 삭제 건수 : " + result);
			
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
	
	//로그인 처리 : ID, PASSWORD 값을 받아서 동일한 데이터 있으면 true, 없으면 false 리턴
	//boolean checkIdPassword(id, password) : true or false
	public boolean checkIdPassword(String id, String password) {
		boolean result = false;
//		ArrayList<MemberVO> cnt = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql += "SELECT COUNT(ID), COUNT(PASSWORD)";
			sql += "  FROM MEMBER";
			sql += "  WHERE IF COUNT(ID) >= 1 WHEN TRUE ELSE FALSE END IF ";
			
			pstmt = conn.prepareStatement(sql);
			
			
			rs = pstmt.executeQuery();
//			cnt = new ArrayList<>();
//			
//			for(int i=0; i<cnt.size(); i++) {
//				if(id == cnt.get(i).getId() && password == cnt.get(i).getPassword()) {
//					result = true;
//					System.out.println(result);
//				}	
//			}

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
		
		return result;
	}
	
	
}
