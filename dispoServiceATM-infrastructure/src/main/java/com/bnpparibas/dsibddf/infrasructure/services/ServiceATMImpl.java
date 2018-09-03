/**
 * 
 */
package com.bnpparibas.dsibddf.infrasructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bnpparibas.dsibddf.domain.EtatServicesATM;
import com.bnpparibas.dsibddf.domain.services.IServiceATM;

/**
 * @author b30653
 *
 */
@Service
public class ServiceATMImpl implements IServiceATM {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public EtatServicesATM getEtatServicesATMByCodeAgence(String codeUO) {
		
		//EtatServicesATM etatServicesATM = restTemplate.getForObject("localhost:9999/hell",EtatServicesATM.class);
		ResponseEntity<EtatServicesATM> response = restTemplate.getForEntity("http://localhost:9999/hell", EtatServicesATM.class);
		return response.getBody();
		/*List<EtatServiceATM> liServiceATMs = new ArrayList<>();
		EtatServicesATM etatServicesATM = new EtatServicesATM();
		EtatServiceATM etatServiceATM = new EtatServiceATM();
		EtatServiceATM etatServiceATM1 = new EtatServiceATM();
		EtatServiceATM etatServiceATM2 = new EtatServiceATM();
		etatServiceATM.setCodeFonction("HS");
		etatServiceATM.setEtat("hors service ");
		etatServiceATM1.setCodeFonction("HS1");
		etatServiceATM1.setEtat("hors service1 ");
		etatServiceATM2.setCodeFonction("HS1");
		etatServiceATM2.setEtat("hors service2222 ");
		liServiceATMs.add(etatServiceATM);
		liServiceATMs.add(etatServiceATM1);
		liServiceATMs.add(etatServiceATM2);
		etatServicesATM.setCodeAgence(codeUO);
		etatServicesATM.setMessageErreur("Message Erreur");
		
		etatServicesATM.setEtatServicesATM(liServiceATMs);*/
		
		//return etatServicesATM;
	}

	/**
	 * @return the restTemplate
	 */
	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	/**
	 * @param restTemplate the restTemplate to set
	 */
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

}
