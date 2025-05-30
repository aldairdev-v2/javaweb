package com.practica.app.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Alumno3 {
	
	@GetMapping(value="alumno3")
	public String datos() {
		return "Nombre: Noemi<br> Carrera: Ing. Civil<br> Matricula:58964721<br> Cuatri: 8vo";
	}

}