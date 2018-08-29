package com.mystudy.jdbc_dao_impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//DAO / Dao : Data Access Object / Database Access Object
//�����ͺ��̽��� �����ؼ� CRUD�� �����ϴ� Ŭ����
//DTO : Data Transfer Object
//VO : Value Object

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
			System.out.println(">> ����Ŭ JDBC ����̹� �ε� ����!!");
		} catch (ClassNotFoundException e) {
			System.out.println("[���ܹ߻�] ����̹� �ε�����!!!");
			e.printStackTrace();
		}
	}
	
//	public MemberDAO() {
//		try {
//			Class.forName(DRIVER);
//			System.out.println(">> ����Ŭ JDBC ����̹� �ε� ����!!");
//		} catch (ClassNotFoundException e) {
//			System.out.println("[���ܹ߻�] ����̹� �ε�����!!!");
//			e.printStackTrace();
//		}
//	}
	
	//SELECT : ���̺� �ִ� ������ ��ü ��ȸ - selectAll : ArrayList<MemberVO>
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
	
	
	//SELECT : �ϳ��� ������ ��ȸ(ID) - selectOne : MemberVO
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
				System.out.println("������ ����");
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
	
	//SELECT : �ϳ��� ������ ��ȸ(VO) - selectOne : MemberVO
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
				System.out.println("������ ����");
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
	//INSERT : VO ��ü�� �޾Ƽ� �Է� - insertOne : int
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
			
			System.out.println(">> �Է°Ǽ� : " + result);
			
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
	//UPDATE : VO ��ü�� �޾Ƽ� ���� - updateOne : int
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
			
			System.out.println(">> ������Ʈ �Ǽ� : " + result);
			
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
	//DELETE : VO ��ü�� �޾Ƽ� ���� - deleteOne : int
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
			
			System.out.println(">> ���� �Ǽ� : " + result);
			
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
	//DELETE : ID �޾Ƽ� ���� - deleteOne : int
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
			
			System.out.println(">> ���� �Ǽ� : " + result);
			
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
	
	//�α��� ó�� : ID, PASSWORD ���� �޾Ƽ� ������ ������ ������ true, ������ false ����
	//boolean checkIdPassword(id, password) : true or false
	public boolean checkIdPassword(String id, String password) {
		boolean result = false;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql += "SELECT ID  ";
			sql += "  FROM MEMBER";
			sql += "  WHERE ID = ? AND PASSWORD = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) { //rs.next()�� �ǹ̴� �ּ� 1�� �̻��� �����Ͱ� ������ �ǹ�
				result = true;
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
	
	//SELECT : name���� �޾Ƽ� ���� ���� ���
	public ArrayList<MemberVO> selectName(String name) {
		ArrayList<MemberVO> result = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql += "SELECT ID, NAME, PASSWORD, PHONE, ADDRESS ";
			sql += "  FROM MEMBER";
			sql += "  WHERE NAME = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			
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
	
}
