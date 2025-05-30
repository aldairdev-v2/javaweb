package com.practica.app.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Alumno1 {
	
	@GetMapping(value="alumno1")
	public String datos() {
		return "Nombre: Laura<br> Carrera: Info. administrativa<br> Matricula:58796412<br> Cuatri: 7mo";
	}

}
