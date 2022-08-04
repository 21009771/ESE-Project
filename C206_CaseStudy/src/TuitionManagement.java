import java.util.ArrayList;
public class TuitionManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		private static final int OPTION_RETURN = 4;
//		private static final int OPTION_LOAN = 3;
//		private static final int OPTION_ADD = 2;
//		private static final int OPTION_VIEW = 1;
//		private static final int OPTION_QUIT = 5;
		
		// Ardilla tuition timetable
			ArrayList<Tuition> tuitionList = new ArrayList<Tuition>();
		
			int option = 0;

			while (option != 5) {

				TuitionManagement.menu();
				option = Helper.readInt("Enter an option > ");

				if (option == 1) {
					// View all Register tuition
					TuitionManagement.viewAllTuition(tuitionList);
					
				

				} else if (option == 2) {
					// Add a new tuitiontimetable
					TuitionManagement.setHeader("ADD");			
					TuitionManagement.setHeader("TUITION");
					System.out.println("1. Tuition Timetable");
					
					
					int itemType = Helper.readInt("Enter option to select item type > ");

					if (itemType == 1) {
						Tuition tt = inputTuition();
						TuitionManagement.addTuition(tuitionList, tt);
						System.out.println("Tuition timetable added");

					} else if (itemType == 2) {
						

					} else {
						System.out.println("Invalid type");
					}

				} else if (option == 3) {
					
					

				} else if (option == 4) {
					

				} else if (option == 5) {
					System.out.println("Bye!");
				} else {
					System.out.println("Invalid option");
				}

			}

		}
		//Ardilla================================= Option 2 Add an item (CRUD - Create) =================================
		private static Tuition inputTuition() {
			String registerNum = Helper.readString("Enter register number > ");
			String tuitionTimetableId = Helper.readString("Enter tuition timetable Id > ");
			String email = Helper.readString("Enter email > ");
			
			
			String registerId = Helper.readString("Enter register Id > ");

			Tuition tt = new Tuition(registerNum, tuitionTimetableId, email, registerId);
			return tt;
		
		}

		private static void addTuition(ArrayList<Tuition> tuitionList, Tuition tt) {
			
			tuitionList.add(tt);
		}


		private static void viewAllTuition(ArrayList<Tuition> tuitionList) {
			// TODO Auto-generated method stub
			
		}

		public static void menu() {
			TuitionManagement.setHeader("RESOURCE CENTRE APP");
			System.out.println("1. Display Inventory");
			System.out.println("2. Register tuition timetable ");
			System.out.println("3. ");
			System.out.println("4. ");
			System.out.println("5. Quit");
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

		
	

	}


