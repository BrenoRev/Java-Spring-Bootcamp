package com.brenodev.bootcamp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenodev.bootcamp.model.BancoHoras;
import com.brenodev.bootcamp.repository.bancoHorasRepository;

// REGRA DE NEGÓCIO

@Service
public class bancoHorasService {

	@Autowired
	bancoHorasRepository bancoHorasRepository;

	public BancoHoras saveBancoHoras(BancoHoras bancohoras) {
		return bancoHorasRepository.save(bancohoras);

	}

	public BancoHoras updateBancoHoras(BancoHoras bancohoras) {
		return bancoHorasRepository.save(bancohoras);

	}
	
	public List<BancoHoras> findAll() {
		return bancoHorasRepository.findAll();
	}

	public Optional<BancoHoras> findByID(Long id) {
		return bancoHorasRepository.findById(id);
	}
	
	public void DeleteByID(Long id) {
		bancoHorasRepository.deleteById(id);
	}
}
