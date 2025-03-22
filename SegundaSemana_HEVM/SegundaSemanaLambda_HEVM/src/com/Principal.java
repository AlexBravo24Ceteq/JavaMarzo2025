package com;

public class Principal {

	public static void main(String[] args) {
		/*Expresiones Lambda
		 * Son conocidas tambien como expresiones anonimas que implementan
		 * una interface funcional
		 * Su operador es ->
		 * y su sintaxis es la siguiente:
		 * (parametros) -> {cuerpo de lambda};
		 */
		//No se pueden crear objetos de una interface, el objeto calcSumar se esta creandpo
		//de una clase anonima para poder implementar la interface IFuncional
		IFuncional calcSumar = (x, y) -> System.out.println(x+y);
		//Entonces una vez escribimos el metodo con la expresion lambda,
		//podemos utilizar el método que originalmente llamperación a través del
		//objeto calcSumar
		
		calcSumar.operacion(12, 5);
		//yo puedo crear otro objeto que imple,ente el mismo metodo pero que el
		//realice multiplicaciones
		
		IFuncional calcMultiplicar = (a,b) -> System.out.println(a*b);
		calcMultiplicar.operacion(10, 12);
	}

}
