package ilu2;

public class Calculateur {
	String[] args;
	int res;
	int nombre;
	String[] nombres;
	final static String ERR = "erreur";
	
	public String ajoute(String input) {
		res = 0;
		if (input.isBlank()) {
			return "0";
		}
	    input = input.replace(" ", "");
	    if(!input.substring(0, 2).equals("//") || input.endsWith(",")) return ERR;
	    input = input.replace("//", "");
		args = input.split("\n");
		nombres = args[1].split(args[0]);
		
		return somme(nombres);
	}
	
	
	public String somme(String[] nombres) {
		for (int i = 0; i < nombres.length; i++) {
			try {
				nombre = Integer.parseInt(nombres[i]);
			} catch (NumberFormatException e) {
				return ERR;
			}
			if(nombre < 0) return ERR;
			if(nombre < 1000) res += nombre;	
		}
		return Integer.toString(res);
	}

}
