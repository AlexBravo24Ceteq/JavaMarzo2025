package ejercicioHerencia;

public class Animal {
	
	private String nombreComun;
	private String especie;
	private String localidad;
	
	public Animal(){
		
	}

	public Animal(String nombreComun, String especie, String localidad) {
		super();
		this.nombreComun = nombreComun;
		this.especie = especie;
		this.localidad = localidad;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Animal [nombreComun=" + nombreComun + ", especie=" + especie + ", localidad=" + localidad + "]";
	}
	
	

}
