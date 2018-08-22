package com.mystudy.manager;

import java.util.ArrayList;

public class StudentManager {
	private ArrayList<StudentVO> list;

	static final String TITLE = "이름\t국어\t영어\t수학\t총점\t평균";
	static final String LINE = "-----------------------" + "------------------------------";

	StudentManager() {
		list = new ArrayList<>();
	}

	StudentManager(ArrayList<StudentVO> list) {
		this.list = list;
	}

	public StudentVO selectOne(String id) {
		StudentVO result = null;
		// list에 있는 데이타를 전달받은 id과 동일한 이름의 데이타가 있으면 리턴
		// 없으면 null 리턴

		for (int i = 0; i < list.size(); i++) {
			if (id == list.get(i).getId()) {
				result = list.get(i);
				System.out.println(">> 조회한 " + "\"" + id + "\" 데이터 입니다.");
				System.out.println(result + "\n");
			} else {
				return null;
			}
		}

		return result;
	}

	public StudentVO selectOne(StudentVO vo) {
		StudentVO result = null;
		// list에 있는 데이타를 전달받은 vo의 id와 동일한 이름의 데이타가 있으면 리턴
		// 없으면 null 리턴

		for (int i = 0; i < list.size(); i++) {
			if (vo.getId() == list.get(i).getId()) {
				result = list.get(i);
				System.out.println(">> 조회한 " + "\"" + vo.getId() + "\" 데이터 입니다.");
				System.out.println(result + "\n");
			} else {
				return null;
			}
		}
		return result;
	}

	public ArrayList<StudentVO> selectAll() {
		ArrayList<StudentVO> result = null;
		// 전체 데이타를 리턴 처리
		for (int i = 0; i < list.size(); i++) {
			result.add(list.get(i));
		}

		return result;
	}

	public int insert(StudentVO vo) {
		int result = 0;
		// list.add(vo);
		// 전달받은 vo의 id가 list에 없으면 list에 추가(1 리턴)
		// 전달받은 vo의 id가 list에 있으면 "이미 존재하는 데이타" 출력(0 리턴)
		// vo.getId().equals(list.get(i).getId())
		for (int i = 0; i < list.size(); i++) {
			if (vo.getId() == list.get(i).getId()) {
				System.out.println("이미 존재하는 데이터.\n");
				result = 0;
				return result;
			}
		}
		list.add(vo);
		result = 1;
		return result;
	}

	public int update(StudentVO vo) {
		int result = 0;
		// 전달받은 vo의 id가 list에 있으면 수정처리(1 리턴)
		// (키값인 id를 제외하고 모든 데이타를 수정처리)
		// 전달받은 vo의 id가 list에 없으면 "데이타 없어서 수정못함" 출력(0 리턴)
		for (int i = 0; i < list.size(); i++) {
			if (vo.getId() == list.get(i).getId()) {
				list.set(i, vo);
				System.out.println("수정이 완료됐습니다.\n");
				result = 1;
				return result;
			}
		}
		System.out.println("데이터 없어서 수정 못함.\n");
		result = 0;
		return result;
	}

	public int delete(StudentVO vo) {
		int result = 0;
		// 전달받은 vo의 id가 list에 있으면 삭제처리(성공시 1 리턴, 실패시 0리턴)
		// 전달받은 vo의 id가 list에 없으면 "데이타 없어서 삭제 못함" 출력(0 리턴)
		for (int i = 0; i < list.size(); i++) {
			if (vo.getId() == list.get(i).getId()) {
				list.remove(vo);
				System.out.println("삭제가 완료됐습니다.\n");
				result = 1;
				return result;
			}
		}
		System.out.println("데이터 없어서 삭제 못함.\n");
		result = 0;
		return result;
	}

	public int delete(String id) {
		int result = 0;
		// 전달받은 id가 list에 있으면 삭제처리(성공시 1 리턴, 실패시 0리턴)
		// 전달받은 id가 list에 없으면 "데이타 없음" 출력(0 리턴)
		for (int i = 0; i < list.size(); i++) {
			if (id == list.get(i).getId()) {
				list.remove(list.get(i));
				System.out.println("삭제가 완료됐습니다.\n");
				result = 1;
				return result;
			}
		}
		System.out.println("데이터 없어서 삭제 못함.\n");
		result = 0;
		return result;
	}

	// 전체 데이타 출력(타이틀 출력없이 데이타만)
	// list에 있는 데이타를 전체 화면 출력

	void displayAll() {
		// list 필드에 담겨있는 데이타만 출력
		for (StudentVO vo : list) {
			printDataOne(vo, "\t"); // 탭으로 delim 구분자 지정
		}

	}

	// 하나의 데이타를 출력(VO와 출력구분자)
	void printDataOne(StudentVO vo, String delim) {
		if (vo == null)
			return;
		System.out.print(vo.getName());
		System.out.print(delim + vo.getKor());
		System.out.print(delim + vo.getEng());
		System.out.print(delim + vo.getMath());
		System.out.print(delim + vo.getTot());
		System.out.print(delim + vo.getAvg());
		System.out.println();
	}

	void printTitle() {
		System.out.println(TITLE);
		System.out.println(LINE);
	}

	public boolean displayOne(StudentVO vo) {
		// list에 있는 데이타 중 vo의 id와 일치하는 데이타 화면 출력
		// 없으면 "데이타 없음" 화면 출력

		boolean result = false;
		for (int i = 0; i < list.size(); i++) {
			if (vo.getId() == list.get(i).getId()) {
				System.out.println(LINE);
				System.out.println("조회가 완료됐습니다.\n");
				System.out.println(list.get(i));
				System.out.println();
				result = true;
				return result;
			} else {
				int j = i;
				System.out.println(i);
				System.out.println(list.size());
				if ((j + 1) == list.size()) {// 리스트의 마지막 데이터에서도 데이터가 없을 경우
					System.out.println(LINE);
					System.out.println("해당 ID " + vo.getId() + " 가 데이터 없어서 조회 못함.\n");
					result = false;
				}
			}
		}
		return result;
	}

	public boolean displayOne(String id) {
		// list에 있는 데이타 중 id와 일치하는 데이타 화면 출력
		// 없으면 "데이타 없음" 화면 출력

		boolean result = false;
		for (int i = 0; i < list.size(); i++) {
			if (id == list.get(i).getId()) {
				list.get(i);
				System.out.println(LINE);
				System.out.println("조회가 완료됐습니다.\n");
				System.out.println(list.get(i));
				System.out.println();
				result = true;
				return result;
			} else if (id.contains(list.get(i).getId()) == false) {
				int j = i;
				if ((j + 1) == list.size()) { // 리스트의 마지막 데이터에서도 데이터가 없을 경우
					System.out.println(LINE);
					System.out.println("해당 ID " + id + " 가 데이터 없어서 조회 못함.\n");
					result = false;
				}
			}
		}
		return result;
	}

	public void printSungjuk() {
		// list에 있는 데이타 전체를 양식에 맞춰 화면에 출력
		// 성명 국어 영어 수학 총점 평균
		// ------------------------------
		// 홍길동 100 90 80 270 90.0
		// .....
		printTitle();
		displayAll();
		System.out.println(LINE);
		System.out.println();
	}
}
