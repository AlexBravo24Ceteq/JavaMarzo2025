package com;

public class MetodosString {

	public static void main(String[] args) {
		
		
		//Metodos y funcionalidades de la clase string
		//Ej. Declaramos un string con una cadena de texto
		// la fecha de hoy
		
		String fecha = "Hoy es 11 de marzo de 2025";
		
		// .lenght() - nos devuelve en un valor tipo entero
		//la longitud o el conteo de caracteres que contiene mi String
		System.out.println("Probando el metodo .lenghht()");
		System.out.println(fecha.length());
		
		//Recuerden .length me devyelve un valor entero. Si quiero 
		//puedo guardarlo para su uso posterior
		int conteo = fecha.length();
		
				System.out.println(conteo);
		//.charAt() - nos devuelve o extrae el caracter que se encuentra
				//en un indice especificado 
				System.out.println("Probando el metodo .chartAt()");
				System.out.println(fecha.charAt(24));
				
				//podemor ir combiando metodos  para utilizarlos
		System.out.println(fecha.charAt(fecha.length()-1));
		
		//.subtring() - nos devuelve una subcadena de texto
		// y funciona de dos formas, la primera es indicando a partir
		// de que indice queremos la subcadena y la otra es indicando 
		//a partir de que indice inicial y hasta que indice final queremos }
		//dicha sub cadena
		
		System.out.println("Probando metodo, .subtring(indice inicial)");
		System.out.println(fecha.substring(4));
		
		System.out.println("Probando metodo, .subtring(indice inicial)");
		System.out.println(fecha.substring(4, 6));
		
		
		// .toLowerCase() Convierte la cadena de texto a minuscula
		// .toUppercase() convierte la cadena de texto en mayuscula
		
		System.out.println("probando el metodo .toLowerCase()");
		System.out.println(fecha.toLowerCase());
		
		//.equals() - compara un objetivo contra otro y regresa un valor booleano
		// para decirnos si son iguales o no
		System.out.println("Probando el metodo .equals()");
		System.out.println(fecha.contentEquals("Hoy es 11 de marzo de 2025"));
		
		//.equalsIgnoreCase() - compara una cadena de texto contra otra en contenido
		//si son iguales devuelve un valor, true no imporntando el uso de mayusculas
		// y minusculas
		
		System.out.println("probando el metodo .equalsIgnoreCase()");
		System.out.println(fecha.equalsIgnoreCase("hoy es 11 de MarzO dE 2025"));
		
		// .contains - devuelve true si existe la secuencia de caracteres
		// en el String
		System.out.println("Probando el metodo .contains()");
		System.out.println(fecha.contains("Marzo"));
		
		//.replace () - remplaza un caracter o secuencia de ellos, con otrosa nuevos
		System.out.println("Probando el metodo .replace");
		System.out.println(fecha.replace("2025", "2026"));
		System.out.println(fecha.replace(" ", "%"));
		System.out.println(fecha.replace(" ", ""));
		
		
		
	}

}
