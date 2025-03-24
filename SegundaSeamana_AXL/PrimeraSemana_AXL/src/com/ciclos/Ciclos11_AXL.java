package com.ciclos;

import java.util.Scanner;

public class Ciclos11_AXL {

	public static void main(String[] args) {
		// T11.Dibuja un cuadrado, como en la imagen que acompaña, 
		//introducir desde teclado el ancho y el alto. 
		//Ejemplo: 8 x 8  
		
		int fila,columna,relleno;
        Scanner leer= new Scanner(System.in);
        System.out.println("Numero de filas:");
        fila=leer.nextInt();
        
        System.out.println("Numero de columnas:");
        columna=leer.nextInt();
        
        System.out.println("Vacio -->0 / Relleno -->1 :");
        relleno=leer.nextInt();        
        System.out.println("\t Dibujo del cuadrado \n");
        for (int f=0; f<fila; f++) {
            for (int c = 0; c < columna; c++) {
                
                if(f==0||f==(fila-1)){
                    //las esquinas se dibujan con +
                    if(c==0||c==(columna-1)){ 
                        System.out.print("+");
                    }
                    
                    else{
                        System.out.print("-");
                    }
                }
                
                else{
                    
                    if(c==0||c==(columna-1)){
                        System.out.print("|");
                    }
                    
                    else
                        
                        if(relleno==0){
                            System.out.print(" ");
                        }
                        
                        else{
                            System.out.print(f);
                        }
                }
            }
            System.out.println(""); 

	}

	}
}	
