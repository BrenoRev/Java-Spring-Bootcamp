package com.brenodev.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brenodev.bootcamp.model.BancoHoras;

// PERSISTIR OS DADOS

@Repository
public interface bancoHorasRepository extends JpaRepository<BancoHoras, Long> {

	
}
