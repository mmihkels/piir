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
import ee.itcollege.i377.team28.entities.SEOTUD_KONTAKTISIK;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: SUGULUSE_ROLLI_LIIT
 *
 */
@Entity
@RooToString
@RooEntity
public class SUGULUSE_ROLLI_LIIT implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long suguluse_rolli_liit_id;
	@NotNull
	@Size(min=1,max=60)
	private String nimetus;
	private String kommentaar;
	@Size(min=1,max=1)
	private char sugulane_voi_mitte;
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
	@OneToMany(mappedBy = "sUGULUSE_ROLLI_LIIT")
	private Collection<SEOTUD_KONTAKTISIK> sEOTUD_KONTAKTISIK;

	public SUGULUSE_ROLLI_LIIT() {
		super();
	}   
	public Long getSuguluse_rolli_liit_id() {
		return this.suguluse_rolli_liit_id;
	}

	public void setSuguluse_rolli_liit_id(Long suguluse_rolli_liit_id) {
		this.suguluse_rolli_liit_id = suguluse_rolli_liit_id;
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
	public char getSugulane_voi_mitte() {
		return this.sugulane_voi_mitte;
	}

	public void setSugulane_voi_mitte(char sugulane_voi_mitte) {
		this.sugulane_voi_mitte = sugulane_voi_mitte;
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
	public Collection<SEOTUD_KONTAKTISIK> getSEOTUD_KONTAKTISIK() {
	    return sEOTUD_KONTAKTISIK;
	}
	public void setSEOTUD_KONTAKTISIK(Collection<SEOTUD_KONTAKTISIK> param) {
	    this.sEOTUD_KONTAKTISIK = param;
	}
   
}
