package com;

import java.util.Scanner;

public class EstructuraCiclos {

	public static void main(String[] args) {
		// Metodo While

		
		int x = 1;
		
		while (x<5) { //mientras x sea menor a 5
			//ejecutamos este bloque de codigo
			System.out.println("Hola mundo");
			//Para poder detener o controlar un ciclo determinado
			//debemos meter un cambio en x
			x = x + 1; //incrementamos x en 1 cada que se ejecuta el bloque
			// otra forma de expresar el incremente es x++; o x+=2, etc
		}
		
		// Ejecuta el codigo al menos una vez y despues pregunta si debe seguir 
		//realizando la acción.
		//Con esto nos podriamos asegurar que nuestro programa se ejecute por lo menos
		//una vez, en caso de que tengamos una condicion que no pueda cumplirse
		
		do {//Ejecuta lo siguiente
			System.out.println("Hola mundo");
		} while (x > 5);
		
		String password = "9876";
		
		Scanner input = new Scanner(System.in);
		String contraseña;
		
		do {//primero ejecuta
			System.out.println("Introduce tu contraseña");
			contraseña = input.next();
			}while(!contraseña.contentEquals(password)); //luego evalua o pregunta
		//si debe seguir ejecutandose 
		
		//Ciclo for - Para los siguientes argumentos
		//Este es un ciclo determinado
		
		/*Para (una variable de control; una condicion; un incremento){
		 * 		ejecuta este bloque de codigo
		 * 		}
		 */
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hola mundo");
		}

	}
}
