package com; //Nombre del paquete

public class TiposDeDatos { //nombre de la clase

	public static void main(String[] args) {
		//El doble diagonal nos permite hacer comentarios de una sola linea
		
		/*
		 * Con diagonal y asterisco
		 * podemos hacer comentarios de 
		 * varias lineas
		 */
		
		// Para guardar cambios se puede usar Ctrl + s
		// Si en el nombre de la clase aparece un asterisco es porque hay cambios no guardados
		
		//Tipos de datos primitivos
		//numeros enteros
		// Ejemplo de crear una variable con su tipo de dato pero sin almacenar ningun valor aun en ella
		 byte numero1;
		 
		 //Declarar una variable sin asignarle algun valor me sirve
		 // para poder asignarselo mas adelante
		 numero1 = 120;
		 
		 //Ejamplo de crear variables con su tipo de dato
		 // pero con sus valores asignados desde el principio
		 byte a = 120; //1 Byte de memoria y admite valores de -128 a 127
		 short b = -32768; //2 Bytes y admite del -32768 a 32767
		 int c = 2147483647; //4 Bytes es el tipo de dato entero mas utilizado 
		 long d = 2147483647909L;// 8 Bytes y necesita el sufijo "L" para poder ser almacenado mas alla de los tipo int
		 
		 /*Tipos de datos primitivos
		  * numericos en coma flotante (decimales)
		  */
		 float e = 3.1416F; //4 Bytes necesita el sufijo "F" para admitir el valor
		 double f = 2.5476454363; //8 Bytes y es el tipo de dato mas utilizado para trabajar decimales
		 
		 /*Tipos de datos primitivos
		  * booleanos
		  * caracter
		  */
		 
		 boolean  indicador = true; //Solo pueden guardar valores true o false y son utiles
		 	//para evaluar expresiones o condiciones
		 char caracter = '3'; //Solo admiten o pueden guardar un caracter a la vez
		 
		 
		 /*Tipos de datos no primitivos
		  * tipos de datos objeto
		  * topos de dato estructurado
		  * Son tipos de datos mas complejos ya que pueden representar
		  * un conjunto de datos como los arrays o nos pueden ayudar 
		  * a crear objetos, etc.
		  */
		 
		 //string - cadenas de texto
		 String nombre = "Hector Villafaña"; //No puede haber nombres de variables repetidas aunque contengan
		 	//datos diferentes
		 String letra;
		 letra= "A";
		 
		 /*Tipos de dato warpper
		  * pertenecen a los tipos de dato objeto
		  */
		 
		 //Estos tipos de datos envueven a los tipos de datos primitivos y les otorgan ciertas funcionalidades
		 a = 10; //aqui estamos remplazando el valor de "a" desde esta linea en adelante
		 
		 // si a un tipo de dato  tipo objeto le agregas un punto al final como letra.
		 //te despliega un menu de funcionalidades
		 
		 Byte x = 127;
		 
		 /*Ahora si necesitara que x tuviera mas funcioones, podemos acceder
		  * a ellas porque la estamos declarando con un tipo de dato Wrapper
		  */
		 x.toString(); //"127"
		 
		 /*Datos Wrapper, son los datos ptimitivos pero con mayusculas
		  * Byte
		  * Short
		  * Integer
		  * Long
		  * Float
		  * Double
		  * Boolean
		  * Character
		  */
		 
		 /*Cuando no utilizamos las variables para ningun proposito el IDE  nos las marca o
		  * subraya en amarillo porque no estan teniendo un uso y solo utilizan memoria
		  */
		 int g = 100;
		 int h = 20;
		 
		 int resultado = g+h; //como estamos usando g y h ya no las marca en amarillo, pero ahora marca resultado
		 
		 //Darle salida a nuestros datos en consola
		 //"Mandarlos a imprimir"
		 System.out.println("Hola ¿que hace?");//.print mandara a imprimir
		 //este saludo en consola, pero en una sola linea, usando "ln" al final hace un salto de linea
		 System.out.println(resultado);
		 //Atajos para esta linea
		 //syso + ctrl + espacio
		 //sout + ctrl + espacio
		 System.out.println(nombre);
		 
		 //Mandar a imprimir directamente una operacion en consola
		 System.out.println(10+11);
		 
		 //Si queremos mandar a imprimiir texto y numeros en una sola impresion, o mas elementos
		 //entramos en algo que se llama "concatenacion"
		 System.out.println("La suma es : " + 10 + 11);// el primer mas hace que piense que se estam agregando los numeros al texto
		 System.out.println("La suma es : " + (10+11));// para solucionarlo se usan parentesis
		 
		 
	} //cierre del main
} // cierre de la clase
