package com;

public class EstructurasCondicionalesJava {

	public static void main(String[] args) {
		// Estructuras de decision if/else, evaluan valores booleanos
		/*si (esto se cumple){
		 * se ejecutara este bloque de codigo}
		 * si no/de otro modo{
		 * ejecuta este otro bloque}
		 */

		//ejemplo, vamos a tener una variable con un valor entero
		int x = 9;
		if (x<8) { //si esto se cumple se ejecuta el siguiente bloque
			System.out.println("cierto");
		}else {//si no se cumple se ejecuta este otro
			System.out.println("falso");
		}
		
		//Condiciones compuestas con operadores logicos
		// AND, OR, NOT, Diferente de; Igualdad
		
		//AND - && - Devuelve el primer bloque (true); siempre que todas
		//las condiciones secumplan
		
		if (x<8 && x>5) {
			System.out.println("cierto");
		}else {
			System.out.println("falso");
		}
		
		//NOT - ! - Niega una condicion, o cambia su valor de true a false y viceversa
		System.out.println("Operador NOT");
		if (!(x<8 && x>5)) {// Una condicion que era falsa ahora la estamos haciendo verdadera
			System.out.println("cierto");
		}else {
			System.out.println("falso");
		}	
		//Igualdad - == - Compara valores y devuelve true cuando son iguales
		System.out.println("Operador IGUALDAD");
		if (x == 9) {
			System.out.println("cierto");
		}else {
			System.out.println("falso");
		}
		
		//Diferente de -!= - Compara los valores y devuelve true cuando son diferentes
		System.out.println("Operdor DIFERENTE DE");
		if (x != 10) {
			System.out.println("Cierto");
		}else {
			System.out.println("falso");
		}
	
		/*if else anidado
		 * Nos permite evaluar mas alla de si una sola condicion se cumple y poder
		 * evaluar varios panoramas
		 * 
		 * Ejamplo, creamos un pequeño juego para responder con Piedra, Papel y Tijera
		 *
		 */
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
		//Nos ayuda a ejecutar algun bloque en funcion del cambio de valor de una variable
		
		//Ejemplo, si queremos mostrar algun dia de la semana
		int dia = 3;
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;	
		default:
			System.out.println("Error");
			break;
		}
		
	}//cierre del método Main
}//Cierre de la clase
