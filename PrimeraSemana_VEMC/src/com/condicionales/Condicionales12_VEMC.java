package com.condicionales;

import java.util.Scanner;

public class Condicionales12_VEMC {

	public static void main(String[] args) {
// Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 [m])
// e indique el estado en el que se encuentra esa persona en función del valor de IMC:
Scanner input = new Scanner (System.in);


//Solicitamos el peso
System.out.println("Introduce tu peso: ");
double peso = input.nextDouble();

//Solicitamos la altura

System.out.println("Introduce tu altura: ");
double altura = input.nextDouble();

//calculamos el IMC
double imc = peso / (altura*altura);


//mostrar el IMC
System.out.printf("Tu IMC es: %.2f\n", imc);//es un especificador de formato 

//Determinar el diagnostico segun el IMC
String diagnostico;
if(imc < 16) {
	diagnostico = "Criterio de ingreso al hospital.";
}else if(imc >= 16 && imc < 17) {
	diagnostico = "infrapeso.";
}else if(imc >= 17 && imc < 18) {	
	diagnostico = "bajo peso.";
}else if(imc >= 18 && imc <25) {
	diagnostico = "peso normal (saludable).";
}else if(imc >= 25 && imc <30) {
	diagnostico = "sobrepeso (obesidad de grado I).";
}else if(imc >=30 && imc <35) {
	diagnostico = "sobrepeso crónico (obesidad de grado II).";
}else if(imc >=35 && imc <40) {
	diagnostico = "obesidad premórbida (obesidad de grado III).";
}else {
	diagnostico = "obesidad mórbida (obesidad de grado IV).";
}
System.out.println("El dignostico es: " + diagnostico);
input.close();

	}

}
