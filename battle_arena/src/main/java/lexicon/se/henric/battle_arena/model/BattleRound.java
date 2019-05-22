package lexicon.se.henric.battle_arena.model;

public class BattleRound {

	private static int COUNTER = 0;
	private int battleID =0;
	private BattleRoundRoll playerRoll;
	private BattleRoundRoll opponentRoll;
	private Fighter player;
	private Fighter opponent;
	private Fighter roundWinner;
	
	public Fighter getRoundWinner() {
		return roundWinner;
	}


	private void setRoundWinner(Fighter roundWinner) {
		//Compare fighters and declare winner, else isDraw = true; Player "wins" by default.
		
		this.roundWinner = roundWinner;
		//TODO: add condition around this
		setRoundIsDraw(true);
	}
	private boolean roundIsDraw;
	private boolean isFinalRound;
	private BattleLog log;
	
	
	public int getBattleID() {
		return battleID;
	}


	public boolean getisRoundIsDraw() {
		return roundIsDraw;
	}


	private void setRoundIsDraw(boolean roundIsDraw) {
		this.roundIsDraw = roundIsDraw;
	}


	public boolean isFinalRound() {
		return isFinalRound;
	}


	private void setFinalRound(boolean isFinalRound) {
		this.isFinalRound = isFinalRound;
	}


	
	public BattleRound(Fighter player, Fighter opponent) {
		
		this.battleID = ++COUNTER;
		this.player = player;
		this.opponent=opponent;
	}


	public BattleRoundRoll getPlayerRoll() {
		return playerRoll;
	}


	public void setPlayerRoll(BattleRoundRoll playerRoll) {
		//use battleRoll class
		this.playerRoll = playerRoll;
	}


	public BattleRoundRoll getOpponentRoll() {
		
		return opponentRoll;
	}


	public void setOpponentRoll(BattleRoundRoll opponentRoll) {
		
		//use battleRoll class
		this.opponentRoll = opponentRoll;
	}


	public Fighter getPlayer() {
		return player;
	}

	public Fighter getOpponent() {
		return opponent;
	}





	
	
	
}
