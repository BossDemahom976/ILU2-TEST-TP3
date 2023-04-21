package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		StringBuilder bonjour = new StringBuilder("Hello, ");
		if(input != null && input.trim() != "") {
			if(input.equals(input.toUpperCase())) {
				bonjour.delete(0, bonjour.toString().length());
				bonjour.append("HELLO, " + input + " !");
			}else {
				bonjour.append(input.substring(0, 1).toUpperCase() + input.substring(1));
			}
		}else if(input == null || input.trim() == "") {
			bonjour.append("my friend");
		}
		return bonjour.toString();
	}
}
