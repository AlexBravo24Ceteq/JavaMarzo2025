package com.condicionales;

import java.util.Scanner;

public class Condicionales12_HEVM {

	public static void main(String[] args) {
		/*
		 * Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2
		 *[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
		 */
		Scanner input = new Scanner (System.in);
		
		System.out.println("Calcularemos su masa de indice corporal usando su peso y altura");
		System.out.println("Introduzca su peso en Kg");
		double peso = input.nextDouble();
		System.out.println("Introduzca su altura en m");
		double altura = input.nextDouble();
		double IMC = peso/(altura*altura);
		
		if (IMC < 16) {
			System.out.println("Su IMC es de " + IMC + " su diagnostico es un Criterio de ingreso a Hospital");
		}else if (IMC >= 16 && IMC < 17) {
			System.out.println("Su IMC es de " + IMC + " su diagnostico es de infrapeso");
		}else if (IMC >= 17 && IMC < 18) {
			System.out.println("Su IMC es de " + IMC + " su diagnostico es de bajo de peso");
		}else if (IMC >= 18 && IMC < 25) {
			System.out.println("Su IMC es de " + IMC + " su diagnostico es de peso normal (saludable)");
		}else if (IMC >= 25 && IMC < 30) {
			System.out.println("Su IMC es de " + IMC + " su diagnostico es de sobrepeso (obesidad grado I)");
		}else if (IMC >= 30 && IMC < 35) {
			System.out.println("Su IMC es de " + IMC + " su diagnostico es de sobrepeso (obesidad grado II)");
		}else if (IMC >= 35 && IMC < 40) {
			System.out.println("Su IMC es de " + IMC + " su diagnostico es de sobrepeso (obesidad grado III)");
		}else if (IMC >= 40) {
			System.out.println("Su IMC es de " + IMC + " su diagnostico es de obesidad morbida (obesidad grado IV)");
		}

	}

}
