
public class tuitionDetails extends addTuition {
	//Jayda code
	private String tuition;

	public tuitionDetails(int code, String title, String groupName, int duration,String preRequisite, String teacher ) {
		super(code, title, groupName ,duration, preRequisite, teacher );
		this.tuition = tuition;
	}

	public String getTuition() {
		return tuition;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		return output;
	}
	

}