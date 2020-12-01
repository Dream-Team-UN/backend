package com.example.dataAccess.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dataAccess.models.InfoDepartamento;
import com.example.dataAccess.models.InfoMunicipio;
import com.example.dataAccess.models.Info;
import com.example.dataAccess.repositories.CaseRepository;
import com.example.dataAccess.repositories.infotemp;
import com.example.dataAccess.services.InfoDepartamentServices;
import com.example.dataAccess.services.InfoMunicipioServices;

@CrossOrigin(origins = { "http://localhost:8081" })
@RestController
public class ClientRestController {

	CaseRepository caso = new CaseRepository();
	String casosActuales = String.valueOf(caso.actualInfected());
	String casosTotales = String.valueOf(caso.totalCases());
	String casosRecuperados = String.valueOf(caso.totalRecupered());
	String casosFallecidos = String.valueOf(caso.totalDied());
	String casosAsintomaticos = String.valueOf(caso.totalAsintomatics());
	
	@Autowired
	infotemp repository;

	@Autowired
	InfoDepartamentServices dataD;
	
	@Autowired
	InfoMunicipioServices dataM;
	/*
	 * @GetMapping("/") public String index() { return "index"; }
	 */
	@RequestMapping("/data1")
	public List<Info> findAll() {
		return repository.getData();
	}
	@GetMapping("/data1/{departamento}")
		public InfoDepartamento find(@PathVariable String departamento) {
			return dataD.getData(departamento);
	}
	@GetMapping("/data1/municipio/{municipio}")
	public InfoMunicipio  findM(@PathVariable String municipio){
		return dataM.getData(municipio);
	}

	@RequestMapping("/data")
	public String hola(Model modelo) {

		modelo.addAttribute("mensaje1", casosActuales);
		modelo.addAttribute("mensaje2", casosTotales);
		modelo.addAttribute("mensaje3", casosRecuperados);
		modelo.addAttribute("mensaje4", casosFallecidos);
		return modelo.toString();
	}

}
