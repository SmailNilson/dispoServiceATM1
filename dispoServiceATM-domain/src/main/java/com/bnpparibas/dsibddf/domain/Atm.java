package com.bnpparibas.dsibddf.domain;

import java.util.Date;

/**
 * 
 * @author b30653
 * 
 */
public class Atm {

	private String groupe;
	private String idGab;
	private String nomSite;
	private String materiel;
	private String gestionnaire1;
	private String nomSiege;
	private String idUoPointVente;
	private String adresse;
	private String codePostal;
	private String ville;
	private String constructeur;
	private Date dateDemarrage;
	private String operationAutorisee;
	private String localisation;
	private String accessibilite;
	private String nomMainteneur;
	private String motifArretService;
	private Date dateDebutArretService;
	private Date dateFinArretService;
	private String smsGroupe;
	private String enseigne;
	private String sousEnseigne;
	private String direction;
	private String adresseGabHorsSite;
	private String fonctionsAutorisees;
	private Date dateEntree;

	/**
	 * 
	 */
	public Atm() {
		super();
	}

	/**
	 * @return the groupe
	 */
	public String getGroupe() {
		return groupe;
	}

	/**
	 * @param groupe
	 *            the groupe to set
	 */
	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	/**
	 * @return the idGab
	 */
	public String getIdGab() {
		return idGab;
	}

	/**
	 * @param idGab
	 *            the idGab to set
	 */
	public void setIdGab(String idGab) {
		this.idGab = idGab;
	}

	/**
	 * @return the nomSite
	 */
	public String getNomSite() {
		return nomSite;
	}

	/**
	 * @param nomSite
	 *            the nomSite to set
	 */
	public void setNomSite(String nomSite) {
		this.nomSite = nomSite;
	}

	/**
	 * @return the materiel
	 */
	public String getMateriel() {
		return materiel;
	}

	/**
	 * @param materiel
	 *            the materiel to set
	 */
	public void setMateriel(String materiel) {
		this.materiel = materiel;
	}

	/**
	 * @return the gestionnaire1
	 */
	public String getGestionnaire1() {
		return gestionnaire1;
	}

	/**
	 * @param gestionnaire1
	 *            the gestionnaire1 to set
	 */
	public void setGestionnaire1(String gestionnaire1) {
		this.gestionnaire1 = gestionnaire1;
	}

	/**
	 * @return the nomSiege
	 */
	public String getNomSiege() {
		return nomSiege;
	}

	/**
	 * @param nomSiege
	 *            the nomSiege to set
	 */
	public void setNomSiege(String nomSiege) {
		this.nomSiege = nomSiege;
	}

	/**
	 * @return the idUoPointVente
	 */
	public String getIdUoPointVente() {
		return idUoPointVente;
	}

