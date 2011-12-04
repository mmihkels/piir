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
import ee.itcollege.i377.team28.entities.VAHTKOND_PIIRILOIGUL;
import java.util.Collection;
import ee.itcollege.i377.team28.entities.VAEOSA;
import javax.persistence.OneToMany;
import ee.itcollege.i377.team28.entities.PIIRIPUNKT;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ee.itcollege.i377.team28.entities.VAHTKONNA_LIIGE;
import ee.itcollege.i377.team28.entities.VAHTKOND_INTSIDENDIS;

/**
 * Entity implementation class for Entity: VAHTKOND
 *
 */
@Entity
@RooToString
@RooEntity

public class VAHTKOND implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long vahtkond_id;
	@Size(min=1,max=20)
	private String kood;
	@Size(min=1,max=60)
	private String nimetus;
	@DateTimeFormat(style="M-")
	private Date alates;
	@DateTimeFormat(style="M-")
	private Date kuni;
	private String kommentaar;
	@NotNull
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
	@OneToMany(mappedBy = "vAHTKOND")
	private Collection<VAHTKOND_PIIRILOIGUL> vAHTKOND_PIIRILOIGUL;
	@ManyToOne
	private VAEOSA vAEOSA;
	@ManyToOne
	private PIIRIPUNKT pIIRIPUNKT;
	@OneToMany(mappedBy = "vAHTKOND")
	private Collection<VAHTKONNA_LIIGE> vAHTKONNA_LIIGE;
	@OneToMany(mappedBy = "vAHTKOND")
	private Collection<VAHTKOND_INTSIDENDIS> vAHTKOND_INTSIDENDIS;

	public VAHTKOND() {
		super();
	}   
	public Long getVahtkond_id() {
		return this.vahtkond_id;
	}

	public void setVahtkond_id(Long vahtkond_id) {
		this.vahtkond_id = vahtkond_id;
	}   
	public String getKood() {
		return this.kood;
	}

	public void setKood(String kood) {
		this.kood = kood;
	}   
	public String getNimetus() {
		return this.nimetus;
	}

	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
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
	public Collection<VAHTKOND_PIIRILOIGUL> getVAHTKOND_PIIRILOIGUL() {
	    return vAHTKOND_PIIRILOIGUL;
	}
	public void setVAHTKOND_PIIRILOIGUL(Collection<VAHTKOND_PIIRILOIGUL> param) {
	    this.vAHTKOND_PIIRILOIGUL = param;
	}
	public VAEOSA getVAEOSA() {
	    return vAEOSA;
	}
	public void setVAEOSA(VAEOSA param) {
	    this.vAEOSA = param;
	}
	public PIIRIPUNKT getPIIRIPUNKT() {
	    return pIIRIPUNKT;
	}
	public void setPIIRIPUNKT(PIIRIPUNKT param) {
	    this.pIIRIPUNKT = param;
	}
	public Collection<VAHTKONNA_LIIGE> getVAHTKONNA_LIIGE() {
	    return vAHTKONNA_LIIGE;
	}
	public void setVAHTKONNA_LIIGE(Collection<VAHTKONNA_LIIGE> param) {
	    this.vAHTKONNA_LIIGE = param;
	}
	public Collection<VAHTKOND_INTSIDENDIS> getVAHTKOND_INTSIDENDIS() {
	    return vAHTKOND_INTSIDENDIS;
	}
	public void setVAHTKOND_INTSIDENDIS(Collection<VAHTKOND_INTSIDENDIS> param) {
	    this.vAHTKOND_INTSIDENDIS = param;
	}
   
}
