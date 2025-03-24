package com;

import java.util.Scanner;

//Para implementar una interface se realiza con la palabra reservada implements
public class Cientifica extends Calculadora implements ITermometro{
	
	
	/*Cuando estamos ante una clase encargada de la logica, puede 
	 * no llevar constructotres, si lo unico que queremos acceder
	 * es al uso de sus metodos
	 */
	
	
	public Cientifica() {}//o puede declarar solo el constructor vacio
	

	@Override
	public double sumar(double a, double b) {
		
		return a+b;
	}

	@Override
	public void sumar() {
		Scanner input= new Scanner(System.in);
		double a, b;
		
		System.out.println("Ingresa el primer numero: ");
		a= input.nextDouble();
		System.out.println("Ingresa el segundo numero: ");
		b= input.nextDouble();
		
		System.out.println("El resultado de la suma es: "+(a+b));
		
		
	}
	
	//Aqui se agrega el metodo de la interface para definirlo
	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}
	

}
