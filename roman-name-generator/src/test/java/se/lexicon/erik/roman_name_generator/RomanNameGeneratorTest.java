package se.lexicon.erik.roman_name_generator;


import org.junit.Test;
import static org.junit.Assert.*;


public class RomanNameGeneratorTest {
	
	private RomanNameGenerator testObject = new RomanNameGenerator();
	
	@Test
	public void test_getRandomFirstName() {
		assertNotNull(testObject.getRandomFirstName());
	}
	
	@Test
	public void test_getRandomLastname() {
		assertNotNull(testObject.getRandomLastName());
	}

}
