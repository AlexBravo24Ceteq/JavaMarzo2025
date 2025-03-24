package ejercicioHerencia;

public class Reptil extends Animal{
	
	private String alimentacion;
	private String habitad;
	private String longevidad;
	private String motricidad;
	private String tama�o;

	public Reptil() {
		
	}

	public Reptil(String nombreComun, String especie, String localidad, String alimentacion, String habitad,
			String longevidad, String motricidad, String tama�o) {
		super(nombreComun, especie, localidad);
		this.alimentacion = alimentacion;
		this.habitad = habitad;
		this.longevidad = longevidad;
		this.motricidad = motricidad;
		this.tama�o = tama�o;
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

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Reptil [alimentacion=" + alimentacion + ", habitad=" + habitad + ", longevidad=" + longevidad
				+ ", motricidad=" + motricidad + ", tama�o=" + tama�o + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
