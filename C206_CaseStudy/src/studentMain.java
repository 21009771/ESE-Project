
//HOHOHO
	import java.util.ArrayList;
	public class studentMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
//			private static final int OPTION_RETURN = 4;
//			private static final int OPTION_LOAN = 3;
//			private static final int OPTION_ADD = 2;
//			private static final int OPTION_VIEW = 1;
//			private static final int OPTION_QUIT = 5;
			
			
				ArrayList<student> studentList = new ArrayList<student>();
			
				int option = 0;

				while (option != 4) {

					studentMain.menu();
					option = Helper.readInt("Enter an option > ");

					if (option == 1) {
						
						// Add a new item
						studentMain.setHeader("ADD");	
						student SD = inputStudent();
						studentMain.addStudent(studentList, SD);
						
						System.out.println("Student added!");
						
						
					

					} else if (option == 2) {
						// View 
						studentMain.viewAllStudents(studentList);

						}

					 else if (option == 3) {
						 //delete
						 studentMain.setHeader("DELETE STUDENT");
						 studentMain.deleteStudent(studentList);
						 
						 


					} else if (option == 4) {
						//quit
						System.out.println("Bye!");
						
					} else {
						System.out.println("Invalid option");
					}

				}
		}
		
		
		public static void menu() {
			studentMain.setHeader("Add Students");
			System.out.println("1. Add students");
			System.out.println("2. View students");
			System.out.println("3. Delete students");
			System.out.println("4. Quit");
			Helper.line(80, "-");

		}
		

		
		//================================= Option 1 Add (CRUD - Create)=================================
			public static student inputStudent() {
				String name = Helper.readString("Enter name > ");
				char gender = Helper.readChar("Enter gender > ");
				int mobile = Helper.readInt("Enter phone number > ");
				String email = Helper.readString("Enter email > ");
				String DOB = Helper.readString("Enter date of birth(DOB) > ");
				String country = Helper.readString("Enter country > ");
				String interest = Helper.readString("Enter interest> ");

				student SD = new student(name,gender, mobile, email, DOB, country, interest);
				return SD;
				
			}
			public static void addStudent(ArrayList<student> studentList, student SD) {
				
				studentList.add(SD);
				
			}
			
			
			
			

			public static String retrieveAllStudents(ArrayList<student> studentList) {
				String output = "";

				for (int i = 0; i < studentList.size(); i++) {

					output += String.format("%-10s %-30s %-10s %-10s %-10s %-10s %-10s \n", studentList.get(i).getName(),
							studentList.get(i).getGender(),studentList.get(i).getMobile(),studentList.get(i).getEmail(),
							studentList.get(i).getDoB(),studentList.get(i).getCountry(),studentList.get(i).getInterest());
							
				}
				return output;
				
				
				
				
			}
			public static void viewAllStudents(ArrayList<student> studentList) {
				studentMain.setHeader("STUDENT LIST");
				String output = String.format("%-10s %-30s %-10s %-10s %-10s %-10s %-10s \n", "NAME", "GENDER",
						"PHONE NO", "EMAIL","DOB", "COUNTRY OF RESIDENCE", "INTEREST");
				 output += retrieveAllStudents(studentList);	
				System.out.println(output);
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

			
		

			
			
			public static void deleteStudent(ArrayList<student> studentList) {
				studentMain.viewAllStudents(studentList);
				String  dStudent = Helper.readString("Enter name you wish to delete > ");
				for (int i = 0; i < studentList.size(); i++) {
					String getName = studentList.get(i).getName();
							
								
						if (getName.equalsIgnoreCase(dStudent)) {
							studentList.remove(i);
							System.out.println("Student deleted.");
						} else {
							continue;
						}
				}


	}
	}


