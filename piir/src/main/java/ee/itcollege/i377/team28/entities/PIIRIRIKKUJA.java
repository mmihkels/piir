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
import ee.itcollege.i377.team28.entities.ISIK_INTSIDENDIS;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import ee.itcollege.i377.team28.entities.OBJEKT;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: PIIRIRIKKUJA
 *
 */
@Entity
@RooToString
@RooEntity
public class PIIRIRIKKUJA implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long piiririkkuja_id;
	@Size(min=1,max=32)
	private String isikukood;
	@Size(min=1,max=25)
	private String eesnimi;
	@Size(min=1,max=35)
	private String perek_nimi;
	@Size(min=1,max=1)
	private char sugu;
	@DateTimeFormat(style="M-")
	private Date synniaeg;
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
	@OneToMany(mappedBy = "pIIRIRIKKUJA")
	private Collection<KODAKONDSUS> kODAKONDSUS;
	@OneToMany(mappedBy = "pIIRIRIKKUJA")
	private Collection<ISIK_INTSIDENDIS> iSIK_INTSIDENDIS;
	@ManyToOne
	private OBJEKT oBJEKT;

	public PIIRIRIKKUJA() {
		super();
	}   
	public Long getPiiririkkuja_id() {
		return this.piiririkkuja_id;
	}

	public void setPiiririkkuja_id(Long piiririkkuja_id) {
		this.piiririkkuja_id = piiririkkuja_id;
	}   
	public String getIsikukood() {
		return this.isikukood;
	}

	public void setIsikukood(String isikukood) {
		this.isikukood = isikukood;
	}   
	public String getEesnimi() {
		return this.eesnimi;
	}

	public void setEesnimi(String eesnimi) {
		this.eesnimi = eesnimi;
	}   
	public String getPerek_nimi() {
		return this.perek_nimi;
	}

	public void setPerek_nimi(String perek_nimi) {
		this.perek_nimi = perek_nimi;
	}   
	public char getSugu() {
		return this.sugu;
	}

	public void setSugu(char sugu) {
		this.sugu = sugu;
	}   
	public Date getSynniaeg() {
		return this.synniaeg;
	}

	public void setSynniaeg(Date synniaeg) {
		this.synniaeg = synniaeg;
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
	public Collection<ISIK_INTSIDENDIS> getISIK_INTSIDENDIS() {
	    return iSIK_INTSIDENDIS;
	}
	public void setISIK_INTSIDENDIS(Collection<ISIK_INTSIDENDIS> param) {
	    this.iSIK_INTSIDENDIS = param;
	}
	public OBJEKT getOBJEKT() {
	    return oBJEKT;
	}
	public void setOBJEKT(OBJEKT param) {
	    this.oBJEKT = param;
	}
   
}
