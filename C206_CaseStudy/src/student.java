
public class student extends AddStudent{
	private String student;

	public student(String name, char gender, int mobile, String email, String DOB, String country, String interest) {
		super(name, gender, mobile, email, DOB, country, interest);
		this.student = student;
	}

	public String getStudent() {
		return student;
	}
	
	public String toString(){
		// Write your codes here
		String output = super.toString();
		output = String.format("%-63s %-20s", output, student);
		return output;
	}
}

//YYEEYEEYEE