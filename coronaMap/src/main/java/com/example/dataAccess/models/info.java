package com.example.dataAccess.models;

public class info {

	private int id;
	private String CasosAct;
	private String CasosTol;
	private String CasosRec;
	private String CasosFal;

	public info(int id, String casosAct, String casosTol, String casosRec, String casosFal) {
		super();
		this.id = id;
		CasosAct = casosAct;
		CasosTol = casosTol;
		CasosRec = casosRec;
		CasosFal = casosFal;
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

}
