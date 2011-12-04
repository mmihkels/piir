package ee.itcollege.i377.team28.web;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.roo.addon.javabean.RooJavaBean;

import ee.itcollege.i377.team28.entities.PIIRIVALVUR;

import java.sql.*;

//nn. HelperClass
//Et saaks seda Helper Klassi ka otstarbekohaselt kasutada teeme klassi BEANIKS. 
//Beanil peavad olema getterid ja setterid aga laseme Rool selle ära teha @RooJavaBean. Beanil peab olema ka tühi konstuktor 
@RooJavaBean
@Configurable // ilma selleta ei tööta @PersistenceContext annotatsioon mistõttu entityManager on null ja käivitamisel tuleb veateade: "Entity manager has not been injected".
public class AndmedBaasi {
	
	// Seda läheb meil DB päringute tegemiseks tarvis
    @PersistenceContext
    transient EntityManager entityManager;
    
    final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(this.getClass());
    
    static PIIRIVALVUR piirivalvur;
    
    public AndmedBaasi()
	{
		// Beani reeglitele vastav tühi knstruktor
	}
	
 // Loome AnmedBaasi()'le em'i
    public static final EntityManager entityManager() {
        EntityManager em = new AndmedBaasi().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected.");
        return em;
    }
    
    
    public static void doInsert()
    {
    	 // NB! HSQL
    	Query q = PIIRIVALVUR.entityManager().createNativeQuery(

    			"INSERT INTO PIIRIVALVUR " +
    					"(piirivalvur_id," +
    						"isikukood," +
    						"eesnimed," +
    						"perenimi," +
    						"sugu," +
    						"soduri_kood," +
    						"kommentaar," +
    						"avaja," +
    						"avatud," +
    						"muutja," +
    						"muudetud," +
    						"sulgeja," +
    						"suletud) " +
    			"VALUES (:id,'355111200234',:fname,:lname,'m','123','no','mm','11.11.2011','mm','12.11.2011','mm','11.12.2012');"
    			);
    	
    	String[][] names = {	{"Paul", "Andres", "Serjoga"},
                				{"Smith", "Ais", "Papahhov"}
    						}; 
    	
    	for (int i = 0; i < names.length; i++) {
    		q.setParameter("id", i);
    		q.setParameter("fname", names[0][i]); 
    		q.setParameter("lname", names[1][i]);
    		
    		//q.executeUpdate();
		}
    	
    	//INSERT INTO piirivalvur (piirivalvur_id,isikukood,eesnimed,perenimi,sugu,soduri_kood,kommentaar,avaja,avatud,muutja,muudetud, sulgeja,suletud) VALUES (1,"355111200234","juhan","juurikas","m","123","no","mm","11.11.2011","mm","12.11.2011","mm","11.12.2012");
    }
   
    
    public void fillDB()
    {
		
    	try {
		    Class.forName("org.hsqldb.jdbcDriver");
		    Connection conn = DriverManager.getConnection("jdbc:hsqldb:C:/Users/margus/i377/Team28/db/ProjektDB");

		   log.info("Using database: " +
		        conn.getMetaData().getDatabaseProductName() + " " +
		        conn.getMetaData().getDatabaseProductVersion() + " at " +
		        conn.getMetaData().getURL());

		    Statement s = conn.createStatement();
		    
		    
		    
		    s.executeUpdate("INSERT INTO PIIRIVALVUR " +
										"(piirivalvur_id," +
										"isikukood," +
										"eesnimed," +
										"perenimi," +
										"sugu," +
										"soduri_kood," +
										"kommentaar," +
										"avaja," +
										"avatud," +
										"muutja," +
										"muudetud," +
										"sulgeja," +
										"suletud) " +
							"VALUES (4,'355111200234','Juhan','Juurikas','m','123','no','mm','11.11.2011','mm','12.11.2011','mm','11.12.2012');");
							    
		} catch (Exception e) {
		    log.info("Error: " + e.getMessage());
		}
    	
    }
	

}
