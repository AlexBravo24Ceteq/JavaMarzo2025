package com;

public class Principal {

	public static void main(String[] args) {
		
		// Expresiones Lambda
		//Son conocidas como expresiones anonimas
		//Que implementan una interface funcional
		//su operador es ->
		//y su sintaxis es la siguiente
		//(parametros)-> {cuerpo de lambda};
		
		//no se pueden crear objetos de una interface
		//el siguiente objeto esta creado de una clase anonima
		//para poder implementar la interface IFuncional
		
		IFuncional calcSumar = (x,y) -> System.out.println(x+y);
		
		//Entonces una vez escribimos el metodo con la expresion
		//lambda, podemos utilizar el metodo que originalmente
		//se llama operacion, a traves del objeto calcSumar
		
		calcSumar.operacion(12, 5);
		
		//Yo puedo crear otro objeto que implemente el mismo metodo
		//pero que el realice multiplicaciones
		IFuncional calcMultiplicar = (a,b) -> System.out.println(a*b);
		
		calcMultiplicar.operacion(10, 12);
				
		

	}

}
