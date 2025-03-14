package com;// nombre de paquete



public class TiposDeDatos {// nombre de la clase
	
	//public static void main (String [] args) {
		//} main + espacio
	public static void main(String[] args) {
		/*
		 * comentario de multiples
		 * lineas
		 * jose antonio farfan
		 * Ctlr s para guardar cambios
		 */
		
		/*
		 * Tipos de datos primitivos
		 * numericos enteros
		 */
		//ejemplo de crear una variable con su tipo de dato
		//pero sin almacenar ningun valor aun en ella
		byte numero1;
		
		/*declarar una variable sin asignarle algin valor me sirve
		 * para poder asiganrlo mas adelante
		 */
		numero1 = 120;
		
		/*
		 * Ej. de crear varibales con su tipo de dato
		 * pero con sus valores asignados desde un principio
		 * 
		 */
		
		 byte a = -128; //1 byte admite de -128 a 127
		 short b = -32768; //2 bytes -32768 a 32767
		 int c = 2147483647;// 4 bytes es el tipo de dato mas utilizado
		 long d = 2147483649L; // 8 bytes y necesita del subjio L
		 // para poder almacenar datos que van mas alla de los tipo int
		 
		 
		 //Tipos de datos primitivos
		 /* Numericos en coma flotante ( decimales)
		  * 
		  */
		 float e = 3.1416F; // 4 bytes en memoria 
		 // necesita en subfijo F para admitir el valor
		 double f = 2.548676;// 8 bytes y es tipo de dato 
		 // mas utilizado para trabajar con decimales
		 
		 
		 /* Tipos de  datos primitivos
		  * Booleanos
		  * Caracter
		  * 
		  */
		 
		  boolean indicador = true;// Solo guardan valores true/false
		  //y son utiles para evaluar expresiones o condiciones
		  
		  char caracter = 'F'; // solo admiten un caracter a la ves
		  
		  /*Tipos de datos no primitivos 
		   * tipos de dato objeto
		   * tipos de dato estructurados
		   * so tipos de datos mas complejos ya que pueden represnetar 
		   * un conjunto de datos como los arrays o nos pueden ayudar 
		   * a crear objetos, ect.
		   * 
		   *
		   * 
		   */
		   
		  //String - cadenas de texto
		   String nombre = "Jose Antonio"; 
		   
		   /* Tipos de dato Wrapper
		    * Pertenecen a los tipos de dato objeto
		    */
		   
		   // estos tipos de dato "envuelven" a los tipos de dato primitivos
		   // y les ortoga ciertas funcionalidades
		   
		   a= 10; // aqui estamso remplazando el valor de a desde esta linea
		   // en adelante
		   
		   Byte x = 127; 
		   
		   //Ahora si necesitara que x tuviera mas funciones, podemos acceder
		   //a ellas porqeu la estamso declarando con un tipo de dato Wrapper
		   
		   x.toString();
		   
		   /*
		    * Byte
		    * Short
		    * Integer
		    * Long
		    * Float
		    * Double
		    * Boolean
		    * Character
		    */
		   
		   //Cuando no utilizamos nuetras varibales para algun proposito
		   //El IDE nos las marca o subraya en amarrillo porque pues 
		   // no esta teniendo uso y solo utiliza memoria
		   
		   int g = 100;
		   int h = 20;
		   
		   int resultado = g + h;
		   
		   // Darle salida a nuetros datos en consola
		   // Mandarlos a imprimir 
		   System.out.println(resultado);
		   //atajo syso + Ctrl + espacio
		   //sout + Ctrl + espacio
		   
		   System.out.println(nombre);
		   
		   //mandar a imprimir directamente una operacion en consola
		   System.out.println(10+11);
		   
		   // Si queremos mandar a imprimir texto y numero en una
		   //sola impresion en consola o mas elementos
		   //estaremos en algo que se llama concatenacion
		   
		   System.out.println("la suma es: "+ resultado);
		   
		   System.out.println("La suma es: " + 10 + 11);
		   System.out.println("La suma es: "+ (10+11));
		 	
	
	}//cierre de main
		

}// cierre de la clase
