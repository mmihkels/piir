package ee.itcollege.i377.team28.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.i377.team28.entities.AMET_PIIRIPUNKTIS;

/**
 * Entity implementation class for Entity: AMET
 *
 */
@Entity
@RooToString
@RooEntity

public class AMET implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long amet_id;
	@Size(min=1,max=10)
	private String ISCO_kood;
	@Size(min=1,max=60)
	private String nimetus;
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
	@OneToMany(mappedBy = "aMET")
	private Collection<AMET_VAEOSAS> aMET_VAEOSAS;
	@OneToMany(mappedBy = "aMET")
	private Collection<AMET_PIIRIPUNKTIS> aMET_PIIRIPUNKTIS;
	public AMET() {
		super();
	}   
	public Long getAmet_id() {
		return this.amet_id;
	}

	public void setAmet_id(Long amet_id) {
		this.amet_id = amet_id;
	}   
	public String getISCO_kood() {
		return this.ISCO_kood;
	}

	public void setISCO_kood(String ISCO_kood) {
		this.ISCO_kood = ISCO_kood;
	}   
	public String getNimetus() {
		return this.nimetus;
	}

	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
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
	public Collection<AMET_VAEOSAS> getAMET_VAEOSAS() {
	    return aMET_VAEOSAS;
	}
	public void setAMET_VAEOSAS(Collection<AMET_VAEOSAS> param) {
	    this.aMET_VAEOSAS = param;
	}
	public Collection<AMET_PIIRIPUNKTIS> getAMET_PIIRIPUNKTIS() {
	    return aMET_PIIRIPUNKTIS;
	}
	public void setAMET_PIIRIPUNKTIS(Collection<AMET_PIIRIPUNKTIS> param) {
	    this.aMET_PIIRIPUNKTIS = param;
	}
   
}
