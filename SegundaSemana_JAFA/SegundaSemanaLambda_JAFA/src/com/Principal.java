package com;

public class Principal {

	public static void main(String[] args) {
		
		// Expresiones Lambda
		//Son conocidas como expresiones anonimas
		//que implentan una interface funcional
		//Su operador es ->
		//Y su sintaxis es la siguiente
		//(parametros) -> {cuerpo de lambda};
		
		//clase anonima
		//No se puede crear objetos de una interface
		//el siguiente objeto se esta creando de una clase anonima
		//para poder implementar la interface IFuncional
		IFuncional calcuSumar = (x,y)-> System.out.println(x+y);
		
		//Entonces una vez escribimos el metodo con la expresion
		//lambda, podemos utilizar el metodo que originalmente 
		//se llama operacion, a traves del objeto
		
		calcuSumar.operacion(12, 3);
		
		//Yo puedo crear otro objeto que implenete el mismo metodo
		//pero que el realice multiplicaciones
		
		IFuncional calcMultiplicar = (a,b)-> System.out.println(a*b);
		calcMultiplicar.operacion(5, 5);
		
		IFuncional calcResta = (a,b)-> System.out.println(a-b);
		calcResta.operacion(10, 2);
		
		IFuncional calDivision = (a,b)->System.out.println( b != 0 ? a/b : Double.NaN);
		calDivision.operacion(40, 0);
	
		
		
		
	}

}
