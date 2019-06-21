package com.cine.web.empleado.core.dto.request;

public class EmpleadoRequest {

	
	private Integer idEmp;
	private String nombres;
	private String empPat;
	private String empMat;
	private String usuario;
	private String contraseña;
	private Integer tipoEmpleado;
	
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
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public Integer getTipoEmpleado() {
		return tipoEmpleado;
	}
	public void setTipoEmpleado(Integer tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}
	
}
