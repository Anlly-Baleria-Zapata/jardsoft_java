package com.jardsoftware.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "depreciacion")
public class depreciacion {

	@Id
	@Column(name = "id_equipo")
	private int id_equipo; // Identificador único del equipo
	@Column(name = "Costo_computador")
	private String Costo_computador; // Costo del computador
	@Column(name = "Valor_de_rescate")
	private String Valor_de_rescate; // Valor de rescate del computador
	@Column(name = "total_de_unidades_estimadas_durante_la_vida_útil_del_computador")
	private String total_de_unidades_estimadas_durante_la_vida_útil_del_computador; // Total de unidades estimadas durante la vida útil del computador
	
	public depreciacion( ) {
		
	}

	public depreciacion(String costo_computador, String valor_de_rescate,
			String total_de_unidades_estimadas_durante_la_vida_útil_del_computador) {
		super();
		Costo_computador = costo_computador;
		Valor_de_rescate = valor_de_rescate;
		this.total_de_unidades_estimadas_durante_la_vida_útil_del_computador = total_de_unidades_estimadas_durante_la_vida_útil_del_computador;
	}

	public int getId_equipo() {
		return id_equipo;
	}

	public void setId_equipo(int id_equipo) {
		this.id_equipo = id_equipo;
	}

	public String getCosto_computador() {
		return Costo_computador;
	}

	public void setCosto_computador(String costo_computador) {
		Costo_computador = costo_computador;
	}

	public String getValor_de_rescate() {
		return Valor_de_rescate;
	}

	public void setValor_de_rescate(String valor_de_rescate) {
		Valor_de_rescate = valor_de_rescate;
	}

	public String getTotal_de_unidades_estimadas_durante_la_vida_útil_del_computador() {
		return total_de_unidades_estimadas_durante_la_vida_útil_del_computador;
	}

	public void setTotal_de_unidades_estimadas_durante_la_vida_útil_del_computador(
			String total_de_unidades_estimadas_durante_la_vida_útil_del_computador) {
		this.total_de_unidades_estimadas_durante_la_vida_útil_del_computador = total_de_unidades_estimadas_durante_la_vida_útil_del_computador;
	}

	@Override
	public String toString() {
		return "depreciacion [id_equipo=" + id_equipo + ", Costo_computador=" + Costo_computador + ", Valor_de_rescate="
				+ Valor_de_rescate + ", total_de_unidades_estimadas_durante_la_vida_útil_del_computador="
				+ total_de_unidades_estimadas_durante_la_vida_útil_del_computador + "]";
	}
	
	
}
