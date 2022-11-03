<<<<<<< HEAD
package projet2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatriceTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll 0");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll 4");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach 1");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach 3");
	}

	
	@Test
	void test1() {
		System.out.println("Test1 2");
		
	}
	
	@Test
	void test2() {
		System.out.println("Test2 2");
		
	}

}
=======
package projet2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatriceTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll 0");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll 4");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach 1");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach 3");
	}

	
	@Test
	void test1() {
		System.out.println("Test1 2");
		
	}
	
	@Test
	void test2() {
		System.out.println("Test2 2");
		
	}

}
>>>>>>> 5949a7cddd2605e8b211dc4039fa0dd82f49b702
