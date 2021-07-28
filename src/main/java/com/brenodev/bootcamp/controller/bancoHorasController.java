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

import com.brenodev.bootcamp.model.BancoHoras;
import com.brenodev.bootcamp.service.bancoHorasService;

@RestController
@RequestMapping("/bancohoras")
public class bancoHorasController {

	@Autowired
	bancoHorasService bancoHorasService;
	
	@PostMapping
	public BancoHoras createBancoHoras(@RequestBody BancoHoras bancohoras) {
		return bancoHorasService.saveBancoHoras(bancohoras);
	}
	
	@GetMapping("/listAll")
	public List<BancoHoras> getJornadaList(){
		return bancoHorasService.findAll();
	}
	
	@GetMapping("/{idBancoHoras}")
	public Optional<BancoHoras> getBancoHorasByID(@PathVariable("idBancoHoras") Long id){
		return bancoHorasService.findByID(id);
	}
	
	@PutMapping("/{idUpdate}")
	public BancoHoras updateBancoHoras
	(@RequestBody BancoHoras empresa, @PathVariable("idUpdate") Long id) throws Exception {
		if(bancoHorasService.findByID(id).isPresent()) {
			return bancoHorasService.updateBancoHoras(empresa);
		}
		return null;
	}
	
	@DeleteMapping("/{idDelete}")
	public void deleteBancoHoras(@PathVariable("idDelete") Long id) {
		bancoHorasService.DeleteByID(id);
	}
}
