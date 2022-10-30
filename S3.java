package model;

public class S3 extends Thread{
	
	public static boolean esConsonante(char letra) {
		return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letra).toLowerCase());
	}

	public static int contarConsonantes(String palabra){
		
		int consonantes = 0;
		
		for (int i = 0; i < palabra.length(); i++) {
			char letra = palabra.charAt(i);
			
			if (esConsonante(letra)) {
				consonantes++;
				
			}
		}
		return consonantes;
	}
	
}
