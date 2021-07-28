package com.brenodev.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brenodev.bootcamp.model.CategoriaUsuario;

// PERSISTIR OS DADOS

@Repository
public interface categoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Long> {

	
}
