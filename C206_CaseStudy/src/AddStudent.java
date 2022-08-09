
public class AddStudent {
	
	private String name;
	private char gender;
	private int mobile;
	private String email;
	private String DoB;
	private String country;
	private String interest;
	

	public AddStudent(String name, char gender, int mobile, String email, String DoB, String country, String interest) {
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.country = country;
		this.interest = interest;
	}
	
	public String toString() {
		
		// Write your codes here
		
		String itemInfo = String.format("%-10s %-30s %-10s %-10s", 
				name,
				gender, 
				mobile,
				email,
				country,
				interest);
		
		
		return itemInfo;
		
	}
	
		
	
	

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public int getMobile() {
		return mobile;
	}


	public String getEmail() {
		return email;
	}
	
	public String getDoB() {
		return DoB;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getInterest() {
		return interest;
	}

	
	
}


//add
