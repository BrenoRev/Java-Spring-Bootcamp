package com.brenodev.bootcamp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenodev.bootcamp.model.JornadaTrabalho;
import com.brenodev.bootcamp.repository.jornadaTrabalhoRepository;

// REGRA DE NEGÓCIO

@Service
public class jornadaTrabalhoService {

	@Autowired
	jornadaTrabalhoRepository jornadaRepository;
	
	public JornadaTrabalho saveJornada(JornadaTrabalho jornada) {
		return jornadaRepository.save(jornada);
		
	}

	public List<JornadaTrabalho> findAll() {
		return jornadaRepository.findAll();
	}

	public Optional<JornadaTrabalho> findByID(Long id) {
		return jornadaRepository.findById(id);	
		}
}
