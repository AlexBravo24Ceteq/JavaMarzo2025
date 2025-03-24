package com;

import java.util.Scanner;

public class Cientifica extends Calculadora {
    
    public Cientifica() {}

   
    @Override
    public double sumar(double a, double b) {
        return a + b;
    }

  
    @Override
    public void sumar() {
    	 Scanner input = new Scanner(System.in);
         double a, b;

         System.out.println("Holis, Ingresa el primer numero");
         a = input.nextDouble();
         System.out.println("Ingresa el segundo numero");
         b = input.nextDouble();

         System.out.println("El resultado de la suma es: " + (a + b));
     }
    }



