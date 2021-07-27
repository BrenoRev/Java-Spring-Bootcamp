package com.brenodev.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brenodev.bootcamp.model.JornadaTrabalho;
import com.brenodev.bootcamp.service.jornadaTrabalhoService;

@RestController
@RequestMapping("/jornada")
public class jornadaTrabalhoController {

	@Autowired
	jornadaTrabalhoService jornadaService;
	
	@PostMapping
	public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
		return jornadaService.saveJornada(jornadaTrabalho);
	}
}
