package COM;

public class Precios {
   
	//Aqui se hara el tipo de conversiones a precio que llegara a cada pais 
	
	private String peso;
	private String euro;
	private String dolar;
	private String samsungstore;
	
	public Precios () {}

	public Precios(String peso, String euro, String dolar, String samsungstore) {
		super();
		this.peso = peso;
		this.euro = euro;
		this.dolar = dolar;
		this.samsungstore = samsungstore;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getEuro() {
		return euro;
	}

	public void setEuro(String euro) {
		this.euro = euro;
	}

	public String getDolar() {
		return dolar;
	}

	public void setDolar(String dolar) {
		this.dolar = dolar;
	}

	public String getSamsungstore() {
		return samsungstore;
	}

	public void setSamsungstore(String samsungstore) {
		this.samsungstore = samsungstore;
	}

	@Override
	public String toString() {
		return "Precios [peso=" + peso + ", euro=" + euro + ", dolar=" + dolar + ", samsungstore=" + samsungstore + "]";
	}
	
	
}
