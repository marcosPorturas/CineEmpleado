package com.cine.web.empleado.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cine.web.empleado.core.dto.request.EmpleadoRequest;
import com.cine.web.empleado.core.dto.response.EmpleadoResponse;
import com.cine.web.empleado.core.service.EmpleadoService;

@RestController
@RequestMapping("/api/v1/empleados")
public class EmpleadoController {
	
	@Autowired
	EmpleadoService empleadoService;
	
	
	@GetMapping
	public List<EmpleadoResponse> getAllEmpleados(){
		return empleadoService.allEmpleados();
	}

	@GetMapping("/{idempleado}")
	public EmpleadoResponse getEmpleado(@PathVariable("idempleado")Integer idempleado){
		return empleadoService.findEmpleado(idempleado);
	}

	@PostMapping("/add")
	public void addEmplado(@RequestBody EmpleadoRequest empleadoRequest) {
		empleadoService.addEmpleado(empleadoRequest);
	}
	
	@PutMapping("/update")
	public void updateEmplado(@RequestBody EmpleadoRequest empleadoRequest) {
		empleadoService.addEmpleado(empleadoRequest);
	}
	
	@DeleteMapping("/{idempleado}")
	public void deleteEmplado(@PathVariable("idempleado")Integer idempleado) {
		empleadoService.deleteEmpleado(idempleado);
	}
}
