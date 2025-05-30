package com.practica.app.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Alumno5 {
	
	@GetMapping(value="alumno5")
	public String datos() {
		return "Nombre: Moises<br> Carrera: Info. administrativa<br> Matricula:58946321<br> Cuatri: 6to";
	}

}