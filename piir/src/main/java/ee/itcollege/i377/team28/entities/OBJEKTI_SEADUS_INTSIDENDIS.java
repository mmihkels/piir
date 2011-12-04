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
import ee.itcollege.i377.team28.entities.OBJEKT_INTSIDENDIS;
import ee.itcollege.i377.team28.entities.SEADUSE_PUNKT;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: OBJEKTI_SEADUS_INTSIDENDIS
 *
 */
@Entity
@RooToString
@RooEntity
public class OBJEKTI_SEADUS_INTSIDENDIS implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long objekti_seadus_intsidendis_id;
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
	private OBJEKT_INTSIDENDIS oBJEKT_INTSIDENDIS;
	@ManyToOne
	private SEADUSE_PUNKT sEADUSE_PUNKT;

	public OBJEKTI_SEADUS_INTSIDENDIS() {
		super();
	}   
	public Long getObjekti_seadus_intsidendis_id() {
		return this.objekti_seadus_intsidendis_id;
	}

	public void setObjekti_seadus_intsidendis_id(Long objekti_seadus_intsidendis_id) {
		this.objekti_seadus_intsidendis_id = objekti_seadus_intsidendis_id;
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
	public OBJEKT_INTSIDENDIS getOBJEKT_INTSIDENDIS() {
	    return oBJEKT_INTSIDENDIS;
	}
	public void setOBJEKT_INTSIDENDIS(OBJEKT_INTSIDENDIS param) {
	    this.oBJEKT_INTSIDENDIS = param;
	}
	public SEADUSE_PUNKT getSEADUSE_PUNKT() {
	    return sEADUSE_PUNKT;
	}
	public void setSEADUSE_PUNKT(SEADUSE_PUNKT param) {
	    this.sEADUSE_PUNKT = param;
	}
   
}
