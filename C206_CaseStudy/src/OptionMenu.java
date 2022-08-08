/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Chua Shen Ru
 * Student ID: 21034608
 * Class: W64P
 * Date/Time created: Friday 05-08-2022 21:32
 */

/**
 * @author chuas
 *
 */
public class OptionMenu {
	
	public static void menu() {
		TuitionManagement.setHeader("TUITION MANAGEMENT APP");
		System.out.println("1. Display all");
		System.out.println("2. Add enquiry ");
		System.out.println("3. Delete Enquiry");
		System.out.println("4. Edit Enquiry");
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
