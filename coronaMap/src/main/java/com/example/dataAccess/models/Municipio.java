package com.example.dataAccess.models;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MUNICIPIO")
public class Municipio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6801712309370803481L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String name;

	@Column
	private String latitud;

	@Column
	private String longitud;

	@JoinColumn(name = "fk_departamento", nullable = false)
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Departamento dpto;
	
	@Column
	private float zoom;
	
	public Municipio() {
		
	}

	

	public Municipio(Long id, String name, String latitud, String longitud, Departamento dpto, float zoom) {
		super();
		this.id = id;
		this.name = name;
		this.latitud = latitud;
		this.longitud = longitud;
		this.dpto = dpto;
		this.zoom = zoom;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public Departamento getDpto() {
		return dpto;
	}

	public void setDpto(Departamento dpto) {
		this.dpto = dpto;
	}
	
	

	public float getZoom() {
		return zoom;
	}



	public void setZoom(float zoom) {
		this.zoom = zoom;
	}



	@Override
	public String toString() {
		return "Municipio [id=" + id + ", name=" + name + ", latitud=" + latitud + ", longitud=" + longitud + ", dpto="
				+ dpto + ", zoom=" + zoom + "]";
	}
	
	
	

}