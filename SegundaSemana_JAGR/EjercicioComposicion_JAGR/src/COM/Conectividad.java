package COM;

public class Conectividad {

	//Aqui se conectaran los datos de la conectividad
	
	private String conectividad;
	private String bluethooth;
	private String wifi;
	private String sim;
	private String conector;
	
	
	public Conectividad () {}


	public Conectividad(String conectividad, String bluethooth, String wifi, String sim, String conector) {
		super();
		this.conectividad = conectividad;
		this.bluethooth = bluethooth;
		this.wifi = wifi;
		this.sim = sim;
		this.conector = conector;
	}


	public String getConectividad() {
		return conectividad;
	}


	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}


	public String getBluethooth() {
		return bluethooth;
	}


	public void setBluethooth(String bluethooth) {
		this.bluethooth = bluethooth;
	}


	public String getWifi() {
		return wifi;
	}


	public void setWifi(String wifi) {
		this.wifi = wifi;
	}


	public String getSim() {
		return sim;
	}


	public void setSim(String sim) {
		this.sim = sim;
	}


	public String getConector() {
		return conector;
	}


	public void setConector(String conector) {
		this.conector = conector;
	}


	@Override
	public String toString() {
		return "Conectividad [conectividad=" + conectividad + ", bluethooth=" + bluethooth + ", wifi=" + wifi + ", sim="
				+ sim + ", conector=" + conector + "]";
	}
	
	
}
