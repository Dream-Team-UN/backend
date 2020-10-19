package com.example.dataAccess.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dataAccess.models.entity.Departamento;
import com.example.dataAccess.repositories.DepartamentoRepository;

@Service
public class DepartamentService {
	
	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	public List<Departamento> findAll(){
		var it = departamentoRepository.findAll();
		
		var departaments = new ArrayList<Departamento>();
		
		it.forEach(e -> departaments.add(e));
		
		return departaments;
	}

}
