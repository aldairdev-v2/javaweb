package com.practica.app.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Alumno2 {
	
	@GetMapping(value="alumno2")
	public String datos() {
		return "Nombre: Cristiano Ronaldo<br> Carrera: Ing. Sistemas<br> Matricula:58741239<br> Cuatri: 9no";
	}

}
