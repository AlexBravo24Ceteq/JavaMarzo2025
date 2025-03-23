package com;


//Para implementar una interface se realiza con la palabra reservada "implements"
public class Cientifica extends Calculadora implements ITermometro{
//Constructor
	
	public Cientifica(String marca, String color, String tamaño) {
		super (marca,color,tamaño);
	}
//Implementacion de los metodos abstractos.

public double sumar(double a, double b, double c) {
	return a + b + c;
}
public double restar(double a, double b, double c) {
	return a - b - c;
}
public double multiplicar(double a, double b, double c) {
	return a * b * c;
}
public double dividir(double a, double b, double c) {
	if(b == 0 || c == 0) {
		throw new ArithmeticException("No se puede dividir por cero. ");
	}
	return a / b / c;
}
//Aqui se agrega el metodo de la interface ITermometro.
@Override
public void tomarTemperatura() {
	System.out.println("Temperatura normal");
	
}
}
