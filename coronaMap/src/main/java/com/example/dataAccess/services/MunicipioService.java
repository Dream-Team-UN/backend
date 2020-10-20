package com.example.dataAccess.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dataAccess.models.entity.Municipio;
import com.example.dataAccess.repositories.MunicipioRepository;

@Service
public class MunicipioService {

	@Autowired
	private MunicipioRepository municipioRepository;
	
	public List<Municipio> findAll(){
		var it = municipioRepository.findAll();
		
		var municipios = new ArrayList<Municipio>();
		
		it.forEach(e -> municipios.add(e));
		
		return municipios;
	}
	
}
