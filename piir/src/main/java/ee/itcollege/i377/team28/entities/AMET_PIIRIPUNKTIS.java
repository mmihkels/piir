package ee.itcollege.i377.team28.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.i377.team28.entities.AMET;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: AMET_PIIRIPUNKTIS
 *
 */
@Entity
@RooToString
@RooEntity
public class AMET_PIIRIPUNKTIS implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long amet_piiripunktis_id;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date alates;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date kuni;
	private String kommentaar;
	@NotNull
	@Size(min=1,max=32)
	private String avaja;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date avatud;
	@Size(min=1,max=32)
	private String muutja;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date muudetud;
	@Size(min=1,max=32)
	private String sulgeja;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date suletud;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "aMET_PIIRIPUNKTIS")
	private Collection<PIIRIVALVUR_PIIRIPUNKTIS> pIIRIVALVUR_PIIRIPUNKTIS;
	@ManyToMany
	private Collection<PIIRIPUNKT> pIIRIPUNKT;
	@OneToMany(mappedBy = "aMET_PIIRIPUNKTIS")
	private Collection<PIIRIVALVUR_PIIRIPUNKTIS> pIIRIVALVUR_PIIRIPUNKTIS_1;
	@ManyToOne
	private AMET aMET;
	public AMET_PIIRIPUNKTIS() {
		super();
	}   
	public Long getAmet_piiripunktis_id() {
		return this.amet_piiripunktis_id;
	}

	public void setAmet_piiripunktis_id(Long amet_piiripunktis_id) {
		this.amet_piiripunktis_id = amet_piiripunktis_id;
	}   
	public Date getAlates() {
		return this.alates;
	}

	public void setAlates(Date alates) {
		this.alates = alates;
	}   
	public Date getKuni() {
		return this.kuni;
	}

	public void setKuni(Date kuni) {
		this.kuni = kuni;
	}   
	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}   
	public String getAvaja() {
		return this.avaja;
	}

	public void setAvaja(String avaja) {
		this.avaja = avaja;
	}   
	public Date getAvatud() {
		return this.avatud;
	}

	public void setAvatud(Date avatud) {
		this.avatud = avatud;
	}   
	public String getMuutja() {
		return this.muutja;
	}

	public void setMuutja(String muutja) {
		this.muutja = muutja;
	}   
	public Date getMuudetud() {
		return this.muudetud;
	}

	public void setMuudetud(Date muudetud) {
		this.muudetud = muudetud;
	}   
	public String getSulgeja() {
		return this.sulgeja;
	}

	public void setSulgeja(String sulgeja) {
		this.sulgeja = sulgeja;
	}   
	public Date getSuletud() {
		return this.suletud;
	}

	public void setSuletud(Date suletud) {
		this.suletud = suletud;
	}
	public Collection<PIIRIVALVUR_PIIRIPUNKTIS> getPIIRIVALVUR_PIIRIPUNKTIS() {
	    return pIIRIVALVUR_PIIRIPUNKTIS;
	}
	public void setPIIRIVALVUR_PIIRIPUNKTIS(Collection<PIIRIVALVUR_PIIRIPUNKTIS> param) {
	    this.pIIRIVALVUR_PIIRIPUNKTIS = param;
	}
	public Collection<PIIRIPUNKT> getPIIRIPUNKT() {
	    return pIIRIPUNKT;
	}
	public void setPIIRIPUNKT(Collection<PIIRIPUNKT> param) {
	    this.pIIRIPUNKT = param;
	}
	public Collection<PIIRIVALVUR_PIIRIPUNKTIS> getPIIRIVALVUR_PIIRIPUNKTIS_1() {
	    return pIIRIVALVUR_PIIRIPUNKTIS_1;
	}
	public void setPIIRIVALVUR_PIIRIPUNKTIS_1(Collection<PIIRIVALVUR_PIIRIPUNKTIS> param) {
	    this.pIIRIVALVUR_PIIRIPUNKTIS_1 = param;
	}
	public AMET getAMET() {
	    return aMET;
	}
	public void setAMET(AMET param) {
	    this.aMET = param;
	}
   
}
