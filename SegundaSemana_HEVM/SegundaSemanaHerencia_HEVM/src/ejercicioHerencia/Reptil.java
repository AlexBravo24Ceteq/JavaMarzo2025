package ejercicioHerencia;

public class Reptil extends Animal{
	
	private String alimentacion;
	private String habitad;
	private String longevidad;
	private String motricidad;
	private String tamaño;

	public Reptil() {
		
	}

	public Reptil(String nombreComun, String especie, String localidad, String alimentacion, String habitad,
			String longevidad, String motricidad, String tamaño) {
		super(nombreComun, especie, localidad);
		this.alimentacion = alimentacion;
		this.habitad = habitad;
		this.longevidad = longevidad;
		this.motricidad = motricidad;
		this.tamaño = tamaño;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public String getHabitad() {
		return habitad;
	}

	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}

	public String getLongevidad() {
		return longevidad;
	}

	public void setLongevidad(String longevidad) {
		this.longevidad = longevidad;
	}

	public String getMotricidad() {
		return motricidad;
	}

	public void setMotricidad(String motricidad) {
		this.motricidad = motricidad;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Reptil [alimentacion=" + alimentacion + ", habitad=" + habitad + ", longevidad=" + longevidad
				+ ", motricidad=" + motricidad + ", tamaño=" + tamaño + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
