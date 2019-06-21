package com.cine.web.empleado.core.service;

import java.util.List;

import com.cine.web.empleado.core.dto.request.EmpleadoRequest;
import com.cine.web.empleado.core.dto.response.EmpleadoResponse;
import com.cine.web.empleado.core.entity.Empleado;


public interface EmpleadoService {

	List<EmpleadoResponse> allEmpleados();
	Empleado addEmpleado(EmpleadoRequest empleadoReq);
	void deleteEmpleado(Integer idEmpleado);
	EmpleadoResponse findEmpleado(Integer idEmpleado);
	
}
