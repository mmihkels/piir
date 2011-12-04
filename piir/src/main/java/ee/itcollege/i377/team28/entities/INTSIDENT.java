package ee.itcollege.i377.team28.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.i377.team28.entities.INTSIDENDI_LIIK;
import ee.itcollege.i377.team28.entities.PIIRILOIK;
import javax.persistence.ManyToOne;
import ee.itcollege.i377.team28.entities.VAHTKOND_INTSIDENDIS;
import java.util.Collection;
import ee.itcollege.i377.team28.entities.PIIRIVALVUR_INTSIDENDIS;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ee.itcollege.i377.team28.entities.ISIK_INTSIDENDIS;
import ee.itcollege.i377.team28.entities.OBJEKT_INTSIDENDIS;

/**
 * Entity implementation class for Entity: INTSIDENT
 *
 */
@Entity
@RooToString
@RooEntity
public class INTSIDENT implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long intsident_id;
	@Size(min=1,max=20)
	private String kood;
	@Size(min=1,max=100)
	private String nimetus;
	@DateTimeFormat(style="M-")
	private Date toimumise_algus;
	@DateTimeFormat(style="M-")
	private Date toimumise_lopp;
	@Digits(integer=9,fraction=0)
	private BigDecimal GPS_longituud;
	@Digits(integer=9,fraction=0)
	private BigDecimal GPS_latituud;
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
	private Date sulgeja;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date suletud;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private INTSIDENDI_LIIK iNTSIDENDI_LIIK;
	@ManyToOne
	private PIIRILOIK pIIRILOIK;
	@OneToMany(mappedBy = "iNTSIDENT")
	private Collection<VAHTKOND_INTSIDENDIS> vAHTKOND_INTSIDENDIS;
	@OneToMany(mappedBy = "iNTSIDENT")
	private Collection<PIIRIVALVUR_INTSIDENDIS> pIIRIVALVUR_INTSIDENDIS;
	@OneToMany(mappedBy = "iNTSIDENT")
	private Collection<ISIK_INTSIDENDIS> iSIK_INTSIDENDIS;
	@OneToMany(mappedBy = "iNTSIDENT")
	private Collection<OBJEKT_INTSIDENDIS> oBJEKT_INTSIDENDIS;

	public INTSIDENT() {
		super();
	}   
	public Long getIntsident_id() {
		return this.intsident_id;
	}

	public void setIntsident_id(Long intsident_id) {
		this.intsident_id = intsident_id;
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
	public Date getToimumise_algus() {
		return this.toimumise_algus;
	}

	public void setToimumise_algus(Date toimumise_algus) {
		this.toimumise_algus = toimumise_algus;
	}   
	public Date getToimumise_lopp() {
		return this.toimumise_lopp;
	}

	public void setToimumise_lopp(Date toimumise_lopp) {
		this.toimumise_lopp = toimumise_lopp;
	}   
	public BigDecimal getGPS_longituud() {
		return this.GPS_longituud;
	}

	public void setGPS_longituud(BigDecimal GPS_longituud) {
		this.GPS_longituud = GPS_longituud;
	}   
	public BigDecimal getGPS_latituud() {
		return this.GPS_latituud;
	}

	public void setGPS_latituud(BigDecimal GPS_latituud) {
		this.GPS_latituud = GPS_latituud;
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
	public Date getSulgeja() {
		return this.sulgeja;
	}

	public void setSulgeja(Date sulgeja) {
		this.sulgeja = sulgeja;
	}   
	public Date getSuletud() {
		return this.suletud;
	}

	public void setSuletud(Date suletud) {
		this.suletud = suletud;
	}
	public INTSIDENDI_LIIK getINTSIDENDI_LIIK() {
	    return iNTSIDENDI_LIIK;
	}
	public void setINTSIDENDI_LIIK(INTSIDENDI_LIIK param) {
	    this.iNTSIDENDI_LIIK = param;
	}
	public PIIRILOIK getPIIRILOIK() {
	    return pIIRILOIK;
	}
	public void setPIIRILOIK(PIIRILOIK param) {
	    this.pIIRILOIK = param;
	}
	public Collection<VAHTKOND_INTSIDENDIS> getVAHTKOND_INTSIDENDIS() {
	    return vAHTKOND_INTSIDENDIS;
	}
	public void setVAHTKOND_INTSIDENDIS(Collection<VAHTKOND_INTSIDENDIS> param) {
	    this.vAHTKOND_INTSIDENDIS = param;
	}
	public Collection<PIIRIVALVUR_INTSIDENDIS> getPIIRIVALVUR_INTSIDENDIS() {
	    return pIIRIVALVUR_INTSIDENDIS;
	}
	public void setPIIRIVALVUR_INTSIDENDIS(Collection<PIIRIVALVUR_INTSIDENDIS> param) {
	    this.pIIRIVALVUR_INTSIDENDIS = param;
	}
	public Collection<ISIK_INTSIDENDIS> getISIK_INTSIDENDIS() {
	    return iSIK_INTSIDENDIS;
	}
	public void setISIK_INTSIDENDIS(Collection<ISIK_INTSIDENDIS> param) {
	    this.iSIK_INTSIDENDIS = param;
	}
	public Collection<OBJEKT_INTSIDENDIS> getOBJEKT_INTSIDENDIS() {
	    return oBJEKT_INTSIDENDIS;
	}
	public void setOBJEKT_INTSIDENDIS(Collection<OBJEKT_INTSIDENDIS> param) {
	    this.oBJEKT_INTSIDENDIS = param;
	}
   
}
