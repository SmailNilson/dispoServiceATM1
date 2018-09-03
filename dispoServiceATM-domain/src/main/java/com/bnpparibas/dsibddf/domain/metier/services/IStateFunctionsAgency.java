/**
 * 
 */
package com.bnpparibas.dsibddf.domain.metier.services;

import java.util.List;

import com.bnpparibas.dsibddf.domain.AgencyFunc;
import com.bnpparibas.dsibddf.domain.EtatServicesATM;

/**
 * @author ADMINIBM
 *
 */
public interface IStateFunctionsAgency {

	
  public List<AgencyFunc> getListOfAgnecyFunctions(EtatServicesATM etatServicesATM);
	
}
