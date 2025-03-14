package com; //nombre del paquete

public class TiposDeDatos { //nombre de la clase
	
	public static void main(String[] args) {
		//Jorge Alejandro
		// Comentarios de una sola linea
		
		/*
		 * Podemos escribir comentarios
		 * de multiples
		 * lineas
		 *                    
		 */
		
		//CTRL + S para guardar cambios
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS ENTEROS
		 */
		
		//Ej. de crear una variable con su tipo de dato
		//pero sin almacenar ningun valor aún en ella
		byte numero1;
		
		//Declarar una variable sin asignarle algún valor me sirve
		//para poder asignarselo más adelante
		numero1 = 120;
		
		//Ej. de crear variables con su tipo de dato
		//pero con sus valores asignados desde un principio
		
		byte a = -128; //1 byte de memoria y admite valores de -128 a 127
		short b = -32768; //2 bytes y admite del -32768 a 32767
		int c = 2147483647; //4 bytes y es el tipo de dato entero
		//más utilizado
		long d = 2147483649L; //8 BYTES y necesita del sufijo "L" para poder
		//almacenar datos que van más alla de los tipo int
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN COMA FLOTANTE (DECIMALES)
		 */
		
		float e = 3.141614161416F; // 4 bytes en memoria
		//y necesita del sufijo de la letra F para admitir el valor
		double f = 2.5488786; //8 bytes de memoria y es el tipo de dato
		//más utilizado para trabajar con decimales
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean indicador = true; //Solo pueden guardar valores true/false
		//y son utiles para evaluar expresiones o condiciones
		
		char caracter = '3'; //Solo admiten o pueden guardar un caracter
		//a la vez
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATO OBJETO
		 * TIPOS DE DATO ESTRUCTURADOS
		 * Son tipos de datos más complejos ya que pueden representar
		 * un conjunto de datos como los arrays o nos pueden ayudar
		 * a crear objetos, etc.
		 */
		
		//String - cadenas de texto
		
		String nombre = "Jorge Alejandro";
		
		String letra;
		
		letra = "A";
		
		/*TIPOS DE DATO WRAPPER
		 * PERTENECEN A LOS TIPOS DE DATO OBJETO
		 */
		
		//Estos tipos de dato "envuelven" a los tipos de dato primitivos
		//y les otorgan ciertas funcionalidades
		
		a = 10; //aqui estamos reemplazando el valor de a desde esta linea
		//en adelante
		
		Byte x = 127;
		
		//Ahora si necesitara que x tuviera más funciones, podemos acceder
		//a ellas porque la estamos declarando con un tipo de dato Wrapper
		x.toString(); // "127"
		
		//Byte
		//Short
		//Integer
		//Long
		//Float
		//Double
		//Boolean
		//Character
		
		//Cuando no utilizamos nuestras variables para algun proposito
		//el IDE nos las marca o subraya en amarillo porque pues
		//no estan teniendo un uso y solo utilizan memoria
		int g = 100;
		int h = 20;
		
		int resultado = g+h;
		
		//Darle salida a nuestros datos en consola
		//"Mandarlos a Imprimir"
		System.out.println("Hola Mundo"); //.print mandará a imprimir
		//este saludo en consola, pero en una sola linea
		System.out.println(resultado);
		
		//syso + ctrl + espacio
		//sout + ctrl + espacio
		System.out.println(nombre);
		
		//Mandar a imprimir directamente una operacion en consola
		System.out.println(10+11);
		
		//Si queremos mandar a imprimir texto y numeros en una
		//sola impresion en consola, o más elementos
		//entramos en algo que se llama "concatenación"
		System.out.println("La suma es: " + 10+11);
		
		System.out.println("La suma es: " + (10+11));
		
		
		
		
		
		
	} //cierre del main

} //cierre de la clase