	/**
	 * @param idUoPointVente
	 *            the idUoPointVente to set
	 */
	public void setIdUoPointVente(String idUoPointVente) {
		this.idUoPointVente = idUoPointVente;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal
	 *            the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville
	 *            the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @return the constructeur
	 */
	public String getConstructeur() {
		return constructeur;
	}

	/**
	 * @param constructeur
	 *            the constructeur to set
	 */
	public void setConstructeur(String constructeur) {
		this.constructeur = constructeur;
	}

	/**
	 * @return the dateDemarrage
	 */
	public Date getDateDemarrage() {
		Date date = null;
		if (dateDemarrage != null) {
			date = new Date(dateDemarrage.getTime());
		}
		return date;
	}

	/**
	 * @param dateDemarrage
	 *            the dateDemarrage to set
	 */
	public void setDateDemarrage(Date dateDemarrage) {
		if (dateDemarrage != null) {
			this.dateDemarrage = new Date(dateDemarrage.getTime());
		} else {
			this.dateDemarrage = null;
		}
	}

	/**
	 * @return the operationAutorisee
	 */
	public String getOperationAutorisee() {
		return operationAutorisee;
	}

	/**
	 * @param operationAutorisee
	 *            the operationAutorisee to set
	 */
	public void setOperationAutorisee(String operationAutorisee) {
		this.operationAutorisee = operationAutorisee;
	}

	/**
	 * @return the localisation
	 */
	public String getLocalisation() {
		return localisation;
	}

	/**
	 * @param localisation
	 *            the localisation to set
	 */
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	/**
	 * @return the accessibilite
	 */
	public String getAccessibilite() {
		return accessibilite;
	}

	/**
	 * @param accessibilite
	 *            the accessibilite to set
	 */
	public void setAccessibilite(String accessibilite) {
		this.accessibilite = accessibilite;
	}

	/**
	 * @return the nomMainteneur
	 */
	public String getNomMainteneur() {
		return nomMainteneur;
	}

	/**
	 * @param nomMainteneur
	 *            the nomMainteneur to set
	 */
	public void setNomMainteneur(String nomMainteneur) {
		this.nomMainteneur = nomMainteneur;
	}

	/**
	 * @return the motifArretService
	 */
	public String getMotifArretService() {
		return motifArretService;
	}

	/**
	 * @param motifArretService
	 *            the motifArretService to set
	 */
	public void setMotifArretService(String motifArretService) {
		this.motifArretService = motifArretService;
	}

	/**
	 * @return the dateDebutArretService
	 */
	public Date getDateDebutArretService() {
		Date date = null;
		if (dateDebutArretService != null) {
			date = new Date(dateDebutArretService.getTime());
		}
		return date;
	}

	/**
	 * @param dateDebutArretService
	 *            the dateDebutArretService to set
	 */
	public void setDateDebutArretService(Date dateDebutArretService) {
		if (dateDebutArretService != null) {
			this.dateDebutArretService = new Date(dateDebutArretService.getTime());
		} else {
			this.dateDebutArretService = null;
		}
	}

	/**
	 * @return the dateFinArretService
	 */
	public Date getDateFinArretService() {
		Date date = null;
		if (dateFinArretService != null) {
			date = new Date(dateFinArretService.getTime());
		}
		return date;
	}

	/**
	 * @param dateFinArretService
	 *            the dateFinArretService to set
	 */
	public void setDateFinArretService(Date dateFinArretService) {
		if (dateFinArretService != null) {
			this.dateFinArretService = new Date(dateFinArretService.getTime());
		} else {
			this.dateFinArretService = null;
		}
	}

	/**
	 * @return the smsGroupe
	 */
	public String getSmsGroupe() {
		return smsGroupe;
	}

	/**
	 * @param smsGroupe
	 *            the smsGroupe to set
	 */
	public void setSmsGroupe(String smsGroupe) {
		this.smsGroupe = smsGroupe;
	}

	/**
	 * @return the enseigne
	 */
	public String getEnseigne() {
		return enseigne;
	}

	/**
	 * @param enseigne
	 *            the enseigne to set
	 */
	public void setEnseigne(String enseigne) {
		this.enseigne = enseigne;
	}

	/**
	 * @return the sousEnseigne
	 */
	public String getSousEnseigne() {
		return sousEnseigne;
	}

	/**
	 * @param sousEnseigne
	 *            the sousEnseigne to set
	 */
	public void setSousEnseigne(String sousEnseigne) {
		this.sousEnseigne = sousEnseigne;
	}

	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * @return the adresseGabHorsSite
	 */
	public String getAdresseGabHorsSite() {
		return adresseGabHorsSite;
	}

	/**
	 * @param adresseGabHorsSite
	 *            the adresseGabHorsSite to set
	 */
	public void setAdresseGabHorsSite(String adresseGabHorsSite) {
		this.adresseGabHorsSite = adresseGabHorsSite;
	}

	/**
	 * @return the fonctionsAutorisees
	 */
	public String getFonctionsAutorisees() {
		return fonctionsAutorisees;
	}

	/**
	 * @param fonctionsAutorisees
	 *            the fonctionsAutorisees to set
	 */
	public void setFonctionsAutorisees(String fonctionsAutorisees) {
		this.fonctionsAutorisees = fonctionsAutorisees;
	}

	/**
	 * @return the dateEntree
	 */
	public Date getDateEntree() {
		Date date = null;
		if (dateEntree != null) {
			date = new Date(dateEntree.getTime());
		}
		return date;
	}

	/**
	 * @param dateEntree
	 *            the dateEntree to set
	 */
	public void setDateEntree(Date dateEntree) {
		if (dateEntree != null) {
			this.dateEntree = new Date(dateEntree.getTime());
		} else {
			this.dateEntree = null;
		}
	}

}