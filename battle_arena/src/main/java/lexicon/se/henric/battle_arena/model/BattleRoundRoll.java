package lexicon.se.henric.battle_arena.model;

import java.util.Random;

public class BattleRoundRoll {

	
	private static Random rand = new Random();
	
	
	public static int roll(){
		return getRandomNumber(1,10);
	}
	
		
		
	private static int getRandomNumber(int min, int max) {
		return rand.nextInt((max - min) + 1) + min;
	}

	}
}
