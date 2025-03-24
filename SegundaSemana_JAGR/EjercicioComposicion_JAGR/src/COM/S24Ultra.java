package COM;


//@allargsconstructordata remplazaria la linea 19 hasta la 29 y sigue funcionando igual
//@Noargsconstructor va a remplazar la linea 17
//@Data remplaza todos los getters y setters, la anotacion @getter solo remplaza getters y el 
//@setters remplaza los setter 
//La anotacion @ToString lo remplaza de una forma corta. de la linea 92 a la 96.
//La forma larga de @ToString(onlyExplicitlyIncluded = true)

public class S24Ultra {

	
	private String modelo;
	private String marca;
	private String bateria;
	private Pantalla pantalla;
	private Conectividad conexiones;
	private Camaras moduloDeCamaras;
	private Precios costo;
	
	public S24Ultra ()  {}

	public S24Ultra(String modelo, String marca, String bateria, Pantalla pantalla, Conectividad conexiones,
			Camaras moduloDeCamaras, Precios costo) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.bateria = bateria;
		this.pantalla = pantalla;
		this.conexiones = conexiones;
		this.moduloDeCamaras = moduloDeCamaras;
		this.costo = costo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getBateria() {
		return bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Conectividad getConexiones() {
		return conexiones;
	}

	public void setConexiones(Conectividad conexiones) {
		this.conexiones = conexiones;
	}

	public Camaras getModuloDeCamaras() {
		return moduloDeCamaras;
	}

	public void setModuloDeCamaras(Camaras moduloDeCamaras) {
		this.moduloDeCamaras = moduloDeCamaras;
	}

	public Precios getCosto() {
		return costo;
	}

	public void setCosto(Precios costo) {
		this.costo = costo;
	}

	
	@Override
	public String toString() {
		return "S24Ultra [modelo=" + modelo + ", marca=" + marca + ", bateria=" + bateria + ",\n pantalla=" + pantalla
				+ ",\n conexiones=" + conexiones + ",\n moduloDeCamaras=" + moduloDeCamaras + ",\n costo=" + costo + "]";
	}  
	
	
	

}
