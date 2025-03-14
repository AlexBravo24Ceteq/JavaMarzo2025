package com;

public class MetodosString {

	public static void main(String[] args) {
		
		// Metodos o funncionalidades de la clase String
		
		//Ej. declaramos un String con una cadena de texto, por ej. 
		//la fechha de hoy
		
		String fecha = "Hoy es 11 de Marzo de 2025";
		
		//.length() - nos devuelve enn un valor de tipo entero
		//la longitud o el conteo de caracteres que contiene mi String
		System.out.println("Probando el metodo .length()");
		System.out.println(fecha.length());
		
		//recuerden .length me devuelve un valor entero. si quiero puedo
		//guardarlo para su uso posterior
		int conteo = fecha.length();
		
		System.out.println(conteo);
		
		//charAt() - nos devuelve o extrae el caracter que se encuentra
		//en un indice especificado 
		System.out.println("Probando el metodo .charAt()");
		System.out.println(fecha.charAt(25));
		
		//Podemos ir combinando metodos para utilizarlos
		System.out.println(fecha.charAt(fecha.length()-1));
		
		//.substring() - Nos devuelve una subcadena de text 
		//y funciona de dos formas, la primera es indicando a partir
		//de que indice queremos la subcadena y la otra es indicando
		//a partir de que indice inicial y hasta que indice final queremos
		//dicha subcadena
		System.out.println("Probando metodo .substring(indice inicial)");
		System.out.println(fecha.substring(4));
		
		System.out.println("Probando metodo .substring(indice inicial, indice final)");
		System.out.println(fecha.substring(4, 6));
		
		//.toLowerCase() - convierte la cadena de texto a minuscula
		//.toUpperCase() - convierte la cadena de texto a mayuscula
		
		System.out.println("Probando el metodo .toLowerCase");
		System.out.println(fecha.toLowerCase());
		
		System.out.println("Probando el metodo .toUpperCase");
		System.out.println(fecha.toUpperCase());
		
		//.equals() - compara un objeto contra otro y regresa un valor booleano
		//para decirnos si son iguales o no
		System.out.println("Probando el metodo .equals()");
		System.out.println(fecha.equals("Hoy es 11 de Marzo de 2025"));
		
		//.equalsIgnoreCase() - compara una cadena de texto contra otra en contenido
		//si son iguales devuelve valor true, no importando el uso de mayusculas
		//y minusculas
		
	System.out.println("Probando metodo .equalsIgnoreCase()");
	System.out.println(fecha.equalsIgnoreCase("hOy eS 11 dE MaRzO dE 2025"));
	
	//.contains - devuelve true si existe la secuencia de caracteres en el String
	System.out.println("Probando el metodo .contains()");
	System.out.println(fecha.contains("marzo"));
	
	//.replaces() - reemplaza un caracter o secuencia de ellos, con otros nuevos
	System.out.println("Probando el metodo .replace()");
	System.out.println(fecha.replace("2025", "2026"));
	
	System.out.println(fecha.replace(" ", "$"));
	
	System.out.println(fecha.replace(" ", ""));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
