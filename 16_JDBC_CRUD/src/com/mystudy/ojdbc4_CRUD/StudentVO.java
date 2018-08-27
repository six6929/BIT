package com.mystudy.ojdbc4_CRUD;

public class StudentVO {
	//�ڹ� �� ���� ��Ģ
	//1. �������(property)�� ���������ڴ� private
	//2. �������(property)�� ����� �� �ִ� set/get �޼ҵ� ����
	//   (�ʿ信 ���� get �޼ҵ常 ������ �� ����)
	//2-1. get�޼ҵ�� �Ķ���Ͱ� ����, set�޼ҵ�� 1�� �̻��� �Ķ���͸� ������
	//3. set/get �޼ҵ�� ���������ڸ� public ����
	//4. �������(property)�� Ÿ���� boolean�� ��� get ��� is ��� ����
	//5. �ܺο��� �������(property)�� �����Ҷ��� set/get �޼ҵ带 ���� ����
	//�� �����Ҷ��� set ���� �о�ö��� get
	//����� ���� is�� ��밡�� ex) isFirst - ó���̴�?
	
	
	private String id;
	private String name;
	private int kor;
	private int eng; //property ����
	private int math; //math : int
	private int tot;
	private double avg;
	

	public StudentVO(String id, String name, int kor, int eng, int math) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}
	
	public StudentVO(String id, String name, int kor, int eng, 
			int math, int tot, double avg) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	//��Ī : get�޼ҵ�, getter, get property
	public String getName() {
		return this.name; //�ʵ忡 �ִ� ���Ӱ��� ����;
	}
	
	//��Ī : set�޼ҵ�, setter, set property
	public void setName(String Name) { //���ϰ��� ���� ������ void ���
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
		return "[���� = " + name + ", ���� = " + kor + ", ���� = " + eng + ", ���� = " + math + ", ���� = " + tot + ", ��� = "
				+ avg + "]";
	}
	
	//eng, math, tot, avg : setter, getter ����(�ǽ�)
	
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
