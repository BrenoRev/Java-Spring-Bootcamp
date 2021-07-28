package com.brenodev.bootcamp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenodev.bootcamp.model.Usuario;
import com.brenodev.bootcamp.repository.UsuarioRepository;

// REGRA DE NEGÓCIO

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public Usuario saveUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);

	}

	public Usuario updateUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);

	}
	
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	public Optional<Usuario> findByID(Long id) {
		return usuarioRepository.findById(id);
	}
	
	public void DeleteByID(Long id) {
		usuarioRepository.deleteById(id);
	}
}
