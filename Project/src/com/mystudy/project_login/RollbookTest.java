package com.mystudy.project_login;

public class RollbookTest {

	public static void main(String[] args) {
		RollbookDAO rdao = new RollbookDAO();
//		rdao.insertIntime("SIX6929");
		rdao.updateOutTime("SIX6929");
		rdao.updateStudyTime("20180907");
	}

}
