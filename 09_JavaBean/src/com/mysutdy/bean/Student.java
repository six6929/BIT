package com.mysutdy.bean;

public class Student {
	//자바 빈 생성 규칙
	//1. 멤버변수(property)의 접근제한자는 private
	//2. 멤버변수(property)를 사용할 수 있는 set/get 메소드 제공
	//   (필요에 따라 get 메소드만 제공할 수 있음)
	//2-1. get메소드는 파라미터가 없고, set메소드는 1개 이상의 파라미터를 가진다
	//3. set/get 메소드는 접근제한자를 public 선언
	//4. 멤버변수(property)의 타입인 boolean인 경우 get 대신 is 사용 가능
	//5. 외부에서 멤버변수(property)에 접근할때는 set/get 메소드를 통해 접근
	//값 저장할때는 set 값을 읽어올때는 get
	//물어보는 것은 is를 사용가능 ex) isFirst - 처음이니?
	
	
	
	private String name; //접근제한자가 이것은 default, 하지만 private이 붙으면 이 내에서만 사용가능하다.
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	//eng : int // property
	//math : int
	//tot : int
	//avg : double
	
	
	public Student() {
		super(); //괄호가 있으면 생성자 or 메서드 // 부모클래스의 기본생성자 호출
		// 생성자의 맨 처음에 와야함
	}
	
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
//		this.tot = kor + eng + math;
//		this.avg = (tot * 100) / 3 / 100.0;
		computeTotAvg();
	}
	

	//명칭 : get메소드, getter, get property
	public String getName() {
		return this.name; //필드에 있는 네임값을 리턴;
	}
	
	//명칭 : set메소드, setter, set property
	public void setName(String Name) { //리턴값이 없기 때문에 void 사용
		this.name = name;
	}
	
	//kor
	public int getKor() {
		return this.kor;
	}
	
	public void setKor(int Kor) {
		this.kor = kor;
//		this.tot = kor + eng + math;
//		this.avg = (tot * 100) / 3 / 100.0;
		computeTotAvg();
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot + ", avg="
				+ avg + "]";
	}
	
	//eng, math, tot, avg : setter, getter 정의(실습)
	
	//eng
	public int getEng() {
		return this.eng;
	}
	
	public void setEng() {
		this.eng = eng;
//		this.tot = kor + eng + math;
//		this.avg = (tot * 100) / 3 / 100.0;
		computeTotAvg();
	}
	
	//math
	public int getMath() {
		return this.math;
	}
	
	public void setMath(int math) {
		this.math = math;
//		this.tot = kor + eng + math;
//		this.avg = (tot * 100) / 3 / 100.0;
		computeTotAvg();
	}
	
	//tot
	public int getTot() {
		return this.tot;
	}
	
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	//avg
	public double getAvg() {
		return this.avg;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public void computeTotAvg() {
		this.tot = kor + eng + math;
		this.avg = (tot * 100) / 3 / 100.0;
	}
	

}
