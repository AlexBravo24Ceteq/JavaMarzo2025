package com;

import java.util.Scanner;

public class EstructurasCiclos {

	public static void main(String[] args) {
		//12/03/2025
		// CICLOS
		//Son estructuras que nos permiten repetir una tarea,setencia
		
		
		//CICLOS INDETERMINADOS
		
		//While - Mientras
		//Pseudocodigo
		/*mientas (esta condicion se cumpla){
		 *    se ejecuta la setencia
		 *    }
		 */
		
		
		double x = 1;
//		while (x<5) {
//			//Mientras sea menor al valor de la variable se ejecutara la condicion
//			System.out.println(x + ".-Hola mundo");
//			//para detener el ciclo, debemos meter un cambio en x
//			
//			//x = x + 1; //incrementamos x en 1 cada que se ejecuta el bloque
//			//x++; //esta es otra forma de expresar que x se incrementa en 1
//			x+=2; //esto incrementa x de 2 en 2
//				
//		}
		
	//DO WHILE- Ejecuta el codigo al menos una vez y despues pregunta si debe
		//seguir realizando la accion
		//con esto podriamos asegurar que nuestro programa se ejecute
		//por lo menos una vez, en caso de que tengamos una condicion que pueda no
		//cumplirse
		
		
//		 do { //ejecuta lo siguiente
//			 System.out.println("Hola mundo");
//		 } while (x>5);
		 
//		 String password = "9876";
//		 String contraseña;
//		 Scanner input = new Scanner(System.in);
//		 
//		 do {
//			 System.out.println("Introduce contraseña");
//			 contraseña = input.next();
//		 }while(!contraseña.equals(password)); //luego evalua o 
//		 //pregunta si debe seguir ejecutando
		
		
		
		//FOR- Este ciclo es determinado
		/* para (una variable de control; una condicion; un incremento) {
		 *        ejecuta este bloque de codigo
		 *   }     
		 */
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hola mundo");
		}
		 
		 
			
	}	 
		

}


