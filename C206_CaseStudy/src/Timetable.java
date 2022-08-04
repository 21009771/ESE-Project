
public class Timetable {
	private String registerNum;
	private String tuitionTimetableId;
	private String email;
	private String status;
	private boolean dateTime;
	
	public Timetable(String registerNum, String tuitionTimetableId, String email, String dateTime) {
		this.registerNum = registerNum;
		this.tuitionTimetableId = tuitionTimetableId;
		this.email = email;
		this.status = "pending";
		this.dateTime = true;
		
	}

	public String getTuitionTimetableId() {
		return tuitionTimetableId;
	}

	public void setTuitionTimetableId(String tuitionTimetableId) {
		this.tuitionTimetableId = tuitionTimetableId;
	}

	public String getRegisterNum() {
		return registerNum;
	}

	public void setRegisterNum(String registerNum) {
		this.registerNum = registerNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isDateTime() {
		return dateTime;
	}

	public void setDateTime(boolean dateTime) {
		this.dateTime = dateTime;
	}

	
	
	
	
}
