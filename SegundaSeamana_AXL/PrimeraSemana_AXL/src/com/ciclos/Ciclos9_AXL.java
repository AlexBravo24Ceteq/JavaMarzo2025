package com.ciclos;

import java.util.Scanner;

public class Ciclos9_AXL {

	public static void main(String[] args) {
		//9. Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos  
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Introduce el primer n�mero: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo n�mero: ");
        int num2 = scanner.nextInt();

     
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("N�meros pares entre " + num1 + " y " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

	}

}
