package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// EStructiras de decision if/else evaluan valores booleanos
		
		/* si (esto se cumple){
		 * se ejecutara este bloque de codigo
		 * }
		 * si no / de otro modo {
		 * ejecuta este otro bloque
		 * } 
		 * 
		 */
		// ej vamos a tener un variable con un valor entero
		
		int x = 9;
		 
		if (x<=9) { // si esto se cumple, se ejecuta el sig bloque
			System.out.println("Cierto");
		}
		
		else { // si no, se ejecuta este otro 
			System.out.println("False");
		}
		
		//condiciones compuestas con operadores logicos 
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND && devuelve el primer bloque(true) siempre que todas las condiciones
		//se cumplan
		System.out.println("operador AND");
		
		if (x<8 && x>5) {
			System.out.println("cierto");	
		}
		else { 
			System.out.println("falso");
		}
		
		//OR || devuelve true cuando al menos se cumpla una condicion
		
		System.out.println("operador OR");
		if (x<8 || x>5) {
			System.out.println("cierto");	
		}
		else { 
			System.out.println("falso");
		}
		
		// NOT ! Niega una condicion o cambia su valor de true a false y veceversa
		System.out.println("Operador NOT");
		
		if (!(x<8)) {
			System.out.println("cierto");
		}
		else {
			System.out.println("falso");
		}
		
		//IGUALDAD == Compara valores y devuelve true cuando son iguales
		
		System.out.println("Operador Igualdad");
		
		if (x==9) {
			System.out.println("cierto");
		}
		else {
			System.out.println("falso");
		}
		
		// DIFERENTE DE != compara los valores y devuelve true cuando son diferentes
		System.out.println("Operador Difernte de");
		
		if (x!=10) {
			System.out.println("cierto");
		}
		else {
			System.out.println("falso");
		}
		
		// if else anidado 
		// nos permite evaluar mas alla de si una sola condicion se cumple y poder evaluar varios
		//panoramas
		
		// ej. Si creamos un pequeño juego para responeder piedra papel o tijera
		System.out.println("if else anidado (piedra, papel, tijera");
		int numero =3;
		
		if(numero ==1) {
			System.out.println("piedra");
		}
		else if (numero == 2) {
			System.out.println("Papel");
		}
		else if(numero ==3) {
			System.out.println("tijera");
		}
		else {
			System.out.println("Error");
		}
		
		//Switch Case
		//nos ayuda a ejecutar algun bloque en funcion del cambio de valor de una varibale
		// ej si queremos algun dia de la semana
		
		int dia= 3;
		
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
