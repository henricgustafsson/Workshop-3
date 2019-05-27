package lexicon.se.henric.battle_arena;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import lexicon.se.henric.battle_arena.model.Character;

public class CharacterTest {
	
	private Character testCharacter;
	private static final String name = "Charizard";
	private static final double strength = 5;
	private static final double health = 100;
	@Before
	public void init() {
		
		testCharacter = new Character(name,strength,health);
		
	}
	
	@Test
	public void testGetName() {
		assertEquals(name,testCharacter.getCharacterName());
	}
	
	@Test
	public void testGetStrength() {
				
		assertEquals(strength,testCharacter.getStrength(),0);
	}
	
	
	@Test
	public void testaddStrength() {
		double strengthToAdd = 5;
		testCharacter.addStrength(strengthToAdd);
		assertEquals(testCharacter.getStrength(),10,0);
		
	}
	
	@Test
	public void testGetHealth() {
		
		assertEquals(health,testCharacter.getHealth(),0);
	}
	
	@Test
	public void testTakeDamage() {
		double damage = 5;
		double expectedHealth = 95;
		testCharacter.takeDamage(damage);
		assertEquals(expectedHealth,testCharacter.getHealth(),0);
		
	}
	
	@Test
	public void testIsDead() {
		testCharacter.takeDamage(health);
		assertTrue(testCharacter.isDead());
	}
	
	@Test
	public void testToString() {
		String ExpectedString = "Health: " + health + "\nStrength" + strength;
		assertEquals(ExpectedString,testCharacter.toString());
	}
	

}
