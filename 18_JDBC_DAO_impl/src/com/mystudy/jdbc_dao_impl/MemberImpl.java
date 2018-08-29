package com.mystudy.jdbc_dao_impl;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberImpl implements Member {

	MemberDAO dao = new MemberDAO();
	
	@Override
	public ArrayList<MemberVO> selectAll() {
//		dao.selectAll();
		return dao.selectAll();
	}

	@Override
	public MemberVO selectOne(String id) {
//		dao.selectOne(id);
		return dao.selectOne(id);
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
//		dao.selectOne(vo);
		return dao.selectOne(vo);
	}

	@Override
	public ArrayList<MemberVO> selectName(String name) {
		
//		dao.selectName(name);
		return dao.selectName(name);
	}

	@Override
	public int insertOne(MemberVO vo) {
//		dao.insertOne(vo);
		return dao.insertOne(vo);
	}

	@Override
	public int updateOne(MemberVO vo) {
//		dao.updateOne(vo);
		return dao.updateOne(vo);
	}

	@Override
	public int deleteOne(MemberVO vo) {
//		dao.deleteOne(vo);
		return dao.deleteOne(vo);
	}

	@Override
	public int deleteOne(String id) {
//		dao.deleteOne(id);
		return dao.deleteOne(id);
	}

}
