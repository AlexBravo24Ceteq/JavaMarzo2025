package ejercicioHerencia;

public class Principal {

	public static void main(String[] args) {

		Animal cocodriloNilo = new Animal("Cocodrilo del Nilo", "Crocodylus niloticus", "�frica y Madagascar");
		Reptil geckoColaGorda = new Reptil("Gecko de cola gorda", "Hemitheconix caudicinctus", "�frica Occidental", "Insectivoro",
				"Semi des�rtico", "8 a 12 a�os", "Cuadrupedo trepador", "25 cm");
	
		System.out.println(cocodriloNilo);
		System.out.println(geckoColaGorda);
	}

	
	
}

