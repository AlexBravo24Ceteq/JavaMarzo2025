package com.ciclos;

import java.util.Scanner;

public class Ciclos2_AXL {

	public static void main(String[] args) {
		//2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		//desde teclado, hasta la iteración deseada por el usuario.  
		//Ejemplo, tabla de 23 hasta el 95.23 x 95 = ???
		
		int multiplicando ;
	       
        System.out.println("¿Que tabla desea realizar?");
        Scanner valor1 = new Scanner(System.in);
        multiplicando = valor1.nextInt();

        int multiplicador = 1;
        do {System.out.println (multiplicando + " X " + multiplicador + " = " + multiplicando * multiplicador );
               multiplicador += 1;
    } while (multiplicador<=10);    

	}

}
