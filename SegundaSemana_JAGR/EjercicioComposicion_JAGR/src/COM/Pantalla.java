package COM;

public class Pantalla {

	//Aqui se agregaran los datos de la pantalla
	
	private String tamaño;
	private String resolucion;
	private String panel;
	private String proteccion;
	
	public Pantalla () {}

	public Pantalla(String tamaño, String resolucion, String panel, String proteccion) {
		super();
		this.tamaño = tamaño;
		this.resolucion = resolucion;
		this.panel = panel;
		this.proteccion = proteccion;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
	}

	public String getProteccion() {
		return proteccion;
	}

	public void setProteccion(String proteccion) {
		this.proteccion = proteccion;
	}

	@Override
	public String toString() {
		return "Pantalla [tamaño=" + tamaño + ", resolucion=" + resolucion + ", panel=" + panel + ", proteccion="
				+ proteccion + "]";
	}
	
	
	
}
