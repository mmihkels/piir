package ee.itcollege.i377.team28.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.roo.addon.javabean.RooJavaBean;

import ee.itcollege.i377.team28.entities.PIIRIVALVUR;
import ee.itcollege.i377.team28.entities.VAHTKONNA_LIIGE;


@Configurable
@RooJavaBean
public class Helper {

	@PersistenceContext 
	EntityManager entityManager;	
    public static final EntityManager entityManager() {
        EntityManager em = new Helper().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected");
        return em;
    }
	
	public Helper() {}
	
	public static List<VAHTKONNA_LIIGE> getVahtkonds(PIIRIVALVUR p, Date alates, Date kuni){
		TypedQuery<VAHTKONNA_LIIGE> q = entityManager().createQuery(
    			"SELECT o FROM VAHTKONNA_LIIGE o WHERE o.pIIRIVALVUR = :pv AND o.alates >= :a AND o.kuni <= :k", VAHTKONNA_LIIGE.class);
            q.setParameter("pv", p);		
            q.setParameter("a", alates);
            q.setParameter("k", kuni);
		return q.getResultList();
	}	
}

