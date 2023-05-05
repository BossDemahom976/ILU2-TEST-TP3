package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		StringBuilder bonjour = new StringBuilder();
		if(input == null || input.trim() == "") {
			bonjour.append("Hello, my friend");
		}else {
			String[] noms = input.trim().split(",");
			// S'il y a plusieurs noms
			if(noms.length > 1) {
				bonjour.append("Hello");
				int maj = getNbMaj(noms);
				int min = noms.length - maj;
				
				for(String e : noms) {
					if(!isToutEnMaj(e)) {
						if(min > 1) {
							bonjour.append(", " + majLettre(e));
						}else { 
							bonjour.append(" and " + majLettre(e));
						}
						min -= 1;
					}
				}
				// S'il y a un nom maj
				if(maj > 0) {
					bonjour.append(". AND HELLO");
					for(String nom : noms) {
						if(isToutEnMaj(nom)) {
							if(maj > 1) {
								bonjour.append(", " + majLettre(nom));
							}else {
								bonjour.append(" AND " + majLettre(nom));
							}
							maj -= 1;
						}
					}
					bonjour.append(" !");
				}
			}
			// 1 seul nom maj
			else if(isToutEnMaj(input)) {
				bonjour.append("HELLO, " + input + " !");
			}
			// 1 seul nom 
			else {
				bonjour.append("Hello, " + majLettre(input));
			}
		}
		return bonjour.toString();
	}
	
	private static String majLettre(String input) {
		return input.trim().substring(0, 1).toUpperCase() + input.trim().substring(1);
	}
	
	private static boolean isToutEnMaj(String input) {
		return input.equals(input.toUpperCase());
	}
	
	private static int getNbMaj(String[] noms) {
		int maj = 0;
		for(String e : noms) {
			if(isToutEnMaj(e)) {
				maj+=1;
			}
		}
		return maj;
	}
}
