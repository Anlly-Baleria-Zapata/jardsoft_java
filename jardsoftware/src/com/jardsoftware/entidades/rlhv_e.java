package com.jardsoftware.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "rlhv_e")
public class rlhv_e {
	
	
	@Id
	@Column(name = "num_hoja_de_vida_equipo")
	private int num_hoja_de_vida_equipo; // Número de la hoja de vida del equipo
	@Column(name = "id_equipo")
	private String id_equipo; // Identificador del equipo
	@Column(name = "nombre_SO")
	private String nombre_SO; // Nombre del sistema operativo instalado en el equipo
	@Column(name = "nombre_sistema")
	private String nombre_sistema; // Nombre del sistema del equipo
	@Column(name = "modelo_sistema")
	private String modelo_sistema; // Modelo del sistema del equipo
	@Column(name = "precauciones_utilizacion")
	private String precauciones_utilizacion; // Precauciones de utilización del equipo
	@Column(name = "personas_responsables")
	private String personas_responsables; // Personas responsables del equipo
	@Column(name = "observaciones_generales")
	private String observaciones_generales; // Observaciones generales del equipo
	@Column(name = "mantenimiento_asignado")
	private String mantenimiento_asignado; // Mantenimiento asignado al equipo
	@Column(name = "reparacion_asignada")
	private String reparacion_asignada; // Reparación asignada al equipo 
	
	public rlhv_e() {
		
	}

	public rlhv_e(String id_equipo, String nombre_SO, String nombre_sistema, String modelo_sistema,
			String precauciones_utilizacion, String personas_responsables, String observaciones_generales,
			String mantenimiento_asignado, String reparacion_asignada) {
		super();
		this.id_equipo = id_equipo;
		this.nombre_SO = nombre_SO;
		this.nombre_sistema = nombre_sistema;
		this.modelo_sistema = modelo_sistema;
		this.precauciones_utilizacion = precauciones_utilizacion;
		this.personas_responsables = personas_responsables;
		this.observaciones_generales = observaciones_generales;
		this.mantenimiento_asignado = mantenimiento_asignado;
		this.reparacion_asignada = reparacion_asignada;
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

	public String getNombre_SO() {
		return nombre_SO;
	}

	public void setNombre_SO(String nombre_SO) {
		this.nombre_SO = nombre_SO;
	}

	public String getNombre_sistema() {
		return nombre_sistema;
	}

	public void setNombre_sistema(String nombre_sistema) {
		this.nombre_sistema = nombre_sistema;
	}

	public String getModelo_sistema() {
		return modelo_sistema;
	}

	public void setModelo_sistema(String modelo_sistema) {
		this.modelo_sistema = modelo_sistema;
	}

	public String getPrecauciones_utilizacion() {
		return precauciones_utilizacion;
	}

	public void setPrecauciones_utilizacion(String precauciones_utilizacion) {
		this.precauciones_utilizacion = precauciones_utilizacion;
	}

	public String getPersonas_responsables() {
		return personas_responsables;
	}

	public void setPersonas_responsables(String personas_responsables) {
		this.personas_responsables = personas_responsables;
	}

	public String getObservaciones_generales() {
		return observaciones_generales;
	}

	public void setObservaciones_generales(String observaciones_generales) {
		this.observaciones_generales = observaciones_generales;
	}

	public String getMantenimiento_asignado() {
		return mantenimiento_asignado;
	}

	public void setMantenimiento_asignado(String mantenimiento_asignado) {
		this.mantenimiento_asignado = mantenimiento_asignado;
	}

	public String getReparacion_asignada() {
		return reparacion_asignada;
	}

	public void setReparacion_asignada(String reparacion_asignada) {
		this.reparacion_asignada = reparacion_asignada;
	}

	@Override
	public String toString() {
		return "rlhv_e [num_hoja_de_vida_equipo=" + num_hoja_de_vida_equipo + ", id_equipo=" + id_equipo
				+ ", nombre_SO=" + nombre_SO + ", nombre_sistema=" + nombre_sistema + ", modelo_sistema="
				+ modelo_sistema + ", precauciones_utilizacion=" + precauciones_utilizacion + ", personas_responsables="
				+ personas_responsables + ", observaciones_generales=" + observaciones_generales
				+ ", mantenimiento_asignado=" + mantenimiento_asignado + ", reparacion_asignada=" + reparacion_asignada
				+ "]";
	}
	
	
	
}
