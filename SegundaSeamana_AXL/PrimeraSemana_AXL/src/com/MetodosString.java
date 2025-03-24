package com;

public class MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Metodos o funcionalidades de la clase String
		
		//Ej. declaramos un String con una cadena de texto por ej.
		//la fecha de hoy
		
		String fecha = "Hoy es 11 de marzo del 2025";
		
		//.length() - Nos devuelve en un valor de tipo entero
		//la longitud o el conteo de caracteres que contiene mi String
		
		System.out.println("Probando el metodo .length()");
		System.out.println(fecha.length());
		
		//.length devuelve valor entero, si quiero puedo guardarlo para su 
		//uso posterior
		int conteo = fecha.length();
		
		System.out.println(conteo);
		
		//Metodo .charAt - nos devuelve o extrae el caracter
		//que se encuenta en un indice especifico 
		System.out.println("Probando el metodo .charAt()");
		System.out.println(fecha.charAt(25));
		
		
		//podemos ir combinando metodos para utilizarlos
		System.out.println(fecha.charAt(fecha.length()-1));
		
		//.substring() - nos devuelve una cadena de texto
		//funciona a partir de que indice queremos la subcadena y la otra forma 
		//indica a partir de que indice inicial y hasta que indice
		//final queremos
		System.out.println("probando metodo .substring(indice inicial)");
		System.out.println(fecha.substring(3));
		
		System.out.println("probando metodo .substring(indice inicial, indice final)");
		System.out.println(fecha.substring(3, 5));
		
		//.toLowerCase() - convierte la cadena de texto a minusculas
		//.toUpCase() - convierte la cadena de texto a mayusculas
		
		System.out.println("Probando el metodo .toLowerCase()");
		System.out.println(fecha.toLowerCase());
		
		System.out.println("Probando el metodo .toUpperrCase()");
		System.out.println(fecha.toUpperCase());
		
		//.equals() - compara un objeto contra el otro y regresa un valor booleano
		//para decirnos si son iguales o no
		System.out.println("Probando el metodo .equals()");
		System.out.println(fecha.equals("Hoy es 11 de marzo del 2025"));
		
		//.equalsIgnoreCase() - compara una cadena de texto contra otra en contenido
		//si son iguales devuelve un valor true, no importa el uso
		//de mayusculas y minusculas
		
		System.out.println("Probando el metodo .equalsIgnoreCase()");
		System.out.println(fecha.equalsIgnoreCase("Hoy es 11 de mArzo deL 2025"));
		
		//.contains - devuelve true si existe la secuencia de caracteres en el String
		System.out.println("Probando el metodo .contains()");
		System.out.println(fecha.contains("marzo"));
		// busca la coincidencia exacta de los caracteres, osea si afecta letras mayusculas y minusculas
		//Ej. "marzo" y "Marzo"
		//basicamente es como si fuera el ciclo if-else
		
		//.replace() - remplaza caracteres o secuencias de ellos, con otros nuevos
		System.out.println("Probando el metodo .replace()");
		System.out.println(fecha.replace("2025", "2026"));
		
		System.out.println(fecha.replace(" ", "$"));
		System.out.println(fecha.replace(" ", ""));
		
		
		
		

	}

}
