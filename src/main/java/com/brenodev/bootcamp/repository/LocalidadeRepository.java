package com.brenodev.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brenodev.bootcamp.model.Localidade;

// PERSISTIR OS DADOS

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {

	
}
