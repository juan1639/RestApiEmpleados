package com.crud.rest.crudRest.persistencia.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.crud.rest.crudRest.persistencia.entidades.Empleado;

@RepositoryRestResource(collectionResourceRel = "empleados", path = "empleados")
public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {
	
}
