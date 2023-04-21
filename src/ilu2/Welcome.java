package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		String bonjour = "Hello, my friend";
		if(input != null && input.trim() != "") {
			bonjour = "Hello, " + input.substring(0, 1).toUpperCase() + input.substring(1);
		}
		return bonjour;
	}
}
