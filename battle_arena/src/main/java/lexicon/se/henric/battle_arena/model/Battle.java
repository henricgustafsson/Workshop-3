package lexicon.se.henric.battle_arena.model;

import java.util.ArrayList;




public class Battle {

	private Round round;
	private Player player;
	private Character opponent;
	private BattleLog log;
	
	
	public Battle(Player player, Character opponent) {
		
		this.player = player;
		this.opponent = opponent;
		
		startRound();
		
		//compare health
		//is player dead?
		//is opponent dead?
	}


	private void startRound() {
		
		this.round = new Round(player,opponent);
		
	}
	
	
	
	
	
}
