package com.ciclos;

public class Ciclos7_VEMC {

	public static void main(String[] args) {
//Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual.
//¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su dinero?		
double capitalInicial = 700.0;//capital inicial
double interes = 0.02;//tasa de interes mensual 2%
double montoDeseado = 1500.0;//monto deseado.
int meses = 0;

//calcular cuantos meses
while (capitalInicial < montoDeseado) {
capitalInicial *= (1 + interes);//reinvertir el dinero,En cada iteración, el capital se multiplica para simular la reinversion mensual
meses++;//se incrementa en 1 en cada iteracion

}
//Mostrar el resultado
System.out.println("Se necesitan " + meses + " meses para tener más de $" + montoDeseado);

	}

}
