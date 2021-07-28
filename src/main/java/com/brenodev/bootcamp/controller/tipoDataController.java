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

import com.brenodev.bootcamp.model.TipoData;
import com.brenodev.bootcamp.service.tipoDataService;

@RestController
@RequestMapping("/tipodata")
public class tipoDataController {

	@Autowired
	tipoDataService tipoDataService;
	
	@PostMapping
	public TipoData createTipoData(@RequestBody TipoData tipodata) {
		return tipoDataService.saveTipoData(tipodata);
	}
	
	@GetMapping("/listAll")
	public List<TipoData> getJornadaList(){
		return tipoDataService.findAll();
	}
	
	@GetMapping("/{idTipoData}")
	public Optional<TipoData> getTipoDataByID(@PathVariable("idTipoData") Long id){
		return tipoDataService.findByID(id);
	}
	
	@PutMapping("/{idUpdate}")
	public TipoData updateTipoData
	(@RequestBody TipoData empresa, @PathVariable("idUpdate") Long id) throws Exception {
		if(tipoDataService.findByID(id).isPresent()) {
			return tipoDataService.updateTipoData(empresa);
		}
		return null;
	}
	
	@DeleteMapping("/{idDelete}")
	public void deleteTipoData(@PathVariable("idDelete") Long id) {
		tipoDataService.DeleteByID(id);
	}
}
