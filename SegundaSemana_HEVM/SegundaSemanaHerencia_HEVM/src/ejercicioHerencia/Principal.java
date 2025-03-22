package ejercicioHerencia;

public class Principal {

	public static void main(String[] args) {

		Animal cocodriloNilo = new Animal("Cocodrilo del Nilo", "Crocodylus niloticus", "África y Madagascar");
		Reptil geckoColaGorda = new Reptil("Gecko de cola gorda", "Hemitheconix caudicinctus", "África Occidental", "Insectivoro",
				"Semi desértico", "8 a 12 años", "Cuadrupedo trepador", "25 cm");
	
		System.out.println(cocodriloNilo);
		System.out.println(geckoColaGorda);
	}

	
	
}

