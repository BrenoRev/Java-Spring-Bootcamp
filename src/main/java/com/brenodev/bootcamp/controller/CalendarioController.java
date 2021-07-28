package com.brenodev.bootcamp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brenodev.bootcamp.model.Calendario;
import com.brenodev.bootcamp.service.CalendarioService;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {

	@Autowired
	CalendarioService calendarioService;
	
	@PostMapping
	public Calendario createCalendario(@RequestBody Calendario calendario) {
		return calendarioService.saveCalendario(calendario);
	}
	
	@GetMapping("/listAll")
	public List<Calendario> getJornadaList(){
		return calendarioService.findAll();
	}
	
	@GetMapping("/{idCalendario}")
	public Optional<Calendario> getCalendarioByID(@PathVariable("idCalendario") Long id){
		return calendarioService.findByID(id);
	}
	
	@PutMapping("/{idUpdate}")
	public Calendario updateCalendario
	(@RequestBody Calendario empresa, @PathVariable("idUpdate") Long id) throws Exception {
		if(calendarioService.findByID(id).isPresent()) {
			return calendarioService.updateCalendario(empresa);
		}
		return null;
	}
	
	@DeleteMapping("/{idDelete}")
	public void deleteCalendario(@PathVariable("idDelete") Long id) {
		calendarioService.DeleteByID(id);
	}
}
