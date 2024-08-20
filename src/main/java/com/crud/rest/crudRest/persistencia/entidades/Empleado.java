package com.crud.rest.crudRest.persistencia.entidades;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "empleados")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotBlank
	@Size(max = 30)
	private String nombre;
	
	@NotNull
	@NotBlank
	@Size(max = 99)
	private String apellidos;
	
	@NotNull
	@NotBlank
	private String nif;
	
	@NotNull
	@Min(0)
	private BigDecimal sueldoMensual;
	
	@NotNull
	@NotBlank
	private String nss;
}
