/**
 * 
 */
package com.bnpparibas.dsibddf.application.adaptors;

import java.util.ArrayList;
import java.util.List;

import com.bnpparibas.dsibddf.application.beans.Agence;
import com.bnpparibas.dsibddf.domain.AgencyFunc;

/**
 * @author ADMINIBM
 *
 */
public  class  ApplicationAdaptor {

	public static List<Agence> changeAgencyFuncToAgence(List<AgencyFunc> listAgences) {
		
		Agence agence = new Agence();
		List<Agence> agences = new ArrayList<>();
		listAgences.forEach(ag ->{ 
			agence.setId(ag.getId());
			agence.setLibelle(ag.getLibelle());
			agence.setDefinition(ag.getDefinition());
			agences.add(agence);
		});
		
		
		return agences;
	}
	
}
