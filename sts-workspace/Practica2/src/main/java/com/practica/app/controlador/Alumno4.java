package com.practica.app.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Alumno4 {
	
	@GetMapping(value="alumno4")
	public String datos() {
		return "Nombre: Aldair<br> Carrera: Info. administrativa<br> Matricula:58642791<br> Cuatri: 3ro";
	}

}