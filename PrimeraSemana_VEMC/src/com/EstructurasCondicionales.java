package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras de desicion if/else evaluan valores booleanos.
		//si (esto se cumple){
		//se ejeturara este bloque de codigo
		//}
		//si no/ de otro modo {
		//ejecuta este otro bloque }
		
		
		
		//Ej. vamos a tener una variable con un valor entero
		int x = 9;
		if (x<=9) {//si no se cumple la condicion, se ejecuta el siguiente bloque.
			System.out.println("Cierto");
		}else {//si no, se ejecuta esto
			System.out.println("Falso");
	
		}
		//Condiciones compuestas con operadores logicos.
				//AND, OR, NOT, DIFERENTE DE, IGUALDAD.
				//AND - && - Devuelve el primero bloque (true), siempre que todas las condiciones se cumplan.
		System.out.println("Operador AND");
		if (x<8 && x>5) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		//OR -|| - Devuelve true, cuando al menos se cumple una condicion.
		System.out.println("Operador OR");
		if (x<8 || x>5) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		// NOT  - Niega una condicion o cambia su valor de True a False y viceversa.
		System.out.println("Operador NOT");
		if (!(x<8)) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		//IGUALDAD - Compara valores y devuelve true cuando son iguales.
		System.out.println("Operador IGUALDAD");
		if (x == 10) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		//DIFERENTE DE - != - Compara los valores y devuelve true cuando son diferentes.
		System.out.println("Operador DIFERENTE DE");
		if (x != 10) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		// if/else anidado
		//Nos permite evaluar mas alla de si una sola condicion se cumple y poder evaluar varios panoramas.
		//Ej. Si creamos un pequeño juego para responder con Piedra, Papel o Tijera.
		System.out.println("if/else anidado (Piedra,Papel,Tijera)");
		int numero = 1;
		if (numero == 1) {
			System.out.println("Piedra");
		}else if (numero == 2) {
			System.out.println("Papel");
		}else if (numero ==3) {
			System.out.println("Tijera");
		}else {
			System.out.println("Error");
		}
		//Switch Case - Nos ayuda a ejecutar algun bloque en funcion del cambio de valor de una variable 
		//Ej. si queremos msotrar algun dia de la semana.
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
		case 5:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Error");
			break;
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//Cierre Main
	
		
}//Cierre clase
