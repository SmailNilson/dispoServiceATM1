/**
 * 
 */
package com.bnpparibas.dsibddf.domain;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author ADMINIBM
 *
 */
public class AgencyFunc {
	
	@ApiModelProperty(notes = "The database generated agnce ID")
	private int id;
	
	@ApiModelProperty(notes = "The database generated agence libelle")
	private String libelle; 
	
	@ApiModelProperty(notes = "The database generated Agence definition")
	private String definition;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
