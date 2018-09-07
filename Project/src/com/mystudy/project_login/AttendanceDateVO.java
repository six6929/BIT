package com.mystudy.project_login;

public class AttendanceDateVO {

	private int attendance;
	private int rate;
	private String payment;
	private String id;
	private int monthlylesson;
	private int startdate;
	private int finishdate;
	private String lecturename;
		
	
	
	
	
	
	//생성자
	
	public AttendanceDateVO(String id, int monthlylesson, int startdate, int finishdate, String lecturename) {
		super();
		this.id = id;
		this.monthlylesson = monthlylesson;
		this.startdate = startdate;
		this.finishdate = finishdate;
		this.lecturename = lecturename;
	}
	

	public AttendanceDateVO(int attendance, int rate, String payment, String id, int monthlylesson, int startdate, int finishdate, String lecturename) {
		super();
		this.attendance = attendance;
		this.rate = rate;
		this.payment = payment;
		this.id = id;
		this.monthlylesson = monthlylesson;
		this.startdate = startdate;
		this.finishdate = finishdate;
		this.lecturename = lecturename;
		}

	
	//get, set 코드
	public int getAttendance() {
		return attendance;
	}


	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}


	public int getRate() {
		return rate;
	}


	public void setRate(int rate) {
		this.rate = rate;
	}


	public String getPayment() {
		return payment;
	}


	public void setPayment(String payment) {
		this.payment = payment;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getMonthlylesson() {
		return monthlylesson;
	}


	public void setMonthlylesson(int monthlylesson) {
		this.monthlylesson = monthlylesson;
	}


	public int getStartdate() {
		return startdate;
	}


	public void setStartdate(int startdate) {
		this.startdate = startdate;
	}


	public int getFinishdate() {
		return finishdate;
	}


	public void setFinishdate(int finishdate) {
		this.finishdate = finishdate;
	}


	public String getLecturename() {
		return lecturename;
	}


	public void setLecturename(String lecturename) {
		this.lecturename = lecturename;
	}


	@Override
	public String toString() {
		return " 출석일수 : " + attendance  + "\n" +  " 출석률 : " + rate + "\n" + " 수당수령 여부 : " + payment + "\n" + " ID : " + id + "\n" + " 수업일수 : " + monthlylesson + "\n" + " 첫 수강일 : " + startdate + "\n" + " 마지막 수강일 : " + finishdate + "\n" + " 훈련과정 : " + lecturename + "";
	}

	
		
	

}