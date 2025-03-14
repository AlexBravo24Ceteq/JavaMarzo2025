package com.ciclos;

import java.util.Scanner;

public class Ciclos11_VEMC {

	public static void main(String[] args) {
	// Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el ancho y el alto. Ejemplo: 8 x 8
Scanner input = new Scanner (System.in);//Scanner para recibir valores por teclado.

//Solicitar el ancho y alto

System.out.println("Introduce el ancho del cuadrado: ");
int ancho = input.nextInt();

System.out.println("Introduce el alto del cuadrado: ");
int alto = input.nextInt();
//Validar que sea un cuadrado (ancho y alto iguales)
if (ancho != alto) {
	System.out.println("Error: Para que sea un cuadrado, el ancho y el alto deben ser iguales.");
}else {
	//Dibujar el cuadrado
	//El interno dibuja el anocho y el externo el alto
	for (int i = 0; i < alto; i ++) {//Recorrer las filas
		for (int j = 0; j < ancho; j ++) {//Recorrer las columnas
		System.out.print("* ");//imprime un asterisco y un espacio	
			}
		//estamos en el ciclo externo, una vez dibujada la primera linea da un salto de linea
		System.out.println();//salto de linea
		input.close();
}


}

	}

}
