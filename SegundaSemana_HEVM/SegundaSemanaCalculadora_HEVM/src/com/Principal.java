package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica toshiba = new Cientifica("Toshiba", "Negro", 700, "Digital");
		System.out.println(toshiba);
		
		toshiba.sumar(24, 456);
		toshiba.sumar(1322, -324234, 52534);
		
		toshiba.restar(456, 234);
		toshiba.restar(3948, 456, 1874);
		
		toshiba.multiplicar(345, 32);
		toshiba.multiplicar(34, 32, 98);
		
		toshiba.dividir(34, 2);
		toshiba.dividir(345, 5, 3);
		
		toshiba.tomarTemperatura();

	}

}
