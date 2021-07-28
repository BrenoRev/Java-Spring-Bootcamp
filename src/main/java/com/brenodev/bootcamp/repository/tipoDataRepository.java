package com.brenodev.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brenodev.bootcamp.model.TipoData;

// PERSISTIR OS DADOS

@Repository
public interface tipoDataRepository extends JpaRepository<TipoData, Long> {

	
}