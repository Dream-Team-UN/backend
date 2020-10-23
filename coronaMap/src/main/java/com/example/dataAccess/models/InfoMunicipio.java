package com.example.dataAccess.models;

public class InfoMunicipio {
	private int id;
	private String CasosAct;
	private String CasosTol;
	private String CasosRec;
	private String CasosFal;
	private String CasosAsin;
	
	public InfoMunicipio(int id, String casosAct, String casosTol, String casosRec, String casosFal, String casosAsin) {
		super();
		this.id = id;
		CasosAct = casosAct;
		CasosTol = casosTol;
		CasosRec = casosRec;
		CasosFal = casosFal;
		CasosAsin = casosAsin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCasosAct() {
		return CasosAct;
	}

	public void setCasosAct(String casosAct) {
		CasosAct = casosAct;
	}

	public String getCasosTol() {
		return CasosTol;
	}

	public void setCasosTol(String casosTol) {
		CasosTol = casosTol;
	}

	public String getCasosRec() {
		return CasosRec;
	}

	public void setCasosRec(String casosRec) {
		CasosRec = casosRec;
	}

	public String getCasosFal() {
		return CasosFal;
	}

	public void setCasosFal(String casosFal) {
		CasosFal = casosFal;
	}

	public String getCasosAsin() {
		return CasosAsin;
	}

	public void setCasosAsin(String casosAsin) {
		CasosAsin = casosAsin;
	}
	
}