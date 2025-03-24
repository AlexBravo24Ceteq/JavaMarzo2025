package COM;

		public class Principal {

		    public static void main(String[] args) {

		        // Composición del Samsung S24 Ultra
		        Pantalla samsung = new Pantalla("6,8 Pulgadas", "Quad HD", "AMOLED LTPO", "Gorilla Glass Armor");
		        Conectividad conexion = new Conectividad("5G, LTE, 3G", "Bluetooth 5.3", "WiFi 7", "2 nano SIM y eSIM", "USB Tipo C 3.2");
		        Camaras modulo = new Camaras("Lente Principal de 200MP, F/1.7 OIS", "Cámara Telefoto de 50 MP, F/3.4 OIS, ZOOM X5", 
		                                      "Cámara Gran Angular de 10 MP F/2.4 OIS ZOOM X3", "Teleobjetivo con hasta x100 ZOOM DIGITAL", 
		                                      "Cámara Frontal de 12MP, F/2.2");

		        // Evitar hardcoding de precios
		        String precioMXN = "$19,499 Pesos Mexicanos";
		        String precioEUR = "€1,099 Euros";
		        String precioUSD1 = "1,100 USD";
		        String precioUSD2 = "1,050 USD";

		        Precios costo = new Precios(precioMXN, precioEUR, precioUSD1, precioUSD2);

		        S24Ultra S24U = new S24Ultra("SAMSUNG S24 ULTRA", "Samsung", "5000 mAh", samsung, conexion, modulo, costo);

		        System.out.println(S24U);
		    }
		
		
	}

		
		//package COM;
		//
		//public class Principal {
		//
//			public static void main(String[] args) {
//				
//				//Composicion del Samsung S24 ultra
		//
//				Pantalla samsung = new Pantalla("6,8 Pulgadas", "Quad HD","AMOLED LTPO", "Gorilla Glass Armor",1-120);
//				Conectividad conexion = new Conectividad("5G, LTE, 3G", "Bluethooth 5.3","Wifi 7","2 nano Sim y Esim", "USB tipo C 3.2");
//				Camaras modulo = new Camaras("Lente Principal de 200MP, F/1.7 OIS","Camara Telefoto de 50 MP, F/3.4 OIS,ZOOM X5", "Camara Gran Angular de 10 MP F/2.4 OIS ZOOM X3","Con un Teleobjetivo de hasta x100 en ZOOM DIGITAL", "Camara Frontal de 12MP, F2.2");
//				Precios costo = new Precios("$19,499 Pesos Mexicanos", "€1,099 Euros","1,100 USD","1,050 USD");
//				
//				S24Ultra S24U = new S24Ultra("SAMSUNG S24 ULTRA", "Samsung","5000 Mah", samsung, conexion, modulo, costo);
//				
//				System.out.println(S24U);
				