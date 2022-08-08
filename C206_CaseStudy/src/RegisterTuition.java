//Ardilla
public class RegisterTuition extends RegisterTimetable {
	private int registerId;

	public RegisterTuition(String registerNum, String tuitionTimetableId, String email, String dateTime) {
		super(registerNum, tuitionTimetableId, email, dateTime);
		this.registerId = registerId; 
	}

	
	public int getRegisterId() {
		return registerId;
	}

	public void setRegisterId(int registerId) {
		this.registerId = registerId;
	}
	public String toString(){
		//String output = "";
		// Write your codes here
		String output = super.toString();
		output = String.format("%-63s %-20s", output, registerId);
		
		return output;
	}
	
}





