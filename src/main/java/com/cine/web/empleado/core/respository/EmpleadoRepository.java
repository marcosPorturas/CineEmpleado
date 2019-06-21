package com.cine.web.empleado.core.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cine.web.empleado.core.entity.Empleado;


public interface EmpleadoRepository extends JpaRepository<Empleado,Integer>{

	
	@Query("Select MAX(e.idEmp) from Empleado e")
	Integer getLastIdEmp();
	
}
