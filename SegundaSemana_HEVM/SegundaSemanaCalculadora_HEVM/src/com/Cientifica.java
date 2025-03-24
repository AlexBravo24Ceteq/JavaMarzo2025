package com;

public class Cientifica extends Calculadora implements ITermometro{ //con implements metemos la interface

	
		//Cuando estamos ante una clase encargada de la logica puede
		//no llevar constructores, si lo unico que queremos es acceder al
		//uso de sus métodos
		public Cientifica(){
			
		}

		public Cientifica(String marca, String color, double precio, String tipo) {
			super(marca, color, precio, tipo);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Cientifica [toString()=" + super.toString() + "]";
		}

		@Override
		public double sumar(double a, double b) {
			System.out.println(a + b);
			return a + b;
		}
		@Override
		public double sumar(double a, double b, double c) {
			System.out.println(a + b + c);
			return a + b + c;
		}

		@Override
		public double restar(double a, double b) {
			System.out.println(a - b);
			return a - b;
		}
		
		@Override
		public double restar(double a, double b, double c) {
			System.out.println(a - b - c);
			return a - b - c;
		}

		@Override
		public double dividir(double a, double b) {
			System.out.println(a / b);
			return a / b;
		}

		@Override
		public double dividir(double a, double b, double c) {
			System.out.println(a / b / c);
			return a / b / c;
		}
		
		@Override
		public double multiplicar(double a, double b) {
			System.out.println(a * b);
			return a * b;
		}
		
		@Override
		public double multiplicar(double a, double b, double c) {
			System.out.println(a * b * c);
			return a * b * c;
		}

		@Override
		public void tomarTemperatura() {
			System.out.println("Temperatura normal");
			
		}
		//¿De donde toman comportamientos los objetos?
		//1,- de sus clases, de metodos propios
		//2.- de otras clases, incluyendo clases abstractas (heredando)
		//3.- de interfaces (implementandolos) 
		
		
		
		
}
