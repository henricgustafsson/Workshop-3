package lexicon.se.henric.battle_arena;

import java.util.Random;

/**
 * Required Features:
• The player should be able to create his character, give it a name, and
assign it attribute values.
• The game should randomly create opponents for the player to fight until
the player character dies or retires.
• When the player character dies or retires, the game should assign a score
to the player based on how many fights their character survived, and
whether they are still alive or not.
Optional:
• Add in arena variety, giving bonuses and penalties based on gear and
other factors. Which one ends up being used should be random.
• When the player is victorious, award them with in-game currency, which
can be spent on upgrading their gear, increasing their statistics.
• A log of each battle should be stored, and be made available to the player
at the end of the game.
 *
 */
public class App 
{
	
	private static Random rand = new Random();
	
    public static void main( String[] args )
    {
    	
       //1.ask for name of player
    	//create new fighter with name given by user input
    	// 2.get a random name and create new fighter
    	
    	//new round
    	//3.start a new round 						<=======================
    	//4.print state of players											||
    	//5.add a random modifier to player strength						||
    	//6.compare player strenghts 										||
    	//7.Damage the looser                                               ||
    	//8.If opponent is dead, round is over, otherwise go to #3. =========
    	//9.Is the player dead?
    	//10. Ask if continue if y go to #2 ======================================
    	
    	
    }
    
    @SuppressWarnings("unused")
	public static int getRandomNumber(int min, int max) {
		return rand.nextInt((max - min) + 1) + min;
	}
}


