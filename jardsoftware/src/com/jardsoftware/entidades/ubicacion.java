package com.jardsoftware.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ubicacion")
public class ubicacion {
	
	@Id
	@Column(name = "num_hoja_de_vida_equipo")
	private int num_hoja_de_vida_equipo; // Número de la hoja de vida del equipo
	@Column(name = "id_equipo")
	private String id_equipo; // Identificador del equipo
	@Column(name = "ubicacion")
	private String ubicacion; // Ubicación actual del equipo
	
	public ubicacion() {
		
	}

	public ubicacion(String id_equipo, String ubicacion) {
		super();
		this.id_equipo = id_equipo;
		this.ubicacion = ubicacion;
	}

	public int getNum_hoja_de_vida_equipo() {
		return num_hoja_de_vida_equipo;
	}

	public void setNum_hoja_de_vida_equipo(int num_hoja_de_vida_equipo) {
		this.num_hoja_de_vida_equipo = num_hoja_de_vida_equipo;
	}

	public String getId_equipo() {
		return id_equipo;
	}

	public void setId_equipo(String id_equipo) {
		this.id_equipo = id_equipo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "ubicacion [num_hoja_de_vida_equipo=" + num_hoja_de_vida_equipo + ", id_equipo=" + id_equipo
				+ ", ubicacion=" + ubicacion + "]";
	}
	
	
}
