package primer;

public class MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Metodos o funcionalidades de la clase String
		// la fecha de hoy
		
		String fecha = "Hoy es 11 de Marzo de 2025";
		//.length () -Nos devuelve un valo de tipo entero
		// la longitu o el conteo de letras que contne mi string
		
		System.out.println ("Probando el metodo .length()");
		System.out.println(fecha.length());
		
		
		//Recuerden .length me devuelve un valor entero. Siquiero puedo 
		//guardarlo para su uso posterior
	
		
		int conteo = fecha.length();
		System.out.println(conteo);
		
		//.charAt() - Nos devuelve en un valor entero . siquieor piedi 
		//guardarlo para su uso posterior
		
		System.out.println("Probando el metodo  .charAt()");
		System.out.println(fecha.charAt(25));
		
		//podemos ir combinando metodos para utilizarlos
		System.out.println(fecha.charAt (fecha.lenght()-1));
		
		System.out.println("probando metodo .substring(indice inicialI)");
		System.out.println( fecha.substring(4, 6));
		
		//.toLowerCase() -Convierte la cadena de texto a minusculas
		// .toUpperCase - conicerte la cadena de texto a mayusculas
		System.out.println("Probando le metodo .toLowerCase()");
		System.out.println (fecha.toLowerCase());
		
		//.equals() -comapara un objeeto contra otro y regresa un valor 
		//booleano para decirnos si son iguales o no
		
		System.out.prinln("Probando el metodo .equal()");
		
		
		// .equalsIgnoreCase() -compara una cadena de texto contra otra en 
		//contenido si son iguales devuelve un valor true, no importa el uso de mayusculas
		
		System.out.println("Probando el metodo .equalIgnoreCase()");
		System.out.println(fecha.equalsIgnoreCase(hOy eS 11 dE Marzo dE 2025"));"
		
		//contains-devuelve true si existe la secuncia de caracteres en el string
				
		System.out.println("Porbando el metodo .contains()");
		System.out.println (fecha.contains("marzo"));
	}

}
