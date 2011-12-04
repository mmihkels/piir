package ee.itcollege.i377.team28.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.i377.team28.entities.RIIGI_ADMIN_YKSUS;

/**
 * Entity implementation class for Entity: RIIGI_ADMIN_YKSUSE_LIIK
 * 
 */
@Entity
@RooToString
@RooEntity
public class RIIGI_ADMIN_YKSUSE_LIIK implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long riigi_admin_yksuse_liik_id;
	@NotNull
	@Size(min = 1, max = 100)
	private String nimetus;
	private String kommentaar;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date alates;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date kuni;
	@NotNull
	@Size(min = 1, max = 32)
	private String avaja;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date avatud;
	@NotNull
	@Size(min = 1, max = 32)
	private String muutja;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date muudetud;
	@Size(min = 1, max = 32)
	private String sulgeja;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date suletud;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "rIIGI_ADMIN_YKSUSE_LIIK_1")
	private Collection<VOIMALIK_ALLUVUS> vOIMALIK_ALLUVUS_1;
	@OneToMany(mappedBy = "rIIGI_ADMIN_YKSUSE_LIIK")
	private Collection<RIIGI_ADMIN_YKSUS> rIIGI_ADMIN_YKSUS;
	@NotNull
	@Size(min = 1, max = 32)
	private String kood;

	public RIIGI_ADMIN_YKSUSE_LIIK() {
		super();
	}

	public Long getRiigi_admin_yksuse_liik_id() {
		return this.riigi_admin_yksuse_liik_id;
	}

	public void setRiigi_admin_yksuse_liik_id(Long riigi_admin_yksuse_liik_id) {
		this.riigi_admin_yksuse_liik_id = riigi_admin_yksuse_liik_id;
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

	public Collection<VOIMALIK_ALLUVUS> getVOIMALIK_ALLUVUS_1() {
		return vOIMALIK_ALLUVUS_1;
	}

	public void setVOIMALIK_ALLUVUS_1(Collection<VOIMALIK_ALLUVUS> param) {
		this.vOIMALIK_ALLUVUS_1 = param;
	}

	public Collection<RIIGI_ADMIN_YKSUS> getRIIGI_ADMIN_YKSUS() {
		return rIIGI_ADMIN_YKSUS;
	}

	public void setRIIGI_ADMIN_YKSUS(Collection<RIIGI_ADMIN_YKSUS> param) {
		this.rIIGI_ADMIN_YKSUS = param;
	}

	public void setKood(String param) {
		this.kood = param;
	}

	public String getKood() {
		return kood;
	}

}
