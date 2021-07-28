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

import com.brenodev.bootcamp.model.NivelAcesso;
import com.brenodev.bootcamp.service.nivelAcessoService;

@RestController
@RequestMapping("/nivelacesso")
public class nivelAcessoController {

	@Autowired
	nivelAcessoService nivelAcessoService;
	
	@PostMapping
	public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso) {
		return nivelAcessoService.saveNivelAcesso(nivelAcesso);
	}
	
	@GetMapping("/listAll")
	public List<NivelAcesso> getJornadaList(){
		return nivelAcessoService.findAll();
	}
	
	@GetMapping("/{idNivelAcesso}")
	public Optional<NivelAcesso> getNivelAcessoByID(@PathVariable("idNivelAcesso") Long id){
		return nivelAcessoService.findByID(id);
	}
	
	@PutMapping("/{idUpdate}")
	public NivelAcesso updateNivelAcesso
	(@RequestBody NivelAcesso empresa, @PathVariable("idUpdate") Long id) throws Exception {
		if(nivelAcessoService.findByID(id).isPresent()) {
			return nivelAcessoService.updateNivelAcesso(empresa);
		}
		return null;
	}
	
	@DeleteMapping("/{idDelete}")
	public void deleteNivelAcesso(@PathVariable("idDelete") Long id) {
		nivelAcessoService.DeleteByID(id);
	}
}
