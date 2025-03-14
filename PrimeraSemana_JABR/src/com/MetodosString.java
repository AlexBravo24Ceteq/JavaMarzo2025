package com;

public class MetodosString {

	public static void main(String[] args) {
		
		// Métodos o funcionalidades de la clase String
		
		//Ej. Declaramos un String con una cadena de texto, por ej.
		//la fecha de hoy
		
		String fecha = "Hoy es 11 de Marzo de 2025";
		
		// .length() - Nos devuelve en un valor de tipo entero
		//la longitud o el conteo de caracteres que contiene mi String
		System.out.println("Probando el método .length()");
		System.out.println(fecha.length());
		
		//Recuerden .length me devuelve un valor entero. Si quiero puedo
		//guardarlo para su uso posterior
		int conteo = fecha.length();
		
		System.out.println(conteo);
		
		//.charAt() - Nos devuelve o extrae el caracter que se encuentra
		//en un indice especificado
		System.out.println("Probando el método .charAt()");
		System.out.println(fecha.charAt(24));
		
		//Podemos ir combinando métodos para utilizarlos
		System.out.println(fecha.charAt(fecha.length()-1));
		
		//.substring() - Nos devuelve una subcadena de texto
		//y funciona de dos formas, la primera es indicando a partir
		//de que indice queremos la subcadena y la otra es indicando
		//a partir de que indice inicial y hasta que indice final queremos
		//dicha subcadena
		System.out.println("Probando método .substring(indice inicial)");
		System.out.println(fecha.substring(4));
		
		System.out.println("Probando método .substring(indice inicial, indice final)");
		System.out.println(fecha.substring(4, 6));
		
		//.toLowerCase() - convierte la cadena de texto a minisculas
		//.toUpperCase() - convierte la cadena de texto a mayusculas
		System.out.println("Probando el método .toLowerCase()");
		System.out.println(fecha.toLowerCase());
		
		System.out.println("Probando el método .toUpperCase()");
		System.out.println(fecha.toUpperCase());
		
		//.equals() - compara un objeto contra otro y regresa un valor booleano
		//para decirnos si son iguales o no
		System.out.println("Probando el método .equals()");
		System.out.println(fecha.equals("Marzo"));
		
		//.equalsIgnoreCase() - compara una cadena de texto contra otra en contenido
		//si son iguales devuelve un valor true, no importando el uso de mayusculas
		//y minusculas
		System.out.println("Probando el método .equalsIgnoreCase()");
		System.out.println(fecha.equalsIgnoreCase("hOy eS 11 dE MaRzO dE 2025"));
		
		//.contains - devuelve true si existe la secuencia de caracteres en el String
		System.out.println("Probando el método .contains()");
		System.out.println(fecha.contains("Hoy es 11 de Marzo de 2025"));
		
		//.replace () - reemplaza un caracter o secuencia de ellos, con otros nuevos
		System.out.println("Probando el método .replace()");
		System.out.println(fecha.replace("2025", "2026"));
		
		System.out.println(fecha.replace(" ", "$"));
		
		System.out.println(fecha.replace(" ", ""));
		
		
	
		

	}

}
