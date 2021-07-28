package com.brenodev.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brenodev.bootcamp.model.Empresa;

// PERSISTIR OS DADOS

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	
}
