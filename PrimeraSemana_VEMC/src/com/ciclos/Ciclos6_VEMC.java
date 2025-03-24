package com.ciclos;


public class Ciclos6_VEMC {

	public static void main(String[] args) {
// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual.
//¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?
//variables iniciales
double montoInicial = 1000.0;
double interesMensual = 0.02;
int meses = 12;
//Calculo monto final
double montoFinal = montoInicial;
for (int i = 1; i <= meses; i++) {
	montoFinal += montoInicial * interesMensual;
	}
//Mostrar resultado
System.out.printf("Monto final despues de %d meses: $%.2f\n", meses, montoFinal);
}

}
