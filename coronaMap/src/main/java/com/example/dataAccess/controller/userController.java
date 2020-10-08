package com.example.dataAccess.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dataAccess.models.info;
import com.example.dataAccess.repositories.CaseRepository;
import com.example.dataAccess.repositories.infotemp;


@CrossOrigin(origins = {"http://localhost:8081"})
@RestController
public class userController {
	
	CaseRepository caso = new CaseRepository();
	String casosActuales = String.valueOf(caso.actualInfected());
	String casosTotales = String.valueOf(caso.totalCases());
	String casosRecuperados = String.valueOf(caso.totalRecupered());
	String casosFallecidos = String.valueOf(caso.totalDied());
	
	@Autowired
	infotemp repository;
	/*
	@GetMapping("/")
	public String index() {
		return "index";
	}
	*/
	@RequestMapping("/data1")
	public List<info> findAll() {
		return repository.getData();
	}

@RequestMapping("/data")
	  public String hola(Model modelo) {
	    
	    
	modelo.addAttribute("mensaje1",casosActuales);
	   modelo.addAttribute("mensaje2",casosTotales);
	    modelo.addAttribute("mensaje3",casosRecuperados);
	    modelo.addAttribute("mensaje4",casosFallecidos);
	    return modelo.toString();
	  }

}
