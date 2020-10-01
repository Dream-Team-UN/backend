package com.example.dataAccess.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Case {
	
	@Id
	private int id;
	@Column(name = "Estado")
	private String state;
	@Column(name = "Fecha")
	private Date date;
	@Column(name = "Pais de procedencia")
	private String country;
	
	
	public Case(int id, String state, Date date, String country) {
		super();
		this.id = id;
		this.state = state;
		this.date = date;
		this.country = country;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Case [id=" + id + ", state=" + state + ", date=" + date + ", country=" + country + "]";
	}
	
}
