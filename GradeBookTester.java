package Lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook b;
	GradeBook b2;
	@BeforeEach
	void setUp() throws Exception {
		b = new GradeBook(5);
		b2 = new GradeBook(5);
		
		
		b.addScore(7);
		b.addScore(11);
		b.addScore(12.5);
		
		
		b2.addScore(10);
		b2.addScore(3.5);
	}

	@AfterEach
	void tearDown() throws Exception {
		b = b2 = null;
	}

	@Test
	void testAddScore() {
		
	}

	@Test
	void testGetScoreSize() {
		assertEquals(3,b.getScoreSize());
		assertEquals(2,b2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(30.5,b.sum());
		assertEquals(13.5,b2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(7,b.minimum());
		assertEquals(3.5,b2.minimum());
	}

	@Test
	void testFinalScore() {

		assertEquals(23.5,b.finalScore());
		assertEquals(10,b2.finalScore());
	}

	@Test
	void testToString() {
		assertEquals(b.toString(),"7.0 11.0 12.5 0.0 0.0 ");
		assertEquals(b2.toString(),"10.0 3.5 0.0 0.0 0.0 ");

	}

}