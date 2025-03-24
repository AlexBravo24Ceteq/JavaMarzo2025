package com;

//Para implementar una interface se realiza con la palabra reservada implements
public class Cientifica extends Calculadora implements ITermometro{ //Creamos la herencia con la palabra extends
	//implemets es para añadir ITemperaura de una interface
	
	
    //Cuando estamos ante una clase encargada de la logica, puede 
    //no llevar constructores, si lo unico acceder 
    //es al uso de sus metodos 

	public Cientifica () {} //Creamos los metodos Constructores
	
	//Metodos Abstractos
	@Override
	public void sumar(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Suma: "+ (a+b));
	}

	@Override
	public void restar(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Resta: "+ (a-b));
	}

	@Override
	public void multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Multiplicación: "+ (a*b));
	}

	@Override
	public void dividir(int a, int b) {
		// TODO Auto-generated method stub
		if(b!=0) {
			System.out.println("Division: "+(a/b));
		}else {
			System.out.println("ERROR: Division por cero");
		}
	}
	
	//Metodos polimorfico 
	//Para que nuestras Operaciones sumen 3 valores
	//sobre carga de argumentos
	
	public void sumar(int a, int b, int c) {
		System.out.println("Suma de 3 numeros: "+(a+b+c));
	}
	
	public void restar(int a, int b, int c) {
		System.out.println("Resta de 3 numeros: "+ (a-b-c));
	}
	
	public void multiplicar(int a, int b, int c) {
		System.out.println("Multiplicacion de 3 numeros: " +(a*b*c));
	}
	
	public void dividir(int a, int b, int c) {
		if(b!=0) {
			System.out.println("Division: "+(a/b/c));
		}else {
			System.out.println("ERROR: Division por cero");
		}
	}

	
	//Aqui se agrega el metodo de la interface para definirlo
	@Override
	public void tomaarTemperatura() {
		// TODO Auto-generated method stub
		System.out.println("Temperatura normal");
	}


}
