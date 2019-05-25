package lexicon.se.henric.battle_arena.model;

public class Character {

	
	private static double STANDARD_STRENGTH=10;
	
	private static double STANDARD_HEALTH =100; 
	private double strength;
	private double health;	
	private String characterName;
	private boolean isDead;
	
	public Character(String characterName) {
		setCharachterName(characterName); 
		//sets the field strength of the character to a standard value
		setStrength(STANDARD_STRENGTH);
		//sets the field health of the character to a standard value
		setStrength(STANDARD_STRENGTH);
	}
	
	public Character(String characterName, double strength, double health) {
		setCharachterName(characterName); 
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
		 return strength;
	}
	
	/** Set method for field health
	 * @return void
	 */
	private void setHealth(double strength) {
		this.strength = strength;
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
	private void setCharachterName(String characterName) {
		this.characterName = characterName;
	}
	
	public boolean isDead() {
		
		this.isDead = health > 0 ? true : false;
		return isDead;
	}
	
	public void takeDamage(double damage) {
		health -= damage;
	}

	public void addStrength(double addedStrength) {
		setStrength(strength+addedStrength);
	}

}