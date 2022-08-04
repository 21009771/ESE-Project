import java.util.ArrayList;

public class TimeTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<TimeTable> timetable = new ArrayList<TimeTable>();
		
		int option = 0;

		while (option != 5) {

			TimeTableMain.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all timetable
				TimeTableMain.viewTimeTable(timetable);
				
			

			} else if (option == 2) {
				// Add a new timetable
				TimeTableMain.setHeader("ADD");			
				TimeTableMain.setHeader("TimeTable");
				
				TimeTable tt = inputTimeTable();
				TimeTableMain.addTimeTable(timetable, tt);
					
			} else if (option == 3) {
				
				
				

			} else if (option == 4) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}
		
		}

	}
	
	public static void menu() {
		TimeTableMain.setHeader("TimeTable");
		System.out.println("1. View TimeTable");
		System.out.println("2. Add TimeTable");
		System.out.println("3. Delete TimeTable");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	public static String retrieveTimeTable(ArrayList<TimeTable> timetable) {
		String output = "";

		for (int i = 0; i < timetable.size(); i++) {

			output += String.format("%-84s\n", timetable.get(i).toString());	
			
		}
		return output;
	}
	
	public static void viewTimeTable(ArrayList<TimeTable> timetable) {
		String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", "ID", "Price",
				"Start Time", "End Time","Mode");
		 output += retrieveTimeTable(timetable);	
		System.out.println(output);
	}
	
	public static TimeTable inputTimeTable() {	
		int ID = Helper.readInt("Enter TimeTable ID > ");
		double price = Helper.readDouble("Enter price > ");
		String starttime = Helper.readString("Enter start time > ");
		String endtime = Helper.readString("Enter endtime > ");
		String mode = Helper.readString("Enter mode > ");

		TimeTable tt= new TimeTable(ID, price, starttime, endtime, mode);
		return tt;
		
	}	
	public static void addTimeTable(ArrayList<TimeTable> timetable, TimeTable tt) {

		timetable.add(tt);
		
	}
	
	public static TimeTable inputTimeTableDelete() {	
		int ID = Helper.readInt("Enter TimeTable ID > ");
		double price = Helper.readDouble("Enter price > ");
		String starttime = Helper.readString("Enter start time > ");
		String endtime = Helper.readString("Enter endtime > ");
		String mode = Helper.readString("Enter mode > ");

		TimeTable tt= new TimeTable(ID, price, starttime, endtime, mode);
		return tt;
		
	}	

}
