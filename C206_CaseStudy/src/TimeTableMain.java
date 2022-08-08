import java.util.ArrayList;

public class TimeTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<TimeTable> timetable = new ArrayList<TimeTable>();
		
		timetable.add(new TimeTable(1,23.05,"12.05pm", "3.05pm","Online"));
		timetable.add(new TimeTable(2,20.30,"3.15pm", "5.15pm","Online"));
		
		int option = 0;

		while (option != 4) {

			TimeTableMain.timetablemenu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all Register tuition
				TimeTableMain.viewTimeTable(timetable);
				
			

			} else if (option == 2) {
				// Add a new timetable
				TimeTableMain.setHeader("ADD");			
				TimeTableMain.setHeader("TUITION");
				
				
				TimeTable tt = inputTimeTable();
				TimeTableMain.addTimeTable(timetable, tt);
				System.out.println("Tuition timetable added");
				

			} else if (option == 3) {
				TimeTableMain.setHeader("Delete");			
				TimeTableMain.setHeader("TimeTable");
				
				int ID = Helper.readInt("Enter the ID >");
				TimeTableMain.deleteTimeTable(timetable,ID);

				
				

			} else if (option == 4) {
				System.out.println("Bye!");
			
			} else {
				
				System.out.println("Invalid option");
			}

		}

	}
	
	public static void timetablemenu() {
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

			output += String.format("%-5s %-10s %-15s %-10s %-10s\n", timetable.get(i).getTimeTableID(),
					timetable.get(i).getPrice(), timetable.get(i).getStartTime(),
					timetable.get(i).getEndTime(),timetable.get(i).getMode());	
			
		}
		return output;
	}
	
	public static void viewTimeTable(ArrayList<TimeTable> timetable) {
		String output = String.format("%-5s %-10s %-15s %-10s %-10s\n", "ID", "Price",
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
		System.out.println("TimeTable added");
		
	}	
	
	public static boolean deleteTimeTable(ArrayList<TimeTable> timetable, int ID) {
		
		boolean isDeleted = false;
		
		for(int i = 0; i < timetable.size(); i++ ) {
			if(ID == timetable.get(i).getTimeTableID()) {
				timetable.remove(i);
				isDeleted = true;
			}
			
			else {
				System.out.println("Invailid ID");
			}
			
	   }
	  return isDeleted;
	}

	public static void deleteTimeTable(ArrayList<TimeTable> timetable) {
		
	}
	
}
