package com.condicionales;

import java.util.Scanner;

public class Salario_Obrero_JAGR {

	public static void main(String[] args) {
		
		// Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40
				//horas o menos se le paga $16 por hora. Si trabaja m�s de 40 horas se le paga $16 por cada una de las
				//primeras 40 horas y $20 por cada hora extra. Trabajo numero 14

				        // Crear un objeto Scanner para leer la entrada del usuario
				        Scanner scanner = new Scanner(System.in);
				        
				        // Solicitar las horas trabajadas al usuario
				        System.out.print("Ingrese el numero de horas trabajadas en la semana: ");
				        int horasTrabajadas = scanner.nextInt();
				        
				        // Definir tarifas de pago
				        final int HORAS_NORMALES = 40;
				        final double TARIFA_NORMAL = 16.0;
				        final double TARIFA_EXTRA = 20.0;
				        
				        // Calcular salario
				        double salario;
				        if (horasTrabajadas <= HORAS_NORMALES) {
				            salario = horasTrabajadas * TARIFA_NORMAL;
				        } else {
				            int horasExtras = horasTrabajadas - HORAS_NORMALES;
				            salario = (HORAS_NORMALES * TARIFA_NORMAL) + (horasExtras * TARIFA_EXTRA);
				        }
				        
				        // Mostrar el resultado
				        System.out.println("El salario semanal es: $" + salario);
				        
				        // Cerrar el scanner
				        scanner.close();
			}

		}


//          public class Salario_Obrero_JAGR {
//		    private static final int HORAS_NORMALES = 40;
//		    private static final double TARIFA_NORMAL = 16.0;
//		    private static final double TARIFA_EXTRA = 20.0;
//
//		    public static void main(String[] args) {
//		        Scanner scanner = new Scanner(System.in);
//		        
//		        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
//		        int horasTrabajadas = scanner.nextInt();
//		        
//		        double salario = calcularSalario(horasTrabajadas);
//		        System.out.println("El salario semanal es: $" + salario);
//		        
//		        scanner.close();
//		    }
//
//		    private static double calcularSalario(int horasTrabajadas) {
//		        if (horasTrabajadas <= HORAS_NORMALES) {
//		            return horasTrabajadas * TARIFA_NORMAL;
//		        } else {
//		            int horasExtras = horasTrabajadas - HORAS_NORMALES;
//		            return (HORAS_NORMALES * TARIFA_NORMAL) + (horasExtras * TARIFA_EXTRA);
//		        }
//		    }
//		}
