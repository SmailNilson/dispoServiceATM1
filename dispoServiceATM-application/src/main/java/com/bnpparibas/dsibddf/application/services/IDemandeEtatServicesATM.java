package com.bnpparibas.dsibddf.application.services;

import java.util.List;

import com.bnpparibas.dsibddf.application.beans.Agence;

public interface IDemandeEtatServicesATM {

	public List<Agence>	getListStateAgency(String codeOU);
	
}
