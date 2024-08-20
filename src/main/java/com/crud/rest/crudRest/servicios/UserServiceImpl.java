package com.crud.rest.crudRest.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.rest.crudRest.persistencia.entidades.Empleado;
import com.crud.rest.crudRest.persistencia.repos.EmpleadoRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	EmpleadoRepository empleadoRepo;

	@Override
	public Iterable<Empleado> listarEmpleados() {
		return empleadoRepo.findAll();
	}
	
	@Override
	public Empleado obtenerEmpleadoPorId(Long id) {
		return empleadoRepo.findById(id).orElse(null);
	}
	
	@Override
	public Empleado altaEmpleado(Empleado empleado) {
		empleado.setId(null);
		return empleadoRepo.save(empleado);
	}
	
	@Override
	public Empleado editarEmpleado(Empleado empleado) {
		
		if (empleado.getId() == null) {
			throw new UserServiceException("No se puede editar un empleado que no tiene id");
		}
		return empleadoRepo.save(empleado);
	}

	@Override
	public void bajaEmpleado(Long id) {
		
		empleadoRepo.deleteById(id);
	}
}
