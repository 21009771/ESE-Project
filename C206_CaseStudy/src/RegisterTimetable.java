
public class RegisterTimetable {
	private String registerNum;
	private String tuitionTimetableId;
	private String email;
	private String status;
	private String dateTime;
	
	//Ardilla
	public RegisterTimetable(String registerNum, String tuitionTimetableId, String email, String dateTime) {
		this.registerNum = registerNum;
		this.tuitionTimetableId = tuitionTimetableId;
		this.email = email;
		this.status = "pending";
		this.dateTime = dateTime;
		
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

	public String isDateTime() {
		return dateTime;
	}
	
	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	
	
	
	
}
