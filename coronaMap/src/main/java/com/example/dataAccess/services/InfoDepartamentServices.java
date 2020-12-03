package com.example.dataAccess.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.dataAccess.repositories.CaseRepository;
import com.example.dataAccess.models.InfoDepartamento;


@Component
public class InfoDepartamentServices {
	

	CaseRepository caso = new CaseRepository();


	public InfoDepartamento getData(String departamento) {
		String casosAct = String.valueOf(caso.actualInfectedepar(departamento));
		String casosTo = String.valueOf(caso.totalCasesdepar(departamento));
		String casosRec = String.valueOf(caso.totalRecuperedepar(departamento));
		String casosFal = String.valueOf(caso.totalDiedepar(departamento));
		String casosAsin = String.valueOf(caso.totalAsintomaticsdepar(departamento));
		return new InfoDepartamento(1,casosAct, casosTo, casosRec, casosFal,casosAsin);
	}
	
	

}