package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		StringBuilder bonjour = new StringBuilder();
		if(input == null || input.trim() == "") {
			bonjour.append("Hello, my friend");
		}else {
			String[] noms = input.trim().split(",");
			if(noms.length > 1) {
				bonjour.append("Hello");
				for(int i= 0; i < noms.length; i++) {
				bonjour.append(", " + noms[i].trim().substring(0, 1).toUpperCase() + noms[i].trim().substring(1));
				}
			}
			else if(input.equals(input.toUpperCase())) {
				bonjour.append("HELLO, " + input + " !");
			}else {
				bonjour.append("Hello, " + input.substring(0, 1).toUpperCase() + input.substring(1));
			}
		}
		return bonjour.toString();
	}
}
