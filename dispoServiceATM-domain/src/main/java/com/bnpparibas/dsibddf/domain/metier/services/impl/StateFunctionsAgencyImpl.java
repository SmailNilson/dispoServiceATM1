/**
 * 
 */
package com.bnpparibas.dsibddf.domain.metier.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bnpparibas.dsibddf.domain.AgencyFunc;
import com.bnpparibas.dsibddf.domain.EtatServiceATM;
import com.bnpparibas.dsibddf.domain.EtatServicesATM;
import com.bnpparibas.dsibddf.domain.metier.services.IStateFunctionsAgency;

/**
 * @author ADMINIBM
 *
 */
@Service
public class StateFunctionsAgencyImpl implements IStateFunctionsAgency{

	@Override
	public List<AgencyFunc> getListOfAgnecyFunctions(EtatServicesATM etatServicesATM) {
		final List<EtatServiceATM> list=etatServicesATM.getEtatServicesATM();
		AgencyFunc agencyFunc = new AgencyFunc();
		AgencyFunc agencyFunc1 = new AgencyFunc();
		AgencyFunc agencyFunc2 = new AgencyFunc();
		List<AgencyFunc> agences = new ArrayList<>();
		list.forEach(etat ->{
			
			if (etat.getCodeFonction().equals("HS")) {
				agencyFunc.setId(0);
				agencyFunc.setLibelle("libelle ");
				agencyFunc.setDefinition(etat.getEtat());
				agences.add(agencyFunc);
			}else if (etat.getCodeFonction().equals("HS1")) {
				agencyFunc1.setId(1);
				agencyFunc1.setLibelle("libelle1 ");
				agencyFunc1.setDefinition(etat.getEtat());
				agences.add(agencyFunc1);
			}else if (etat.getCodeFonction().equals("HS2")) {
				agencyFunc2.setId(2);
				agencyFunc2.setLibelle("libelle2 ");
				agencyFunc2.setDefinition(etat.getEtat());
				agences.add(agencyFunc2);
			}
			
		});
		
		return agences;
	}

}
