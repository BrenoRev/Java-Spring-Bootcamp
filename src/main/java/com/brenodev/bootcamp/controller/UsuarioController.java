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

import com.brenodev.bootcamp.model.Usuario;
import com.brenodev.bootcamp.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping
	public Usuario createUsuario(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}
	
	@GetMapping("/listAll")
	public List<Usuario> getJornadaList(){
		return usuarioService.findAll();
	}
	
	@GetMapping("/{idUsuario}")
	public Optional<Usuario> getUsuarioByID(@PathVariable("idUsuario") Long id){
		return usuarioService.findByID(id);
	}
	
	@PutMapping("/{idUpdate}")
	public Usuario updateUsuario
	(@RequestBody Usuario empresa, @PathVariable("idUpdate") Long id) throws Exception {
		if(usuarioService.findByID(id).isPresent()) {
			return usuarioService.updateUsuario(empresa);
		}
		return null;
	}
	
	@DeleteMapping("/{idDelete}")
	public void deleteUsuario(@PathVariable("idDelete") Long id) {
		usuarioService.DeleteByID(id);
	}
}
