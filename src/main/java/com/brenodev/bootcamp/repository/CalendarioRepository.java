package com.brenodev.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brenodev.bootcamp.model.Calendario;

// PERSISTIR OS DADOS

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {

	
}
