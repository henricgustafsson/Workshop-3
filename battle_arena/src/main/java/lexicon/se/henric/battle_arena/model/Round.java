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
	private int playerRoll;
	private int opponentRoll;
	private Character player;
	private Character opponent;
	private Character rollWinner;
	private static double DAMAGE_DEALT_TO_LOSER=10;
	

	/** Constructor
	 * @param Character player
	 * @param Character opponent
	 */
	public Round(Character player, Character opponent) {		
		
		//set player and opponent from params
		setPlayer(player);
		setOpponent(opponent);
		startRound();
	}
	
	/** Private method to roll for player and opponent
	 * set fields PlayerRoll & OpponentRoll using setters
	 * add strength of roll to characters strength, compare them
	 * and deal damage to looser. Determines winner and sets
	 * field rollWinner with setter.
	 */
	private void startRound(){
		//Roll and save roll for characters in fields
		setPlayerRoll(roll());
		setOpponentRoll(roll());
		
		//Add strength of characters roll to character's strength
		player.addStrength(playerRoll);
		opponent.addStrength(opponentRoll);
		//compare who has more strength		
		Character fighterToTakeDamage = compareRollsAndReturnLoser(player,opponent);
		//deal damage to character
		fighterToTakeDamage.takeDamage(DAMAGE_DEALT_TO_LOSER);
		//If name of the losing character equals player name, set rollwinner to opponent
		//else vice versa
		Character rollWinner = determineRoundWinner(fighterToTakeDamage);
		setRollWinner(rollWinner);
	}
	
	/** Private method which determines the winner of the round
	 * @param fighterToTakeDamage
	 * @return Character player
	 */
	private Character determineRoundWinner(Character fighterToTakeDamage) {
		//if the character of the looser is an instance of Player
		//return opponent, else vice versa
		
		return fighterToTakeDamage instanceof Player ? player : opponent;
	}
	
	/** Private method to comapare rolls and return the loser
	 * @param Character player
	 * @param Character opponent
	 * @return Character
	 */
	private Character compareRollsAndReturnLoser(Character player, Character opponent){
		//if the players strength is less than the opponents, return player
		// otherwise return opponent
		return (player.getStrength() < opponent.getStrength())?player : opponent;
		
	}
	
	/** Private method which gets a random number in an interval of two set values
	 * using fields MINIMUM_VALUE and MAXIMUM_VALUE
	 * @return int 
	 */
	private static int roll(){
		
		return App.getRandomNumber(MINIMUM_VALUE, MAXIMUM_VALUE);
	}
	
	/** getter for field player
	 * @return field player
	 */
	public Character getPlayer() {
		return player;
	}


	/** setter for field player
	 * @param Character player
	 */
	private void setPlayer(Character player) {
		this.player = player;
	}


	/**getter for field opponent
	 * @return
	 */
	public Character getOpponent() {
		return opponent;
	}


	/** setter for field opponent
	 * @param Character oopponent
	 */
	private void setOpponent(Character opponent) {
		this.opponent = opponent;
	}
	
	
	
	/** getter for field Rollwinner
	 * @return
	 */
	public Character getRollWinner() {
		return rollWinner;
	}


	/** setter for field Rollwinner
	 * @param Character rollWinner
	 */
	private void setRollWinner(Character rollWinner) {
		this.rollWinner = rollWinner;
	}

		
	/** getter for field opponentROll
	 * @return field opponentRoll
	 */
	public int getOpponentRoll() {
		return opponentRoll;
	}



	/** setter for field opponentRoll
	 * @param int opponentRoll
	 */
	private void setOpponentRoll(int opponentRoll) {
		this.opponentRoll = opponentRoll;
	}
	
	
	/** getter for field PlayerRoll
	 * @return
	 */
	public int getPlayerRoll() {
		return playerRoll;
	}


	/** setter for field playerRoll
	 * @param int playerRoll
	 */
	private void setPlayerRoll(int playerRoll) {
		this.playerRoll = playerRoll;
	}
	
	
	
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("Player Rolled: "+ getPlayerRoll());
		stringBuilder.append("\nOpponent Rolled: "+getOpponentRoll());
		stringBuilder.append("\nRound Winner: " + getRollWinner().getCharacterName());
		
		return stringBuilder.toString();
	}
	
	
}
