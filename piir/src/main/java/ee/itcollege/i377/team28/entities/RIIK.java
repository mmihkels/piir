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
import ee.itcollege.i377.team28.entities.KODAKONDSUS;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: RIIK
 *
 */
@Entity
@RooToString
@RooEntity
public class RIIK implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long riik_id;
	@NotNull
	@Size(min=1,max=20)
	private String ISO_kood;
	@Size(min=1,max=18)
	private String ANSI_kood;
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
	@OneToMany(mappedBy = "rIIK")
	private Collection<KODAKONDSUS> kODAKONDSUS;

	public RIIK() {
		super();
	}   
	public Long getRiik_id() {
		return this.riik_id;
	}

	public void setRiik_id(Long riik_id) {
		this.riik_id = riik_id;
	}   
	public String getISO_kood() {
		return this.ISO_kood;
	}

	public void setISO_kood(String ISO_kood) {
		this.ISO_kood = ISO_kood;
	}   
	public String getANSI_kood() {
		return this.ANSI_kood;
	}

	public void setANSI_kood(String ANSI_kood) {
		this.ANSI_kood = ANSI_kood;
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
	public Collection<KODAKONDSUS> getKODAKONDSUS() {
	    return kODAKONDSUS;
	}
	public void setKODAKONDSUS(Collection<KODAKONDSUS> param) {
	    this.kODAKONDSUS = param;
	}
   
}
