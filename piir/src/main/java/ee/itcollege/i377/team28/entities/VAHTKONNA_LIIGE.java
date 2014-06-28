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

import ee.itcollege.i377.team28.entities.VAHTKOND;
import ee.itcollege.i377.team28.entities.PIIRIVALVUR;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: VAHTKONNA_LIIGE
 *
 */
@Entity
@RooToString
@RooEntity
public class VAHTKONNA_LIIGE implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long vahtkonna_liige_id;
	@DateTimeFormat(style="M-")
	
	private Date alates;
	@DateTimeFormat(style="M-")
	private Date kuni;
	@Size(min=1,max=18)
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
	private VAHTKOND vAHTKOND;
	@ManyToOne
	private PIIRIVALVUR pIIRIVALVUR;

	public VAHTKONNA_LIIGE() {
		super();
	}   
	public Long getVahtkonna_liige_id() {
		return this.vahtkonna_liige_id;
	}

	public void setVahtkonna_liige_id(Long vahtkonna_liige_id) {
		this.vahtkonna_liige_id = vahtkonna_liige_id;
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
	public VAHTKOND getVAHTKOND() {
	    return vAHTKOND;
	}
	public void setVAHTKOND(VAHTKOND param) {
	    this.vAHTKOND = param;
	}
	public PIIRIVALVUR getPIIRIVALVUR() {
	    return pIIRIVALVUR;
	}
	public void setPIIRIVALVUR(PIIRIVALVUR param) {
	    this.pIIRIVALVUR = param;
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
