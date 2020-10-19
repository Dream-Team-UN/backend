<<<<<<< HEAD
package com.example.dataAccess.entity;
=======
package com.example.dataAccess.models.entity;
>>>>>>> database

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




<<<<<<< HEAD
=======

>>>>>>> database
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
<<<<<<< HEAD
	

	
	@Column
	private String latitud;
	
	@Column
	private String longitud;
=======

	@Column
	private Float latitud;
	
	@Column
	private Float longitud;
>>>>>>> database
	
	 @JoinColumn(name = "fk_departamento", nullable = false)
	    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    private Departamento dpto;
<<<<<<< HEAD
=======
	 
	 

	public Municipio(Long id, String name, Float latitud, Float longitud, Departamento dpto) {
		super();
		this.id = id;
		this.name = name;
		this.latitud = latitud;
		this.longitud = longitud;
		this.dpto = dpto;
	}
>>>>>>> database

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

<<<<<<< HEAD


	public String getCoordenadax() {
		return latitud;
	}

	public void setCoordenadax(String coordenadax) {
		this.latitud = coordenadax;
	}

	public String getCoordenaday() {
		return longitud;
	}

	public void setCoordenaday(String coordenaday) {
		this.longitud = coordenaday;
=======
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
>>>>>>> database
	}

	public Departamento getDpto() {
		return dpto;
	}

	public void setDpto(Departamento dpto) {
		this.dpto = dpto;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Municipio [id=" + id + ", name=" + name + ", coordenadax=" + latitud + ", coordenaday="
				+ longitud + ", dpto=" + dpto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((latitud == null) ? 0 : latitud.hashCode());
		result = prime * result + ((longitud == null) ? 0 : longitud.hashCode());
		result = prime * result + ((dpto == null) ? 0 : dpto.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Municipio other = (Municipio) obj;
		if (latitud == null) {
			if (other.latitud != null)
				return false;
		} else if (!latitud.equals(other.latitud))
			return false;
		if (longitud == null) {
			if (other.longitud != null)
				return false;
		} else if (!longitud.equals(other.longitud))
			return false;
		if (dpto == null) {
			if (other.dpto != null)
				return false;
		} else if (!dpto.equals(other.dpto))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	


	

	
	
=======
		return "Municipio [id=" + id + ", name=" + name + ", latitud=" + latitud + ", longitud=" + longitud + ", dpto=" + dpto + "]";
	}
 
>>>>>>> database
	
	
}