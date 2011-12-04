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
import ee.itcollege.i377.team28.entities.VOODIKOHT;
import java.util.Collection;
import ee.itcollege.i377.team28.entities.RUUMIYKSUS;
import javax.persistence.OneToMany;
import ee.itcollege.i377.team28.entities.RIIGI_ADMIN_YKSUS;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ee.itcollege.i377.team28.entities.RUUMIYKSUSE_LIIK;

/**
 * Entity implementation class for Entity: RUUMIYKSUS
 *
 */
@Entity
@RooToString
@RooEntity
public class RUUMIYKSUS implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ruumiyksus_id;
	@Size(min=1,max=18)
	private String kood;
	@Size(min=1,max=18)
	private String nimetus;
	@Size(min=1,max=18)
	private String aadress;
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
	@OneToMany(mappedBy = "rUUMIYKSUS")
	private Collection<VOODIKOHT> vOODIKOHT;
	@ManyToOne
	private RUUMIYKSUS rUUMIYKSUS;
	@OneToMany(mappedBy = "rUUMIYKSUS")
	private Collection<RUUMIYKSUS> rUUMIYKSUS_1;
	@ManyToOne
	private RIIGI_ADMIN_YKSUS rIIGI_ADMIN_YKSUS;
	@ManyToOne
	private RUUMIYKSUSE_LIIK rUUMIYKSUSE_LIIK;

	public RUUMIYKSUS() {
		super();
	}   
	public Long getRuumiyksus_id() {
		return this.ruumiyksus_id;
	}

	public void setRuumiyksus_id(Long ruumiyksus_id) {
		this.ruumiyksus_id = ruumiyksus_id;
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
	public String getAadress() {
		return this.aadress;
	}

	public void setAadress(String aadress) {
		this.aadress = aadress;
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
	public Collection<VOODIKOHT> getVOODIKOHT() {
	    return vOODIKOHT;
	}
	public void setVOODIKOHT(Collection<VOODIKOHT> param) {
	    this.vOODIKOHT = param;
	}
	public RUUMIYKSUS getRUUMIYKSUS() {
	    return rUUMIYKSUS;
	}
	public void setRUUMIYKSUS(RUUMIYKSUS param) {
	    this.rUUMIYKSUS = param;
	}
	public Collection<RUUMIYKSUS> getRUUMIYKSUS_1() {
	    return rUUMIYKSUS_1;
	}
	public void setRUUMIYKSUS_1(Collection<RUUMIYKSUS> param) {
	    this.rUUMIYKSUS_1 = param;
	}
	public RIIGI_ADMIN_YKSUS getRIIGI_ADMIN_YKSUS() {
	    return rIIGI_ADMIN_YKSUS;
	}
	public void setRIIGI_ADMIN_YKSUS(RIIGI_ADMIN_YKSUS param) {
	    this.rIIGI_ADMIN_YKSUS = param;
	}
	public RUUMIYKSUSE_LIIK getRUUMIYKSUSE_LIIK() {
	    return rUUMIYKSUSE_LIIK;
	}
	public void setRUUMIYKSUSE_LIIK(RUUMIYKSUSE_LIIK param) {
	    this.rUUMIYKSUSE_LIIK = param;
	}
   
}
