package lexicon.se.henric.battle_arena;

import java.util.Random;
import java.util.Scanner;

import lexicon.se.henric.battle_arena.model.Battle;
import lexicon.se.henric.battle_arena.model.Player;


public class App 
{
	
	
	public static final Scanner scanner = new Scanner(System.in);
	private static final Random rand = new Random();
	private static Battle battle;
    public static void main( String[] args )
    {
    	System.out.println("Enter Name:");
    	String playerName = scanner.nextLine();
    	System.out.println("Enter health:");
    	int health = scanner.nextInt();
    	scanner.nextLine();
    	System.out.println("Enter Strength:");
    	int strength = scanner.nextInt();
    	scanner.nextLine();
    	Player player = new Player(playerName,strength,health);
    	do {
			
    		battle = new Battle(player);
    		
		} while (!player.isDead());
    	
    	System.out.println(battle.toString());
    	
    }
    
    
	public static int getRandomNumber(int min, int max) {
		return rand.nextInt((max - min) + 1) + min;
	}
}


