package ee.itcollege.i377.team28.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.i377.team28.entities.AUASTME_MUUTMINE;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ee.itcollege.i377.team28.entities.SEOTUD_KONTAKTISIK;
import ee.itcollege.i377.team28.entities.PIIRIVALVURI_KONTAKT;
import ee.itcollege.i377.team28.entities.VAHTKONNA_LIIGE;
import ee.itcollege.i377.team28.entities.PIIRIVALVUR_VOODIKOHAL;
import ee.itcollege.i377.team28.entities.PIIRIVALVUR_INTSIDENDIS;
import ee.itcollege.i377.team28.entities.PIIRIVALVUR_VAEOSAS;
import ee.itcollege.i377.team28.entities.PIIRIVALVUR_PIIRIPUNKTIS;

/**
 * Entity implementation class for Entity: PIIRIVALVUR
 *
 */
@Entity
@RooToString
@RooEntity
public class PIIRIVALVUR implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long piirivalvur_id;
	@Size(min=1,max=20)
	private String isikukood;
	@Size(min=1,max=25)
	private String eesnimed;
	@Size(min=1,max=35)
	private String perekonnanimi;
	@Size(min=1,max=1)
	private char sugu;
	@Size(min=1,max=20)
	private String soduri_kood;
	private String kommentaar;
	@NotNull
	@Size(min=1,max=32)
	private String avaja;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date avatud;
	@NotNull
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
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Collection<AUASTME_MUUTMINE> aUASTME_MUUTMINE;
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Collection<SEOTUD_KONTAKTISIK> sEOTUD_KONTAKTISIK;
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Collection<PIIRIVALVURI_KONTAKT> pIIRIVALVURI_KONTAKT;
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Collection<VAHTKONNA_LIIGE> vAHTKONNA_LIIGE;
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Collection<PIIRIVALVUR_VOODIKOHAL> pIIRIVALVUR_VOODIKOHAL;
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Collection<PIIRIVALVUR_INTSIDENDIS> pIIRIVALVUR_INTSIDENDIS;
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Collection<PIIRIVALVUR_VAEOSAS> pIIRIVALVUR_VAEOSAS;
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Collection<PIIRIVALVUR_PIIRIPUNKTIS> pIIRIVALVUR_PIIRIPUNKTIS;
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Collection<PIIRIVALVUR_PIIRIPUNKTIS> pIIRIVALVUR_PIIRIPUNKTIS_1;

	public PIIRIVALVUR() {
		super();
	}   
	public Long getPiirivalvur_id() {
		return this.piirivalvur_id;
	}

	public void setPiirivalvur_id(Long piirivalvur_id) {
		this.piirivalvur_id = piirivalvur_id;
	}   
	public String getIsikukood() {
		return this.isikukood;
	}

	public void setIsikukood(String isikukood) {
		this.isikukood = isikukood;
	}   
	public String getEesnimed() {
		return this.eesnimed;
	}

	public void setEesnimed(String eesnimed) {
		this.eesnimed = eesnimed;
	}   
	public String getPerekonnanimi() {
		return this.perekonnanimi;
	}

	public void setPerekonnanimi(String perekonnanimi) {
		this.perekonnanimi = perekonnanimi;
	}   
	public char getSugu() {
		return this.sugu;
	}

	public void setSugu(char sugu) {
		this.sugu = sugu;
	}   
	public String getSoduri_kood() {
		return this.soduri_kood;
	}

	public void setSoduri_kood(String soduri_kood) {
		this.soduri_kood = soduri_kood;
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
	public Collection<AUASTME_MUUTMINE> getAUASTME_MUUTMINE() {
	    return aUASTME_MUUTMINE;
	}
	public void setAUASTME_MUUTMINE(Collection<AUASTME_MUUTMINE> param) {
	    this.aUASTME_MUUTMINE = param;
	}
	public Collection<SEOTUD_KONTAKTISIK> getSEOTUD_KONTAKTISIK() {
	    return sEOTUD_KONTAKTISIK;
	}
	public void setSEOTUD_KONTAKTISIK(Collection<SEOTUD_KONTAKTISIK> param) {
	    this.sEOTUD_KONTAKTISIK = param;
	}
	public Collection<PIIRIVALVURI_KONTAKT> getPIIRIVALVURI_KONTAKT() {
	    return pIIRIVALVURI_KONTAKT;
	}
	public void setPIIRIVALVURI_KONTAKT(Collection<PIIRIVALVURI_KONTAKT> param) {
	    this.pIIRIVALVURI_KONTAKT = param;
	}
	public Collection<VAHTKONNA_LIIGE> getVAHTKONNA_LIIGE() {
	    return vAHTKONNA_LIIGE;
	}
	public void setVAHTKONNA_LIIGE(Collection<VAHTKONNA_LIIGE> param) {
	    this.vAHTKONNA_LIIGE = param;
	}
	public Collection<PIIRIVALVUR_VOODIKOHAL> getPIIRIVALVUR_VOODIKOHAL() {
	    return pIIRIVALVUR_VOODIKOHAL;
	}
	public void setPIIRIVALVUR_VOODIKOHAL(Collection<PIIRIVALVUR_VOODIKOHAL> param) {
	    this.pIIRIVALVUR_VOODIKOHAL = param;
	}
	public Collection<PIIRIVALVUR_INTSIDENDIS> getPIIRIVALVUR_INTSIDENDIS() {
	    return pIIRIVALVUR_INTSIDENDIS;
	}
	public void setPIIRIVALVUR_INTSIDENDIS(Collection<PIIRIVALVUR_INTSIDENDIS> param) {
	    this.pIIRIVALVUR_INTSIDENDIS = param;
	}
	public Collection<PIIRIVALVUR_VAEOSAS> getPIIRIVALVUR_VAEOSAS() {
	    return pIIRIVALVUR_VAEOSAS;
	}
	public void setPIIRIVALVUR_VAEOSAS(Collection<PIIRIVALVUR_VAEOSAS> param) {
	    this.pIIRIVALVUR_VAEOSAS = param;
	}
	public Collection<PIIRIVALVUR_PIIRIPUNKTIS> getPIIRIVALVUR_PIIRIPUNKTIS() {
	    return pIIRIVALVUR_PIIRIPUNKTIS;
	}
	public void setPIIRIVALVUR_PIIRIPUNKTIS(Collection<PIIRIVALVUR_PIIRIPUNKTIS> param) {
	    this.pIIRIVALVUR_PIIRIPUNKTIS = param;
	}
	public Collection<PIIRIVALVUR_PIIRIPUNKTIS> getPIIRIVALVUR_PIIRIPUNKTIS_1() {
	    return pIIRIVALVUR_PIIRIPUNKTIS_1;
	}
	public void setPIIRIVALVUR_PIIRIPUNKTIS_1(Collection<PIIRIVALVUR_PIIRIPUNKTIS> param) {
	    this.pIIRIVALVUR_PIIRIPUNKTIS_1 = param;
	}
   
}
