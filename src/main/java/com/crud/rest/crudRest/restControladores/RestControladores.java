package com.crud.rest.crudRest.restControladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crud.rest.crudRest.persistencia.entidades.Empleado;
import com.crud.rest.crudRest.servicios.UserService;

@RestController
@RequestMapping("/api")
public class RestControladores {
	
	@Autowired
	UserService service;
	
	@GetMapping("/")
	public Iterable<Empleado> obtenerTodosLosEmpleados() {
		
		return service.listarEmpleados();
	}
	
	@GetMapping("/empleado/{id}")
	public Empleado obtenerEmpleadoPorId(@PathVariable Long id) {
		
		return service.obtenerEmpleadoPorId(id);
	}
	
	@PostMapping("/empleado")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleado crearEmpleado(@RequestBody Empleado empleado) {
		
		return service.altaEmpleado(empleado);
	}
	
	@PutMapping("/empleado/{id}")
	public Empleado modificarEmpleado(@PathVariable Long id, @RequestBody Empleado empleado) {
		
		empleado.setId(id);
		return service.editarEmpleado(empleado);
	}
	
	@DeleteMapping("/empleado/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrarEmpleado(@PathVariable Long id) {
		
		service.bajaEmpleado(id);
	}
}
