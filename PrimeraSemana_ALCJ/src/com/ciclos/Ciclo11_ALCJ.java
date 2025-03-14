package com.ciclos;

import java.util.Scanner;

public class Ciclo11_ALCJ {

	public static void main(String[] args) {
		//11.- .Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el
		//ancho y el alto. Ejemplo: 8 x 8 
		
		 
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Escribe el ancho del cuadrado: ");
        int ancho = teclado.nextInt();

        System.out.print("Escribe el largo del cuadrado: ");
        int largo = teclado.nextInt();
        for (int x = 0; x < largo; x++) {
            for (int y = 0; y < ancho; y++) {
                System.out.print("< ");
            }
            System.out.println();
        }
        
        teclado.close();
      

	}

}
