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
import ee.itcollege.i377.team28.entities.RUUMIYKSUS;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import ee.itcollege.i377.team28.entities.PIIRIVALVUR_VOODIKOHAL;
import java.util.Collection;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: VOODIKOHT
 *
 */
@Entity
@RooToString
@RooEntity

public class VOODIKOHT implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long voodikoht_id;
	@Size(min=1,max=20)
	private String number;
	private Long pikkus;
	private Long laius;
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
	@ManyToOne
	private RUUMIYKSUS rUUMIYKSUS;
	@OneToMany(mappedBy = "vOODIKOHT")
	private Collection<PIIRIVALVUR_VOODIKOHAL> pIIRIVALVUR_VOODIKOHAL;

	public VOODIKOHT() {
		super();
	}   
	public Long getVoodikoht_id() {
		return this.voodikoht_id;
	}

	public void setVoodikoht_id(Long voodikoht_id) {
		this.voodikoht_id = voodikoht_id;
	}   
	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}   
	public Long getPikkus() {
		return this.pikkus;
	}

	public void setPikkus(Long pikkus) {
		this.pikkus = pikkus;
	}   
	public Long getLaius() {
		return this.laius;
	}

	public void setLaius(Long laius) {
		this.laius = laius;
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
	public RUUMIYKSUS getRUUMIYKSUS() {
	    return rUUMIYKSUS;
	}
	public void setRUUMIYKSUS(RUUMIYKSUS param) {
	    this.rUUMIYKSUS = param;
	}
	public Collection<PIIRIVALVUR_VOODIKOHAL> getPIIRIVALVUR_VOODIKOHAL() {
	    return pIIRIVALVUR_VOODIKOHAL;
	}
	public void setPIIRIVALVUR_VOODIKOHAL(Collection<PIIRIVALVUR_VOODIKOHAL> param) {
	    this.pIIRIVALVUR_VOODIKOHAL = param;
	}
   
}
