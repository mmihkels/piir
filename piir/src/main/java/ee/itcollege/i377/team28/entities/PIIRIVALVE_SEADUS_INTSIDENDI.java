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
import ee.itcollege.i377.team28.entities.PIIRIVALVUR_INTSIDENDIS;
import ee.itcollege.i377.team28.entities.SEADUSE_PUNKT;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: PIIRIVALVE_SEADUS_INTSIDENDI
 *
 */
@Entity
@RooToString
@RooEntity
public class PIIRIVALVE_SEADUS_INTSIDENDI implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long piirivalve_seadus_intsidendi_id;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date alates;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date kuni;
	@NotNull
	private String kirjeldus;
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
	@ManyToOne
	private PIIRIVALVUR_INTSIDENDIS pIIRIVALVUR_INTSIDENDIS;
	@ManyToOne
	private SEADUSE_PUNKT sEADUSE_PUNKT;

	public PIIRIVALVE_SEADUS_INTSIDENDI() {
		super();
	}   
	public Long getPiirivalve_seadus_intsidendi_id() {
		return this.piirivalve_seadus_intsidendi_id;
	}

	public void setPiirivalve_seadus_intsidendi_id(Long piirivalve_seadus_intsidendi_id) {
		this.piirivalve_seadus_intsidendi_id = piirivalve_seadus_intsidendi_id;
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
	public String getKirjeldus() {
		return this.kirjeldus;
	}

	public void setKirjeldus(String kirjeldus) {
		this.kirjeldus = kirjeldus;
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
	public PIIRIVALVUR_INTSIDENDIS getPIIRIVALVUR_INTSIDENDIS() {
	    return pIIRIVALVUR_INTSIDENDIS;
	}
	public void setPIIRIVALVUR_INTSIDENDIS(PIIRIVALVUR_INTSIDENDIS param) {
	    this.pIIRIVALVUR_INTSIDENDIS = param;
	}
	public SEADUSE_PUNKT getSEADUSE_PUNKT() {
	    return sEADUSE_PUNKT;
	}
	public void setSEADUSE_PUNKT(SEADUSE_PUNKT param) {
	    this.sEADUSE_PUNKT = param;
	}
   
}
