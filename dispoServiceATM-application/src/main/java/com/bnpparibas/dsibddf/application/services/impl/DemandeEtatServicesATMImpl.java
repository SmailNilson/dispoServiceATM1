/**
 * 
 */
package com.bnpparibas.dsibddf.application.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnpparibas.dsibddf.application.adaptors.ApplicationAdaptor;
import com.bnpparibas.dsibddf.application.beans.Agence;
import com.bnpparibas.dsibddf.application.services.IDemandeEtatServicesATM;
import com.bnpparibas.dsibddf.domain.AgencyFunc;
import com.bnpparibas.dsibddf.domain.EtatServicesATM;
import com.bnpparibas.dsibddf.domain.metier.services.IStateFunctionsAgency;
import com.bnpparibas.dsibddf.domain.services.IServiceATM;

/**
 * @author ADMINIBM
 *
 */
@Service
public class DemandeEtatServicesATMImpl implements IDemandeEtatServicesATM{
	
	@Autowired
	private IServiceATM serviceATM;
	@Autowired
	private IStateFunctionsAgency stateAgency;

	@Override
	public List<Agence> getListStateAgency(String codeOU) {
     return ApplicationAdaptor.changeAgencyFuncToAgence(getListOfAgnecyFunctions(getEtatServicesATMByCodeAgence(codeOU)));
	}

	/**
	 * @param etatServicesATM
	 * @return
	 * @see com.bnpparibas.dsibddf.domain.metier.services.IStateFunctionsAgency#getListOfAgnecyFunctions(com.bnpparibas.dsibddf.domain.EtatServicesATM)
	 */
	private List<AgencyFunc> getListOfAgnecyFunctions(EtatServicesATM etatServicesATM) {
		return stateAgency.getListOfAgnecyFunctions(etatServicesATM);
	}

	/**
	 * @param codeUO
	 * @return
	 * @see com.bnpparibas.dsibddf.domain.services.IServiceATM#getEtatServicesATMByCodeAgence(java.lang.String)
	 */
	private EtatServicesATM getEtatServicesATMByCodeAgence(String codeUO) {
		return serviceATM.getEtatServicesATMByCodeAgence(codeUO);
	}

	/**
	 * @return the serviceATM
	 */
	public IServiceATM getServiceATM() {
		return serviceATM;
	}

	/**
	 * @param serviceATM the serviceATM to set
	 */
	public void setServiceATM(IServiceATM serviceATM) {
		this.serviceATM = serviceATM;
	}

	/**
	 * @return the stateAgency
	 */
	public IStateFunctionsAgency getStateAgency() {
		return stateAgency;
	}

	/**
	 * @param stateAgency the stateAgency to set
	 */
	public void setStateAgency(IStateFunctionsAgency stateAgency) {
		this.stateAgency = stateAgency;
	}

	

}
