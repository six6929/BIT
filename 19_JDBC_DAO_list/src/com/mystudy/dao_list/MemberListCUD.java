package com.mystudy.dao_list;

import java.util.ArrayList;

public interface MemberListCUD {
	
	//Member ���̺� �ִ� ����Ÿ�� ȭ�� ���
	void printDataAll();

	//ȸ������� �޾Ƽ� �ϰ� �Է� ó��
	int insertList(ArrayList<MemberVO> list);

	//����Ʈ�� �޾Ƽ� �ϰ� �����۾� ó��
	int updateList(ArrayList<MemberVO> list);

	//����Ʈ�� �޾Ƽ� �ϰ� �����۾� ó��
	int deleteList(ArrayList<MemberVO> list);

}
