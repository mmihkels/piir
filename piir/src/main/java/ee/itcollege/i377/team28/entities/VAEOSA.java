package ee.itcollege.i377.team28.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.i377.team28.entities.AMET_VAEOSAS;
import ee.itcollege.i377.team28.entities.PIIRILOIGU_HALDAJA;
import ee.itcollege.i377.team28.entities.VAHTKOND;
import ee.itcollege.i377.team28.entities.PIIRIPUNKTI_ALLUVUS;

/**
 * Entity implementation class for Entity: VAEOSA
 *
 */
@Entity
@RooToString
@RooEntity
public class VAEOSA implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long vaeosa_ID_id;
	@NotNull
	@Size(min=1, max=20)
	private String kood;
	@NotNull
	@Size(min=1, max=100)
	private String nimetus;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date alates;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date kuni;
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
	private RIIGI_ADMIN_YKSUS rIIGI_ADMIN_YKSUS;
	@OneToMany(mappedBy = "vAEOSA")
	private Collection<VAEOSA_ALLUVUS> vAEOSA_ALLUVUS;
	@OneToMany(mappedBy = "vAEOSA")
	private Collection<PIIRIPUNKTI_ALLUVUS> pIIRIPUNKT_ALLUVUS;
	@OneToMany(mappedBy = "vAEOSA")
	private Collection<ORG_YKSUS> oRG_YKSUS;
	@OneToMany(mappedBy = "vAEOSA")
	private Collection<AMET_VAEOSAS> aMET_VAEOSAS;
	@OneToMany(mappedBy = "vAEOSA")
	private Collection<PIIRILOIGU_HALDAJA> pIIRILOIGU_HALDAJA;
	@OneToMany(mappedBy = "vAEOSA")
	private Collection<VAHTKOND> vAHTKOND;
	@OneToMany(mappedBy = "vAEOSA")
	private Collection<PIIRIPUNKTI_ALLUVUS> pIIRIPUNKTI_ALLUVUS;

	public VAEOSA() {
		super();
	}   
	public Long getVaeosa_ID_id() {
		return this.vaeosa_ID_id;
	}

	public void setVaeosa_ID_id(Long vaeosa_ID_id) {
		this.vaeosa_ID_id = vaeosa_ID_id;
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
	public RIIGI_ADMIN_YKSUS getRIIGI_ADMIN_YKSUS() {
	    return rIIGI_ADMIN_YKSUS;
	}
	public void setRIIGI_ADMIN_YKSUS(RIIGI_ADMIN_YKSUS param) {
	    this.rIIGI_ADMIN_YKSUS = param;
	}
	public Collection<VAEOSA_ALLUVUS> getVAEOSA_ALLUVUS() {
	    return vAEOSA_ALLUVUS;
	}
	public void setVAEOSA_ALLUVUS(Collection<VAEOSA_ALLUVUS> param) {
	    this.vAEOSA_ALLUVUS = param;
	}
	public Collection<PIIRIPUNKTI_ALLUVUS> getPIIRIPUNKT_ALLUVUS() {
	    return pIIRIPUNKT_ALLUVUS;
	}
	public void setPIIRIPUNKT_ALLUVUS(Collection<PIIRIPUNKTI_ALLUVUS> param) {
	    this.pIIRIPUNKT_ALLUVUS = param;
	}
	public Collection<ORG_YKSUS> getORG_YKSUS() {
	    return oRG_YKSUS;
	}
	public void setORG_YKSUS(Collection<ORG_YKSUS> param) {
	    this.oRG_YKSUS = param;
	}
	public Collection<AMET_VAEOSAS> getAMET_VAEOSAS() {
	    return aMET_VAEOSAS;
	}
	public void setAMET_VAEOSAS(Collection<AMET_VAEOSAS> param) {
	    this.aMET_VAEOSAS = param;
	}
	public Collection<PIIRILOIGU_HALDAJA> getPIIRILOIGU_HALDAJA() {
	    return pIIRILOIGU_HALDAJA;
	}
	public void setPIIRILOIGU_HALDAJA(Collection<PIIRILOIGU_HALDAJA> param) {
	    this.pIIRILOIGU_HALDAJA = param;
	}
	public Collection<VAHTKOND> getVAHTKOND() {
	    return vAHTKOND;
	}
	public void setVAHTKOND(Collection<VAHTKOND> param) {
	    this.vAHTKOND = param;
	}
	public Collection<PIIRIPUNKTI_ALLUVUS> getPIIRIPUNKTI_ALLUVUS() {
	    return pIIRIPUNKTI_ALLUVUS;
	}
	public void setPIIRIPUNKTI_ALLUVUS(Collection<PIIRIPUNKTI_ALLUVUS> param) {
	    this.pIIRIPUNKTI_ALLUVUS = param;
	}
   
}
