package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		
		
		
		Date dBirthDate = null;
		Date dBirthDate2= null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
			dBirthDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("1996-04-09");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Carson", "D", "Hake", dBirthDate2, "36 Prospect", "302-908-6889", "chake@udel.edu","CISC");
		Student stu3 = new Student("Colin", "C", "Haines", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu4 = new Student("Bob", "E", "Thomas", dBirthDate2, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu5 = new Student("Kim", "E", "Thomas", dBirthDate2, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");

		
		
		UUID hash = UUID.randomUUID();
		UUID hash2 = UUID.randomUUID();
		UUID hash3 = UUID.randomUUID();
		UUID hash4 = UUID.randomUUID();
		UUID hash5 = UUID.randomUUID();
		stu1.setPersonID(hash);
		stu2.setPersonID(hash2);
		stu3.setPersonID(hash3);
		stu4.setPersonID(hash4);
		stu5.setPersonID(hash5);
		
//		Map<String, Student> stuMap = new HashMap<String, Student>();
//		stuMap.put("1", stu1); 
//		stuMap.put("2", stu2);
//		stuMap.put("3", stu3);
//		stuMap.put("4", stu4);
//		stuMap.put("5", stu5);
		
		Map<UUID, Student> stuMap = new HashMap<UUID, Student>();		
		stuMap.put(stu1.getPersonID(), stu1);// for what ever reason it wont map my UUID of any sort...
		stuMap.put(stu2.getPersonID(), stu2);
		stuMap.put(stu3.getPersonID(), stu3);
		stuMap.put(stu4.getPersonID(), stu4);
		stuMap.put(stu5.getPersonID(), stu5);
		

		
		assertTrue(5== stuMap.size());
	}

}
