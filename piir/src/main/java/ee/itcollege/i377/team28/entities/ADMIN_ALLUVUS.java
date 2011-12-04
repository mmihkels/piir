package ee.itcollege.i377.team28.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: ADMIN_ALLUVUS
 *
 */
@Entity
@RooToString
@RooEntity
public class ADMIN_ALLUVUS implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long admin_alluvus_id;
	
	private String alates;
	private String kuni;
	private String kommentaar;
	private String avaja;
	@DateTimeFormat(style="M-")
	private Date avatud;
	private String muutja;
	@DateTimeFormat(style="M-")
	private Date muudetud;
	private String sulgeja;
	@DateTimeFormat(style="M-")
	private Date suletud;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private RIIGI_ADMIN_YKSUS rIIGI_ADMIN_YKSUS;

	public ADMIN_ALLUVUS() {
		super();
	}   
	public Long getAdmin_alluvus_id() {
		return this.admin_alluvus_id;
	}

	public void setAdmin_alluvus_id(Long admin_alluvus_id) {
		this.admin_alluvus_id = admin_alluvus_id;
	}   
	public String getAlates() {
		return this.alates;
	}

	public void setAlates(String alates) {
		this.alates = alates;
	}   
	public String getKuni() {
		return this.kuni;
	}

	public void setKuni(String kuni) {
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
   
}
