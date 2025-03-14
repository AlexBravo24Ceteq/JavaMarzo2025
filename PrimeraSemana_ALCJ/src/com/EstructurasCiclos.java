package com;

import java.util.Scanner;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// CICLOS o tambien llamados bucles
		//Son estructuras que nos van a permitir 
		//Una tarea, sentencia o bloque de codigo
		
		//Ciclos indeterminados
		
		//While - mientras...
		
		/*mientras (esta condicion se cumpla) {
		 *     se ejecuta esta sentencia o 
		 *     bloque de codigo
		 *     }
		 *     
		 */
		
		
		double x = 1;
		
//		while (x<5) { //Mientras x sea menor a 5
//			//Ejecutaremos este bloque de codigo
//			System.out.println(x + ".-Hola Mundo");
//			//Para poder detener o controlar un ciclo indeterminado
//			//debemos meter un cambio en x
//			
//			//x = x + 1; //incrementamos x en 1 cada que se ejecuta el bloque
//			//x++; //esta es otra forma de expresar que x se incrementa en 1 
//			x+=2; //esto incrementa x de 2 en 2			
//			
//		}
		//do while - ejecuta el codigo al menos 1 vez y despues pregunta si debe
		//seguir realizando la accion
		//con esto nos podriamos asegurar que nuestro programa se ejecute
		//por lo menos 1 vez, en caso de que tengamos una condicion que pueda no
		//cumplirse
		
//		do { //ejecuta lo siguiente
//			System.out.println("Hola Mundo");
//		}while (x>5); 
	
			
		String password = "9876";
		String contraseña;
		
//	    Scanner input = new Scanner(System.in);
//	    
//	    do  { //primero ejecuta
//	    	System.out.println("Introduce tu contraseña");
//	    	contraseña = input.next();
//	    }while(!contraseña.equals(password)); //luego evalua o pregunta 
//	    //si debe seguir ejecutandose
//	    
		//for - para los siguientes argumentos...
		//este es un ciclo determinado
		
		/*para (una variable de control; una condicion; un incremento){
		 * ejecuta este bloque de codigo
		 * }
		 */
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ".-Hola Mundo");
		}
            
			
	} 

}
