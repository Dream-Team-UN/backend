package com.example.dataAccess.repositories;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.dataAccess.models.info;

@Component
public class infotemp {

	List<info> infoList = new ArrayList<info>();

	CaseRepository caso = new CaseRepository();
	String casosActuales = String.valueOf(caso.actualInfected());
	String casosTotales = String.valueOf(caso.totalCases());
	String casosRecuperados = String.valueOf(caso.totalRecupered());
	String casosFallecidos = String.valueOf(caso.totalDied());

	@PostConstruct
	public void init() {
		infoList.add(new info(1,casosActuales, casosTotales, casosRecuperados, casosFallecidos));

	}

	public List<info> getData() {
		return infoList;
	}
}
