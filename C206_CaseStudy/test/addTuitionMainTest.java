import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class addTuitionMainTest {
	private tuitionDetails tt1;
	private tuitionDetails tt2;

	
	private ArrayList<tuitionDetails> tuitionList;
	
	public addTuitionMainTest() {
		super();
	}
	@Before
	public void setUp() throws Exception {
	
	tt1 = new tuitionDetails(1,"Math","Team 1",2,"yes", "Ms Yong");
	tt2 = new tuitionDetails(2, "Chemistry","Team 3", 40, "yes", "Mr Boo");
	
	tuitionList = new ArrayList<tuitionDetails>();
	}

	@Test
	public void testAddTuition() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid tuition arraylist to add to", tuitionList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		tuitionMain.addTuition(tuitionList, tt1);		
		assertEquals("Test if that tuition arraylist size is 1?", 1, tuitionList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Camcorder is added same as 1st item of the list?", tt1, tuitionList.get(0));
//		
//		//Add another item. test The size of the list is 2?
		tuitionMain.addTuition(tuitionList, tt2);
		assertEquals("Test that tuition arraylist size is 2?", 2, tuitionList.size());
		assertSame("Test that tuition is added same as 2nd item of the list?", tt2, tuitionList.get(1));
	}

	
@Test
public void testRetrieveAllTuition() {
	// Test if Item list is not null but empty -boundary
	assertNotNull("Test if there is valid tuition arraylist to retrieve item", tuitionList);
	
	//test if the list of tuition retrieved from the SourceCentre is empty - boundary
	String allTuition= tuitionMain.retrieveAllTuition(tuitionList);
	String testOutput = "";
	assertEquals("Check that ViewAllTuitionList", testOutput, allTuition);

}

@Test
public void testDeleteTimeTable() {
	//Test that Item list is not null but empty -boundary
	assertNotNull("Test if there is valid TimeTable arraylist to retrieve item", tuitionList);
	
	
	//Test that the element is removed from the list 
	tuitionMain.deleteTuition(tuitionList);
	String allTuition = tuitionMain.retrieveAllTuition(tuitionList);
	String testOutput = "";
	assertEquals("Check that ViewTimeTable", testOutput, allTuition);
} 

@After
public void tearDown() throws Exception {
	tt1 = null;
	tt2 = null;
	tuitionList = null;
}

}
