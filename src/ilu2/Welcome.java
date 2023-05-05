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
				boolean cri = false;
				bonjour.append("Hello");
				for(int i = 0; i < noms.length; i++) {
					if(!noms[i].equals(noms[i].toUpperCase())) {
						bonjour.append(", " + noms[i].trim().substring(0, 1).toUpperCase() + noms[i].trim().substring(1));
					}else {
						cri = true;
					}
				}
				// S'il y a un nom crier
				if(cri) {
					bonjour.append(". AND HELLO");
					for(int i = 0; i < noms.length; i++) {
						if(noms[i].equals(noms[i].toUpperCase())) {
							bonjour.append(", " + noms[i].trim().substring(0, 1).toUpperCase() + noms[i].trim().substring(1));
						}
					}
					bonjour.append(" !");
				}
			}
			// 1 seul nom crier
			else if(input.equals(input.toUpperCase())) {
				bonjour.append("HELLO, " + input + " !");
			}
			// 1 seul nom 
			else {
				bonjour.append("Hello, " + input.substring(0, 1).toUpperCase() + input.substring(1));
			}
		}
		return bonjour.toString();
	}
}
