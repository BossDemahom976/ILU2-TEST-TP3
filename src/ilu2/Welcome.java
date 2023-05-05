package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		StringBuilder bonjour = new StringBuilder();
		if(input == null || input.trim().equals("")) {
			bonjour.append("Hello, my friend");
		}else {
			String[] noms = input.trim().split(",");
			// S'il y a plusieurs noms
			if(noms.length > 1) {
				bonjour.append("Hello");
				
				String[] nomsDistinct = getNomsDistinct(noms);
				int[] repetitions = getRepetitions(noms, nomsDistinct);
				
				int maj = getNbMaj(nomsDistinct);
				int majBase = maj;
				int min = nomsDistinct.length - maj;
				int minBase = min;
				
				for(int i = 0; i< nomsDistinct.length; i++) {
					if(!isToutEnMaj(nomsDistinct[i])) {
						if(min > 1) {
							if(repetitions[i] > 1) {
								bonjour.append(", " + majLettre(nomsDistinct[i]) + " (x" + repetitions[i] + ")");
							}else {
								bonjour.append(", " + majLettre(nomsDistinct[i]));
							}
						}else {
							if(minBase > 1) {
								if(repetitions[i] > 1) {
									bonjour.append(" and " + majLettre(nomsDistinct[i]) + " (x" + repetitions[i] + ")");
								}else {
									bonjour.append(" and " + majLettre(nomsDistinct[i]));
								}
							}else {
								if(repetitions[i] > 1) {
									bonjour.append(", " + majLettre(nomsDistinct[i]) + " (x" + repetitions[i] + ")");
								}else {
									bonjour.append(", " + majLettre(nomsDistinct[i]));
								}
							}
						}
						min -= 1;
					}
				}
				// S'il y a un nom maj
				if(maj > 0) {
					bonjour.append(". AND HELLO");
					for(int i = 0; i< nomsDistinct.length; i++) {
						if(isToutEnMaj(nomsDistinct[i])) {
							if(maj > 1) {
								if(repetitions[i] > 1) {
									bonjour.append(", " + majLettre(nomsDistinct[i]) + " (x" + repetitions[i] + ")");
								}else {
									bonjour.append(", " + majLettre(nomsDistinct[i]));
								}
							}else { 
								if(majBase > 1) { 
									if(repetitions[i] > 1) {
										bonjour.append(" AND" + nomsDistinct[i] + " (x" + repetitions[i] + ")");
									}else {
										bonjour.append(" AND" + nomsDistinct[i]);
									}
								}else {
									if(repetitions[i] > 1) {
										bonjour.append("," + nomsDistinct[i] + " (x" + repetitions[i] + ")");
									}else {
										bonjour.append(", " + nomsDistinct[i]);
									}
								}
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
				maj++;
			}
		}
		return maj;
	}
	
	private static String[] getNomsDistinct(String[] noms) {
	    String[] nomsDistinct = new String[noms.length];
	    int index = 0;

	    for (int i = 0; i < noms.length; i++) {
	        boolean existe = false;
	        for (int j = 0; j < index; j++) {
	            if (noms[i].trim().equalsIgnoreCase(nomsDistinct[j].trim())) {
	                existe = true;
	                break;
	            }
	        }
	        if (!existe) {
	            nomsDistinct[index] = noms[i];
	            index++;
	        }
	    }
	    String[] liste = new String[index];
	    for (int i = 0; i < index; i++) {
	        liste[i] = nomsDistinct[i];
	    }
	    return liste;
	}

	
	private static int[] getRepetitions(String[] noms, String[] nomsDistinct) {
	    int[] repetitions = new int[nomsDistinct.length];
	    for (int i = 0; i < nomsDistinct.length; i++) {
	        int count = 0;
	        for (int j = 0; j < noms.length; j++) {
	            if (noms[j].trim().equalsIgnoreCase(nomsDistinct[i].trim())) {
	                count++;
	            }
	        }
	        repetitions[i] = count;
	    }
	    return repetitions;
	}
}