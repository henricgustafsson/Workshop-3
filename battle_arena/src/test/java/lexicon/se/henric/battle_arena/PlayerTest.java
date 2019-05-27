package lexicon.se.henric.battle_arena;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import lexicon.se.henric.battle_arena.model.Player;



public class PlayerTest {
	

	private static final String name = "Charizard";
	private static final double strength = 5;
	private static final double health = 100;
	private Player testPlayer;
	
	@Before
	public void init() {
		
		testPlayer = new Player(name,strength,health);
		
		
	}
	
	@Test
	public void testGetName() {
		assertEquals(name,testPlayer.getCharacterName());
	}
	
	@Test
	public void testGetStrength() {
				
		assertEquals(strength,testPlayer.getStrength(),0);
	}
	
	
	@Test
	public void testaddStrength() {
		double strengthToAdd = 5;
		testPlayer.addStrength(strengthToAdd);
		assertEquals(testPlayer.getStrength(),10,0);
		
	}
	
	@Test
	public void testGetHealth() {
		
		assertEquals(health,testPlayer.getHealth(),0);
	}
	
	@Test
	public void testTakeDamage() {
		double damage = 5;
		double expectedHealth = 95;
		testPlayer.takeDamage(damage);
		assertEquals(expectedHealth,testPlayer.getHealth(),0);
		
	}
	
	@Test
	public void testIsDeadWhenHealthIsZero() {
		testPlayer.takeDamage(health);
		assertTrue(testPlayer.isDead());
	}
	
	@Test
	public void testIsDeadWhenHealthIsGreaterThanZero() {
		testPlayer.takeDamage(1);
		assertFalse(testPlayer.isDead());
	}
	
	@Test
	public void testToString() {
		String ExpectedString = "Health: " + health + "\nStrength" + strength;
		assertEquals(ExpectedString,testPlayer.toString());
	}
	
	@Test
	public void testAddToBattlesWon() {
		testPlayer.addToBattlesWon();
		
		assertEquals(testPlayer.getBattlesWon(),1);
	}
	
	@Test
	public void testCalculateScoreWhenAlive() {
		//add two won battles = 2*100 points
		testPlayer.addToBattlesWon();
		testPlayer.addToBattlesWon();
		//since testplayer is alive an additional 200 is added
		int expected = 400;
		assertEquals(expected, testPlayer.calculateScore());	
		
	}
	
	@Test
	public void testCalculateScoreWhenDead() {
		//add two won battles = 2*100 points
		testPlayer.addToBattlesWon();
		testPlayer.addToBattlesWon();
		//damage player to death no bonus for being alive
		testPlayer.takeDamage(health);
		int expected = 200;
		assertEquals(expected, testPlayer.calculateScore());
		
		
	}
	

}
