package com.mystudy.project_login;

public class RollbookVO {

	//변수선언
	String days;
	String inTime;
	String outTime;
	String studyTime;
	int lectureTime;
	String id;
	
	//생성자
	public RollbookVO(String days, String inTime, String outTime, String studyTime, int lectureTime, String id) {
		super();
		this.days = days;
		this.inTime = inTime;
		this.outTime = outTime;
		this.studyTime = studyTime;
		this.lectureTime = lectureTime;
		this.id = id;
	}

	//get, set 코드
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

	public String getStudyTime() {
		return studyTime;
	}

	public void setStudyTime(String studyTime) {
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
