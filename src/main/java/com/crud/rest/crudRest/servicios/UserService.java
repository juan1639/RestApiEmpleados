package com.crud.rest.crudRest.servicios;

import com.crud.rest.crudRest.persistencia.entidades.Empleado;

public interface UserService {
	
	Iterable<Empleado> listarEmpleados();
	Empleado obtenerEmpleadoPorId(Long id);
	
	Empleado altaEmpleado(Empleado empleado);
	Empleado editarEmpleado(Empleado empleado);
	void bajaEmpleado(Long id);
}
