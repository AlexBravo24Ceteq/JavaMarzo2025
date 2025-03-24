package com;

import java.util.Scanner;

public class EstructuraCiclos{


	public static void main(String[] args) {


	//Ciclos o tambien llamados Bucles
		//son estructuras que nos van a permitir repetir
		//una tarea, sentencia o bloque de codigo
		
		//Ciclos indeterminados
		
		//Ciclo (While) significa - mientras...
		
		/* mientras ( esta condicion se cumpla) {
		 * se ejecuta esta sentencia o
		 * bloque de codigo
		 * 
		 */
		
		int x = 1;
		
		while (x<5) { //mientras x sea menor a 5
//			ejecutaremos este bloque de codigo
//			System.out.println(x + ".-Hola Mundo");
//			para detener o controlar un ciclo indeterminado
//			debemos meter un cambio en X
//			x = x + 1; //Incrementamos x en cada que se ejecuta el bloque
//			como resultado, da 4 bbloques de (Hola Mundo)
//			x++; //esta es otra forma que va incremento el ciclo
//			como alternativa 
//			x+=2; //esto incrementa x de 2 en 2
			
			
			
			
			//do while- Ejecuta el codigo al menos 1 vez y despues pregunta
			//si se puede seguir realizando la accion.
			//con esto nos podriamos asegurar que nuestro programa se ejecute
			//pr lo menos 1 vez, en caso de que tengamos una condicion que pueda 
			//no cumplirse
			
			
//			do { //Ejecuta lo siguiente
//				System.out.println("Hola Mundo");
//			}while (x>5);
//				
	
		String password = "9876";
		String contraseña;
		
//		Scanner input = new Scanner(System.in);
//		
//		do { //primero Ejecuta
//			System.out.println("Introduce tu contraseña");
//			contraseña = input.next();
//		}while(!contraseña.equals(password)); //luego evalua o pregunta
//		//si debe seguir ejecutandose
		
		//ciclo for - para los siguientes argumentos...
		//Este es un ciclo determinado
		
		/*para (una variable de control; una condicion; un incremento){
		 * 	ejecuta este bloque de codigo
		 * }
		 */
		
		for (int i = 0; i < 5; i++) {
			System.out.println(".-Hola Mundo");
		
		}
		}
	}
}

