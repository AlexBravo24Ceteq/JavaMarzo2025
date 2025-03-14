package com.arrays;

public class Arrays4_JAFA {
	public static void main(String[] args) {
//		//Dado un array de números de 5 posiciones con los siguientes valores:
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
//		los valores invertidos, es decir, que el segundo array deberá tener los valores 
//		{5,4,3,2,1}.
		
		int [] numerosP = {1,2,3,4,5};
		
		int [] invertido= new int [numerosP.length];
		
		//Copia los valores invertidos
		for (int i = 0; i < numerosP.length; i++) {
			invertido[i]=numerosP[numerosP.length -1 -i];// copia el valor desde el final hacia el principio
		}
		
		//mostrar el array original
			for (int j = 0; j < numerosP.length; j++) {
			System.out.print(numerosP[j]+ " ");	
			}
			
			System.out.println();// salto de linea
			
			
			//mostrar el array invertido
			for (int i = 0; i < invertido.length; i++) {
				System.out.print(invertido[i]+ " ");
			}
		
		
	}

}
