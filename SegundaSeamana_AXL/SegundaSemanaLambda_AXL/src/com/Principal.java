package com;

public class Principal {

	public static void main(String[] args) {
		// 21/03/2025
		//EXPRESIONES LAMBDA
		/*Son conocidas como expresiones anonimas que implementan
		 * una interface funcional
		 * 
		 * Su operador es ->
		 * Y su sintaxis es la siguiente (parametros) -> {cuerpo de lambda}
		 */
		
		/*No se puede crear objetos de una interface 
		 * El siguiente objeto se esta creando de una clase anonima
		 * para poder implementar la interface IFuncional
		 */
		IFuncional calSumar = (x,y) -> System.out.println(x+y);
		
		//Entonces una vez escribimos el metodo con la expresion
		//Lambda, podemos utilizar el metodo que originalmente
		//se llama operacion, a traves del objeto calSumar
		
		calSumar.operacion(12, 5);
		
		/*Yo puedo crear otro objeto que implemente el mismo metodo
		 * pero que el realice multiplicaciones
		 * 
		 */
		IFuncional calMultiplicar = (a,b) -> System.out.println(a*b);
		calMultiplicar.operacion(10, 12);

	}

}
