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
    	boolean playerWantsToContinue =true;
    	String playerName=null;
    	double health=0;
    	double strength=0;
    	boolean validInput =true;
    	
    	do {
			try {
				System.out.println("Enter Name:");
				playerName = scanner.nextLine();
				System.out.println("Enter health:");
				health = scanner.nextDouble();
				System.out.println("Enter Strength:");
				strength = scanner.nextDouble();
				scanner.nextLine();
				
			} catch (Exception e) {
				System.out.println("Please enter health and strength as numbers!");
				validInput = false;
				scanner.nextLine();
			} 
			
		} while (!validInput);
    	
		StringBuilder stringbuilder = new StringBuilder();

		Player player = new Player(playerName,strength,health);
    	do {
			
    		battle = new Battle(player);
    		battle.startBattle();
    		//System.out.println(battle.toString());
    		stringbuilder.append(battle.toString());
    		System.out.println("Do you want to continue?");
        	String userInput = scanner.nextLine();
        	playerWantsToContinue = userInput.compareToIgnoreCase("y")==0? true:false; 
        	if(!playerWantsToContinue) break;
        	
		} while (!player.isDead());
    
		
		System.out.println(stringbuilder.toString());
		System.out.println("Your Score"+player.calculateScore());
    	
    	
    }
    
    
	public static int getRandomNumber(int min, int max) {
		return rand.nextInt((max - min) + 1) + min;
	}
}


