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

import com.brenodev.bootcamp.model.CategoriaUsuario;
import com.brenodev.bootcamp.service.categoriaUsuarioService;

@RestController
@RequestMapping("/categoria")
public class categoriaUsuarioController {

	@Autowired
	categoriaUsuarioService categoriaUsuario;
	
	@PostMapping
	public CategoriaUsuario createCategoriaUsuario(@RequestBody CategoriaUsuario categoria) {
		return categoriaUsuario.saveCategoriaUsuario(categoria);
	}
	
	@GetMapping("/listAll")
	public List<CategoriaUsuario> getJornadaList(){
		return categoriaUsuario.findAll();
	}
	
	@GetMapping("/{idCategoriaUsuario}")
	public Optional<CategoriaUsuario> getCategoriaUsuarioByID(@PathVariable("idCategoriaUsuario") Long id){
		return categoriaUsuario.findByID(id);
	}
	
	@PutMapping("/{idUpdate}")
	public CategoriaUsuario updateCategoriaUsuario
	(@RequestBody CategoriaUsuario empresa, @PathVariable("idUpdate") Long id) throws Exception {
		if(categoriaUsuario.findByID(id).isPresent()) {
			return categoriaUsuario.updateCategoriaUsuario(empresa);
		}
		return null;
	}
	
	@DeleteMapping("/{idDelete}")
	public void deleteCategoriaUsuario(@PathVariable("idDelete") Long id) {
		categoriaUsuario.DeleteByID(id);
	}
}
