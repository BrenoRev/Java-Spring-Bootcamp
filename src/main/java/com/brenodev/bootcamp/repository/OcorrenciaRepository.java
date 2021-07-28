package com.brenodev.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brenodev.bootcamp.model.Ocorrencia;

// PERSISTIR OS DADOS

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {

	
}
