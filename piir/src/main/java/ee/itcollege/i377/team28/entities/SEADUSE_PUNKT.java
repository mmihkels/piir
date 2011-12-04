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
import ee.itcollege.i377.team28.entities.PIIRIVALVE_SEADUS_INTSIDENDI;
import java.util.Collection;
import ee.itcollege.i377.team28.entities.SEADUS;
import javax.persistence.OneToMany;
import ee.itcollege.i377.team28.entities.SEADUSE_PUNKT;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ee.itcollege.i377.team28.entities.OBJEKTI_SEADUS_INTSIDENDIS;
import ee.itcollege.i377.team28.entities.ISIKU_SEADUS_INTSIDENDID;

/**
 * Entity implementation class for Entity: SEADUSE_PUNKT
 *
 */
@Entity
@RooToString
@RooEntity
public class SEADUSE_PUNKT implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long seaduse_punkt_id;
	@Size(min=1,max=18)
	private String paragrahv;
	@Size(min=1,max=18)
	private String pais;
	@Size(min=1,max=18)
	private String tekst;
	@Size(min=1,max=18)
	private String kehtiv_alates;
	@Size(min=1,max=18)
	private String kehtiv_kuni;
	@Size(min=1,max=18)
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
	@OneToMany(mappedBy = "sEADUSE_PUNKT")
	private Collection<PIIRIVALVE_SEADUS_INTSIDENDI> pIIRIVALVE_SEADUS_INTSIDENDI;
	@ManyToOne
	private SEADUS sEADUS;
	@ManyToOne
	private SEADUSE_PUNKT sEADUSE_PUNKT;
	@OneToMany(mappedBy = "sEADUSE_PUNKT")
	private Collection<SEADUSE_PUNKT> sEADUSE_PUNKT_1;
	@OneToMany(mappedBy = "sEADUSE_PUNKT")
	private Collection<OBJEKTI_SEADUS_INTSIDENDIS> oBJEKTI_SEADUS_INTSIDENDIS;
	@OneToMany(mappedBy = "sEADUSE_PUNKT")
	private Collection<ISIKU_SEADUS_INTSIDENDID> iSIKU_SEADUS_INTSIDENDID;

	public SEADUSE_PUNKT() {
		super();
	}   
	public Long getSeaduse_punkt_id() {
		return this.seaduse_punkt_id;
	}

	public void setSeaduse_punkt_id(Long seaduse_punkt_id) {
		this.seaduse_punkt_id = seaduse_punkt_id;
	}   
	public String getParagrahv() {
		return this.paragrahv;
	}

	public void setParagrahv(String paragrahv) {
		this.paragrahv = paragrahv;
	}   
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}   
	public String getTekst() {
		return this.tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}   
	public String getKehtiv_alates() {
		return this.kehtiv_alates;
	}

	public void setKehtiv_alates(String kehtiv_alates) {
		this.kehtiv_alates = kehtiv_alates;
	}   
	public String getKehtiv_kuni() {
		return this.kehtiv_kuni;
	}

	public void setKehtiv_kuni(String kehtiv_kuni) {
		this.kehtiv_kuni = kehtiv_kuni;
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
	public Collection<PIIRIVALVE_SEADUS_INTSIDENDI> getPIIRIVALVE_SEADUS_INTSIDENDI() {
	    return pIIRIVALVE_SEADUS_INTSIDENDI;
	}
	public void setPIIRIVALVE_SEADUS_INTSIDENDI(Collection<PIIRIVALVE_SEADUS_INTSIDENDI> param) {
	    this.pIIRIVALVE_SEADUS_INTSIDENDI = param;
	}
	public SEADUS getSEADUS() {
	    return sEADUS;
	}
	public void setSEADUS(SEADUS param) {
	    this.sEADUS = param;
	}
	public SEADUSE_PUNKT getSEADUSE_PUNKT() {
	    return sEADUSE_PUNKT;
	}
	public void setSEADUSE_PUNKT(SEADUSE_PUNKT param) {
	    this.sEADUSE_PUNKT = param;
	}
	public Collection<SEADUSE_PUNKT> getSEADUSE_PUNKT_1() {
	    return sEADUSE_PUNKT_1;
	}
	public void setSEADUSE_PUNKT_1(Collection<SEADUSE_PUNKT> param) {
	    this.sEADUSE_PUNKT_1 = param;
	}
	public Collection<OBJEKTI_SEADUS_INTSIDENDIS> getOBJEKTI_SEADUS_INTSIDENDIS() {
	    return oBJEKTI_SEADUS_INTSIDENDIS;
	}
	public void setOBJEKTI_SEADUS_INTSIDENDIS(Collection<OBJEKTI_SEADUS_INTSIDENDIS> param) {
	    this.oBJEKTI_SEADUS_INTSIDENDIS = param;
	}
	public Collection<ISIKU_SEADUS_INTSIDENDID> getISIKU_SEADUS_INTSIDENDID() {
	    return iSIKU_SEADUS_INTSIDENDID;
	}
	public void setISIKU_SEADUS_INTSIDENDID(Collection<ISIKU_SEADUS_INTSIDENDID> param) {
	    this.iSIKU_SEADUS_INTSIDENDID = param;
	}
   
}
