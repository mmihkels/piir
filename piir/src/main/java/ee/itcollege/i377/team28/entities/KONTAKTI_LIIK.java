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
import ee.itcollege.i377.team28.entities.PIIRIVALVURI_KONTAKT;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: KONTAKTI_LIIK
 *
 */
@Entity
@RooToString
@RooEntity

public class KONTAKTI_LIIK implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long kontakti_liik_id;
	@NotNull
	@Size(min=1,max=60)
	private String nimetus;
	private String XML_kirjeldus;
	@NotNull
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
	@OneToMany(mappedBy = "kONTAKTI_LIIK")
	private Collection<PIIRIVALVURI_KONTAKT> pIIRIVALVURI_KONTAKT;

	public KONTAKTI_LIIK() {
		super();
	}   
	public Long getKontakti_liik_id() {
		return this.kontakti_liik_id;
	}

	public void setKontakti_liik_id(Long kontakti_liik_id) {
		this.kontakti_liik_id = kontakti_liik_id;
	}   
	public String getNimetus() {
		return this.nimetus;
	}

	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
	}   
	public String getXML_kirjeldus() {
		return this.XML_kirjeldus;
	}

	public void setXML_kirjeldus(String XML_kirjeldus) {
		this.XML_kirjeldus = XML_kirjeldus;
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
	public Collection<PIIRIVALVURI_KONTAKT> getPIIRIVALVURI_KONTAKT() {
	    return pIIRIVALVURI_KONTAKT;
	}
	public void setPIIRIVALVURI_KONTAKT(Collection<PIIRIVALVURI_KONTAKT> param) {
	    this.pIIRIVALVURI_KONTAKT = param;
	}
   
}
