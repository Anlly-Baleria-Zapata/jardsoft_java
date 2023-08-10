package com.jardsoftware.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dpto_infraestructura_ti")

	public class dpto_infraestructura_ti {
		
	
		@Id
		@Column(name = "id")
		private int id; // Identificador único del departamento de infraestructura de TI
		@Column(name = "nit_empresa")
		private String nit_empresa; // NIT de la empresa asociada al departamento de infraestructura de TI
		
		public dpto_infraestructura_ti() {
			
		}

		public dpto_infraestructura_ti(String nit_empresa) {
			super();
			this.nit_empresa = nit_empresa;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNit_empresa() {
			return nit_empresa;
		}

		public void setNit_empresa(String nit_empresa) {
			this.nit_empresa = nit_empresa;
		}

		@Override
		public String toString() {
			return "dpto_infraestructura_ti [id=" + id + ", nit_empresa=" + nit_empresa + "]";
		}
		
		
		
	}























