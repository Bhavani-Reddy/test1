package JUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTryTest {

	TestTry test;
	 
	 @BeforeAll
	 static void SetupAll(){
		 System.out.println("@BeforAll Method");
		 
	 }
	 @BeforeEach
	void setup() {
		test=new TestTry();
		System.out.println("@BeforeEach Method");
	}
	
	@Test
	void test() {
		
		int expected=5;
		int actual=test.add(2, 3);
		assertEquals(expected, actual);
		System.out.println(actual);
	}
	@Test
	void test2() {
		int expected=8;
		int actual=test.add(4, 4);
		assertEquals(expected, actual);
		System.out.println(actual);

	}
	
	@AfterEach
	void setup2() {
		System.out.println("@AfteEach Method");
	}
	 
	 @AfterAll
	 static void SetupAll2(){
		 System.out.println("@AfterAll Method");
		 
	 }
	}

