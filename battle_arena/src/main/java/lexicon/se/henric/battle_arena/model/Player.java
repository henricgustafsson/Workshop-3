package lexicon.se.henric.battle_arena.model;


public class Player extends Character{

	
	@SuppressWarnings("unused")
	private int battlesWon;
	
	public Player(String characterName, double strength, double health) {
		super(characterName, strength, health);
		battlesWon =0;
		
	}
	
	public void addToBattlesWon() {
		++battlesWon;
	}
	
	public int getBattlesWon() {
		return battlesWon;
	}

	public int calculateScore() {
		int score = battlesWon *100;
		//if the user is stile alive, add a bonus of 200 points
		if(!isDead()) {
			score += 200;
		}
		return score;
	}
	
}
