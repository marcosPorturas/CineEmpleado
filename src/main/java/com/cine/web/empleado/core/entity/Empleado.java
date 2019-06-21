package com.cine.web.empleado.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Empleado {

	@Id
	private Integer idEmp;
	private String nombres;
	private String empPat;
	private String empMat;
	private String usuario;
	private String contraseña;
	
	@ManyToOne
	@JoinColumn(name = "tipo_emp")
	private TipoEmpleado tipoEmp;
	
	public Integer getIdEmp() {
		return idEmp;
	}
	public void setIdEmp(Integer idEmp) {
		this.idEmp = idEmp;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getEmpPat() {
		return empPat;
	}
	public void setEmpPat(String empPat) {
		this.empPat = empPat;
	}
	public String getEmpMat() {
		return empMat;
	}
	public void setEmpMat(String empMat) {
		this.empMat = empMat;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public TipoEmpleado getTipoEmp() {
		return tipoEmp;
	}
	public void setTipoEmp(TipoEmpleado tipoEmp) {
		this.tipoEmp = tipoEmp;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	
}
