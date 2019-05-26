package lexicon.se.henric.battle_arena.model;

import java.util.ArrayList;

import se.lexicon.erik.roman_name_generator.RomanNameGenerator;



public class Battle {

	private ArrayList<Round> rounds;
	private Player player;
	private Character opponent;
	private RomanNameGenerator romanNameGenerator;
	private BattleLog log;
	private Character battleWinner;



	/**Constructor
	 * @param Player player
	 */
	public Battle(Player player) {
		
		setPlayer(player); 
		this.rounds = new ArrayList<Round>();
		this.romanNameGenerator = new RomanNameGenerator();
		Character opponent =CreateOpponent();
		setOpponent(opponent);
		battle();
	}
	
	/** private method for starting round
	 *  initiates a new Round object
	 * @return
	 */
	private Round startRound() {
		
		return new Round(player, opponent);
		
	}
	
	/** private method for starting battle
	 *  starts a round, adds round to list of rounds
	 *  uses setter SetLog to create new BattleLog object
	 *  and adds it to Player. Determines winner and sets
	 *  field BattleWinner with setter.
	 */
	public void battle() {
			
			do {
				//start round
				Round round = startRound();
				//add round to list of rounds
				rounds.add(round);
			} while (!player.isDead() || opponent.isDead());
			
			//if the battle is over, save the battle to log
			setLog(new BattleLog(this));
			//add log to players arrayList of logs
			player.addBattleLog(log);
			
			Character winner = determineWinner();
			setBattleWinner(winner);
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

	
	/** getter for field log
	 * @return BattleLog log
	 */
	public BattleLog getLog() {
		return log;
	}


	/** setter for field log
	 * @param BattleLog log
	 */
	public void setLog(BattleLog log) {
		this.log = log;
	}
	
		
	
	
	/**
	 *
	 */
	@Override
	public String toString() {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Player Name: "+player.getCharacterName());
		stringBuilder.append("\nOpponent Name: "+opponent.getCharacterName());
		stringBuilder.append("nBattle Winner: " + getBattleWinner());		
		int i =0;
		while (i >rounds.size()) {
			
			Round round = rounds.get(i);
			
			stringBuilder.append("Round "+i+"\n");
			stringBuilder.append(round.toString());
			
		}
		
		return stringBuilder.toString();
	}
	
	
}
