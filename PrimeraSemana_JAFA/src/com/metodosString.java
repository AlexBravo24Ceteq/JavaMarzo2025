package com;

public class metodosString {
	public static void main(String[] args) {
		// metodos o funcionalidades del metodo String
		
		// ej. declaramos un String con una cadena de texto por ej.
		// la fecha de hoy
		
		String fecha ="Hoy es 11 de marzo de 2025";
		//.length() - nos devuleve en un valor de tipo entero
		// la longitud o el conteo de caracteres que contiene mi string
		
		System.out.println("probando el metodo .length()");
		System.out.println(fecha.length());
		
		// guardar el numero de conteo para su uso posterior
		int conteo = fecha.length();
		
		System.out.println(conteo);
		
		//Metodo .charAt() nos devuelve o extrae el carcater que se encuentra
		// en un indice especificado
		System.out.println("probando el metodo .charAt()");
		System.out.println(fecha.charAt(0));
		
		// podemos ir combinando metodos para utilizarlos
		System.out.println(fecha.charAt(fecha.length()-1));
		
		//.substring() nos devuelve una subcadena de texto
		// y funciona de dos formas, la primera es indicador a partir
		//de que indice queremos la subcadena y la otra es indicado
		//a partir de que indice inicial y hasta que indice final queremos 
		//dicha subcadena
		
		System.out.println("Probando metodo .substring(indice inicial)");
		System.out.println(fecha.substring(4));
		
		System.out.println("Probando metodo .substring(indice inicial, indice final)");
		System.out.println(fecha.substring(4,6));
		
		//.toLowerCase() convierte la cadena de texto en minuscula
		//.toUpperCase() convierte la cadena de texto a mayuscula
		
		System.out.println("Probando el metodo . toLowecase()");
		System.out.println(fecha.toLowerCase());
		
		System.out.println("Probando el metodo . toUppercase()");
		System.out.println(fecha.toUpperCase());
		
		// .equals() compara un objeto contra otro y regresa un valor booleano
		//paara decirnos si son iguales o no 
		
		System.out.println("Probando el metodo . equals");
		System.out.println(fecha.equals("hoy es 11 de marzo de 2025"));
		
		//.equalsIgnoreCase() compara una cadena de texto contra otra en contenido
		//si son iguales devuelve un valor true, no importando el uso de mayuscaulas
		// y minusculas
		
		System.out.println("Probando el metodo . equalsIgnoreCase");
		System.out.println(fecha.equalsIgnoreCase("hoy es 11 de marzo de 2025"));
		
		//.Contains devuelve true si exite la secuencia de caracteres en el string
		System.out.println("Probando el metodo .contains()");
		System.out.println(fecha.contains("del"));
		
		//,replase () remplaza un caracter o secuencia de ellos, con otros nuevos
		System.out.println("probando el metodo .repalce()");
		System.out.println(fecha.replace("2025", "2026"));
		
		System.out.println("probando el metodo .repalce()");
		System.out.println(fecha.replace(" ", "_"));
	}

}
