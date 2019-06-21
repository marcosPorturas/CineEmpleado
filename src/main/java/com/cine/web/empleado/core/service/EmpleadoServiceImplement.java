package com.cine.web.empleado.core.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cine.web.empleado.core.dto.request.EmpleadoRequest;
import com.cine.web.empleado.core.dto.response.EmpleadoResponse;
import com.cine.web.empleado.core.entity.Empleado;
import com.cine.web.empleado.core.entity.TipoEmpleado;
import com.cine.web.empleado.core.respository.EmpleadoRepository;

@Service
public class EmpleadoServiceImplement implements EmpleadoService{

	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Override
	public List<EmpleadoResponse> allEmpleados() {
		// TODO Auto-generated method stub
		List<EmpleadoResponse> lstEmpleadoResponse = new ArrayList<>();
		for(Empleado empleado: empleadoRepository.findAll()) {
			EmpleadoResponse empResp = new EmpleadoResponse();
			empResp.setIdEmp(empleado.getIdEmp());
			empResp.setNombres(empleado.getNombres());
			empResp.setEmpPat(empleado.getEmpPat());
			empResp.setEmpMat(empleado.getEmpMat());
			empResp.setUsuario(empleado.getUsuario());
			empResp.setContraseña(empleado.getContraseña());
			empResp.setTipoEmpleado(empleado.getTipoEmp().getNomTipoEmp());
			lstEmpleadoResponse.add(empResp);
		}
		
		return lstEmpleadoResponse;
	}

	@Override
	public Empleado addEmpleado(EmpleadoRequest empleadoReq) {
		// TODO Auto-generated method stub
		Empleado empleado = new Empleado();
		if(empleadoReq.getIdEmp() == null) {
			empleado.setIdEmp(generarCodigoEmpleado());
		}else {
			empleado.setIdEmp(empleadoReq.getIdEmp());
		}
		
		empleado.setNombres(empleadoReq.getNombres());
		empleado.setEmpPat(empleadoReq.getEmpPat());
		empleado.setEmpMat(empleadoReq.getEmpMat());
		empleado.setUsuario(empleadoReq.getUsuario());
		empleado.setContraseña(empleadoReq.getContraseña());
		TipoEmpleado tipoEmp = new TipoEmpleado();
		tipoEmp.setTipoEmp(empleadoReq.getTipoEmpleado());		
		empleado.setTipoEmp(tipoEmp);
		return empleadoRepository.save(empleado);
	}

	@Override
	public void deleteEmpleado(Integer idEmpleado) {
		// TODO Auto-generated method stub
		empleadoRepository.deleteById(idEmpleado);
		
	}

	@Override
	public EmpleadoResponse findEmpleado(Integer idEmpleado) {
		// TODO Auto-generated method stub
		Empleado empleado = empleadoRepository.findById(idEmpleado).get();
		EmpleadoResponse empResp = new EmpleadoResponse();
		empResp.setIdEmp(empleado.getIdEmp());
		empResp.setNombres(empleado.getNombres());
		empResp.setEmpPat(empleado.getEmpPat());
		empResp.setEmpMat(empleado.getEmpMat());
		empResp.setUsuario(empleado.getUsuario());
		empResp.setContraseña(empleado.getContraseña());
		empResp.setTipoEmpleado(empleado.getTipoEmp().getNomTipoEmp());
		return empResp;
	}

	public Integer generarCodigoEmpleado() {
		  Integer idempleado;
		  idempleado=empleadoRepository.getLastIdEmp();
	      if(idempleado==null)idempleado=10000;
	      return idempleado+1;
	} 
	
}
