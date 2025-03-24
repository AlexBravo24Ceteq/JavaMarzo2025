package com.condicionales;

import java.util.Scanner;

public class Condicionales8_VEMC {

	public static void main(String[] args) {
// Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras
//que muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
		//Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		//Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto”.
		
Scanner input = new Scanner(System.in);
System.out.println("Introduce el resultado del dado (1-6): ");//Pedimos el dato al lanzar un dado.
int resultado = input.nextInt();//obtener resultado
String caraOpuesta;//determinar la cara opuesta y mostrarla en letras.
switch (resultado){
	case 1:
		caraOpuesta = "seis";
		break;
	case 2:
		caraOpuesta = "cinco";
		break;
	case 3:
		caraOpuesta = "cuatro";
		break;
	case 4:
		caraOpuesta = "tres";
		break;
	case 5:
		caraOpuesta = "dos";
		break;
	case 6:
		caraOpuesta = "uno";
		break;
		default:
			caraOpuesta = null; //para manejar numeros incorrectos
}
//mostrar resultado o mensaje de error
if (caraOpuesta != null) {
	System.out.println("La cara opuesta es: " + caraOpuesta);
}else {
	System.out.println("ERROR: número incorrecto ");
}
input.close();
	}

}
