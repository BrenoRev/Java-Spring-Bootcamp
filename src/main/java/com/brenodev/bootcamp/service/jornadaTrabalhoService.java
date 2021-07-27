package com.brenodev.bootcamp.service;

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
}
