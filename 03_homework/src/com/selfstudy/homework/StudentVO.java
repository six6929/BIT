package com.selfstudy.homework;

public class StudentVO {
	//필드선언
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	//생성자 선언
	public StudentVO() {
		
	}

	public StudentVO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}
	
		
	public StudentVO(String name, int kor, int eng, int math, int tot, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
		computeTotAvg();
	}

	//getter, setter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}
	

	public void setKor(int kor) {
		this.kor = kor;
		computeTotAvg();
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
		computeTotAvg();
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
		computeTotAvg();
	}
	
	public int getTot() {
		return tot;
	}
	
//	public void setTot(int tot) {
//		this.tot = tot;
//	}
	
	public double getAvg() {
		return avg;
	}
	
//	public void setAvg(double avg) {
//		this.avg = avg;
//	}
	
	//총점,평균 계산 메서드
	
	public void computeTotAvg() {
		this.tot = kor + eng + math;
		this.avg = (tot * 100) / 3 / 100.0;
	}


	
	//toString()
	
//	@Override
//	public String toString() {
//		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
//				+ ", avg=" + avg + "]";
//	}
	
	@Override
	public String toString() {
		return "학생성적 [이름=" + name + ", 국어점수=" + kor + ", 영어점수=" + eng + ", 수학점수=" + math + ", 총점=" + tot 
				+ ", 평균=" + avg + "]";
	}
	
	
}
