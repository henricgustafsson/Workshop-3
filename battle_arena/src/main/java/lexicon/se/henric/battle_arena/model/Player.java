package lexicon.se.henric.battle_arena.model;

import java.util.ArrayList;

public class Player extends Character{

	private ArrayList<BattleLog> battleLogs;
	
	public Player(String characterName, double strength, double health) {
		super(characterName, strength, health);
		this.battleLogs = new ArrayList<BattleLog>();
	}
	

	/**
	 * @return ArrayList<BattleLog> battleLogs - field battleLogs
	 */
	public ArrayList<BattleLog> getBattleLogs() {
		return battleLogs;
	}
	
	
	/** method to add a BattleLog to the field battleLogs
	 * @param BattleLog log
	 * @return void
	 */
	public void addBattleLog(BattleLog log) {
		battleLogs.add(log);
	}
	
	// TODO: private int getNumberOfBattle
	
	
	
}
