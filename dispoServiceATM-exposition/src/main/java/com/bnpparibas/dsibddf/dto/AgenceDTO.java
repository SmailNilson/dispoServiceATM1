/**
 * 
 */
package com.bnpparibas.dsibddf.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author ADMINIBM
 *
 */ 
@ApiModel(description="All details about the student. ")
public class AgenceDTO {
	 
	@ApiModelProperty(notes = "The database generated agnce ID")
	private int id;
	@ApiModelProperty(notes = "The database generated agence libelle")
	private String libelle; 
	@ApiModelProperty(notes = "The database generated Agence definition")
	private String definition;
	/**
	 * @return the agencyId
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param agencyId the agencyId to set
	 */
	public void setId(int agencyId) {
		this.id = agencyId;
	}
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * @return the definition
	 */
	public String getDefinition() {
		return definition;
	}
	/**
	 * @param definition the definition to set
	 */
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	
}
