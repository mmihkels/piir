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
import ee.itcollege.i377.team28.entities.PIIRILOIK;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ee.itcollege.i377.team28.entities.VAEOSA;

/**
 * Entity implementation class for Entity: PIIRILOIGU_HALDAJA
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRILOIGU_HALDAJA implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long piiriloigu_haldaja_id;
	private String kood;
	private String nimetus;
	private double GPS_longitude;
	private double GPS_latitude;
	private double korgus_merepinnast;
	private String kommentaar;
	@DateTimeFormat(style="M-")
	private Date alates;
	@DateTimeFormat(style="M-")
	private Date kuni;
	private String avaja;
	@DateTimeFormat(style="M-")
	private Date avatud;
	@NotNull
	@Size(min=1,max=32)
	private String muutja;
	@DateTimeFormat(style="M-")
	private Date muudetud;
	private String sulgeja;
	@DateTimeFormat(style="M-")
	private Date suletud;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private PIIRIPUNKT pIIRIPUNKT;
	@ManyToOne
	private PIIRILOIK pIIRILOIK;
	@ManyToOne
	private VAEOSA vAEOSA;

	public PIIRILOIGU_HALDAJA() {
		super();
	}   
	public Long getPiiriloigu_haldaja_id() {
		return this.piiriloigu_haldaja_id;
	}

	public void setPiiriloigu_haldaja_id(Long piiriloigu_haldaja_id) {
		this.piiriloigu_haldaja_id = piiriloigu_haldaja_id;
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
	public double getGPS_longitude() {
		return this.GPS_longitude;
	}

	public void setGPS_longitude(double GPS_longitude) {
		this.GPS_longitude = GPS_longitude;
	}   
	public double getGPS_latitude() {
		return this.GPS_latitude;
	}

	public void setGPS_latitude(double GPS_latitude) {
		this.GPS_latitude = GPS_latitude;
	}   
	public double getKorgus_merepinnast() {
		return this.korgus_merepinnast;
	}

	public void setKorgus_merepinnast(double korgus_merepinnast) {
		this.korgus_merepinnast = korgus_merepinnast;
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
	public PIIRIPUNKT getPIIRIPUNKT() {
	    return pIIRIPUNKT;
	}
	public void setPIIRIPUNKT(PIIRIPUNKT param) {
	    this.pIIRIPUNKT = param;
	}
	public PIIRILOIK getPIIRILOIK() {
	    return pIIRILOIK;
	}
	public void setPIIRILOIK(PIIRILOIK param) {
	    this.pIIRILOIK = param;
	}
	public VAEOSA getVAEOSA() {
	    return vAEOSA;
	}
	public void setVAEOSA(VAEOSA param) {
	    this.vAEOSA = param;
	}
   
}
