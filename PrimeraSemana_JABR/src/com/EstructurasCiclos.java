package com;

import java.util.Scanner;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// CICLOS o tambi�n llamados bucles
		//Son estructuras que nos van a permitir repetir
		//una tarea, sentencia o bloque de codigo
		
		//Ciclos indeterminados
		
		//while - mientras....
		
		/* mientras (esta condicion se cumpla) {
		 * 		se ejecuta esta sentencia o
		 * 		bloque de codigo
		 * }
		 * 
		 */
		
		double x = 1;
		
//		while (x<5) { //mientras x sea menor a 5
//			//Ejecutaremos este bloque de codigo
//			System.out.println(x + ".-Hola Mundo");
//			//Para poder detener o controlar un ciclo inderteminado
//			//debemos meter un cambio en x
//			//x = x + 1; //incrementamos x en 1 cada que se ejecuta el bloque
//			//x++; //esta es otra forma de expresar que x se incrementa en 1
//			x+=2; //esto incrementa x de 2 en 2
//		}
		
		
		//do while - Ejecuta el codigo al menos 1 vez y despu�s pregunta si debe
		//seguir realizando la acci�n.
		//Con esto nos podriamos asegurar que nuestro programa se ejecute 
		//por lo menos 1 vez, en caso de que tengamos una condicion que pueda no
		//cumplirse
		
//		do { //ejecuta lo siguiente
//			System.out.println("Hola Mundo");
//		}while (x>5);
		
		String password = "9876";
		String contrase�a;
		
//		Scanner input = new Scanner(System.in);
//		
//		do { //primero ejecuta
//			System.out.println("Introduce tu contrase�a");
//			contrase�a = input.next();
//		}while(!contrase�a.equals(password)); //luego evalua o pregunta
//		//si debe seguir ejecutandose
		
		
		//for - para los siguiente argumentos...
		//Este es un ciclo determinado
		
		/*para (una variable de control; una condicion; un incremento){
		 * 		ejecuta este bloque de codigo
		 * }
		 */
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ".-Hola mundo");
		}
		
		
		
		
		
		

	}

}
