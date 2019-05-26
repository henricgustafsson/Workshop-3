package lexicon.se.henric.battle_arena.model;


public class BattleLog {


	private Battle battle;
	
	public BattleLog(Battle battle) {
		
		setBattle(battle);
	}

	public Battle getBattle() {
		return battle;
	}

	private void setBattle(Battle battle) {
		this.battle = battle;
	}

	@Override
	public String toString() {
		
		return battle.toString();
	}
	
	
}


