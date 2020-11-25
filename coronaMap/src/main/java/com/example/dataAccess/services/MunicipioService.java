package com.example.dataAccess.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dataAccess.models.Municipio;
import com.example.dataAccess.repositories.MunicipioRepository;

@Service
public class MunicipioService {

	@Autowired
	private MunicipioRepository municipioRepository;
	
	public List<Municipio> findAll(){
		Iterable<Municipio> it = municipioRepository.findAll();
		
		ArrayList<Municipio> municipios = new ArrayList<>();
		
		it.forEach(e -> municipios.add(e));
		
		return municipios;
	}
	
}
