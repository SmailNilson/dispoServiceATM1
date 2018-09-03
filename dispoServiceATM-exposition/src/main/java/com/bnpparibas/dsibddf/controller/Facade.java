package com.bnpparibas.dsibddf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bnpparibas.dsibddf.application.services.IDemandeEtatServicesATM;
import com.bnpparibas.dsibddf.dto.AgenceDTO;
import com.bnpparibas.dsibddf.exposition.adaptors.AdaptorToDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/agencies")
@Api(value = "automates", description = "Etat des automates")
public class Facade {
	
	@Autowired
	private IDemandeEtatServicesATM demandeEtatServiceATM;

	@ApiOperation(value = "Find automates by agency ID", response = AgenceDTO.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation"),
			@ApiResponse(code = 400, message = "Invalid code OU supplied"),
			@ApiResponse(code = 404, message = "Definition not found") })
	@RequestMapping(value = "{agencyId}/availability", method = RequestMethod.GET, produces = "application/json")
	public List<AgenceDTO> getStateByAgencyId(@PathVariable String agencyId) {
		
		/*if (agencyId.equals("test")) {
			agence.setDefinition("test def ");
			agence.setLibelle("lebelle123456");
			agences.add(agence);
			
			agence2.setDefinition("test def222222 ");
			agence2.setLibelle("lebelle44444444");
			agences.add(agence2);
		}*/
		
		  
		
		return AdaptorToDTO.changeAgencyFuncToAgence(demandeEtatServiceATM.getListStateAgency(agencyId));
	}

	/**
	 * @return the demandeEtatServiceATM
	 */
	public IDemandeEtatServicesATM getDemandeEtatServiceATM() {
		return demandeEtatServiceATM;
	}

	/**
	 * @param demandeEtatServiceATM the demandeEtatServiceATM to set
	 */
	public void setDemandeEtatServiceATM(IDemandeEtatServicesATM demandeEtatServiceATM) {
		this.demandeEtatServiceATM = demandeEtatServiceATM;
	}

}
