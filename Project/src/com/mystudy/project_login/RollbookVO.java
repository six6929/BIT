package com.mystudy.project_login;

public class RollbookVO {

	//���� ���� ��������
	int allDate; // �����⼮�� - ������
	String ingDate; // �����⼮�� - Date�Լ��� �Ϸ羿 ����?
	int attendanceRate; // (�⼮��) attendanceRate = ingDate / allDate
	int payment; // ���翩�� - �⼮���� ���� 
	int days; //����
	String inTime; //�Խǽð�
	String outTime; //��ǽð�
	int studyTime; //�����ð�
	String todayAttendance; //������ - ����/����/�Ἦǥ��(���� ��ǽð� - �Խǽð� > �� 4�ð��̻�), (���� �Խǽð� am 9:40:00���� �Խ��� ���), 
	                        //        �Ἦ(��ǽð� - �Խǽð� < 4�ð��̼����ѻ��, �ƿ� ���� ���� ���)
	String id; // �л� ID
	
	//������ ȣ��
	public RollbookVO() {
		
	}
	
	//get, set �ڵ�
	public int getAllDate() {
		return allDate;
	}

	public void setAllDate(int allDate) {
		this.allDate = allDate;
	}

	public String getIngDate() {
		return ingDate;
	}


	public void setIngDate(String ingDate) {
		this.ingDate = ingDate;
	}


	public int getAttendanceRate() {
		return attendanceRate;
	}

	public void setAttendanceRate(int attendanceRate) {
		this.attendanceRate = attendanceRate;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}


	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public int getStudyTime() {
		return studyTime;
	}

	public void setStudyTime(int studyTime) {
		this.studyTime = studyTime;
	}

	public String getTodayAttendance() {
		return todayAttendance;
	}

	public void setTodayAttendance(String todayAttendance) {
		this.todayAttendance = todayAttendance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void computeTodayAttendence() {
		if(Double.parseDouble(outTime) - Double.parseDouble(inTime) > 4 && Double.parseDouble(outTime) - Double.parseDouble(inTime) < 7.9) {
			System.out.println("����");
		}
	}
	
}
