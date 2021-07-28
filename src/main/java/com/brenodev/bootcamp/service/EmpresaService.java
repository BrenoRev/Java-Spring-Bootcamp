package com.brenodev.bootcamp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenodev.bootcamp.model.Empresa;
import com.brenodev.bootcamp.repository.EmpresaRepository;

// REGRA DE NEGÓCIO

@Service
public class EmpresaService {

	@Autowired
	EmpresaRepository empresaRepository;

	public Empresa saveEmpresa(Empresa empresa) {
		return empresaRepository.save(empresa);

	}

	public Empresa updateEmpresa(Empresa empresa) {
		return empresaRepository.save(empresa);

	}
	
	public List<Empresa> findAll() {
		return empresaRepository.findAll();
	}

	public Optional<Empresa> findByID(Long id) {
		return empresaRepository.findById(id);
	}
	
	public void DeleteByID(Long id) {
		empresaRepository.deleteById(id);
	}
}
