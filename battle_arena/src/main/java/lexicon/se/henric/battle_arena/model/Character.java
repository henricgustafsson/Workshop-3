package lexicon.se.henric.battle_arena.model;

import lexicon.se.henric.battle_arena.App;

public class Character {

	
	private double strength;
	private double health;	
	private String characterName;
	private boolean isDead;
	
	
	
	public Character(String characterName) {
		//setCharacterName(characterName); 
		//sets the field strength of the character to a random value
		//sets the field health of the character to a random value
		this(characterName,App.getRandomNumber(1, 10));
	}
	/** Constructor taking two parameter
	 * @param String characterName
	 */
	public Character(String characterName, double strength) {
		//setCharacterName(characterName); 
		//sets the field strength of the character to a random value
		//sets the field health of the character to a random value
		this(characterName,strength,App.getRandomNumber(1, 10));
	}
	
	
	/** Constructor taking 3 parameters
	 * @param String characterName
	 * @param double strength
	 * @param double health
	 */
	public Character(String characterName, double strength, double health) {
		setCharacterName(characterName); 
		//sets the field strength of the character to a standard value
		setStrength(strength);
		//sets the field health of the character to a standard value
		setHealth(health);
	}
	
	
	/** Get method for field strength
	 * @return double strength - field strength
	 */
	public double getStrength() {
		 return strength;
	}
	
	/** Set method for field strength
	 * @return void
	 */
	private void setStrength(double strength) {
		this.strength = strength;
	}
	
	/** Get method for field health
	 * @return double health - field health
	 */
	public double getHealth() {
		 return health;
	}
	
	/** Set method for field health
	 * @return void
	 */
	private void setHealth(double health) {
		this.health = health;
	}
	
	/** Get method for field characterName
	 * @return string characterName - field characterName
	 */
	public String getCharacterName() {
		 return characterName;
	}
	
	/** Set method for field strength
	 * @return void
	 */
	private void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	
	/** Check if character is dead by determining if health is greater than 0
	 * and set field isDead to true if dead else false
	 * @return boolean isDead
	 */
	public boolean isDead() {
		System.out.println(health);
		this.isDead = health <= 0 ? true : false;
		return isDead;
	}
	
	/** set field health to param damage
	 * @param double damage
	 */
	public void takeDamage(double damage) {
		health -= damage;
	}

	/** add param addedStrength to field strength
	 * @param double addedStrength
	 */
	public void addStrength(double addedStrength) {
		setStrength(strength+addedStrength);
	}
	
	@Override
	public String toString() {
		
		return "Health: " + getHealth() + "\nStrength" + getStrength();
	}

}