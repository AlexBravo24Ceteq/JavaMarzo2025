package com.condicionales;

import java.util.Scanner;

public class Condicionales9_VEMC {

	public static void main(String[] args) {
// Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error
Scanner input = new Scanner (System.in);
System.out.println("Introduce un dia de la semana (del 1 al 7): ");//solicitar el numero de la semana
int numeroDia = input.nextInt();
String diaSemana;
switch (numeroDia) {
case 1:
	diaSemana = "Lunes";
	break;
case 2:
	diaSemana = "Martes";
	break;
case 3:
	diaSemana = "Miercoles";
	break;
case 4:
	diaSemana = "Jueves";
	break;
case 5:
	diaSemana = "Viernes";
	break;
case 6:
	diaSemana = "Sabado";
	break;
case 7:
	diaSemana = "Domingo";
	break;
	default:
		diaSemana = null; //para manejar numeros incorrectos
}
if (diaSemana != null) {//Mostrar el día de la semana o un mensaje de error
	System.out.println("El dia correspondiente es: "+ diaSemana);
} else { 
	System.out.println("ERROR: Número incorrecto. Debe ser un número del 1 al 7. ");
}
input.close();
	}

}
