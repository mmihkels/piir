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
import ee.itcollege.i377.team28.entities.PIIRIVALVUR;
import ee.itcollege.i377.team28.entities.KONTAKTI_LIIK;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: PIIRIVALVURI_KONTAKT
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRIVALVURI_KONTAKT implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long piirivalvuri_kontakt_id;
	@NotNull
	@Size(min=1, max=120)
	private String kontakt;
	@Size(min=1, max=1)
	private String peamine_kontakt;
	@DateTimeFormat(style="M-")
	private Date alates;
	@DateTimeFormat(style="M-")
	private Date kuni;
	@NotNull
	private String kommentaar;
	@NotNull
	@Size(min=1, max=32)
	private String avaja;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date avatud;
	@NotNull
	@Size(min=1, max=32)
	private String muutja;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date muudetud;
	@Size(min=1, max=32)
	private String sulgeja;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date suletud;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private PIIRIVALVUR pIIRIVALVUR;
	@ManyToOne
	private KONTAKTI_LIIK kONTAKTI_LIIK;

	public PIIRIVALVURI_KONTAKT() {
		super();
	}   
	public Long getPiirivalvuri_kontakt_id() {
		return this.piirivalvuri_kontakt_id;
	}

	public void setPiirivalvuri_kontakt_id(Long piirivalvuri_kontakt_id) {
		this.piirivalvuri_kontakt_id = piirivalvuri_kontakt_id;
	}   
	public String getKontakt() {
		return this.kontakt;
	}

	public void setKontakt(String kontakt) {
		this.kontakt = kontakt;
	}   
	public String getPeamine_kontakt() {
		return this.peamine_kontakt;
	}

	public void setPeamine_kontakt(String peamine_kontakt) {
		this.peamine_kontakt = peamine_kontakt;
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
	public PIIRIVALVUR getPIIRIVALVUR() {
	    return pIIRIVALVUR;
	}
	public void setPIIRIVALVUR(PIIRIVALVUR param) {
	    this.pIIRIVALVUR = param;
	}
	public KONTAKTI_LIIK getKONTAKTI_LIIK() {
	    return kONTAKTI_LIIK;
	}
	public void setKONTAKTI_LIIK(KONTAKTI_LIIK param) {
	    this.kONTAKTI_LIIK = param;
	}
   
}
