package com.brenodev.bootcamp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brenodev.bootcamp.model.Empresa;
import com.brenodev.bootcamp.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

	@Autowired
	EmpresaService empresaService;
	
	@PostMapping
	public Empresa createEmpresa(@RequestBody Empresa empresa) {
		return empresaService.saveEmpresa(empresa);
	}
	
	@GetMapping("/listAll")
	public List<Empresa> getJornadaList(){
		return empresaService.findAll();
	}
	
	@GetMapping("/{idEmpresa}")
	public Optional<Empresa> getEmpresaByID(@PathVariable("idEmpresa") Long id){
		return empresaService.findByID(id);
	}
	
	@PutMapping("/{idUpdate}")
	public Empresa updateEmpresa
	(@RequestBody Empresa empresa, @PathVariable("idUpdate") Long id) throws Exception {
		if(empresaService.findByID(id).isPresent()) {
			return empresaService.updateEmpresa(empresa);
		}
		return null;
	}
	
	@DeleteMapping("/{idDelete}")
	public void deleteEmpresa(@PathVariable("idDelete") Long id) {
		empresaService.DeleteByID(id);
	}
}
