package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras de decision if/else - evaluan valores booleanos
		
		/*si (esto se cumple) {
		 * se ejecutara este bloque de codigo
		 * } si n/deotro modo {
		 * ejecuta este otro bloque
		 * }
		 */
		
		//Ej. vamos a tener una variable con un valor entero
		
		int x = 9;
		if (x<=9) { //si ewsto se cumple, se ejecuta el sig bloque
			System.out.println("Cierto");
		}else { //si no, se ejecuta esto otro
			System.out.println("Falso");
		}
		
		//Condiciones compuestas con operadores logicos
		//AND, OR, NOT ,DIFERENTE DE, IGUALDAD
		
		//AND - && - Devuelve el primer bloque(true), siempre que todas las condiciones se cumplan
		System.out.println("Operador AND");
		
		if (x<8 && x>5) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		//OR - ||- Devuelve true, cuando al menos se cumpla una condicion
		
System.out.println("Operador OR");
		
		if (x<8 || x>5) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		//NOT - ! - Niega una condicion, o cambia su valor de true a false y viceversa
System.out.println("Operador NOT");
		
		if(!
				(x<8)) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		//IGUALDAD - == - Compara valores y devuelve true cuando son iguales
		
System.out.println("Operador IGUALDAD");
		
		if (x == 10) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		//DIFERENTE DE - != - Compara los valores y devuelve true cuando son diferentes
		
System.out.println("Operador DIFERENTE DE");
		
		if (x != 10) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		//if else anidado
		//nos permite evaluar mas all de si una sola condicion se cumpl
		//y poder evaluar varios panoramas
		
		//Ej. Si crearamos un juego para responder con Piedra, papel o tijeras
		
		int numero = 1;
		if (numero == 1) {
			System.out.println("Piedra");
		} else if (numero == 2) {
			System.out.println("Papel");
		} else if (numero == 3) {
			System.out.println("Tijeras");
		}else {
			System.out.println("Error"); 
		}
		
		//Switch case
		//Nos ayuda a ejecutar algun bloque en funcion del cambio de valor de una variable
		//Ej
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
		
		
		
	}	
			
			

}
