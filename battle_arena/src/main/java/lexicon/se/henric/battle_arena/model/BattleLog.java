package lexicon.se.henric.battle_arena.model;


public class BattleLog {

	private BattleRound round;
	private int BattleID;
	private Fighter player;
	private Fighter opponent;
	private BattleRoundRoll playerRoll;
	private BattleRoundRoll opponentRoll;
	private Fighter roundWinner;
	boolean roundIsDraw;
	boolean isFinalRound;
	
	
	
	
	public BattleLog(BattleRound round) {

		this.round = round;
		this.BattleID = round.getBattleID();
		this.player = round.getPlayer();
		this.opponent = round.getOpponent();
		this.playerRoll = round.getPlayerRoll();
		this.opponentRoll = round.getOpponentRoll();
		this.roundWinner = round.getRoundWinner();
		this.roundIsDraw = round.getisRoundIsDraw();
		this.isFinalRound = round.isFinalRound();
	}


	
	
}


