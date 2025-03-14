package com;

public class MetodosString {

	public static void main(String[] args) {
		
		/* Méodos o funcionalidades de la clase String
		 * Ejemplo, declaramos un String con una cadena de texto
		 * por ejemplo la fecha de hoy
		 */
		
		String fecha = "Hoy es 11 de marzo del 2025";
		
		/* .Length() Nos devuelve en un valor de tipo entero la longitud o
		 * el conteo de caracteres que contiene el String
		 */
		System.out.println("Probando el método .lenght()");
		System.out.println(fecha.length());
		
		//Si quiero guardar el valor entero que devuelve .length para su uso posterior
		int conteo = fecha.length();
		System.out.println(conteo);
		
		//.charAt() Nos devuelve o extrae el caracter que se encuentra en un indice especificado
		System.out.println("Probando el metodo .charAt()");
		System.out.println(fecha.charAt(0));
		System.out.println(fecha.charAt(26));
		
		//Podemos ir combinando métodos para utilizarlos
		System.out.println(fecha.charAt(fecha.length()-1));
		
		/*.substring() Nos devuelve una subcadena de texto y funciona de dos maneras
		 * la primera es indicando a partir de que indice queremos la subcadena y la otra
		 * es indicando a partir de que indice inicial y hasta que indice final queremos dicha cadena
		 */
		System.out.println("Probando método .substring(indice inicial)");
		System.out.println(fecha.substring(3));
		
		System.out.println("Probando método .substring(indice inicial e indice final)");
		System.out.println(fecha.substring(3, 18));
		
		//.tolowerCase() convierte la cadena de texto a minusculas
		//.toUpperCase() convierte la cadena de texto a mayusculas
		System.out.println("Probando el metodo .toLowerCase");
		System.out.println(fecha.toLowerCase());
		
		System.out.println("Probando el metodo .toUpperCase");
		System.out.println(fecha.toUpperCase());
		
		//.equals() compara un objeto contra otro y regresa un valor booleano
		//para decirnos si son iguales o no
		System.out.println("Probando el método .equals");
		System.out.println(fecha.equals("Hoy es 11 de marzo del 2025"));
		
		/*.equalsIgnoreCase() compara una cadena de text0 contra otra en contenido si son iguales
		 * devuelve un valor true, no iportando el uso de mayusculas y minusculas
		 */
		
		System.out.println("Probando el método .equalsIgnoreCase");
		System.out.println(fecha.equalsIgnoreCase("HOY ES 11 de MARZO del 2025"));
		
		//.contains devuelve true si existe la secuencia de caracteres en el string
		System.out.println("Probando el metodo .contains");
		System.out.println(fecha.contains("marzo"));
		
		//.remplace() reemplaza un caracter o secuencia de ellos con otros nuevos
		System.out.println("Probando el método .replace()");
		System.out.println(fecha.replace("2025", "2026"));
		
	}

}
