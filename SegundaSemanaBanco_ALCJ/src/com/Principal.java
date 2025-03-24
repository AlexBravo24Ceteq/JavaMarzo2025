package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// Vamos a crear nuestra BD
		
		//Declaramos nuestro HM
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		
		//Para agregar cuentas en nuestro HM podemos hacerlo de dos 
		//formas
		//1.-Creando la cuenta y agregandola despues
		
		Cuenta alex = new Cuenta("Alex", 13000, 4000, 50000, "Debito");
		
		cuentas.put(1001, alex);
		
		//Creando las cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Karen", 10000, 1000, 20000, "Debito"));
		cuentas.put(1002, new Cuenta("Pablo", 500, 100, 10000, "Debito"));
		
		//Si nos acordamos, para recuperar el valor de un objeto en mi HashMap
		//System.out.println(cuentas.get(1003));
		
		//Crear nuevo cajero
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		//probar el metodo consultar
		System.out.println(angelopolis.consultar(1005));
		
		//Probar metodo retirar exitoso
		
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));
		//Quiero retirar dinero de una cuenta que no existe
		System.out.println(angelopolis.retirar(1002, 1000));
		
		//Probar el metodo depositar exisoto
		System.out.println(angelopolis.depositar(1001, 5000));
		
		System.out.println(angelopolis.depositar(1003, 10000));
		
	}

}
