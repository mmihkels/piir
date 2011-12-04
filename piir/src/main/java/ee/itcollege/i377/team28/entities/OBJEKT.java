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
import ee.itcollege.i377.team28.entities.OBJEKT_INTSIDENDIS;
import java.util.Collection;
import ee.itcollege.i377.team28.entities.OBJEKTI_LIIK;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import ee.itcollege.i377.team28.entities.PIIRIRIKKUJA;

/**
 * Entity implementation class for Entity: OBJEKT
 *
 */
@Entity
@RooToString
@RooEntity
public class OBJEKT implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long objekt_id;
	@Size(min=1,max=100)
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
	@OneToMany(mappedBy = "oBJEKT")
	private Collection<OBJEKT_INTSIDENDIS> oBJEKT_INTSIDENDIS;
	@ManyToOne
	private OBJEKTI_LIIK oBJEKTI_LIIK;
	@OneToMany(mappedBy = "oBJEKT")
	private Collection<PIIRIRIKKUJA> pIIRIRIKKUJA;

	public OBJEKT() {
		super();
	}   
	public Long getObjekt_id() {
		return this.objekt_id;
	}

	public void setObjekt_id(Long objekt_id) {
		this.objekt_id = objekt_id;
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
	public Collection<OBJEKT_INTSIDENDIS> getOBJEKT_INTSIDENDIS() {
	    return oBJEKT_INTSIDENDIS;
	}
	public void setOBJEKT_INTSIDENDIS(Collection<OBJEKT_INTSIDENDIS> param) {
	    this.oBJEKT_INTSIDENDIS = param;
	}
	public OBJEKTI_LIIK getOBJEKTI_LIIK() {
	    return oBJEKTI_LIIK;
	}
	public void setOBJEKTI_LIIK(OBJEKTI_LIIK param) {
	    this.oBJEKTI_LIIK = param;
	}
	public Collection<PIIRIRIKKUJA> getPIIRIRIKKUJA() {
	    return pIIRIRIKKUJA;
	}
	public void setPIIRIRIKKUJA(Collection<PIIRIRIKKUJA> param) {
	    this.pIIRIRIKKUJA = param;
	}
   
}
