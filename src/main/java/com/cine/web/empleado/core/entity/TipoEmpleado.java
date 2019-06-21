package com.cine.web.empleado.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoEmpleado {

	@Id
	private Integer tipoEmp;
	private String nomTipoEmp;
	
	public Integer getTipoEmp() {
		return tipoEmp;
	}
	public void setTipoEmp(Integer tipoEmp) {
		this.tipoEmp = tipoEmp;
	}
	public String getNomTipoEmp() {
		return nomTipoEmp;
	}
	public void setNomTipoEmp(String nomTipoEmp) {
		this.nomTipoEmp = nomTipoEmp;
	}
}
