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
import ee.itcollege.i377.team28.entities.PIIRILOIGU_HALDAJA;
import java.util.Collection;
import ee.itcollege.i377.team28.entities.VAHTKOND_PIIRILOIGUL;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ee.itcollege.i377.team28.entities.INTSIDENT;

/**
 * Entity implementation class for Entity: PIIRILOIK
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRILOIK implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long piiriloik_id;
	@Size(min=1,max=18)
	private String kood;
	@Size(min=1,max=60)
	private String nimetus;
	private String GPS_koordinaadid;
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
	private Long vaeosa_ID_id;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date suletud;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "pIIRILOIK")
	private Collection<PIIRILOIGU_HALDAJA> pIIRILOIGU_HALDAJA;
	@OneToMany(mappedBy = "pIIRILOIK")
	private Collection<VAHTKOND_PIIRILOIGUL> vAHTKOND_PIIRILOIGUL;
	@OneToMany(mappedBy = "pIIRILOIK")
	private Collection<INTSIDENT> iNTSIDENT;

	public PIIRILOIK() {
		super();
	}   
	public Long getPiiriloik_id() {
		return this.piiriloik_id;
	}

	public void setPiiriloik_id(Long piiriloik_id) {
		this.piiriloik_id = piiriloik_id;
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
	public String getGPS_koordinaadid() {
		return this.GPS_koordinaadid;
	}

	public void setGPS_koordinaadid(String GPS_koordinaadid) {
		this.GPS_koordinaadid = GPS_koordinaadid;
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
	public Long getVaeosa_ID_id() {
		return this.vaeosa_ID_id;
	}

	public void setVaeosa_ID_id(Long vaeosa_ID_id) {
		this.vaeosa_ID_id = vaeosa_ID_id;
	}   
	public Date getSuletud() {
		return this.suletud;
	}

	public void setSuletud(Date suletud) {
		this.suletud = suletud;
	}
	public Collection<PIIRILOIGU_HALDAJA> getPIIRILOIGU_HALDAJA() {
	    return pIIRILOIGU_HALDAJA;
	}
	public void setPIIRILOIGU_HALDAJA(Collection<PIIRILOIGU_HALDAJA> param) {
	    this.pIIRILOIGU_HALDAJA = param;
	}
	public Collection<VAHTKOND_PIIRILOIGUL> getVAHTKOND_PIIRILOIGUL() {
	    return vAHTKOND_PIIRILOIGUL;
	}
	public void setVAHTKOND_PIIRILOIGUL(Collection<VAHTKOND_PIIRILOIGUL> param) {
	    this.vAHTKOND_PIIRILOIGUL = param;
	}
	public Collection<INTSIDENT> getINTSIDENT() {
	    return iNTSIDENT;
	}
	public void setINTSIDENT(Collection<INTSIDENT> param) {
	    this.iNTSIDENT = param;
	}
   
}
