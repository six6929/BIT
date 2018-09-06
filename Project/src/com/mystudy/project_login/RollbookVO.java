package com.mystudy.project_login;

public class RollbookVO {

	//디비와 같은 변수선언
	int allDate; // 소정출석일 - 고정값
	String ingDate; // 실제출석일 - Date함수로 하루씩 증가?
	int attendanceRate; // (출석률) attendanceRate = ingDate / allDate
	int payment; // 수당여부 - 출석률에 따른 
	int days; //일자
	String inTime; //입실시간
	String outTime; //퇴실시간
	int studyTime; //수업시간
	String todayAttendance; //출결상태 - 조퇴/지각/결석표기(조퇴 퇴실시간 - 입실시간 > 총 4시간이상), (지각 입실시간 am 9:40:00이후 입실한 사람), 
	                        //        결석(퇴실시간 - 입실시간 < 4시간이수못한사람, 아예 오지 않은 사람)
	String id; // 학생 ID
	
	//생성자 호출
	public RollbookVO() {
		
	}
	
	//get, set 코드
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
			System.out.println("조퇴");
		}
	}
	
}
