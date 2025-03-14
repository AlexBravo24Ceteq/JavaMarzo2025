package com.condicionales;

import java.util.Scanner;

public class condicionales12_JAFA {

	public static void main(String[] args) {
//		//Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
//		[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
//			
		
		Scanner input = new Scanner(System.in);
		double peso, altura,imc;
		
		System.out.println("Ingresa tu peso en kg: ");
		peso=input.nextDouble();
		
		System.out.println("Ingresa tu altura en cm ");
		altura=input.nextDouble();
		
		imc = peso /(altura * altura);
		
		System.out.println("Tu indice de masa corporal es de: "+ imc);
		
		if (imc <16) {
			System.out.println("Criterio de ingreso al Hospital");
		}
		else if (imc >=16 && imc <16.9  ) {
			System.out.println("infrapeso");
		}
		else if(imc >=17 && imc <17.9) {
			System.out.println("Bajo de peso");
		}
		else if (imc >=18 && imc <24.9) {
			System.out.println("Peso normal (saludable)");
		}
		else if (imc > 25 && imc < 29.9) {
			System.out.println("Sobrepeso(Obesidad grado 1)");
		}
		else if (imc > 30 && imc < 34.5) {
			System.out.println("Sobrepeso cronico (obesidad de grado 2)");
		}
		else if (imc >35 && imc <39.9) {
			System.out.println("Obesidad Premorbida(Obesidad de grado 3)");
		}
		else {
			System.out.println("obesidad morbida (Obseidad de grado 4)");
		}
	}
}
