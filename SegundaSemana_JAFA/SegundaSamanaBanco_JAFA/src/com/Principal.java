package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// Vamos a crear nuestra base de datos
		
		//Declaramos nuetro HasMap
		Map<Integer,Cuenta> cuentas =new HashMap<Integer, Cuenta>();
		
		
		//Para agregar cuentas en nuestro HashMap podemos hacerlo de dos
		//formas
		//creando la cuenta y agregandola despues
		
		Cuenta alex =new Cuenta ("Alex",13000,4000,50000,"Debito");
		
		cuentas.put(1001, alex);
		
		//Segunda forma de agregar
		//Creando las cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000,"Debito"));
		cuentas.put(1003, new Cuenta("Pedro", 10000, 1000, 20000,"Debito"));
		cuentas.put(1004, new Cuenta("Pablo", 500, 100, 10000,"Debito"));
		cuentas.put(1005, new Cuenta("Mariana", 15000, 500, 50000, "Premiun"));
		
		//Si nos acordamos para recuperar el valor de un objeto en mi HasMap
		//System.out.println(cuentas.get(1003));
		
		//crear mi nuevo cajero
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		//Probar el metodo consultar
		System.out.println(angelopolis.consultar(1001));
		
		//probar el metodo retirar exitoso
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));
		
		//Quiero retirar dinero de una cuenta que  no existe
		System.out.println(angelopolis.retirar(1006, 1000));

		//vamos a probar el metodo depositar exitoso
		System.out.println(angelopolis.depositar(1001, 5000));
		
		//excede el maximo permitido
		System.out.println(angelopolis.depositar(1003, 11000));
		
		//
		System.out.println(angelopolis.depositar(1003, 10000));
		System.out.println(angelopolis.depositar(1003, 100));
	}

}
