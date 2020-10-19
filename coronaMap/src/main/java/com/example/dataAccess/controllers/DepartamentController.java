package com.example.dataAccess.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dataAccess.models.entity.Departamento;
import com.example.dataAccess.services.DepartamentService;

@RestController
public class DepartamentController {
	
	@Autowired
	private DepartamentService departamentService;
	
	@GetMapping("/Departamentos")
	public List<Departamento> allDepartaments(){
		return departamentService.findAll();
	}

}
