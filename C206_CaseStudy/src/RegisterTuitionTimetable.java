import java.util.ArrayList;
//Ardilla
public class RegisterTuitionTimetable {
	
	public static void main(String[] args) {
		
	ArrayList<RegisterTuition> tuitionList = new ArrayList<RegisterTuition>();

	
	int option = 0;

	while (option != 4) {

		RegisterTuitionTimetable.menu();
		option = Helper.readInt("Enter an option > ");

		if (option == 1) {
			// Add a new tuition timetable
			RegisterTuitionTimetable.setHeader("REGISTER FOR TUITION TIMETABLE");			
			RegisterTuition tt = inputTuition();
			RegisterTuitionTimetable.addTuition(tuitionList, tt);
			System.out.println("Tuition timetable added");
		
		} else if (option == 2) {
			// View all Register tuition
			RegisterTuitionTimetable.viewAllTuition(tuitionList);

		} else if (option == 3) {
			//RegisterTuitionTimetable.deleteTuition(tuitionList, dt);
			

		} else if (option == 4) {
			System.out.println("Bye!");
		} else {
			System.out.println("Invalid option");
		}

	}

}
	//================================= Option 1 Add an item (CRUD - Create) =================================
	private static RegisterTuition inputTuition() {
		String registerNum = Helper.readString("Enter register number > ");
		String tuitionTimetableId = Helper.readString("Enter tuition timetable Id > ");
		String email = Helper.readString("Enter email > ");
		String dateTime = Helper.readString("Enter Date & Time (DD/MM/YY) 00:00 > ");
		String registerId = Helper.readString("Enter register Id > ");

		RegisterTuition tt = new RegisterTuition(registerNum, tuitionTimetableId, email,dateTime);
		return tt;

	}

	private static void addTuition(ArrayList<RegisterTuition> tuitionList, RegisterTuition tt) {
		
		tuitionList.add(tt);
	}



	public static void menu() {
		RegisterTuitionTimetable.setHeader("TUITION MANAGEMENT APP");
		System.out.println("1. Register tuition timetable");
		System.out.println("2. View all registrations ");
		System.out.println("3. Delete registrations");
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

//================================= Option 2 View items (CRUD- Read) =================================

public static String retrieveAllTuition(ArrayList<RegisterTuition> tuitionList) {
	String output = "";
	// write your code here
	for (int i = 0; i < tuitionList.size(); i++) {

		output += String.format("%-15s %-15s %-10s %-10s %-10s %-20s\n",
				tuitionList.get(i).getRegisterNum(),
				tuitionList.get(i).getTuitionTimetableId(), 
				tuitionList.get(i).getEmail(),
				tuitionList.get(i).getStatus(), 
				tuitionList.get(i).getDateTime(),
				tuitionList.get(i).getRegisterId());
	}
	return output;
}
public static void viewAllTuition(ArrayList<RegisterTuition> tuitionList) {
	RegisterTuitionTimetable.setHeader("REGISTRATION LIST");
	//String output = retrieveAllChromebook(chromebookList);
	String output = String.format("%-15s %-15s %-10s %-10s %-10s %-20s\n",
			"Register Number", "TimetableID",
			"Email", "Status", "Date Time", "Register ID");
	 output += retrieveAllTuition(tuitionList);	
	System.out.println(output);
	
}




//================================= Option 3 DELETE ITEM) =================================
public static boolean deleteTuition(ArrayList<RegisterTuition> tuitionList, String string) {
	boolean deleteReg = false;
	String  dRegisterations = Helper.readString("Enter Register number to delete > ");

	for (int i = 0; i < tuitionList.size(); i++) {
		if (dRegisterations == tuitionList.get(i).getRegisterNum()) {
			tuitionList.remove(i);
			deleteReg = true;
		} else {
			System.out.println("No record found");
		}
	}
	return deleteReg;
}
}




