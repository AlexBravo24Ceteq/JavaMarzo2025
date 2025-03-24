package com;

import java.util.Scanner;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// CICLOS o tambien llamados BUCLES
		//Son estructuras que nos van a permitir repetir una tarea, sentencia o bloque de codigo.
		
		
		//CICLOS INDETERMINADOS
		//While - mietras...
		/*mientras (esta condicion se cumpla){
		 * se ejecuta esta sentencia o bloque de codigo
		 * }
	*/
double x = 1;
//while (x < 5) {//mientras x sea menor a 5
//	System.out.println( x + " Hola Mundo :)");//se ejecuta este codigo
//	//para poder detener o controlar un ciclo indeterminado
//	//debemos meter un cambio en x
//	//x = x + 1;//incrementamos X en 1 cada que se ejecuta el bloque.
//	//x ++;// es otra forma de expresar que X se incrementa en 1
//	x += 2; //esto incrementa X de 2 en 2.
//}


//do while - Ejecuta el codigo al menos 1 vez y despues pregunta si debe seguir realizando la accion.
//Con esto nos aseguramos que nuestro programa se ejecute por lo menos una vez en caso de que tengamos condiciones que no puedan cumplirse.

//do {//ejectua lo siguiente
//System.out.println("Hola Mundo :) ");	
//}while (x > 5);
String password = "1218";
String contra;
//Scanner input = new Scanner(System.in);
//do {//primero ejecutra
//	System.out.println("Introduce tu contrasena: ");
//	contra = input.next();
//	
//}while(!contra.equals(password));//luego evalua una pregunta si debe seguir ejecutandose  (!) operador not, mientras no se cumpla.


//Ciclo For - para los siguientes argumentos
//Este es un ciclo determinado.
/*
 * para (una variable de control; una condicion; un incremento){
 * ejecutra este bloque de codigo }
 */
for (int i = 0; i < 5; i++) { //for + espacio + enter
	System.out.println( i + " Hola Mundo :) ");
}

	}

}
