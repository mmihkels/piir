package ee.itcollege.i377.team28.entities;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import ee.itcollege.i377.team28.entities.PIIRILOIK;
import ee.itcollege.i377.team28.entities.VAHTKOND;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: VAHTKOND_PIIRILOIGUL
 *
 */
@Entity
@RooToString
@RooEntity

public class VAHTKOND_PIIRILOIGUL implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long vahtkond_piiriloigul_id;
	@DateTimeFormat(style="M-")
	private Date alates;
	@DateTimeFormat(style="M-")
	private Date kuni;
	private String kommentaar;

	@Size(min=1,max=32)
	protected String avaja;
	@DateTimeFormat(style="M-")
	protected Date avatud;
	@Size(min=1,max=32)
	protected String muutja;
	@DateTimeFormat(style="M-")
	protected Date muudetud;	
	@Size(min=1,max=32)
	protected String sulgeja;
	@DateTimeFormat(style="M-")
	protected Date suletud;
	
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private PIIRILOIK pIIRILOIK;
	@ManyToOne
	private VAHTKOND vAHTKOND;

	public VAHTKOND_PIIRILOIGUL() {
		super();
	}   
	public Long getVahtkond_piiriloigul_id() {
		return this.vahtkond_piiriloigul_id;
	}

	public void setVahtkond_piiriloigul_id(Long vahtkond_piiriloigul_id) {
		this.vahtkond_piiriloigul_id = vahtkond_piiriloigul_id;
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
	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}   

	public void setSuletud(Date suletud) {
		this.suletud = suletud;
	}
	public PIIRILOIK getPIIRILOIK() {
	    return pIIRILOIK;
	}
	public void setPIIRILOIK(PIIRILOIK param) {
	    this.pIIRILOIK = param;
	}
	public VAHTKOND getVAHTKOND() {
	    return vAHTKOND;
	}
	public void setVAHTKOND(VAHTKOND param) {
	    this.vAHTKOND = param;
	}
	
	@PrePersist		
	public void recordCreated() {			
		String user = GetUser();		
		this.avaja = user;		
		this.muutja = user;		
		this.sulgeja = user;		
		this.avatud = new Date();		
		this.muudetud = new Date();		
		try {			
			this.suletud = new SimpleDateFormat("yyyy-MM-dd").parse("9999-12-31");		
		} catch (ParseException e) {			
			e.printStackTrace();		
		}	
	}
	
	@PreUpdate		
	public void recordModified() {			
		this.muutja = GetUser();		
		this.muudetud = new Date();		
	}
	
	private String GetUser() {		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();		
		return auth.getName();	
	}   
}
