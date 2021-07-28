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

import com.brenodev.bootcamp.model.Localidade;
import com.brenodev.bootcamp.service.LocalidadeService;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {

	@Autowired
	LocalidadeService localidadeService;
	
	@PostMapping
	public Localidade createLocalidade(@RequestBody Localidade localidade) {
		return localidadeService.saveLocalidade(localidade);
	}
	
	@GetMapping("/listAll")
	public List<Localidade> getJornadaList(){
		return localidadeService.findAll();
	}
	
	@GetMapping("/{idLocalidade}")
	public Optional<Localidade> getLocalidadeByID(@PathVariable("idLocalidade") Long id){
		return localidadeService.findByID(id);
	}
	
	@PutMapping("/{idUpdate}")
	public Localidade updateLocalidade
	(@RequestBody Localidade empresa, @PathVariable("idUpdate") Long id) throws Exception {
		if(localidadeService.findByID(id).isPresent()) {
			return localidadeService.updateLocalidade(empresa);
		}
		return null;
	}
	
	@DeleteMapping("/{idDelete}")
	public void deleteLocalidade(@PathVariable("idDelete") Long id) {
		localidadeService.DeleteByID(id);
	}
}
