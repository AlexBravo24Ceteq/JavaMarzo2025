package com.condicionales;

import java.util.Scanner;

public class Condicionales12IMC_JAGR {

	public static void main(String[] args) {
		//Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2
		//Trabajo 12
		
		
		 Scanner scanner = new Scanner(System.in);

	        // Solicitar peso y altura al usuario
	        System.out.print("Ingrese su peso en kg: ");
	        double peso = scanner.nextDouble();
	        
	        System.out.print("Ingrese su altura en metros: ");
	        double altura = scanner.nextDouble();
	        
	        // Calcular IMC
	        double imc = peso / (altura * altura);
	        
	        // Determinar estado según IMC
	        String estado;
	        if (imc < 18.5) {
	            estado = "Bajo peso";
	        } else if (imc >= 18.5 && imc < 24.9) {
	            estado = "Peso normal";
	        } else if (imc >= 25 && imc < 29.9) {
	            estado = "Sobrepeso";
	        } else {
	            estado = "Obesidad";
	        }
	        
	        // Mostrar resultado
	        System.out.printf("Su IMC es: %.2f. Estado: %s\n", imc, estado);
	        
	        scanner.close();
	    }
	}
