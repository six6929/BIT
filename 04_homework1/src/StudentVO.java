
public class StudentVO {
	//�ʵ弱��
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	//������ ����
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
	
	//����,��� ��� �޼���
	
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
		return "�л����� [�̸�=" + name + ", ��������=" + kor + ", ��������=" + eng + ", ��������=" + math + ", ����=" + tot 
				+ ", ���=" + avg + "]";
	}

	//equals �� hashcode ���

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
		StudentVO other = (StudentVO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	

	
	
	
}
