package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// 20/03/25
		//Vamos a crear nuestra base de datos 
		
		//Declaramos nuestro HashMap
		Map<Integer, Cuenta> cuentas=new HashMap<Integer,Cuenta>();
		
		//Para agregar cuentas en nuestro HashMap hay dos formas
		//Creando la cuenta y agregandola despues
		
		Cuenta alex = new Cuenta("Alex", 13000, 4000, 50000, "Debito");
		
		cuentas.put(1001, alex);
		
		//creando las cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta("Valentin", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Kerry", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Pandora", 500, 100, 10000, "Debito"));
		
		//Si nos acordamos, para recuperar el v alor de un objeto
		//de mi HashMap
		//System.out.println(cuentas.get(1003));  
		
		//Crear mi nuevo cajero
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		
		//Probar el metodo consultar
		System.out.println(angelopolis.consultar(1001));
		
		
		//Probar el metodo retirar exitoso
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));
		
		//Quiero retirar dinero de una cuenta que no existe
		System.out.println(angelopolis.retirar(1004, 1000));
		
		//Porbar el metodo depositar exitoso
		System.out.println(angelopolis.depositar(1001, 5000));
		
		System.out.println(angelopolis.depositar(1003, 10000));
		System.out.println(angelopolis.depositar(1003, 100)); 
		
		

	}

}
