package com.mystudy.project_login;

public class RollbookVO {

	//
	String days;
	String inTime;
	String outTime;
	int studyTime;
	int lectureTime;
	String id;
	String name;
	String payment;
	int rate;
	int checkdate;
	
	//
	public RollbookVO(String days, String inTime, String outTime, int studyTime, int lectureTime, String id) {
		super();
		this.days = days;
		this.inTime = inTime;
		this.outTime = outTime;
		this.studyTime = studyTime;
		this.lectureTime = lectureTime;
		this.id = id;
	}

//	public RollbookVO(String days, String name, String inTime, String outTime, int studyTime, int rate, String payment) {
//		super();
//		this.days = days;
//		this.name = name;
//		this.inTime = inTime;
//		this.outTime = outTime;
//		this.studyTime = studyTime;
//		this.rate = rate;
//		this.payment = payment;
//		
//		}
	
	
	public RollbookVO(int checkdate) {
		super();
		this.checkdate = checkdate;
	}
	//get, set 
	public String getDays() {
		return days;
	}

	public void setDays(String days) {
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

	public int getLectureTime() {
		return lectureTime;
	}

	public void setLectureTime(int lectureTime) {
		this.lectureTime = lectureTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	//toString()
	
	@Override
	public String toString() {
		return "RollbookVO [days=" + days + ", inTime=" + inTime + ", outTime=" + outTime + ", studyTime=" + studyTime
				+ ", lectureTime=" + lectureTime + ", id=" + id + "]";
	}
	
	
}