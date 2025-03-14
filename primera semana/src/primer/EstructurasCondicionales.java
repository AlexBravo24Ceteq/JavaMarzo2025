package primer;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras de desicion if/else -evaluan valores booleanos
		
		/* si (esto se cumple)
		 * se ejecutara este bloque de codigo 
		 * si no//de otro modo
		 * ejecuta este otro bloque
		 
		 
		 */
// ej. vamos a tener una variable con un valor entero
		
		int x = 9;
		
		
		if (x<=9) {
			System.out.println ("Cierto");
		} else {
			System.out.println ("Falso");
		}
	}
//
//	//Condiciones compuestas con operadores logicos
//	// AND, OR , NOT, DIFERENTE DE IGUALDAD
//	
//	//AND - && CUANDO SE DEBE CUMPLIR AMBAS CONDICIONES
//	
//	// OPERADOR OR - devuelve TRUE CUANDO AL MENOS SE CUMPLE UNA CONDICION 
//	
//	int x = 9;
//	
//	
	if (x<8 || x>5) {
		System.out.println ("Cierto");
	} else {
		System.out.println ("Falso");
		
		//NOT ! -NIEGA UNA CONDICION O CAMBIA SU VALOR DE TRUE A FALSE Y VICEVERSA
		
		if (! (x<8)) {
			System.out.println ("Cierto");
		} else {
			System.out.println ("Falso");
	
}
		
		//IGUALDAD - ==  COMAPRA VALORES, Y DEVUELVE TRUE CUANDO SON IGUALES
		
		
		
		// DIFERENTE DE -  != . COMPARA LOS VALOFRES Y DEVUELVE TRUE CUANDO SON DIFERENTES 
		
		if (x != 10) {
			System.out.println ("Cierto");
		} else {
			System.out.println ("Falso");
		}
			
