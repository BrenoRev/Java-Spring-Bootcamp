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

import com.brenodev.bootcamp.model.Ocorrencia;
import com.brenodev.bootcamp.service.OcorrenciaService;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {

	@Autowired
	OcorrenciaService ocorrenciaService;
	
	@PostMapping
	public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia) {
		return ocorrenciaService.saveOcorrencia(ocorrencia);
	}
	
	@GetMapping("/listAll")
	public List<Ocorrencia> getJornadaList(){
		return ocorrenciaService.findAll();
	}
	
	@GetMapping("/{idOcorrencia}")
	public Optional<Ocorrencia> getOcorrenciaByID(@PathVariable("idOcorrencia") Long id){
		return ocorrenciaService.findByID(id);
	}
	
	@PutMapping("/{idUpdate}")
	public Ocorrencia updateOcorrencia
	(@RequestBody Ocorrencia empresa, @PathVariable("idUpdate") Long id) throws Exception {
		if(ocorrenciaService.findByID(id).isPresent()) {
			return ocorrenciaService.updateOcorrencia(empresa);
		}
		return null;
	}
	
	@DeleteMapping("/{idDelete}")
	public void deleteOcorrencia(@PathVariable("idDelete") Long id) {
		ocorrenciaService.DeleteByID(id);
	}
}
