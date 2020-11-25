package com.example.dataAccess.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.dataAccess.models.Departamento;

public interface DepartamentoRepository extends CrudRepository<Departamento, Long> {
	
}
