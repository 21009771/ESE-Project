import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimeTableMainTest {
	
	private TimeTable tt1;
	private TimeTable tt2;
	private TimeTable tt3;
	
	private ArrayList<TimeTable> timetable;
	
	@Before
	public void setUp() throws Exception {
		
		tt1 = new TimeTable (1,12.04,"3.30pm", "5.30pm","Online");
		tt2 = new TimeTable (2,13.50, "09.45am", "12.15pm", "Face-To-Face");
		tt3 = new TimeTable (3,23.50,"11.30pm", "2.30pm", "Online");
		
		timetable = new ArrayList<TimeTable>();
	
	}


	
	@Test
	public void testAddTimeTable() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid TimeTable arraylist to add to", timetable);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		TimeTableMain.addTimeTable(timetable, tt1);
		assertEquals("Check that TimeTable arraylist size is 1", 1, timetable.size());
		assertSame("Check that TimeTable is added", tt1, timetable.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		TimeTableMain.addTimeTable(timetable, tt2);
		assertEquals("Check that TimeTable arraylist size is 2", 2, timetable.size());
		assertSame("Check that TimeTable is added", tt2,timetable.get(1));
	}
	
	@Test
	public void testRetrieveTimeTable() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid TimeTable arraylist to retrieve item", timetable);
		
		//test if the list of timetable retrieved from the SourceCentre is empty - boundary
		String allTimeTable = TimeTableMain.retrieveTimeTable(timetable);
		String testOutput = "";
		assertEquals("Check that ViewTimeTable", testOutput, allTimeTable);
		
	}
	
	@Test
	public void testDeleteTimeTable() {
		//Test that Item list is not null but empty -boundary
		assertNotNull("Test if there is valid TimeTable arraylist to retrieve item", timetable);
		
		
		//Test that the element is removed from the list 
		TimeTableMain.deleteTimeTable(timetable);
		String allTimeTable = TimeTableMain.retrieveTimeTable(timetable);
		String testOutput = "";
		assertEquals("Check that ViewTimeTable", testOutput, allTimeTable);
    }  
	
	
	
	
	
	@After
	public void tearDown() throws Exception {
		tt1 = null;
		tt2 = null;
		timetable = null;
	}

}
