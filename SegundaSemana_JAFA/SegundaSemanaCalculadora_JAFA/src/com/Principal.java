package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);//Objeto para pedir valores
		
		Cientifica calculadora1 = new Cientifica(); ;//objeto de cientifica creamos objeto
		System.out.println();
		
		
		System.out.println("Ingrese el primer numero: "); //pedimos valores y los almacenamos en num1..
		int num1 = input.nextInt();                          
		
		System.out.println("Ingrese el segundo numero: ");
		int num2 = input.nextInt();
		
		System.out.println("Ingrese el tercer numero: ");
		int num3 = input.nextInt();
		System.out.println();
		
		//probar metodos calculadora1 con 2 valores
		
		calculadora1.sumar(num1, num2);
		calculadora1.restar(num1, num2);
		calculadora1.multiplicar(num1, num2);
		calculadora1.dividir(num1, num2);
		
		//probar calculadora con 3 valores
		System.out.println();
		calculadora1.sumar(num1, num2, num3);
		calculadora1.restar(num1, num2, num3);;
		calculadora1.multiplicar(num1, num2, num3);;
		calculadora1.dividir(num1, num2,num3);
		
		//¿De donde toman comportamiento los objetos?
		//1. De sus clases, de metodos propios
		//2. DE otras clases, incluyendo calses abstractas (heredanlos)
		//3. De interface (implementadolos)
		
	}

}
