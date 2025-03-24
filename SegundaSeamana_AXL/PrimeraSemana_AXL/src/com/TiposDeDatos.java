package com; //nombre del paquete

public class TiposDeDatos { //nombre de la clase

	public static void main(String[] args) {
		//comentario de una sola linea
		
		/*
		 * podemos escribir comentarios
		 * de munltiples
		 * lineas
		 */
		
		/*
		 * TIPOS DE DATOS PRIMITIVOS 
		 * NUMERICO ENTERO
		 */
		
		//ejemplo de crear una variablecon su tipo de dto
		//pero sin almacenar ningun valor en ella
		byte numero1;
		
		/*
		 * declarar una variable para asignarle un nvalor
		 * para poder asignarselo mas tarde
		 */
		
		numero1 = 120;
		
		/*
		 * ejemplo crear variables con su tipo de edato
		 * pero con sus valores asignados desde un principio
		 */
		
		byte a = -128;  //1byte de memoria y admite val de -128 a 127
		short b = -32768; //2bytes admite del -32768 a 32767
		int c = 214483647; //4bytes siendo este el tipo de dato
		//entero mas utilizado
		long d = 2147483649L; //8bytes y necesita el surfijo "L" para poder
		//almacenar datos que van mas alla de los tipo int
		
		/*tipos de datos primitivos
		 * nunericos en coma flotante (decimales)
		 */
		
		float e = 3.141614161416F; //4bytes en memoria
		//y necesita del subfijo de la letra "F" para admitir el valor
		
		double f = 2.5488786; //8bytes y es el tipo de dato
		//mas utulizado para trabajar con decimales
		
		/*DATOS PRIMITIVOS
		 * BOOLEANOS 
		 * CARACTER
		 */
		
		boolean indicador = true; //solo pueden guardar valores true/fals
		//son utiles para evaluar expresiones o condiciones
		
		char carater = '3'; //solo admiten un caracter a la vez
		
		/*TIPOS DE DATOS NO PRIMITIVOS 
		 * DTO OBJETO
		 * DATO ESTRUCTURADO
		 * son datos mas complejos como los arrays o nos pueden ayudar
		 * a crear objetos, etc.
		 */
		
		//String - cadena de texto
		
		String nombre = "Alexandra Xocoyotl";
		
		String letra;
		
		letra = "A";
		
		/*DATOS WRAPPER
		 * PERTENECEN A LOS TIPOS DE DATOS OBJETO
		 */
		
		//Estos envuelven a los datos primitivos y les otorgan ciertas funciones
		
		a = 10; //se esta remplazando el valor de a desde esta
		//linea en adelante
		
		Byte x = 100;
		//Si llego a necesitas que "x tenga mas funciones" 
		//podemos acceder a ellas porque la estamos declarando con un tipo de dato
		//Wrapper
		
		x.toString(); //127
		
		//Byte
		//Short
		//Int
		//Long
		//Float
		//Double
		//Boolean
		//Character
		
		//Cuando no se usan las variables el ID las marca en amarrillo
		//ya que no estan siendo usadas y solo utilizan memoria 
		
		int g = 100;
		int h = 20;
		
		int resultado = g+h;
		
		//Darle salida a nuestros datos en consola
		System.out.println("hola mundo"); //.print mandara a imprimir
		//este saludo en consola pero a una sola linea
		System.out.println(resultado); 
		//.println permite el salto de linea al momento de ejecutar programa
		
		//syso +ctrl + espacio
		//sout + ctrl + espacio
		System.out.println(nombre);
		
		//Mandar a imprimir directamente una operacion en consola
		System.out.println(10+11);
		
		//si queremos mandar a imprimir texto y numeros en una
		//sola impresion de consola o mas elementos 
		//entramos en algo que se llama "concatacion"
		
		System.out.println("la suma es " + (10+11));
		
		
		
		
		
	} //llave del ciere de main

} //llave de cierre de la clase
