package com.example.dataAccess.models.entity;

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
	private Float latitud;
	
	@Column
	private Float longitud;
	
	 @JoinColumn(name = "fk_departamento", nullable = false)
	    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    private Departamento dpto;
	 
	 

	public Municipio(Long id, String name, Float latitud, Float longitud, Departamento dpto) {
		super();
		this.id = id;
		this.name = name;
		this.latitud = latitud;
		this.longitud = longitud;
		this.dpto = dpto;
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

	public Float getLatitud() {
		return latitud;
	}

	public void setLatitud(Float latitud) {
		this.latitud = latitud;
	}

	public Float getLongitud() {
		return longitud;
	}

	public void setLongitud(Float longitud) {
		this.longitud = longitud;
	}

	public Departamento getDpto() {
		return dpto;
	}

	public void setDpto(Departamento dpto) {
		this.dpto = dpto;
	}

	@Override
	public String toString() {
		return "Municipio [id=" + id + ", name=" + name + ", latitud=" + latitud + ", longitud=" + longitud + ", dpto=" + dpto + "]";
	}
 
	
	
}