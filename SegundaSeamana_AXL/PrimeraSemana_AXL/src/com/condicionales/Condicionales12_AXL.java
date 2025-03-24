package com.condicionales;

import java.util.Scanner;

public class Condicionales12_AXL {

	public static void main(String[] args) {
		// 12.Construir un programa que calcule el �ndice de masa corporal de una persona 
		//(IMC = peso [kg] / altura2 [m]) e indique el estado en el que se encuentra esa persona en 
		//funci�n del valor de IMC: 
			
		//Nota 1: se recomienda el empleo de sentencias if�else anidadas. 
		//Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario.
		
		
		Scanner scanner = new Scanner(System.in);

        
		System.out.println("Ingresa tu peso en kilogramos:");
        double peso = scanner.nextDouble();

        System.out.println("Ingresa tu altura en metros:");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);

        System.out.printf("Indice de masa corporal (IMC) es: %.2f%n", imc);

        if (imc < 16) {
            System.out.println("Diagn�stico: Criterio de ingreso en hospital.");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Diagn�stico: Infrapeso ");
        } else if (imc >= 17 && imc < 18) {
            System.out.println("Diagn�stico: Bajo peso ");
        } else if (imc >= 18 && imc < 25) {
            System.out.println("Diagn�stico: Peso normal ");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Diagn�stico: Sobrepeso ");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Diagn�stico: Sobrepeso cr�nico ");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Diagn�stico: Obesidad prem�rbida ");
        } else {
            System.out.println("Diagn�stico: Obesidad m�rbida ");
        }

	}

}
