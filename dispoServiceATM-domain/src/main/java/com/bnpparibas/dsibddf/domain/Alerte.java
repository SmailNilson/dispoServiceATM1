package com.bnpparibas.dsibddf.domain;

import java.util.Date;

/**
 * 
 * @author @author b30653
 * 
 */
public class Alerte {

	private Long idAlerte;
	private String contenuAlerte;
	private Integer annee;
	private Integer mois;
	private Integer jour;
	private Integer heure;
	private Integer minute;
	private Integer seconde;
	private String codeEtat;
	private String codeEtatPrecedant;
	private String codeAtm;
	private String typeAlerte;
	private String typeAtm;
	private String valFixGab;
	private String errorLoad;
	private Date datecreation;

	
	/**
	 * 
	 */
	public Alerte() {
		super();
	}

	/**
	 * @return the idAlerte
	 */
	public Long getIdAlerte() {
		return idAlerte;
	}

	/**
	 * @param idAlerte
	 *            the idAlerte to set
	 */
	public void setIdAlerte(Long idAlerte) {
		this.idAlerte = idAlerte;
	}

	/**
	 * @return the contenuAlerte
	 */
	public String getContenuAlerte() {
		return contenuAlerte;
	}

	/**
	 * @param contenuAlerte
	 *            the contenuAlerte to set
	 */
	public void setContenuAlerte(String contenuAlerte) {
		this.contenuAlerte = contenuAlerte;
	}

	/**
	 * @return the annee
	 */
	public Integer getAnnee() {
		return annee;
	}

	/**
	 * @param annee
	 *            the annee to set
	 */
	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	/**
	 * @return the mois
	 */
	public Integer getMois() {
		return mois;
	}

	/**
	 * @param mois
	 *            the mois to set
	 */
	public void setMois(Integer mois) {
		this.mois = mois;
	}

	/**
	 * @return the jour
	 */
	public Integer getJour() {
		return jour;
	}

	/**
	 * @param jour
	 *            the jour to set
	 */
	public void setJour(Integer jour) {
		this.jour = jour;
	}

	/**
	 * @return the heure
	 */
	public Integer getHeure() {
		return heure;
	}

	/**
	 * @param heure
	 *            the heure to set
	 */
	public void setHeure(Integer heure) {
		this.heure = heure;
	}

	/**
	 * @return the minute
	 */
	public Integer getMinute() {
		return minute;
	}

	/**
	 * @param minute
	 *            the minute to set
	 */
	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	/**
	 * @return the seconde
	 */
	public Integer getSeconde() {
		return seconde;
	}

	/**
	 * @param seconde
	 *            the seconde to set
	 */
	public void setSeconde(Integer seconde) {
		this.seconde = seconde;
	}

	/**
	 * @return the codeEtat
	 */
	public String getCodeEtat() {
		return codeEtat;
	}

	/**
	 * @param codeEtat
	 *            the codeEtat to set
	 */
	public void setCodeEtat(String codeEtat) {
		this.codeEtat = codeEtat;
	}

	/**
	 * @return codeEtatPrecedant
	 */
	public String getCodeEtatPrecedant() {
		return codeEtatPrecedant;
	}

	/**
	 * @param codeEtatPrecedant
	 *            codeEtatPrecedant to set
	 */
	public void setCodeEtatPrecedant(String codeEtatPrecedant) {
		this.codeEtatPrecedant = codeEtatPrecedant;
	}

	/**
	 * @return the codeAtm
	 */
	public String getCodeAtm() {
		return codeAtm;
	}

	/**
	 * @param codeAtm
	 *            the codeAtm to set
	 */
	public void setCodeAtm(String codeAtm) {
		this.codeAtm = codeAtm;
	}

	/**
	 * @return the typeAlerte
	 */
	public String getTypeAlerte() {
		return typeAlerte;
	}

	/**
	 * @param typeAlerte
	 *            the typeAlerte to set
	 */
	public void setTypeAlerte(String typeAlerte) {
		this.typeAlerte = typeAlerte;
	}

	/**
	 * @return the typeAtm
	 */
	public String getTypeAtm() {
		return typeAtm;
	}

	/**
	 * @param typeAtm
	 *            the typeAtm to set
	 */
	public void setTypeAtm(String typeAtm) {
		this.typeAtm = typeAtm;
	}

	/**
	 * @return the valFixGab
	 */
	public String getValFixGab() {
		return valFixGab;
	}

	/**
	 * @param valFixGab
	 *            the valFixGab to set
	 */
	public void setValFixGab(String valFixGab) {
		this.valFixGab = valFixGab;
	}

	public String getErrorLoad() {
		return errorLoad;
	}

	public void setErrorLoad(String errorLoad) {
		this.errorLoad = errorLoad;
	}

	/**
	 * @return the datecreation
	 */
	public Date getDatecreation() {
		Date date = null;
		if (datecreation != null) {
			date = new Date(datecreation.getTime());
		}
		return date;
	}

	/**
	 * @param datecreation
	 *            the datecreation to set
	 */
	public void setDatecreation(Date datecreation) {
		if (datecreation != null) {
			this.datecreation = new Date(datecreation.getTime());
		} else {
			this.datecreation = null;
		}
	}

}