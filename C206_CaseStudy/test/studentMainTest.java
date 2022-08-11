import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class studentMainTest {
	private student s1;
	private student s2;

	private ArrayList<student> studentList;
	
	
	public studentMainTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		// prepare test data
		s1 = new student("Tim", 'M', 87881234, "timho@gmail.com", "12/10/2000", "Singapore", "science");
		s2 = new student("Cindy", 'F', 81285589, "bunnycandy@gmail.com", "4/3/2000", "Singapore", "math");

		studentList= new ArrayList<student>();
	}

	
	@Test
	public void testAddStudent() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Camcorder arraylist to add to", studentList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		studentMain.addStudent(studentList, s1);
		assertEquals("Check that Camcorder arraylist size is 1", 1, studentList.size());
		assertSame("Check that Camcorder is added", s1, studentList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		studentMain.addStudent(studentList, s2);
		assertEquals("Check that Camcorder arraylist size is 2", 2, studentList.size());
		assertSame("Check that Camcorder is added", s2, studentList.get(1));
	}
	
	
	@Test
	public void testRetrieveStudents() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid student arraylist to retrieve item", studentList);
		
		//test if the list of timetable retrieved from the SourceCentre is empty - boundary
		String allStudents = studentMain.retrieveAllStudents(studentList);
		String testOutput = "";
		assertEquals("Check that ViewAllStudents", testOutput, allStudents);
		
	}


	
	
	@Test
	public void testDeleteStudent() {
		//Test that Item list is not null but empty -boundary
		assertNotNull("Test if there is valid TimeTable arraylist to retrieve item", studentList);
		
		
		//Test that the element is removed from the list 
		studentMain.deleteStudent(studentList);
		String allStudents = studentMain.retrieveAllStudents(studentList);
		String testOutput = "";
		assertEquals("Check that ViewAllStudents", testOutput, allStudents);
    }  
	
	
	
	@After
	public void tearDown() throws Exception {
		s1 = null;
		s2 = null;
		studentList = null;


	}

}
