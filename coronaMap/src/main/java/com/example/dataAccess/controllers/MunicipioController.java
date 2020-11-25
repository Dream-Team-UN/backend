package com.example.dataAccess.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dataAccess.models.Municipio;
import com.example.dataAccess.services.MunicipioService;

@RestController
public class MunicipioController {
	
	@Autowired
	private MunicipioService municipioService;
	
	@GetMapping("/Municipios")
	public List<Municipio> allMunicipios(){
		return municipioService.findAll();
	}

}
