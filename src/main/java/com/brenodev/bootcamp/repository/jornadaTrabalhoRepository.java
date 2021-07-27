package com.brenodev.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brenodev.bootcamp.model.JornadaTrabalho;

// PERSISTIR OS DADOS

@Repository
public interface jornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho, Long> {

	
}
