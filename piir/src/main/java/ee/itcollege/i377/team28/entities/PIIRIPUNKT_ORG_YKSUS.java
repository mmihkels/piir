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
import ee.itcollege.i377.team28.entities.PIIRIPUNKT;
import ee.itcollege.i377.team28.entities.PIIRIPUNKT_ORG_YKSUS;
import javax.persistence.ManyToOne;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: PIIRIPUNKT_ORG_YKSUS
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRIPUNKT_ORG_YKSUS implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long piiripunkt_org_yksus_id;
	@NotNull
	@Size(min=1, max=20)
	private String kood;
	@NotNull
	@Size(min=1, max=100)
	private String nimetus;
	private String kommentaar;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date alates;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date kuni;
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
	private Long vaeosa_ID_id;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private PIIRIPUNKT pIIRIPUNKT;
	@ManyToOne
	private PIIRIPUNKT_ORG_YKSUS pIIRIPUNKT_ORG_YKSUS;
	@OneToMany(mappedBy = "pIIRIPUNKT_ORG_YKSUS")
	private Collection<PIIRIPUNKT_ORG_YKSUS> pIIRIPUNKT_ORG_YKSUS_1;

	public PIIRIPUNKT_ORG_YKSUS() {
		super();
	}   
	public Long getPiiripunkt_org_yksus_id() {
		return this.piiripunkt_org_yksus_id;
	}

	public void setPiiripunkt_org_yksus_id(Long piiripunkt_org_yksus_id) {
		this.piiripunkt_org_yksus_id = piiripunkt_org_yksus_id;
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
	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
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
	public Long getVaeosa_ID_id() {
		return this.vaeosa_ID_id;
	}

	public void setVaeosa_ID_id(Long vaeosa_ID_id) {
		this.vaeosa_ID_id = vaeosa_ID_id;
	}
	public PIIRIPUNKT getPIIRIPUNKT() {
	    return pIIRIPUNKT;
	}
	public void setPIIRIPUNKT(PIIRIPUNKT param) {
	    this.pIIRIPUNKT = param;
	}
	public PIIRIPUNKT_ORG_YKSUS getPIIRIPUNKT_ORG_YKSUS() {
	    return pIIRIPUNKT_ORG_YKSUS;
	}
	public void setPIIRIPUNKT_ORG_YKSUS(PIIRIPUNKT_ORG_YKSUS param) {
	    this.pIIRIPUNKT_ORG_YKSUS = param;
	}
	public Collection<PIIRIPUNKT_ORG_YKSUS> getPIIRIPUNKT_ORG_YKSUS_1() {
	    return pIIRIPUNKT_ORG_YKSUS_1;
	}
	public void setPIIRIPUNKT_ORG_YKSUS_1(Collection<PIIRIPUNKT_ORG_YKSUS> param) {
	    this.pIIRIPUNKT_ORG_YKSUS_1 = param;
	}
   
}
