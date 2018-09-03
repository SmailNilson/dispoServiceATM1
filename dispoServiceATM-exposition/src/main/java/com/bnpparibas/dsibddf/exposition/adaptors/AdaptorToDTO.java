/**
 * 
 */
package com.bnpparibas.dsibddf.exposition.adaptors;

import java.util.ArrayList;
import java.util.List;

import com.bnpparibas.dsibddf.application.beans.Agence;
import com.bnpparibas.dsibddf.dto.AgenceDTO;

/**
 * @author ADMINIBM
 *
 */
public class AdaptorToDTO {
public static List<AgenceDTO> changeAgencyFuncToAgence(List<Agence> listAgences) {
		
		AgenceDTO agence = new AgenceDTO();
		List<AgenceDTO> agenceDTOs = new ArrayList<>();
		listAgences.forEach(ag ->{
			
			agence.setId(ag.getId());
			agence.setLibelle(ag.getLibelle());
			agence.setDefinition(ag.getDefinition());
			agenceDTOs.add(agence);
		});

		
		return agenceDTOs;
	}
}
