package com.example.dataAccess.models;

public class InfoMunicipio {
	private int id;
	private String casosAct;
	private String casosTol;
	private String casosRec;
	private String casosFal;
	private String casosAsin;

	public InfoMunicipio(int id, String casosAct, String casosTol, String casosRec, String casosFal, String casosAsin) {
		super();
		this.id = id;
		this.casosAct = casosAct;
		this.casosTol = casosTol;
		this.casosRec = casosRec;
		this.casosFal = casosFal;
		this.casosAsin = casosAsin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCasosAct() {
		return casosAct;
	}

	public void setCasosAct(String casosAct) {
		this.casosAct = casosAct;
	}

	public String getCasosTol() {
		return casosTol;
	}

	public void setCasosTol(String casosTol) {
		this.casosTol = casosTol;
	}

	public String getCasosRec() {
		return casosRec;
	}

	public void setCasosRec(String casosRec) {
		this.casosRec = casosRec;
	}

	public String getCasosFal() {
		return casosFal;
	}

	public void setCasosFal(String casosFal) {
		this.casosFal = casosFal;
	}

	public String getCasosAsin() {
		return casosAsin;
	}

	public void setCasosAsin(String casosAsin) {
		this.casosAsin = casosAsin;
	}

}
