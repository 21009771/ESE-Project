import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private RegisterTuition tt1;
	
	ArrayList<RegisterTuition> tuitionList = new ArrayList<RegisterTuition>();
	
	@Before
	public void setUp() throws Exception {
	}

	//Ardilla 
	@Test
	public void testAddTuition() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid Tuition Timetable arraylist to add to", tuitionList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		RegisterTuitionTimetable.addTuitionTimetable(tuitionList, tt1);		
		assertEquals("Test that Tuition Timetable arraylist size is 1", 1, tuitionList.size());
		assertSame("Test that Tuition Timetable is added", tt1, tuitionList.get(0));
		
	}
//	//Ardilla
	@Test
	public void testRetrieveAllTuition() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Camcorder arraylist to retrieve item", tuitionList);
		
		//test if the list of TuitionTimetable retrieved from the SourceCentre is empty - boundary
		String allTuition= RegisterTuitionTimetable.retrieveAllTuition(tuitionList);
		String testOutput = "";
		assertEquals("Check that ViewAllTuitionlist", testOutput, allTuition);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		RegisterTuitionTimetable.addTuitionTimetable(tuitionList, tt1);
		assertEquals("Test that TuitionTimetable arraylist size is 2", 2, tuitionList.size());
		
		//test if the expected output string same as the list of Tuition retrieved from the 	
		allTuition= RegisterTuitionTimetable.retrieveAllTuition(tuitionList);
		testOutput = String.format("%-16s %-15s %-20s %-10s %-10s %-10s\n","", "", "", "", "", "");
		
	
		assertEquals("Test that ViewAllTuitionlist", testOutput, tuitionList);
		
	}
	
	//Ardilla
	@Test
	public void testDeleteTuition() {
		//boundary
				assertNotNull("Test if there is valid Tuition arraylist to add to", tuitionList);
				//RegisterTuitionTimetable.deleteTuition(tuitionList, tt1);
				//normal
				//assertTrue("Test if an available item is ok to loan?");		
				//error condition
	}
	
	
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
