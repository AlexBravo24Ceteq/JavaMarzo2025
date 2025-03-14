package com; //nombre del paquete

public class TiposDeDatos { //nombre de la clase
 public static void main (String[] args) {
	 
	 /*
	 podemos escribir con enter sin cortat 
	 */ 
	  //TIPOS DE DATOS PRIMITIVOS//
	 //NUMERICOS ENTEROS//
	//E.J. Declaracion de variable con su tipo de dato pero sin almacenar nigun valor.//
	 byte numero1;
	 
	 //Declarar una variable sin asignarle algun valor me sirve para poder asignarlo mas adelante//
	 numero1 = 120;
	 
	 //Ej. de crear variables con su tipo de dato
	 //pero con sus valores asignados desde el principio
	 byte a = -128; // 1 byte de memoria admite desde -128 a 127.
	 short b = -32768; // 2 bytes de memoria admiten desde -32768 a 32767.
	 int c = 2147483647; //4 bytes de memoria y es el tipo de dato entero mas utilizado. 
	 long d = 2147483649L; // 8 bytes y necesita del sufijo (L) para poder almacenar datos que van mas alla de los datos tipo int.
	 
	 
	 //NUMERICOS-FLOTANTES(DECIMALES)//
	 float e = 3.141614161416F; //4 bytes de memoria y necesita del sufijo (F) para poder almacenar datos.
	 double f = 2.5488786; // 8 bytes de momoria y es el tipo de dato mas utilizado para trabajar con decimales.
	 
	 boolean indicador = true; // solo guardan valores true o false, se utilizan para evualuar expresiones o condiciones.
	 char caracter = '3'; // solo guardan un caracter a la vez.
	 
	 //TIPOS DE DATOS NO PRIMITIVOS//
	 //TIPO DE DATOS OBJETOS
	  //TIPO DE DATOS ESTRUCTURADOS
	  // Son tipos de datos mas complejos ya que puenden representar un conjunto de datos como los arrays o nos pueden ayudar a crear objetos, etc.
	  
	 String nombre = "Victor Mendez";
	 String letra;
	 letra = "A";
	 
	 //TIPOS DE DATOS WRAPPER
	 //SON TIPO DE DATOS OBJETO
	 //Este tipo de datos "envuelven" los tipos de datos primitivos y les otorgan ciertas funcionalidades
	 a = 10; //aqui estamos reemplazando el valor de "a" desde esta linea en adelante.
	  
	 Byte x = 127; //Si necesitara que "x" tuviera mas funciones, podemos acceder a ellas porque las estamos declarando con un tipo de dato wrapper.
	 x.toString(); //"127"
		 
	 //Byte
	 //Short
	 //Integer
	 //Long
	 //Float
	 //Double
	 //Boolean
	 //Character
	 
	 //Cuando no utilizamos las variables para un proposito el IDE nos las marca o subraya en amarillo porque no estan teniendo uso	y solo utilizan memoria.
	 int g = 100;
	 int h = 20; 
	 int resultado = g+h;
	 
	 //Darle salida a nuestros datos en consola "Mandarlos a imprimir".
	 
	 System.out.println("Hola Mundo"); //.print manda a imprimir este saludo en consola pero en una sola linea.
	 System.out.println(resultado); //"ln" agrega un salto de linea al mostrar resultados.
	 
	 //syso + ctrl + espacio
	 //sout + ctrl + espacio
	 System.out.println(nombre);

	 
	 //mandar a imprimir directamente una operacion en consola.
	 System.out.println(10+11);
	 
	 
	 //Si queremos mandar a imprimir texto y numeros o mas elementos en una sola impresion en consoloda entramos en un elemento llamado "Concatenacion"
	 System.out.println("La suma es: "+ 10+11);
	 System.out.println("La suma es: "+(10+11));
	 
	 
	 
	 
	 
	 
 } //cierre de< main
 
}//cierre de la clase

