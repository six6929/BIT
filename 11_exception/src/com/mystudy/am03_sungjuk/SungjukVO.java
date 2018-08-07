package com.mystudy.am03_sungjuk;

class SungjukVO {
	//�ʵ�(�Ӽ�)
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	//������
	SungjukVO() {
		
	}
	
	
	public SungjukVO(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}


	public SungjukVO(String name, int kor, int eng, int math, int tot, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
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
		if(kor < 0 || kor > 100) {
			System.out.println("[���ܹ߻�] ������ ����(0~100)�� ������ϴ�.");
			return;
		}
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) throws JumsuOutOfValueException {
		
		if (eng < 0 || eng > 100) {
			//���� �߻� ��Ű��
			throw new JumsuOutOfValueException();
		}
		
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTot() {
		return tot;
	}
	
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}

	//toString()
	
	@Override
	public String toString() {
		return "SungjukVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + "]";
	}

	//hashcode �� equals
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SungjukVO other = (SungjukVO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	//���(�޼���)
	
	
}
