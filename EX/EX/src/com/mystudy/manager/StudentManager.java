package com.mystudy.manager;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentManager {
	private ArrayList<StudentVO> list;
	static final String TITLE = "성명\t국어\t영어\t수학\t총점\t평균";
	static final String LINE = "---------------------------------------------";
	
	void printTitle() {
		System.out.println(TITLE);
		System.out.println(LINE);
	}
	
	StudentManager() {
		list = new ArrayList<>();
	}
	
	StudentManager(ArrayList<StudentVO> list) {
		this.list = list;
	}

	public StudentVO selectOne(String id) {
		StudentVO result = null;
		//list에 있는 데이타를 전달받은 id와 동일한 이름의 데이터가 있으면 리턴
		//없으면 null 리턴
		for(int i=0; i<list.size(); i++) {
			if((list.get(i)).getId() == id) {
				result = list.get(i);
			}
		}
		return result;
	}
	public StudentVO selectOne(StudentVO vo) {
		StudentVO result = null;
		//list에 있는 데이타를 전달받은 vo의 ID와 동일한 id의 데이타가 있으면 리턴
		//없으면 null 리턴
		for(int i=0; i<list.size(); i++) {
			if((list.get(i)).getId() == vo.getId()) {
				result =list.get(i);
			}
		}
		
		return result;
	}
	
	public ArrayList<StudentVO> selectAll() {
		ArrayList<StudentVO> result = null;
		//전체 데이타를 리턴 처리
		for (StudentVO vo : list) {
			System.out.println(vo + "\t");
		}
		return result;
	}
	
	public int insert(StudentVO vo) {
		int result = 0;
		//전달받은 vo의 id가 list에 없으면 list에 추가(1 리턴)
		//전달받은 vo의 id가 list에 있으면 "이미 존재하는 데이타" 출력(0 리턴)
		for(int i=0; i<list.size(); i++) {
			if(list.contains(vo)) {
				System.out.println("이미 존재하는 데이터");
			} else {
				list.add(vo);
				result = 1;
			}
			
		}
		return result;
	}
	
	public int update(StudentVO vo) {
		int result = 0;
		//전달받은 vo의 id가 list에 있으면 수정처리(1 리턴)
		// (키값인 id를 제외하고 모든 데이터를 수정처리
		//전달받은 vo의 id가 list에 없으면 "데이타 없음" 출력(0 리턴)
		
		
		return result;
	}
	public int delete(StudentVO vo) {
		int result = 0;
		//전달받은 vo의 id이 list에 있으면 삭제처리(성공시 1 리턴, 실패시 0리턴)
		//전달받은 vo의 id이 list에 없으면 "데이타 없어서 삭제 못함" 출력(0 리턴)
		for(int i=0; i<list.size(); i++) {
			if(vo.getId() == list.get(i).getId()) {
				list.remove(list.get(i));
				result = 1;
			} else {
				System.out.println("데이터 없어서 삭제 못함");
				result = 0;
			}
		}
		
		return result;
	}
	public int delete(String id) {
		int result = 0;
		//전달받은 id가 list에 있으면 삭제처리(성공시 1 리턴, 실패시 0리턴)
		//전달받은 id가 list에 없으면 "데이타 없음" 출력(0 리턴)
		for(int i=0; i<list.size(); i++) {
			if(id == list.get(i).getId()) {
				list.remove(list.get(i));
				result = 1;
			} else {
				System.out.println("데이터 없어서 삭제 못함");
				result = 0;
			}
		}
		
		return result;
	}
	
	public void displayAll() {
		//list에 있는 데이타를 전체 화면 출력
		Iterator ite = list.iterator();
		while(ite.hasNext()) {
			ite.next();
		}
	}
	
	public void displayOne(StudentVO vo) {
		//list에 있는 데이타 중 vo의 id와 일치하는 데이타 화면 출력
		//없으면 "데이타 없음" 화면 출력
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == vo.getId()) {
				System.out.println(list.get(i));
			} else {
				System.out.println("데이터 없음");
			}
		}
		
	}
	public void displayOne(String id) {
		//list에 있는 데이타 중 id와 일치하는 데이타 화면 출력
		//없으면 "데이타 없음" 화면 출력
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				System.out.println(list.get(i));
			} else {
				System.out.println("데이터 없음");
			}
		}
	}
	
	public void printSungjuk() {
		//list에 있는 데이타 전체를 양식에 맞춰 화면에 출력
		//성명     국어    영어    수학     총점     평균
		//------------------------------
		//홍길동  100  90   80   270   90.0
		//.....
		printTitle();
		displayAll();
	}
}
