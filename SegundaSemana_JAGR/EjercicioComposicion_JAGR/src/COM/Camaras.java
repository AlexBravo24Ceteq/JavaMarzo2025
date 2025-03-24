package COM;

public class Camaras {

	private String camaraPrincipal;
	private String camaraTelefoto;
	private String camaraGranAngular;
	private String Zoom;
	private String CamaraFrontal;
	
	public Camaras () {}

	public Camaras(String camaraPrincipal, String camaraTelefoto, String camaraGranAngular, String zoom,
			String camaraFrontal) {
		super();
		this.camaraPrincipal = camaraPrincipal;
		this.camaraTelefoto = camaraTelefoto;
		this.camaraGranAngular = camaraGranAngular;
		Zoom = zoom;
		CamaraFrontal = camaraFrontal;
	}

	public String getCamaraPrincipal() {
		return camaraPrincipal;
	}

	public void setCamaraPrincipal(String camaraPrincipal) {
		this.camaraPrincipal = camaraPrincipal;
	}

	public String getCamaraTelefoto() {
		return camaraTelefoto;
	}

	public void setCamaraTelefoto(String camaraTelefoto) {
		this.camaraTelefoto = camaraTelefoto;
	}

	public String getCamaraGranAngular() {
		return camaraGranAngular;
	}

	public void setCamaraGranAngular(String camaraGranAngular) {
		this.camaraGranAngular = camaraGranAngular;
	}

	public String getZoom() {
		return Zoom;
	}

	public void setZoom(String zoom) {
		Zoom = zoom;
	}

	public String getCamaraFrontal() {
		return CamaraFrontal;
	}

	public void setCamaraFrontal(String camaraFrontal) {
		CamaraFrontal = camaraFrontal;
	}

	@Override
	public String toString() {
		return "Camaras [camaraPrincipal=" + camaraPrincipal + ", camaraTelefoto=" + camaraTelefoto
				+ ", camaraGranAngular=" + camaraGranAngular + ", Zoom=" + Zoom + ", CamaraFrontal=" + CamaraFrontal
				+ "]";
	}
	
	
}
