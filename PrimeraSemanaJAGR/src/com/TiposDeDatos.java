package com; // Nombre del paquete

public class TiposDeDatos { //nombre de la clase
	
	public static void main(String[] args) {
		//Jorge Arturo 
		
		/*
		 * podemos escribir
		 * comentarios
		 * de multiples
		 * lineas
		 */
		
		/*TIPO DE DATOS PRIMITIVOS
		 * NUMERICOS ENTEROS
		 */
		/*TIPO DE DATOS PRIMITIVOS
		 * NUMERICOS ENTEROS
		 */
		//EJ. DE CREAR UNA VARIABLE CON SU TIPO DE DATO
		//PERO SIN ALMACENAR NINGUN VALOR AUN EN ELLA
		byte numero1;
		
		//declarar una variable sin asignarle algun valor me sirve
		//para poder asignasrselo más adelante
		numero1 = 120;
		
		//Ej. de crear variables con su tipo de dato
		//pero con sus valores asignados desde un principio 
		
		byte a = -128; // 1 byte memoria y valores de -128 a 127
		short b = -32768; // 2 byte admite del -32768 a 32767
		int c = 2147483647; // 3 byte 4 bytes es el tipo entero mas utilizado 
		long d = 12345432289L; //8 bytes se necesita un sufijo "L" para poder
		//almacenar datos mas alla de 2 elevado a la 63
		
		/* tipo de datos primitivos es donde aceptan
		 * numeros en coma (decimales)
		 */
		float e = 3.141714161416F; // 4 bytes en memoria 
		// y se necesita del sufijo de la letra F para admitir valor 
		double f = 2.5488786; //8 bytes de memoria y es el tipo de valor mas
		//utilizado para trabajar con decimales
		boolean indicador = true; //solo pueden guardar valores true/false
		//y son utiles para evaluar expresiones o condiciones
		char caracter = '3'; //solo se admite o se puede guarda
		//run caracter a la vez
		/*TIPO DE DATOS NO PRIMITIVOS
		 * TIPO DE DATO OBJETO
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * Son tipo de datos mas complejos ya que pueden representar 
		 * un conjunto de datos como los arrays o nos pueden ayudar
		 * a crear objetos, etc.
		 */
		
		//String - Cadenas de texto (lo que vi con lalo)
		String nombre = "Jorge Arturo";
		
		String letra; 
		
		letra = "A";
		
		/*TIPO DE DATO WRAPPER
		 * PERTENECEN A LOS TIPOS DE DATO A OBJETO
		 */
		
		//Estos tipos de dato "envuelven" a los tipos de dato primitivos 
		// y les otorgan a ciertas funcionalidades
		
		a = 10; //aqui estamos reemplazando el valor de "A"
		//a partir de esta linea
		
		Byte x = 100;
		
		// ahora si necesitara que "X" tubiera mas funciones, podemos acceder
		//a ellas porque la estamos declarando como dato wrapper
		
		x.toString();  // "127"
		
		//Byte
		//Short
		//Integer
		//Long
		//Float
		//Double
		//Boolean
		//Character
		
		//cuando no utilizamos nuestras variables para algun proposito
		//el IDE nos da las marca o subraya en amarrillo porque pues
		//no estan teniendo un uso y solo utilizan memoria
		int g = 100;
		int h = 20;
		
		int resultado = g+h;
		
		System.out.println("Hola Mundo como estan?");
		System.out.println(resultado);
		
		//syso + ctrl + espacio
		// sout +ctrl + espacio
		System.out.println(nombre);
		System.out.println(31*22);
		
		
		//Si queremos mandar a imprimir texto y numeros en una
		//sola impresion en consola, o mas elementos
		//entramos en algo que se llama 'Concatenacion'
		
		System.out.println("La suma es: " + (10+11));
		
		
		
		
	}//Cierre del main
	
}//Cierre de la clase
