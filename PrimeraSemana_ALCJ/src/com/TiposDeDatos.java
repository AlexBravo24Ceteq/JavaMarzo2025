package com; //nombre del paquete

public class TiposDeDatos { //nombre de la clase

	public static void main (String[] args) {
		//America Calderon
		//Comentarios de una sola lina
		
		/*
		 * Podemos escribir comentarios
		 * de multiples
		 * lineas
		 * 
		 */
		
		//CTRL + S = guardar cambios
		
		/*Tipos de datos primitivod
		 * Numericos enteros
		 */
		
		//Ej. de crear una variable con su tipo de dato
		//Pero sin almacenar ningun valor aun en ella
		byte numero1; 
		
		//Declarar una variable y asignarle algun valor me sirve
		//para poder asignarselo mas adelante
		numero1 = 120; 
		
		//Ej. de crear variables con su tipo de dato
		//Pero con sus valores asignados desde un principio
		
		byte a = -128; //1 byte de memoria y admite valores de -128 a 127
		short b = -32768; //2 bye admite del -32768 a 32767
		int c = 2147483647; //4 bytes de memoria y es el tipo de dato entero mas utilizado
	    long d = 2147483649l; //8 bytes y necesita del sufijo "L" para almacenar datos que van
	    // mas alla de los tipo int
	    
	    /*Tipos de datos primitivos
	     * numericos en coma flotante (decimales)
	     */
		
	    
	    float e = 3.141614161416F; // 4 bytes en memoria 
	    //y necesita del sufijo de la lera F para admitir el valor
	    double f = 2.5488786; //8 bytes de memoria y es el tipo de dato
	    //mas utilizado para trabajar con decimales
	    
	   /*TIPOS DE DATOS PRIMITIVOS
	    * BOOLEANOS
	    * CARACTER
	    */
	    
	    boolean inndicador = true; //solo pueden guardar valores true/false
	    // y son utiles para evaluar expresiones o condiciones
	    
	    char caracter = '3'; //solo admiten o pueden guardar un caracter 
	    //a la vez 
	    
	    /*Conocer los tipos de datos no primitivos
	     * tipos de dato objetos 
	     * tipos de dato estructurados
	     * son tipos de datos mas complejos ya que pueden representar
	     * un conjunto de datos como los arrays o nos pueden ayudar
	     * a crear objetos, etc.
	     */
	    
	    //string - cadenas de texto
	    
	    String nombre = "America Calderon";
	    
	    String letra; 
	    
	    letra = "A";
	    
	    /*tipos de datos wrapper
	     * pertenecen a los tipos de dato objeto
	     */
	    
	    //Estos tipos de dato "envuelven" a los tipos de dato primitivos 
	    //y les otorgan ciertas funncionalidades
	    
	    a = 10;//aqui estamos remplazando el valor de a desde esta linea
	    //en adelante
	    
	    Byte x = 127;
	    //ahora si necesitara que x tuviera mas funciones, podemos acceder
	    //a ellas porque lo estamos declarando como un tipo de dato wrapper
	    x.toString();// "127
	    
	    //Byte
	    //Short
	    //Integer
	    //Long
	    //Float
	    //Double
	    //Boolean
	    //Character
	    
	    
	    //cuando no utilizamos las variables para un proposito
	    //el ide las marca en amarillo porque
	    //no estan teniendo un uso y solo utilizan memoria
	    int g = 100;
	    int h = 20;
	    
	    int resultado = g+h;
	    
	    //Darle salida a nuestros datos en consola
	    //"Mandarlos a imprimir"
	    System.out.println("Hola Mundo"); //.print manda a imprimir 
	    //este saludo en consola, pero en una sola linea
	    System.out.println(resultado);
	    
	    //syso + ctrl + espacio
	    //sout + ctrl + espacio
	    System.out.println(nombre);
	    
	    //Mandar a imprimir directamente una operacion en consola
	    System.out.println(10+11);
	    
	    //si queremos mandar a imprimir texto y numeros en una
	    //sola impresion en consola o mas elementos
	    //entramos en algo que se llama "concatenacion"
	    System.out.println("La suma es: " + 10+11);
	    
	    System.out.println("La suma es:" + (10+11));
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
 	} //cierre del main
} //cierre de la clase
