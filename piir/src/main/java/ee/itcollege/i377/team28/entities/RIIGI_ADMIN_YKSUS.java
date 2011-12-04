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
import ee.itcollege.i377.team28.entities.RUUMIYKSUS;

/**
 * Entity implementation class for Entity: RIIGI_ADMIN_YKSUS
 *
 */
@Entity
@RooToString
@RooEntity
public class RIIGI_ADMIN_YKSUS implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long riigi_admin_yksus_id;
	@Size (min=1, max=100)
	private String nimetus;
	private String kommentaar;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date alates;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date kuni;
	@NotNull
	@Size (min=1, max=32)
	private String avaja;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date avatud;
	@NotNull
	@Size (min=1, max=32)
	private String muutja;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date muudetud;
	@Size (min=1, max=32)
	private String sulgeja;
	@NotNull
	@DateTimeFormat(style="M-")
	private Date suletud;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private RIIGI_ADMIN_YKSUSE_LIIK rIIGI_ADMIN_YKSUSE_LIIK;
	@OneToMany(mappedBy = "rIIGI_ADMIN_YKSUS")
	private Collection<VAEOSA> vAEOSA;
	@OneToMany(mappedBy = "rIIGI_ADMIN_YKSUS")
	private Collection<ADMIN_ALLUVUS> aDMIN_ALLUVUS;
	@OneToMany(mappedBy = "rIIGI_ADMIN_YKSUS")
	private Collection<RUUMIYKSUS> rUUMIYKSUS;

	public RIIGI_ADMIN_YKSUS() {
		super();
	}   
	public Long getRiigi_admin_yksus_id() {
		return this.riigi_admin_yksus_id;
	}

	public void setRiigi_admin_yksus_id(Long riigi_admin_yksus_id) {
		this.riigi_admin_yksus_id = riigi_admin_yksus_id;
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
	public RIIGI_ADMIN_YKSUSE_LIIK getRIIGI_ADMIN_YKSUSE_LIIK() {
	    return rIIGI_ADMIN_YKSUSE_LIIK;
	}
	public void setRIIGI_ADMIN_YKSUSE_LIIK(RIIGI_ADMIN_YKSUSE_LIIK param) {
	    this.rIIGI_ADMIN_YKSUSE_LIIK = param;
	}
	public Collection<VAEOSA> getVAEOSA() {
	    return vAEOSA;
	}
	public void setVAEOSA(Collection<VAEOSA> param) {
	    this.vAEOSA = param;
	}
	public Collection<ADMIN_ALLUVUS> getADMIN_ALLUVUS() {
	    return aDMIN_ALLUVUS;
	}
	public void setADMIN_ALLUVUS(Collection<ADMIN_ALLUVUS> param) {
	    this.aDMIN_ALLUVUS = param;
	}
	public Collection<RUUMIYKSUS> getRUUMIYKSUS() {
	    return rUUMIYKSUS;
	}
	public void setRUUMIYKSUS(Collection<RUUMIYKSUS> param) {
	    this.rUUMIYKSUS = param;
	}
   
}
