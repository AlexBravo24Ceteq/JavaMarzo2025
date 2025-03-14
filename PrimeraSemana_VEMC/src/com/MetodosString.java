package com;

public class MetodosString {

	public static void main(String[] args) {
		//Metodos o funcionalidades de la clase String
		//Ej. declaramos un String con una cadena de texto.
		
		String fecha = "Hoy es 11 de Marzo de 2025";
		//Metodo .lenght() - Nos devuelve un valor de tipo entero, la logitud o el conteo de caracteresque contiene mi String.
		System.out.println("Probando el metodo .lenght()");
		System.out.println(fecha.length());
		
		//Recordar que .length me devuelve un valor entero, si quiero puedo guardarlo para su uso posterior.
		
		int conteo = fecha.length();
		System.out.println(conteo);
		
		//Metodo .charAt() Nos devuelve o extrae un caracter que se encuentra en un indice especificado.//el espacio tambien es un caracter
		System.out.println("Probando el metodo .charAt()");
		System.out.println(fecha.charAt(24));
		
		//podemor ir combinando metodos para utilizarlos
		System.out.println(fecha.charAt(fecha.length()-1));
		
		//.substring() Nos devuelve una subcadena de texto	y funciona de dos formas.
		//1.-indicando a partir de que indice queremos la subcadena.
		//2.-indicando a partir de que indice inicial y hasta que indice final queremos dicha subcadena
		System.out.println("Probando metodo .substring (Indice incial)");
		System.out.println(fecha.substring(4));
		
		
		System.out.println("Probando metodo .substring (Indice incial, indice final)");
		System.out.println(fecha.substring(4,6));
		
		//.toLowerCase() Convierte la cadena de texto en minusculas
		System.out.println("Probando el metodo LowerCase()");
		System.out.println(fecha.toLowerCase());
		
		//.toUpperCase() Convierte la cadena de texto en mayusculas
		System.out.println("Probando el metodo UpperCase()");
		System.out.println(fecha.toUpperCase());
		
		//.equals() Compara un objeto contra otro y regresa un valor booleano para decirnos si son iguales o no.
		System.out.println("Probando el metodo .equals()");
		System.out.println(fecha.equals("Hoy es 11 de Marzo de 2025"));
		
		//.equalsIgnoreCase() Compara una cadena de texto con otra en contenido, si son iguales, devuelven un valor true, no importa el uso de mayusculas o minusculas.
		System.out.println("Probando el metodo .equalsIngoneCase()");
		System.out.println(fecha.equalsIgnoreCase("hOY Es 11 dE mArZo dE 2025"));
		
		//.contains Devuelve "True" si existe la secuencia de caracteres especificos en el String.
		System.out.println("Probando el metodo .contains()");
		System.out.println(fecha.contains("marzo"));
		 
		//.replace() Reemplaza un caracter o secuencia de ellos con otros nuevos.
		System.out.println("Porbando el metodo .replace()");
		System.out.println(fecha.replace("2025", "2026"));//reemplaza secuencia de caracteres
		
		System.out.println(fecha.replace(" ", "#"));//reemplaza solo el caracter
		System.out.println(fecha.replace(" ", ""));
		
	}

}
