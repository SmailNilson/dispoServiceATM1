package com.bnpparibas.dsibddf.domain;

/**
 * 
 * @author @author b30653
 * 
 */
public class AlerteHS {

	private Long id;
	private Alerte alerte;
	private String idAtm;
	private String estSourceEtat;
	private Integer priorite;
	private Integer annee;
	private Integer mois;
	private Integer jour;
	private Integer heure;
	private Integer minute;
	private Integer seconde;
	private String valFixGab;
	private String codeEtat;
	private String typeAlerte;
	private String estAffichable;

	/**
	 * 
	 */
	public AlerteHS() {
		super();
	}

	/**
	 * @return the id AlerteHS
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            AlerteHS the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the alerte
	 */
	public Alerte getAlerte() {
		return alerte;
	}

	/**
	 * @param alerte
	 *            the alerte to set
	 */
	public void setAlerte(Alerte alerte) {
		this.alerte = alerte;
	}

	/**
	 * @return the idAtm AlerteHS
	 */
	public String getIdAtm() {
		return idAtm;
	}

	/**
	 * @param idAtm
	 *            AlerteHS the idAtm to set
	 */
	public void setIdAtm(String idAtm) {
		this.idAtm = idAtm;
	}

	/**
	 * @return the estSourceEtat
	 */
	public String getEstSourceEtat() {
		return estSourceEtat;
	}

	/**
	 * @param estSourceEtat
	 *            the estSourceEtat to set
	 */
	public void setEstSourceEtat(String estSourceEtat) {
		this.estSourceEtat = estSourceEtat;
	}

	/**
	 * @return the priorite
	 */
	public Integer getPriorite() {
		return priorite;
	}

	/**
	 * @param priorite the priorite to set
	 */
	public void setPriorite(Integer priorite) {
		this.priorite = priorite;
	}

	/**
	 * @return the annee
	 */
	public Integer getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
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
	 * @param mois the mois to set
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
	 * @param jour the jour to set
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
	 * @param heure the heure to set
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
	 * @param minute the minute to set
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
	 * @param seconde the seconde to set
	 */
	public void setSeconde(Integer seconde) {
		this.seconde = seconde;
	}

	/**
	 * @return the valFixGab
	 */
	public String getValFixGab() {
		return valFixGab;
	}

	/**
	 * @param valFixGab the valFixGab to set
	 */
	public void setValFixGab(String valFixGab) {
		this.valFixGab = valFixGab;
	}

	/**
	 * @return the codeEtat
	 */
	public String getCodeEtat() {
		return codeEtat;
	}

	/**
	 * @param codeEtat the codeEtat to set
	 */
	public void setCodeEtat(String codeEtat) {
		this.codeEtat = codeEtat;
	}

	/**
	 * @return the typeAlerte
	 */
	public String getTypeAlerte() {
		return typeAlerte;
	}

	/**
	 * @param typeAlerte the typeAlerte to set
	 */
	public void setTypeAlerte(String typeAlerte) {
		this.typeAlerte = typeAlerte;
	}

	/**
	 * @return the estAffichable
	 */
	public String getEstAffichable() {
		return estAffichable;
	}

	/**
	 * @param estAffichable the estAffichable to set
	 */
	public void setEstAffichable(String estAffichable) {
		this.estAffichable = estAffichable;
	}

}