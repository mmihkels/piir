// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.i377.team28.entities;

import ee.itcollege.i377.team28.entities.RIIK;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;

privileged aspect RIIK_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager RIIK.entityManager;
    
    @Version
    @Column(name = "version")
    private Integer RIIK.version;
    
    public Integer RIIK.getVersion() {
        return this.version;
    }
    
    public void RIIK.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void RIIK.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void RIIK.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            RIIK attached = RIIK.findRIIK(this.riik_id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void RIIK.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void RIIK.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public RIIK RIIK.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        RIIK merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager RIIK.entityManager() {
        EntityManager em = new RIIK().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long RIIK.countRIIKS() {
        return entityManager().createQuery("SELECT COUNT(o) FROM RIIK o", Long.class).getSingleResult();
    }
    
    public static List<RIIK> RIIK.findAllRIIKS() {
        return entityManager().createQuery("SELECT o FROM RIIK o", RIIK.class).getResultList();
    }
    
    public static RIIK RIIK.findRIIK(Long riik_id) {
        if (riik_id == null) return null;
        return entityManager().find(RIIK.class, riik_id);
    }
    
    public static List<RIIK> RIIK.findRIIKEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM RIIK o", RIIK.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
