package com.example.dataAccess.services;

import org.springframework.stereotype.Component;
import com.example.dataAccess.repositories.CaseRepository;
import com.example.dataAccess.models.InfoMunicipio;


@Component
public class InfoMunicipioServices {
	

	CaseRepository caso = new CaseRepository();


	public InfoMunicipio getData(String municipio) {
		String casosAct = String.valueOf(caso.actualInfectedmun(municipio));
		String casosTo = String.valueOf(caso.totalCasesmun(municipio));
		String casosRec = String.valueOf(caso.totalRecuperedmun(municipio));
		String casosFal = String.valueOf(caso.totalDiedmun(municipio));
		String casosAsin = String.valueOf(caso.totalAsintomaticsmun(municipio));
		return new InfoMunicipio(1,casosAct, casosTo, casosRec, casosFal,casosAsin);
	}
	
	

}
