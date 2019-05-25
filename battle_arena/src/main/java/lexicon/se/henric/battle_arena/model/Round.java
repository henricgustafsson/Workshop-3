package lexicon.se.henric.battle_arena.model;

import lexicon.se.henric.battle_arena.App;

public class Round {

	
	/**
	roll a dice by generating a random number between 1 and 6, and adding it
	to the strength value of the character. Then compare the total strength
	values of both characters, and have the character with the highest value
	deal damage to the other. */
	
	private static int MINIMUM_VALUE = 1;
	private static int MAXIMUM_VALUE = 6;
	private static double DAMAGE_DEALT_TO_LOSER=10;
	private Player player;
	private Character opponent;
	private int playerRoll;
	private int opponentRoll;
		
	
	public Round(Player player, Character opponent) {
		
		this.player = player;
		this.opponent = opponent;
		
		this.playerRoll = roll();
		this.opponentRoll = roll();
		
		player.addStrength(playerRoll);
		opponent.addStrength(opponentRoll);
		
				
		Character fighterToTakeDamage = player.getStrength() > opponent.getStrength() ? 
															   opponent : player;
		
		fighterToTakeDamage.takeDamage(DAMAGE_DEALT_TO_LOSER);
		
	}
	
	
	
	private static int roll(){
		
		//TODO add numbers
		return App.getRandomNumber(MINIMUM_VALUE, MAXIMUM_VALUE);
	}
	
		
	

	
}
