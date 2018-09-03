/**
 * 
 */
package com.bnpparibas.dsibddf.domain;

import java.util.List;

/**
 * @author ADMINIBM
 *
 */
public class EtatServicesATM {
	private String codeAgence;

	private List<EtatServiceATM> etatServicesATM;
	
	private String messageErreur;

	/**
	 * @return the codeAgence
	 */
	public String getCodeAgence() {
		return codeAgence;
	}

	/**
	 * @param codeAgence the codeAgence to set
	 */
	public void setCodeAgence(String codeAgence) {
		this.codeAgence = codeAgence;
	}

	/**
	 * @return the etatServicesATM
	 */
	public List<EtatServiceATM> getEtatServicesATM() {
		return etatServicesATM;
	}

	/**
	 * @param etatServicesATM the etatServicesATM to set
	 */
	public void setEtatServicesATM(List<EtatServiceATM> etatServicesATM) {
		this.etatServicesATM = etatServicesATM;
	}

	/**
	 * @return the messageErreur
	 */
	public String getMessageErreur() {
		return messageErreur;
	}

	/**
	 * @param messageErreur the messageErreur to set
	 */
	public void setMessageErreur(String messageErreur) {
		this.messageErreur = messageErreur;
	}
	
}
