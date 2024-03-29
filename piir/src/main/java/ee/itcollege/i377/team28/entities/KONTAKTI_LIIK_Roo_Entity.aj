// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.i377.team28.entities;

import ee.itcollege.i377.team28.entities.KONTAKTI_LIIK;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;

privileged aspect KONTAKTI_LIIK_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager KONTAKTI_LIIK.entityManager;
    
    @Version
    @Column(name = "version")
    private Integer KONTAKTI_LIIK.version;
    
    public Integer KONTAKTI_LIIK.getVersion() {
        return this.version;
    }
    
    public void KONTAKTI_LIIK.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void KONTAKTI_LIIK.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void KONTAKTI_LIIK.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            KONTAKTI_LIIK attached = KONTAKTI_LIIK.findKONTAKTI_LIIK(this.kontakti_liik_id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void KONTAKTI_LIIK.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void KONTAKTI_LIIK.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public KONTAKTI_LIIK KONTAKTI_LIIK.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        KONTAKTI_LIIK merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager KONTAKTI_LIIK.entityManager() {
        EntityManager em = new KONTAKTI_LIIK().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long KONTAKTI_LIIK.countKONTAKTI_LIIKs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM KONTAKTI_LIIK o", Long.class).getSingleResult();
    }
    
    public static List<KONTAKTI_LIIK> KONTAKTI_LIIK.findAllKONTAKTI_LIIKs() {
        return entityManager().createQuery("SELECT o FROM KONTAKTI_LIIK o", KONTAKTI_LIIK.class).getResultList();
    }
    
    public static KONTAKTI_LIIK KONTAKTI_LIIK.findKONTAKTI_LIIK(Long kontakti_liik_id) {
        if (kontakti_liik_id == null) return null;
        return entityManager().find(KONTAKTI_LIIK.class, kontakti_liik_id);
    }
    
    public static List<KONTAKTI_LIIK> KONTAKTI_LIIK.findKONTAKTI_LIIKEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM KONTAKTI_LIIK o", KONTAKTI_LIIK.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
