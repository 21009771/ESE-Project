
public class TimeTable {
	private int TimeTableID;
	private double price;
	private String starttime;
	private String endtime;
	private String mode;
	

	
	public TimeTable(int TimeTableID, double price, String starttime, String endtime, String mode) {
		
		this.TimeTableID = TimeTableID;
		this.price = price;
		this.starttime = starttime;
		this.endtime = endtime;
		this.mode = mode;
	}
	
	public TimeTable(int TimeTableID) {
		this.TimeTableID = TimeTableID;
	}

	public int getTimeTableID() {
		return TimeTableID;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getStartTime() {
		return starttime;
	}
	
	public String getEndTime() {
		return endtime;
	}
	
	public String getMode(){
		return mode;
	}


}
