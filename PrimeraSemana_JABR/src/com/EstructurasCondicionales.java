package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estructuras de decisión if/else - evaluan valores booleanos
		
		/*si (esto se cumple) {
		 * se ejecutara este bloque de codigo
		 * } si no/de otro modo {
		 * ejecuta este otro bloque
		 * }
		 */
		
		//Ej. vamos a tener un variable con un valor entero
		
		int x = 9;
		
		if (x<=9) { //si esto se cumple, se ejecuta el sig bloque
			System.out.println("Cierto");
		}else { //si no, se ejecuta esto otro
			System.out.println("Falso");
		}
		
		//Condiciones compuestas con operadores lógicos
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND - && - Devuelve el primer bloque (true), siempre que todas las condiciones
		//se cumplan
		System.out.println("Operador AND");
		
		if (x<8 && x>5) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		//OR - || - Devuelve true, cuando al menos se cumpla una condición
		System.out.println("Operador OR");
		
		if (x<8 || x>5) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		//NOT - ! - Niega una condición, o cambia su valor de true a false y viceversa
		System.out.println("Operador NOT");
		
		if (!(x<8)) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		//IGUALDAD - == - Compara valores y devuelve true cuando son iguales
		
		System.out.println("Operador IGUALDAD");
		
		if (x == 10) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		//DIFERENTE DE - != - Compara los valores y devuelve true cuando son diferentes
		System.out.println("Operador DIFERENTE DE");
		
		if (x != 10) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		//if else anidado
		//Nos permite evaluar más alla de si una sola condición se cumple y poder evaluar varios
		//panoramas
		
		//Ej. Si crearamos un pequeño juego para responder con Piedra, Papel o Tijera
		System.out.println("if else anidado (Piedra, Papel, Tijera)");
		int numero = 1;
		
		if (numero == 1) {
			System.out.println("Piedra");
		}else if (numero == 2) {
			System.out.println("Papel");
		}else if (numero == 3) {
			System.out.println("Tijera");
		}else {
			System.out.println("Error");
		}
		
		//Switch Case
		//Nos ayuda a ejecutar algun bloque en función del cambio de valor de una variable
		
		//Ej. Si queremos mostrar algún día de la semana
		
		int dia = 3;
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Error");
			break;
	} 

} //Cierre del método Main
}//Cierre de la clase