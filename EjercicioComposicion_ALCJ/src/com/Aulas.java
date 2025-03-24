package com;

public class Aulas {
	private String aulaA;
	private String aulaB;
	private String aulaC;
	
	public Aulas () {}

	public Aulas(String aulaA, String aulaB, String aulaC) {
		super();
		this.aulaA = aulaA;
		this.aulaB = aulaB;
		this.aulaC = aulaC;
	}

	public String getAulaA() {
		return aulaA;
	}

	public void setAulaA(String aulaA) {
		this.aulaA = aulaA;
	}

	public String getAulaB() {
		return aulaB;
	}

	public void setAulaB(String aulaB) {
		this.aulaB = aulaB;
	}

	public String getAulaC() {
		return aulaC;
	}

	public void setAulaC(String aulaC) {
		this.aulaC = aulaC;
	}

	@Override
	public String toString() {
		return "Aulas [aulaA=" + aulaA + ", aulaB=" + aulaB + ", aulaC=" + aulaC + "]";
	}

}
