package lexicon.se.henric.battle_arena.model;

import java.util.ArrayList;

import se.lexicon.erik.roman_name_generator.RomanNameGenerator;



public class Battle {

	private ArrayList<Round> rounds;
	private Player player;
	private Character opponent;
	private RomanNameGenerator romanNameGenerator;
	private Character battleWinner;



	/**Constructor
	 * @param Player player
	 */
	public Battle(Player player) {
		
		setPlayer(player); 
		this.rounds = new ArrayList<Round>();
		this.romanNameGenerator = new RomanNameGenerator();
		
	}
	
	/** private method for starting round
	 *  initiates a new Round object
	 * @return
	 */
	private Round newRound() {
		
		return new Round(player, opponent);
		
	}
	
	/** private method for starting battle
	 *  starts a round, adds round to list of rounds
	 *  uses setter SetLog to create new BattleLog object
	 *  and adds it to Player. Determines winner and sets
	 *  field BattleWinner with setter.
	 */
	public void startBattle() {
			
		
				do {
					//create new opponent
					Character opponent = CreateOpponent();
					setOpponent(opponent);
					//start round
					Round round = newRound();
					round.startRound();
					//add round to list of rounds
					rounds.add(round);
					Character winner = determineWinner();
					//if the winning character is an instance of player
					//the player has won. Count up field battlesWon
					//using addToBattlesWon method
					if (winner instanceof Player) {
						((Player) winner).addToBattlesWon();
					}
					setBattleWinner(winner);
				} while (!player.isDead() && !opponent.isDead());
	
			
			
	}
	
	/** private method for determing winner
	 * if player is dead return opponent, otherwisee vice versa
	 * @return
	 */
	private Character determineWinner() {
		return player.isDead() ? opponent : player;
	}
	
	
	/** Gets a random name using romanNameGenerator class (field romanNameGenerator)
	 * initiziate a new Character object using that name and returns it
	 * @return
	 */
	private Character CreateOpponent() {
		String name = romanNameGenerator.getFullName();
		
		return new Character(name);
	} 
	
	/**getter for field player
	 * @return field player
	 */
	public Player getPlayer() {
		return player;
	}

	/** setter for field player
	 * @param Character player
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	/** getter for field Opponent
	 * @return field opponent
	 */
	public Character getOpponent() {
		return opponent;
	}

	/** setter for field opponent
	 * @param Character opponent
	 */
	public void setOpponent(Character opponent) {
		this.opponent = opponent;
	}

		
	/** getter for field battleWinner
	 * @return Character battleWinner
	 */
	public Character getBattleWinner() {
		return battleWinner;
	}


	/** setter for field battleWinner
	 * @param Character battleWinner
	 */
	private void setBattleWinner(Character battleWinner) {
		this.battleWinner = battleWinner;
	}

	
	/**
	 *
	 */
	@Override
	public String toString() {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Player Name: "+player.getCharacterName());
		stringBuilder.append("\nOpponent Name: "+opponent.getCharacterName());
		stringBuilder.append("\nBattle Winner: " + getBattleWinner().getCharacterName());		
		int i =0;
		while (i <rounds.size()) {
			
			Round round = rounds.get(i);
			
			stringBuilder.append("\nRound "+(i+1)+"\n");
			stringBuilder.append(round.toString());
			++i;
		} 
		
		return stringBuilder.toString();
	}
	
	
}
