package com.example.dataAccess.repositories;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.dataAccess.models.Info;

@Component
public class infotemp {

	List<Info> infoList = new ArrayList<>();

	CaseRepository caso = new CaseRepository();
	String casosActuales = String.valueOf(caso.actualInfected());
	String casosTotales = String.valueOf(caso.totalCases());
	String casosRecuperados = String.valueOf(caso.totalRecupered());
	String casosFallecidos = String.valueOf(caso.totalDied());
	String casosAsintomaticos = String.valueOf(caso.totalAsintomatics());
	
	@PostConstruct
	public void init() {
		infoList.add(new Info(1,casosActuales, casosTotales, casosRecuperados, casosFallecidos,casosAsintomaticos));
	}

	public List<Info> getData() {
		return infoList;
	}
}
