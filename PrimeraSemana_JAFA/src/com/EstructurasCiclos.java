package com;

import java.util.Scanner;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// Ciclos o tmabien llamados bucles
		//Son estructuras que nos van a permitir repetir
		//Una tarea, setencia o bloque de codigo
		
		//Ciclos indeterminados
		
		//while - mientras
		
		/*
		 * mientras (esta condicion se cumpla){
		 * se ejeucta esta sentencia o bloque de 
		 * codigo
		 * }
		 */
		
		int x = 1;
		
//		while (x<5) {// mientras x sea menor a 5
//			//ejecutaremos este bloque de codigo
//			System.out.println(x +".- Hola Mundo");
//			
//			//Para poder detener ocontrolar un ciclo indetreminado
//			//debemos meter un cambio en x
//			//x= x + 1;//incrementamos x en 1 cada que se ejecuta el bloque
//			x++; // Esta es otra forma de expresar que x se incrementa en 1
//			//x+=2 esto incrementa en 2 en 2 
//		}

		
		//Ciclo do while- Ejecuta el codigo al menos 1 vez y despues pregunta si debe
		//seguir realizando la accion.
		//con esto nos podriamos asegurar que nuestro programa se ejecute
		//por lo menos 1 vez, en caso de que tengamos una condicion que pueda no
		//cumplirse
		
		
//		do {// ejecuta lo siguiente ejemplo en una contraseña
//			System.out.println("Hola mundo");
//		}
//		while(x>5);
		
		String password ="9866";
		String contraseña;
		
//		Scanner input = new Scanner(System.in);
//		
//		do { //primero ejecuta
//			System.out.println("introduce tu contraseña");
//			contraseña=input.next();
//		} while (!contraseña.equals(password));// luego evalua o pregunta
//		//si debe seguir ejecutandose
//		
//		
		
		
		// ciclo FOR- para los siguientes argumentos 
		// este es un ciclo determinado
		
		/*para (una variable de control; una condicion; un incremento){
		 * ejecuta este bloque de codigo
		 * }
		 * 
		 */
		
		for (int i = 0; i < 5; i++) {
			//variable que inicia en 0; Condicion, incremento
			System.out.println(i+".-Hola mundo");
		}
		
		
		
	}

}
