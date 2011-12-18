// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.ADMIN_ALLUVUS;
import ee.itcollege.i377.team28.entities.AMET;
import ee.itcollege.i377.team28.entities.AMET_PIIRIPUNKTIS;
import ee.itcollege.i377.team28.entities.AMET_VAEOSAS;
import ee.itcollege.i377.team28.entities.AUASTE;
import ee.itcollege.i377.team28.entities.AUASTME_MUUTMINE;
import ee.itcollege.i377.team28.entities.INTSIDENDI_LIIK;
import ee.itcollege.i377.team28.entities.INTSIDENT;
import ee.itcollege.i377.team28.entities.ISIKU_SEADUS_INTSIDENDID;
import ee.itcollege.i377.team28.entities.ISIK_INTSIDENDIS;
import ee.itcollege.i377.team28.entities.KODAKONDSUS;
import ee.itcollege.i377.team28.entities.KONTAKTI_LIIK;
import ee.itcollege.i377.team28.entities.OBJEKT;
import ee.itcollege.i377.team28.entities.OBJEKTI_LIIK;
import ee.itcollege.i377.team28.entities.OBJEKTI_SEADUS_INTSIDENDIS;
import ee.itcollege.i377.team28.entities.OBJEKT_INTSIDENDIS;
import ee.itcollege.i377.team28.entities.ORG_YKSUS;
import ee.itcollege.i377.team28.entities.PIIRILOIGU_HALDAJA;
import ee.itcollege.i377.team28.entities.PIIRILOIK;
import ee.itcollege.i377.team28.entities.PIIRIPUNKT;
import ee.itcollege.i377.team28.entities.PIIRIPUNKTI_ALLUVUS;
import ee.itcollege.i377.team28.entities.PIIRIPUNKT_ORG_YKSUS;
import ee.itcollege.i377.team28.entities.PIIRIRIKKUJA;
import ee.itcollege.i377.team28.entities.PIIRIVALVE_SEADUS_INTSIDENDI;
import ee.itcollege.i377.team28.entities.PIIRIVALVUR;
import ee.itcollege.i377.team28.entities.PIIRIVALVURI_KONTAKT;
import ee.itcollege.i377.team28.entities.PIIRIVALVUR_INTSIDENDIS;
import ee.itcollege.i377.team28.entities.PIIRIVALVUR_PIIRIPUNKTIS;
import ee.itcollege.i377.team28.entities.PIIRIVALVUR_VAEOSAS;
import ee.itcollege.i377.team28.entities.PIIRIVALVUR_VOODIKOHAL;
import ee.itcollege.i377.team28.entities.RIIGI_ADMIN_YKSUS;
import ee.itcollege.i377.team28.entities.RIIGI_ADMIN_YKSUSE_LIIK;
import ee.itcollege.i377.team28.entities.RIIK;
import ee.itcollege.i377.team28.entities.RUUMIYKSUS;
import ee.itcollege.i377.team28.entities.RUUMIYKSUSE_LIIK;
import ee.itcollege.i377.team28.entities.SEADUS;
import ee.itcollege.i377.team28.entities.SEADUSE_PUNKT;
import ee.itcollege.i377.team28.entities.SEOTUD_KONTAKTISIK;
import ee.itcollege.i377.team28.entities.SUGULUSE_ROLLI_LIIT;
import ee.itcollege.i377.team28.entities.VAEOSA;
import ee.itcollege.i377.team28.entities.VAEOSA_ALLUVUS;
import ee.itcollege.i377.team28.entities.VAHTKOND;
import ee.itcollege.i377.team28.entities.VAHTKOND_INTSIDENDIS;
import ee.itcollege.i377.team28.entities.VAHTKOND_PIIRILOIGUL;
import ee.itcollege.i377.team28.entities.VAHTKONNA_LIIGE;
import ee.itcollege.i377.team28.entities.VOIMALIK_ALLUVUS;
import ee.itcollege.i377.team28.entities.VOODIKOHT;
import java.lang.String;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(new ADMIN_ALLUVUSConverter());
        registry.addConverter(new AMETConverter());
        registry.addConverter(new AMET_PIIRIPUNKTISConverter());
        registry.addConverter(new AMET_VAEOSASConverter());
        registry.addConverter(new AUASTEConverter());
        registry.addConverter(new AUASTME_MUUTMINEConverter());
        registry.addConverter(new INTSIDENDI_LIIKConverter());
        registry.addConverter(new INTSIDENTConverter());
        registry.addConverter(new ISIKU_SEADUS_INTSIDENDIDConverter());
        registry.addConverter(new ISIK_INTSIDENDISConverter());
        registry.addConverter(new KODAKONDSUSConverter());
        registry.addConverter(new KONTAKTI_LIIKConverter());
        registry.addConverter(new OBJEKTConverter());
        registry.addConverter(new OBJEKTI_LIIKConverter());
        registry.addConverter(new OBJEKTI_SEADUS_INTSIDENDISConverter());
        registry.addConverter(new OBJEKT_INTSIDENDISConverter());
        registry.addConverter(new ORG_YKSUSConverter());
        registry.addConverter(new PIIRILOIGU_HALDAJAConverter());
        registry.addConverter(new PIIRILOIKConverter());
        registry.addConverter(new PIIRIPUNKTConverter());
        registry.addConverter(new PIIRIPUNKTI_ALLUVUSConverter());
        registry.addConverter(new PIIRIPUNKT_ORG_YKSUSConverter());
        registry.addConverter(new PIIRIRIKKUJAConverter());
        registry.addConverter(new PIIRIVALVE_SEADUS_INTSIDENDIConverter());
        registry.addConverter(new PIIRIVALVURConverter());
        registry.addConverter(new PIIRIVALVURI_KONTAKTConverter());
        registry.addConverter(new PIIRIVALVUR_INTSIDENDISConverter());
        registry.addConverter(new PIIRIVALVUR_PIIRIPUNKTISConverter());
        registry.addConverter(new PIIRIVALVUR_VAEOSASConverter());
        registry.addConverter(new PIIRIVALVUR_VOODIKOHALConverter());
        registry.addConverter(new RIIGI_ADMIN_YKSUSConverter());
        registry.addConverter(new RIIGI_ADMIN_YKSUSE_LIIKConverter());
        registry.addConverter(new RIIKConverter());
        registry.addConverter(new RUUMIYKSUSConverter());
        registry.addConverter(new RUUMIYKSUSE_LIIKConverter());
        registry.addConverter(new SEADUSConverter());
        registry.addConverter(new SEADUSE_PUNKTConverter());
        registry.addConverter(new SEOTUD_KONTAKTISIKConverter());
        registry.addConverter(new SUGULUSE_ROLLI_LIITConverter());
        registry.addConverter(new VAEOSAConverter());
        registry.addConverter(new VAEOSA_ALLUVUSConverter());
        registry.addConverter(new VAHTKONDConverter());
        registry.addConverter(new VAHTKOND_INTSIDENDISConverter());
        registry.addConverter(new VAHTKOND_PIIRILOIGULConverter());
        registry.addConverter(new VAHTKONNA_LIIGEConverter());
        registry.addConverter(new VOIMALIK_ALLUVUSConverter());
        registry.addConverter(new VOODIKOHTConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.ADMIN_ALLUVUSConverter implements Converter<ADMIN_ALLUVUS, String> {
        public String convert(ADMIN_ALLUVUS aDMIN_ALLUVUS) {
            return new StringBuilder().append(aDMIN_ALLUVUS.getAlates()).append(" ").append(aDMIN_ALLUVUS.getKuni()).append(" ").append(aDMIN_ALLUVUS.getKommentaar()).append(" ").append(aDMIN_ALLUVUS.getAvaja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.AMETConverter implements Converter<AMET, String> {
        public String convert(AMET aMET) {
            return new StringBuilder().append(aMET.getISCO_kood()).append(" ").append(aMET.getNimetus()).append(" ").append(aMET.getKommentaar()).append(" ").append(aMET.getAvaja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.AMET_PIIRIPUNKTISConverter implements Converter<AMET_PIIRIPUNKTIS, String> {
        public String convert(AMET_PIIRIPUNKTIS aMET_PIIRIPUNKTIS) {
            return new StringBuilder().append(aMET_PIIRIPUNKTIS.getAlates()).append(" ").append(aMET_PIIRIPUNKTIS.getKuni()).append(" ").append(aMET_PIIRIPUNKTIS.getKommentaar()).append(" ").append(aMET_PIIRIPUNKTIS.getAvaja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.AMET_VAEOSASConverter implements Converter<AMET_VAEOSAS, String> {
        public String convert(AMET_VAEOSAS aMET_VAEOSAS) {
            return new StringBuilder().append(aMET_VAEOSAS.getAlates()).append(" ").append(aMET_VAEOSAS.getKuni()).append(" ").append(aMET_VAEOSAS.getKommentaar()).append(" ").append(aMET_VAEOSAS.getAvaja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.AUASTEConverter implements Converter<AUASTE, String> {
        public String convert(AUASTE aUASTE) {
            return new StringBuilder().append(aUASTE.getNimetus()).append(" ").append(aUASTE.getKommentaar()).append(" ").append(aUASTE.getAvaja()).append(" ").append(aUASTE.getAvatud()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.AUASTME_MUUTMINEConverter implements Converter<AUASTME_MUUTMINE, String> {
        public String convert(AUASTME_MUUTMINE aUASTME_MUUTMINE) {
            return new StringBuilder().append(aUASTME_MUUTMINE.getAlates()).append(" ").append(aUASTME_MUUTMINE.getKuni()).append(" ").append(aUASTME_MUUTMINE.getKommentaar()).append(" ").append(aUASTME_MUUTMINE.getAvaja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.INTSIDENDI_LIIKConverter implements Converter<INTSIDENDI_LIIK, String> {
        public String convert(INTSIDENDI_LIIK iNTSIDENDI_LIIK) {
            return new StringBuilder().append(iNTSIDENDI_LIIK.getKood()).append(" ").append(iNTSIDENDI_LIIK.getNimetus()).append(" ").append(iNTSIDENDI_LIIK.getKommentaar()).append(" ").append(iNTSIDENDI_LIIK.getAvaja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.INTSIDENTConverter implements Converter<INTSIDENT, String> {
        public String convert(INTSIDENT iNTSIDENT) {
            return new StringBuilder().append(iNTSIDENT.getKood()).append(" ").append(iNTSIDENT.getNimetus()).append(" ").append(iNTSIDENT.getToimumise_algus()).append(" ").append(iNTSIDENT.getToimumise_lopp()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.ISIKU_SEADUS_INTSIDENDIDConverter implements Converter<ISIKU_SEADUS_INTSIDENDID, String> {
        public String convert(ISIKU_SEADUS_INTSIDENDID iSIKU_SEADUS_INTSIDENDID) {
            return new StringBuilder().append(iSIKU_SEADUS_INTSIDENDID.getAlates()).append(" ").append(iSIKU_SEADUS_INTSIDENDID.getKuni()).append(" ").append(iSIKU_SEADUS_INTSIDENDID.getKirjeldus()).append(" ").append(iSIKU_SEADUS_INTSIDENDID.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.ISIK_INTSIDENDISConverter implements Converter<ISIK_INTSIDENDIS, String> {
        public String convert(ISIK_INTSIDENDIS iSIK_INTSIDENDIS) {
            return new StringBuilder().append(iSIK_INTSIDENDIS.getAlates()).append(" ").append(iSIK_INTSIDENDIS.getKuni()).append(" ").append(iSIK_INTSIDENDIS.getKirjeldus()).append(" ").append(iSIK_INTSIDENDIS.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.KODAKONDSUSConverter implements Converter<KODAKONDSUS, String> {
        public String convert(KODAKONDSUS kODAKONDSUS) {
            return new StringBuilder().append(kODAKONDSUS.getIsikukood()).append(" ").append(kODAKONDSUS.getAlates()).append(" ").append(kODAKONDSUS.getKuni()).append(" ").append(kODAKONDSUS.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.KONTAKTI_LIIKConverter implements Converter<KONTAKTI_LIIK, String> {
        public String convert(KONTAKTI_LIIK kONTAKTI_LIIK) {
            return new StringBuilder().append(kONTAKTI_LIIK.getNimetus()).append(" ").append(kONTAKTI_LIIK.getXML_kirjeldus()).append(" ").append(kONTAKTI_LIIK.getKommentaar()).append(" ").append(kONTAKTI_LIIK.getAvaja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.OBJEKTConverter implements Converter<OBJEKT, String> {
        public String convert(OBJEKT oBJEKT) {
            return new StringBuilder().append(oBJEKT.getNimetus()).append(" ").append(oBJEKT.getKommentaar()).append(" ").append(oBJEKT.getAvaja()).append(" ").append(oBJEKT.getAvatud()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.OBJEKTI_LIIKConverter implements Converter<OBJEKTI_LIIK, String> {
        public String convert(OBJEKTI_LIIK oBJEKTI_LIIK) {
            return new StringBuilder().append(oBJEKTI_LIIK.getKood()).append(" ").append(oBJEKTI_LIIK.getNimetus()).append(" ").append(oBJEKTI_LIIK.getKommentaar()).append(" ").append(oBJEKTI_LIIK.getAvaja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.OBJEKTI_SEADUS_INTSIDENDISConverter implements Converter<OBJEKTI_SEADUS_INTSIDENDIS, String> {
        public String convert(OBJEKTI_SEADUS_INTSIDENDIS oBJEKTI_SEADUS_INTSIDENDIS) {
            return new StringBuilder().append(oBJEKTI_SEADUS_INTSIDENDIS.getAlates()).append(" ").append(oBJEKTI_SEADUS_INTSIDENDIS.getKuni()).append(" ").append(oBJEKTI_SEADUS_INTSIDENDIS.getKirjeldus()).append(" ").append(oBJEKTI_SEADUS_INTSIDENDIS.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.OBJEKT_INTSIDENDISConverter implements Converter<OBJEKT_INTSIDENDIS, String> {
        public String convert(OBJEKT_INTSIDENDIS oBJEKT_INTSIDENDIS) {
            return new StringBuilder().append(oBJEKT_INTSIDENDIS.getAlates()).append(" ").append(oBJEKT_INTSIDENDIS.getKuni()).append(" ").append(oBJEKT_INTSIDENDIS.getKirjeldus()).append(" ").append(oBJEKT_INTSIDENDIS.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.ORG_YKSUSConverter implements Converter<ORG_YKSUS, String> {
        public String convert(ORG_YKSUS oRG_YKSUS) {
            return new StringBuilder().append(oRG_YKSUS.getKood()).append(" ").append(oRG_YKSUS.getNimetus()).append(" ").append(oRG_YKSUS.getKommentaar()).append(" ").append(oRG_YKSUS.getAlates()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.PIIRILOIGU_HALDAJAConverter implements Converter<PIIRILOIGU_HALDAJA, String> {
        public String convert(PIIRILOIGU_HALDAJA pIIRILOIGU_HALDAJA) {
            return new StringBuilder().append(pIIRILOIGU_HALDAJA.getKood()).append(" ").append(pIIRILOIGU_HALDAJA.getNimetus()).append(" ").append(pIIRILOIGU_HALDAJA.getGPS_longitude()).append(" ").append(pIIRILOIGU_HALDAJA.getGPS_latitude()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.PIIRILOIKConverter implements Converter<PIIRILOIK, String> {
        public String convert(PIIRILOIK pIIRILOIK) {
            return new StringBuilder().append(pIIRILOIK.getKood()).append(" ").append(pIIRILOIK.getNimetus()).append(" ").append(pIIRILOIK.getGPS_koordinaadid()).append(" ").append(pIIRILOIK.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.PIIRIPUNKTConverter implements Converter<PIIRIPUNKT, String> {
        public String convert(PIIRIPUNKT pIIRIPUNKT) {
            return new StringBuilder().append(pIIRIPUNKT.getKood()).append(" ").append(pIIRIPUNKT.getNimetus()).append(" ").append(pIIRIPUNKT.getGPS_longitude()).append(" ").append(pIIRIPUNKT.getGPS_latitude()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.PIIRIPUNKTI_ALLUVUSConverter implements Converter<PIIRIPUNKTI_ALLUVUS, String> {
        public String convert(PIIRIPUNKTI_ALLUVUS pIIRIPUNKTI_ALLUVUS) {
            return new StringBuilder().append(pIIRIPUNKTI_ALLUVUS.getAlates()).append(" ").append(pIIRIPUNKTI_ALLUVUS.getKuni()).append(" ").append(pIIRIPUNKTI_ALLUVUS.getKommentaar()).append(" ").append(pIIRIPUNKTI_ALLUVUS.getAvaja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.PIIRIPUNKT_ORG_YKSUSConverter implements Converter<PIIRIPUNKT_ORG_YKSUS, String> {
        public String convert(PIIRIPUNKT_ORG_YKSUS pIIRIPUNKT_ORG_YKSUS) {
            return new StringBuilder().append(pIIRIPUNKT_ORG_YKSUS.getKood()).append(" ").append(pIIRIPUNKT_ORG_YKSUS.getNimetus()).append(" ").append(pIIRIPUNKT_ORG_YKSUS.getKommentaar()).append(" ").append(pIIRIPUNKT_ORG_YKSUS.getAlates()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.PIIRIRIKKUJAConverter implements Converter<PIIRIRIKKUJA, String> {
        public String convert(PIIRIRIKKUJA pIIRIRIKKUJA) {
            return new StringBuilder().append(pIIRIRIKKUJA.getIsikukood()).append(" ").append(pIIRIRIKKUJA.getEesnimi()).append(" ").append(pIIRIRIKKUJA.getPerek_nimi()).append(" ").append(pIIRIRIKKUJA.getSugu()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.PIIRIVALVE_SEADUS_INTSIDENDIConverter implements Converter<PIIRIVALVE_SEADUS_INTSIDENDI, String> {
        public String convert(PIIRIVALVE_SEADUS_INTSIDENDI pIIRIVALVE_SEADUS_INTSIDENDI) {
            return new StringBuilder().append(pIIRIVALVE_SEADUS_INTSIDENDI.getAlates()).append(" ").append(pIIRIVALVE_SEADUS_INTSIDENDI.getKuni()).append(" ").append(pIIRIVALVE_SEADUS_INTSIDENDI.getKirjeldus()).append(" ").append(pIIRIVALVE_SEADUS_INTSIDENDI.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.PIIRIVALVURConverter implements Converter<PIIRIVALVUR, String> {
        public String convert(PIIRIVALVUR pIIRIVALVUR) {
            return new StringBuilder().append(pIIRIVALVUR.getIsikukood()).append(" ").append(pIIRIVALVUR.getEesnimed()).append(" ").append(pIIRIVALVUR.getPerekonnanimi()).append(" ").append(pIIRIVALVUR.getSugu()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.PIIRIVALVURI_KONTAKTConverter implements Converter<PIIRIVALVURI_KONTAKT, String> {
        public String convert(PIIRIVALVURI_KONTAKT pIIRIVALVURI_KONTAKT) {
            return new StringBuilder().append(pIIRIVALVURI_KONTAKT.getKontakt()).append(" ").append(pIIRIVALVURI_KONTAKT.getPeamine_kontakt()).append(" ").append(pIIRIVALVURI_KONTAKT.getAlates()).append(" ").append(pIIRIVALVURI_KONTAKT.getKuni()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.PIIRIVALVUR_INTSIDENDISConverter implements Converter<PIIRIVALVUR_INTSIDENDIS, String> {
        public String convert(PIIRIVALVUR_INTSIDENDIS pIIRIVALVUR_INTSIDENDIS) {
            return new StringBuilder().append(pIIRIVALVUR_INTSIDENDIS.getAlates()).append(" ").append(pIIRIVALVUR_INTSIDENDIS.getKuni()).append(" ").append(pIIRIVALVUR_INTSIDENDIS.getKirjeldus()).append(" ").append(pIIRIVALVUR_INTSIDENDIS.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.PIIRIVALVUR_PIIRIPUNKTISConverter implements Converter<PIIRIVALVUR_PIIRIPUNKTIS, String> {
        public String convert(PIIRIVALVUR_PIIRIPUNKTIS pIIRIVALVUR_PIIRIPUNKTIS) {
            return new StringBuilder().append(pIIRIVALVUR_PIIRIPUNKTIS.getAlates()).append(" ").append(pIIRIVALVUR_PIIRIPUNKTIS.getKuni()).append(" ").append(pIIRIVALVUR_PIIRIPUNKTIS.getKoormus()).append(" ").append(pIIRIVALVUR_PIIRIPUNKTIS.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.PIIRIVALVUR_VAEOSASConverter implements Converter<PIIRIVALVUR_VAEOSAS, String> {
        public String convert(PIIRIVALVUR_VAEOSAS pIIRIVALVUR_VAEOSAS) {
            return new StringBuilder().append(pIIRIVALVUR_VAEOSAS.getAlates()).append(" ").append(pIIRIVALVUR_VAEOSAS.getKuni()).append(" ").append(pIIRIVALVUR_VAEOSAS.getKoormus()).append(" ").append(pIIRIVALVUR_VAEOSAS.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.PIIRIVALVUR_VOODIKOHALConverter implements Converter<PIIRIVALVUR_VOODIKOHAL, String> {
        public String convert(PIIRIVALVUR_VOODIKOHAL pIIRIVALVUR_VOODIKOHAL) {
            return new StringBuilder().append(pIIRIVALVUR_VOODIKOHAL.getAlates()).append(" ").append(pIIRIVALVUR_VOODIKOHAL.getKuni()).append(" ").append(pIIRIVALVUR_VOODIKOHAL.getKommentaar()).append(" ").append(pIIRIVALVUR_VOODIKOHAL.getAvaja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.RIIGI_ADMIN_YKSUSConverter implements Converter<RIIGI_ADMIN_YKSUS, String> {
        public String convert(RIIGI_ADMIN_YKSUS rIIGI_ADMIN_YKSUS) {
            return new StringBuilder().append(rIIGI_ADMIN_YKSUS.getNimetus()).append(" ").append(rIIGI_ADMIN_YKSUS.getKommentaar()).append(" ").append(rIIGI_ADMIN_YKSUS.getAlates()).append(" ").append(rIIGI_ADMIN_YKSUS.getKuni()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.RIIGI_ADMIN_YKSUSE_LIIKConverter implements Converter<RIIGI_ADMIN_YKSUSE_LIIK, String> {
        public String convert(RIIGI_ADMIN_YKSUSE_LIIK rIIGI_ADMIN_YKSUSE_LIIK) {
            return new StringBuilder().append(rIIGI_ADMIN_YKSUSE_LIIK.getNimetus()).append(" ").append(rIIGI_ADMIN_YKSUSE_LIIK.getKommentaar()).append(" ").append(rIIGI_ADMIN_YKSUSE_LIIK.getAlates()).append(" ").append(rIIGI_ADMIN_YKSUSE_LIIK.getKuni()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.RIIKConverter implements Converter<RIIK, String> {
        public String convert(RIIK rIIK) {
            return new StringBuilder().append(rIIK.getISO_kood()).append(" ").append(rIIK.getANSI_kood()).append(" ").append(rIIK.getKommentaar()).append(" ").append(rIIK.getAvaja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.RUUMIYKSUSConverter implements Converter<RUUMIYKSUS, String> {
        public String convert(RUUMIYKSUS rUUMIYKSUS) {
            return new StringBuilder().append(rUUMIYKSUS.getKood()).append(" ").append(rUUMIYKSUS.getNimetus()).append(" ").append(rUUMIYKSUS.getAadress()).append(" ").append(rUUMIYKSUS.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.RUUMIYKSUSE_LIIKConverter implements Converter<RUUMIYKSUSE_LIIK, String> {
        public String convert(RUUMIYKSUSE_LIIK rUUMIYKSUSE_LIIK) {
            return new StringBuilder().append(rUUMIYKSUSE_LIIK.getKood()).append(" ").append(rUUMIYKSUSE_LIIK.getNimetus()).append(" ").append(rUUMIYKSUSE_LIIK.getKommentaar()).append(" ").append(rUUMIYKSUSE_LIIK.getAvaja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.SEADUSConverter implements Converter<SEADUS, String> {
        public String convert(SEADUS sEADUS) {
            return new StringBuilder().append(sEADUS.getKood()).append(" ").append(sEADUS.getNimetus()).append(" ").append(sEADUS.getKehtiv_alates()).append(" ").append(sEADUS.getKehtiv_kuni()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.SEADUSE_PUNKTConverter implements Converter<SEADUSE_PUNKT, String> {
        public String convert(SEADUSE_PUNKT sEADUSE_PUNKT) {
            return new StringBuilder().append(sEADUSE_PUNKT.getParagrahv()).append(" ").append(sEADUSE_PUNKT.getPais()).append(" ").append(sEADUSE_PUNKT.getTekst()).append(" ").append(sEADUSE_PUNKT.getKehtiv_alates()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.SEOTUD_KONTAKTISIKConverter implements Converter<SEOTUD_KONTAKTISIK, String> {
        public String convert(SEOTUD_KONTAKTISIK sEOTUD_KONTAKTISIK) {
            return new StringBuilder().append(sEOTUD_KONTAKTISIK.getAlates()).append(" ").append(sEOTUD_KONTAKTISIK.getKuni()).append(" ").append(sEOTUD_KONTAKTISIK.getKommentaar()).append(" ").append(sEOTUD_KONTAKTISIK.getAvaja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.SUGULUSE_ROLLI_LIITConverter implements Converter<SUGULUSE_ROLLI_LIIT, String> {
        public String convert(SUGULUSE_ROLLI_LIIT sUGULUSE_ROLLI_LIIT) {
            return new StringBuilder().append(sUGULUSE_ROLLI_LIIT.getNimetus()).append(" ").append(sUGULUSE_ROLLI_LIIT.getKommentaar()).append(" ").append(sUGULUSE_ROLLI_LIIT.getSugulane_voi_mitte()).append(" ").append(sUGULUSE_ROLLI_LIIT.getAvaja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.VAEOSAConverter implements Converter<VAEOSA, String> {
        public String convert(VAEOSA vAEOSA) {
            return new StringBuilder().append(vAEOSA.getKood()).append(" ").append(vAEOSA.getNimetus()).append(" ").append(vAEOSA.getAlates()).append(" ").append(vAEOSA.getKuni()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.VAEOSA_ALLUVUSConverter implements Converter<VAEOSA_ALLUVUS, String> {
        public String convert(VAEOSA_ALLUVUS vAEOSA_ALLUVUS) {
            return new StringBuilder().append(vAEOSA_ALLUVUS.getAlates()).append(" ").append(vAEOSA_ALLUVUS.getKuni()).append(" ").append(vAEOSA_ALLUVUS.getKommentaar()).append(" ").append(vAEOSA_ALLUVUS.getAvaja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.VAHTKONDConverter implements Converter<VAHTKOND, String> {
        public String convert(VAHTKOND vAHTKOND) {
            return new StringBuilder().append(vAHTKOND.getKood()).append(" ").append(vAHTKOND.getNimetus()).append(" ").append(vAHTKOND.getAlates()).append(" ").append(vAHTKOND.getKuni()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.VAHTKOND_INTSIDENDISConverter implements Converter<VAHTKOND_INTSIDENDIS, String> {
        public String convert(VAHTKOND_INTSIDENDIS vAHTKOND_INTSIDENDIS) {
            return new StringBuilder().append(vAHTKOND_INTSIDENDIS.getAlates()).append(" ").append(vAHTKOND_INTSIDENDIS.getKuni()).append(" ").append(vAHTKOND_INTSIDENDIS.getKirjeldus()).append(" ").append(vAHTKOND_INTSIDENDIS.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.VAHTKOND_PIIRILOIGULConverter implements Converter<VAHTKOND_PIIRILOIGUL, String> {
        public String convert(VAHTKOND_PIIRILOIGUL vAHTKOND_PIIRILOIGUL) {
            return new StringBuilder().append(vAHTKOND_PIIRILOIGUL.getAlates()).append(" ").append(vAHTKOND_PIIRILOIGUL.getKuni()).append(" ").append(vAHTKOND_PIIRILOIGUL.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.VAHTKONNA_LIIGEConverter implements Converter<VAHTKONNA_LIIGE, String> {
        public String convert(VAHTKONNA_LIIGE vAHTKONNA_LIIGE) {
            return new StringBuilder().append(vAHTKONNA_LIIGE.getAlates()).append(" ").append(vAHTKONNA_LIIGE.getKuni()).append(" ").append(vAHTKONNA_LIIGE.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.VOIMALIK_ALLUVUSConverter implements Converter<VOIMALIK_ALLUVUS, String> {
        public String convert(VOIMALIK_ALLUVUS vOIMALIK_ALLUVUS) {
            return new StringBuilder().append(vOIMALIK_ALLUVUS.getKommentaar()).append(" ").append(vOIMALIK_ALLUVUS.getAvaja()).append(" ").append(vOIMALIK_ALLUVUS.getAvatud()).append(" ").append(vOIMALIK_ALLUVUS.getMuutja()).toString();
        }
        
    }
    
    static class ee.itcollege.i377.team28.web.ApplicationConversionServiceFactoryBean.VOODIKOHTConverter implements Converter<VOODIKOHT, String> {
        public String convert(VOODIKOHT vOODIKOHT) {
            return new StringBuilder().append(vOODIKOHT.getNumber()).append(" ").append(vOODIKOHT.getPikkus()).append(" ").append(vOODIKOHT.getLaius()).append(" ").append(vOODIKOHT.getKommentaar()).toString();
        }
        
    }
    
}
