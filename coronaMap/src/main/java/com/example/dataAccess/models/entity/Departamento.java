package com.example.dataAccess.models.entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -17625470174297395L;

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
	
	

	public Departamento(Long id, String name, Float latitud, Float longitud) {
		super();
		this.id = id;
		this.name = name;
		this.latitud = latitud;
		this.longitud = longitud;
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

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", name=" + name + ", latitud=" + latitud + ", longitud=" + longitud
				+ "]";
	}
	
}