package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// Vamos a crear nuestra base de datos
		
		//Declaramos nuestro HashMap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		//Para agregar cuentas en nuestro HashMap podemos hacerlo de dos formas
		//Creando la cuenta y agregandola despues
		
		Cuenta alex = new Cuenta("Alex", 13000, 4000, 50000, "Debito");
		cuentas.put(1001, alex);
		
		//Creando las cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Humberto", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Pablo", 500, 100, 10000, "Debito"));
		
		//Si nos acordamos, para recuperar el valor de un objeto en mi HashMap
		//System.out.println(cuentas.get(1003)); esto se lo vamos a delegar al cajero
		
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		//Probar el método consultar
		System.out.println(angelopolis.consultar(1001));//busca la cuenta 1001 en cajero
	
		//Probar el metodo retirar exitoso
		System.out.println(angelopolis.retirar(1001, 7000));
		
		//Probar el metodo de forma no exitosa
		System.out.println(angelopolis.retirar(1002, 1000));
		System.out.println(angelopolis.retirar(1003, 10000));
		System.out.println(angelopolis.retirar(1006, 1000));
		
		//probando el metodo depositar
		System.out.println(angelopolis.depositar(1002, 3000));
		System.out.println(angelopolis.depositar(1001, 48000));
		System.out.println(angelopolis.depositar(1006, 500));
		System.out.println(angelopolis.depositar(1004, 10000));
	}

}
