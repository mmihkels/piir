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
import ee.itcollege.i377.team28.entities.VAHTKOND_INTSIDENDIS;
import ee.itcollege.i377.team28.entities.INTSIDENT;
import javax.persistence.ManyToOne;
import ee.itcollege.i377.team28.entities.PIIRIVALVUR;
import ee.itcollege.i377.team28.entities.PIIRIVALVE_SEADUS_INTSIDENDI;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: PIIRIVALVUR_INTSIDENDIS
 *
 */
@Entity
@RooToString
@RooEntity
public class PIIRIVALVUR_INTSIDENDIS implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long piirivalvur_intsidendis_id;
	@DateTimeFormat(style="M-")
	private Date alates;
	@DateTimeFormat(style="M-")
	private Date kuni;
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
	private VAHTKOND_INTSIDENDIS vAHTKOND_INTSIDENDIS;
	@ManyToOne
	private INTSIDENT iNTSIDENT;
	@ManyToOne
	private PIIRIVALVUR pIIRIVALVUR;
	@OneToMany(mappedBy = "pIIRIVALVUR_INTSIDENDIS")
	private Collection<PIIRIVALVE_SEADUS_INTSIDENDI> pIIRIVALVE_SEADUS_INTSIDENDI;

	public PIIRIVALVUR_INTSIDENDIS() {
		super();
	}   
	public Long getPiirivalvur_intsidendis_id() {
		return this.piirivalvur_intsidendis_id;
	}

	public void setPiirivalvur_intsidendis_id(Long piirivalvur_intsidendis_id) {
		this.piirivalvur_intsidendis_id = piirivalvur_intsidendis_id;
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
	public VAHTKOND_INTSIDENDIS getVAHTKOND_INTSIDENDIS() {
	    return vAHTKOND_INTSIDENDIS;
	}
	public void setVAHTKOND_INTSIDENDIS(VAHTKOND_INTSIDENDIS param) {
	    this.vAHTKOND_INTSIDENDIS = param;
	}
	public INTSIDENT getINTSIDENT() {
	    return iNTSIDENT;
	}
	public void setINTSIDENT(INTSIDENT param) {
	    this.iNTSIDENT = param;
	}
	public PIIRIVALVUR getPIIRIVALVUR() {
	    return pIIRIVALVUR;
	}
	public void setPIIRIVALVUR(PIIRIVALVUR param) {
	    this.pIIRIVALVUR = param;
	}
	public Collection<PIIRIVALVE_SEADUS_INTSIDENDI> getPIIRIVALVE_SEADUS_INTSIDENDI() {
	    return pIIRIVALVE_SEADUS_INTSIDENDI;
	}
	public void setPIIRIVALVE_SEADUS_INTSIDENDI(Collection<PIIRIVALVE_SEADUS_INTSIDENDI> param) {
	    this.pIIRIVALVE_SEADUS_INTSIDENDI = param;
	}
   
}
