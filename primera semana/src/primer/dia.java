package primer;

public class dia {
//ej.  de fear uan variable con su tipo de dato
	//pero sin alamcenar
	//ej. crear variables con su tipo de dato pero con su valores asignados desde un principio
	byte a= -128; //1byte de memoria y admite valores de -128a 127
short b = -32768; //2 byte y admite del -32768 a 32767
	int c = 2147483647; //4 byte y es el tipo de datos enterosmas utilizado
	long d = 2147483649; //8 bytes y necesita del sufijo "L" para poder almaccenar datos que van mas alla de los tipo int
	/* TIPOS DE DATOS PRIMITIVOS 
	 * NUMERICOS EN COMA FLOTANTE (DECIMALES)
	 */
float e = 3.1416F; // 4 bytes de memoeria y necesita del sufijo F para adminiitir el valor
double f = 2.5488786; //8 bytes de mmeoria y el tipo de dato mas utilizado para trabajar con decimales

/* TIPOS DE DATOS PRIMITIVOS
 * BOOLEANOS
 * CARACTER
 */
boolean indicador = true; //Solo pueden guardar valores ture/false 
// y son utiles para evaluar expreiones o condiciones

 char caracter = '3'; //solo admiten o pueden guardar un caracter
 // a la vez
 /* TIPOS DE DATOS PRIIMITIVOS 
  * TIPOS DE DATOS OBJETO
  * TIPOS DE DATOS ESTRUCTURADOS
  * son tipos de datos compplejos ya que pueden representar 
  * un conjunto de datos como los arrays o nos puedens ayudar a 
  * crear objetos, etc
  * */
 //String - cadenas de texto
 
  String nombre = "Jorge Alejandro" ; 
  String letra  = "A"; 
  letra = "A"; 
  /* TIPOS DE DATO WRAPPER 
   * PERTENECEN A LOS TIPOS DE DATO OBJETO
   */
  
  //Estos tipos de datos envuelven a los tios de datos primitivos 
  otorgan ciertas funcionalidades
  
  
  
  a = 10; //aqui estamos reemplazando el valor des esta linea en adelante
  
  letra. //  funiona el menu con cualquier variable tipo primtivo objeto
  
  
  Byte x = 100; // Se puede guardar ya que se considera una variable tipo objeto por colocar en mayuscula
  
  //Ahora si necesitara que x tuviera mas funciones, podemos acceder a ellas porque la estanos declarando coo dao Wrapper
  
  x. toString(); //"127"
  
  //Byte
  //Short
  //Integer
  //Long
  //Float
  // Double
  // Boolean
  // Character
  
  //Cuando no utilizamos las variabeles para algun proposito
  // el IDE nos la marca o subraya en amarillo por pues 
  // nos estan eniendo uso y solo utilizan memoeria
  
  int g= 100; 
  int h= 20;
  int resultado= g+h;
  
  //Darle salida a nuestros datos en cosnonsola 
  //MAndarlosa inprimir
  
  System.out.println("Hola Mundo"); //.printmandara a imprimir 
  //este saludo en consola, pero eun una sola linea
  
  System.out.println(resultado);
  
  //syso +ctrl + espacio
  //sout + ctrl +espacio
  System.ou.println(nombre);
  
  //Mandar a imprimir directamenteuna operacon en consola
  
  System.out.println(10+11);
  
  //Siquremos mandar a aimprimir texto y numero en una 
  //sola impresion en consola o mas elementos
  //entramos en algo que se llama "concatenacipn"
  
  System.ou.println("la suma es: + (10+10"));
  
  
  
  
  
  
}
