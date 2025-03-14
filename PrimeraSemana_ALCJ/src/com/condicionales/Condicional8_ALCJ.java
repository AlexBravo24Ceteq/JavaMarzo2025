package com.condicionales;

import java.util.Scanner;

public class Condicional8_ALCJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("<<<<<Bienvenido>>>>");
        System.out.println("Ingresa el resultado que obtuviste al lanzar el dado (1-6):");
        int resultado = teclado.nextInt();
        
        String caraOpuesta;

        switch (resultado) {
            case 1:
                caraOpuesta = "seis";
                break;
            case 2:
                caraOpuesta = "cinco";
                break;
            case 3:
                caraOpuesta = "cuatro";
                break;
            case 4:
                caraOpuesta = "tres";
                break;
            case 5:
                caraOpuesta = "dos";
                break;
            case 6:
                caraOpuesta = "uno";
                break;
            default:
                caraOpuesta = "ERROR: número incorrecto";
                break;
        }

        System.out.println(caraOpuesta);
    }


	}

