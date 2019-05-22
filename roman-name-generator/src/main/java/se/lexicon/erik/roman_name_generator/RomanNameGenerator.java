package se.lexicon.erik.roman_name_generator;

import java.util.Random;

/**
 * This class generate random latin names lorem ipsum style
 * @author Erik Svensson
 *
 */
public class RomanNameGenerator {
	
	private String[] firstNames;
	private String[] lastNames;
	private static final Random RANDOM = new Random();
	
	public RomanNameGenerator() {
		firstNames = initFirstNames();
		lastNames = initLastNames();
	}
	
	private int getRandomIndex(int min, int max) {
		return RANDOM.nextInt(max - min) + min;
	}
	
	public String getRandomFirstName() {
		int index = getRandomIndex(0, firstNames.length -1);
		String firstName = firstNames[index];
		return firstName;
	}
	
	public String getRandomLastName() {
		return lastNames[getRandomIndex(0, lastNames.length-1)];
	}
	
	public String getFullName() {
		return getRandomFirstName() + " " + getRandomLastName();
	}	

	private String[] initFirstNames() {
		String[] firstNames = {
				"Julius", "Claudius", "Laurentinus",
				"Gordianus", "Balbus", "Petronius",
				"Fabius", "Ovidius", "Laelius",
				"Valerius", "Traianus", "Africanus",
				"Septimius", "Maximanus", "Antonius",
				"Sextilius", "Quintus", "Aulus",
				"Iovanus", "Sabinus", "Marcus",
				"Otho", "Felix", "Tertius",
				"Varinius", "Herminius", "Januarius",
				"Septimius", "Gnaeus", "Agrippa", "Iulianus", "Manlinus",
				"Gallus", "Faustinus", "Iuvenalis", "Lucianus", "Paulus"	
				
		};
		return firstNames;
	}
	
	private String[] initLastNames() {
        String[] lastNames = {
                "Festus",
                "Ennius",
                "Marius",
                "Valentinus",
                "Iovita",
                "Caius",
                "Aelianus",
                "Lucianus",
                "Camillus",
                "Tiburtius",
                "Severus",
                "Longinus",
                "Fabricius",
                "Atilius",
                "Cornelius",
                "Augustus",
                "Lucanus",
                "Varinius",
                "Marcellinus",
                "Vergilius",
                "Secundinus",
                "Africanus",
                "Valerianus",
                "Decimus",
                "Maximilianus",
                "Priscus",
                "Maxentius",
                "Livius",
                "Severianus",
                "Atilius",
                "Maximus",
                "Plinius",
                "Drusus",
                "Duilius",
                "Pontius",
                "Florianus",
                "Egnatius"
        };
        return lastNames;
    }

	

}
