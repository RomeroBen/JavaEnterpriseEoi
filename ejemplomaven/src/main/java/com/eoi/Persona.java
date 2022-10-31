package com.eoi;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
	
	// Atributos de la clase (propiedades)
	String nombre;
	String apellido;
	String dni;
	String telefono;
	LocalDate fechaNacimiento;
}