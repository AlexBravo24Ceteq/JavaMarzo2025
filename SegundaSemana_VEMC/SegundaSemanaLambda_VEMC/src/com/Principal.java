package com;

public class Principal {

	public static void main(String[] args) {
		//Expresiones Lambda
		//Conocidas como expresiones anonimas que implementan una interface funcional.
		//Su operador es "->"
		//Su sintaxis es: (parametros ) -> (cuerpo de lambda);
		//El siguiente objeto se esta creando de una clase anonima
		//para poder implementar la interface IFuncional.
		IFuncional calcSumar = (x,y) -> System.out.println(x+y);
		
		//Entonces una vez escrito el metodo con la expresion Lambda.
		//Podemos utilizar el metodo que orgininalmente se llama operacion,
		//a traves del objeto calcSumar
		
		calcSumar.operacion(12, 5);
		
		//Puedo crear otro objeto que implemente el mismo metodo
		//pero que realice una multiplicacion
		IFuncional calcMultiplicar = (r,s) -> System.out.println(r*s);
		
		calcMultiplicar.operacion(2, 5);
	}

}
