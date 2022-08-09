import java.util.ArrayList;

public class tuitionMain {
//Jayda CODEs 
	public static void main(String[] args) {

	ArrayList<tuitionDetails> tuitionList = new ArrayList<tuitionDetails>();

	int option = 0;

	while (option != 4) {

		tuitionMain.menu();
		option = Helper.readInt("Enter an option > ");
		
		if (option == 1) {
			// Add a new tuition!
			tuitionMain.setHeader("ADD TUITION");			
			System.out.println("Add tuition");
			tuitionDetails tm = inputTuition();
			tuitionMain.addTuition(tuitionList, tm);
			System.out.println("Tuition added");

		} else if (option == 2) {
			//view a tuition
			tuitionMain.setHeader("VIEW TUITION");
			tuitionMain.viewAllTuition(tuitionList);
			
		} else if (option == 3) {
			// Delete a tuition
			tuitionMain.setHeader("DELETE TUITION");
	        tuitionMain.deleteTuition(tuitionList);

		} else if (option == 4) {
			System.out.println("Quit");
		} else {
			System.out.println("Invalid option");
		

		}
	}


	}


public static void menu() {
	tuitionMain.setHeader("RESOURCE CENTRE APP");
	System.out.println("1. Add tuition");
	System.out.println("2. View tuition");
	System.out.println("3. Delete tuition");
	System.out.println("4. Quit");
	Helper.line(80, "-");

}

public static void setHeader(String header) {
	Helper.line(80, "-");
	System.out.println(header);
	Helper.line(80, "-");
}

public static String showAvailability(boolean isAvailable) {
	String avail;

	if (isAvailable == true) {
		avail = "Yes";
	} else {
		avail = "No";
	}
	return avail;
}

//================================= Option 2 Add an item (CRUD - Create) =================================
	public static tuitionDetails inputTuition() {
		int code = Helper.readInt("Enter tuition code > ");
		String title = Helper.readString("Enter tuition title > ");
		String groupName = Helper.readString("Enter subject group name > ");
		int duration = Helper.readInt("Enter tuition duration > ");
		String preRequisite = Helper.readString("Enter tuition pre-requisite > ");
		String teacher = Helper.readString("Enter tuition teacher > ");

		tuitionDetails tm= new tuitionDetails(code, title, groupName ,duration, preRequisite, teacher);
		return tm;
		
	}
	public static void addTuition(ArrayList<tuitionDetails> tuitionList, tuitionDetails tm) {
		
		tuitionList.add(tm);
		
	}
	
	//================================= Option 1 View items (CRUD- Read) =================================
		public static String retrieveAllTuition(ArrayList<tuitionDetails> tuitionList) {
			String output = "";

			for (int i = 0; i < tuitionList.size(); i++) {

				output += String.format("%-10s %-30s %-10s %-10s %-10s %-20s \n", tuitionList.get(i).getCode(),
						tuitionList.get(i).getTitle(), 
						tuitionList.get(i).getGroupName()
						,tuitionList.get(i).getDuration(),
						tuitionList.get(i).getPreRequisite(),
						tuitionList.get(i).getTeacher());
			}
			return output;
		}
		public static void viewAllTuition(ArrayList<tuitionDetails> tuitionList) {
			tuitionMain.setHeader("TUITION LIST");
			String output = String.format("%-10s %-30s %-10s %-10s %-10s %-20s  \n", "TUITION CODE", "TUITION TITLE",
					"SUBJECT GROUP NAME", "TUITION DURATION","TUITION PRE-REQUISITE", "TUTION TEACHER");
			 output += retrieveAllTuition(tuitionList);	
			System.out.println(output);
		}




//======================================Option 3 Delete tuition ===========================================
		public static void deleteTuition(ArrayList<tuitionDetails> tuitionList) {
			tuitionMain.viewAllTuition(tuitionList);
			String  deleteTuition = Helper.readString("Enter tuition title to delete > ");
			for (int i = 0; i < tuitionList.size(); i++) {
				String getTitle = tuitionList.get(i).getTitle();
				
					
					if (getTitle.equalsIgnoreCase(deleteTuition)) {
						tuitionList.remove(i);
						System.out.println("Tuition deleted.");
					} else {
						continue;
					}
				}
			}
		}
	
