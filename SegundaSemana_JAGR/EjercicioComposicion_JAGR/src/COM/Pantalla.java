package COM;

public class Pantalla {

	//Aqui se agregaran los datos de la pantalla
	
	private String tama�o;
	private String resolucion;
	private String panel;
	private String proteccion;
	
	public Pantalla () {}

	public Pantalla(String tama�o, String resolucion, String panel, String proteccion) {
		super();
		this.tama�o = tama�o;
		this.resolucion = resolucion;
		this.panel = panel;
		this.proteccion = proteccion;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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
		return "Pantalla [tama�o=" + tama�o + ", resolucion=" + resolucion + ", panel=" + panel + ", proteccion="
				+ proteccion + "]";
	}
	
	
	
}
