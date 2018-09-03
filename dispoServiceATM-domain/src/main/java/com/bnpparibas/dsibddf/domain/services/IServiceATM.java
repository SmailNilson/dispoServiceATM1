/**
 * 
 */
package com.bnpparibas.dsibddf.domain.services;

import com.bnpparibas.dsibddf.domain.EtatServicesATM;

/**
 * @author ADMINIBM
 *
 */
public interface IServiceATM {
	
	public EtatServicesATM getEtatServicesATMByCodeAgence(String codeUO);
}
