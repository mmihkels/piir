// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.i377.team28.entities;

import java.lang.String;

privileged aspect PIIRIRIKKUJA_Roo_ToString {
    
    public String PIIRIRIKKUJA.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Avaja: ").append(getAvaja()).append(", ");
        sb.append("Avatud: ").append(getAvatud()).append(", ");
        sb.append("Eesnimi: ").append(getEesnimi()).append(", ");
        sb.append("ISIK_INTSIDENDIS: ").append(getISIK_INTSIDENDIS() == null ? "null" : getISIK_INTSIDENDIS().size()).append(", ");
        sb.append("Isikukood: ").append(getIsikukood()).append(", ");
        sb.append("KODAKONDSUS: ").append(getKODAKONDSUS() == null ? "null" : getKODAKONDSUS().size()).append(", ");
        sb.append("Kommentaar: ").append(getKommentaar()).append(", ");
        sb.append("Muudetud: ").append(getMuudetud()).append(", ");
        sb.append("Muutja: ").append(getMuutja()).append(", ");
        sb.append("OBJEKT: ").append(getOBJEKT()).append(", ");
        sb.append("Perek_nimi: ").append(getPerek_nimi()).append(", ");
        sb.append("Piiririkkuja_id: ").append(getPiiririkkuja_id()).append(", ");
        sb.append("Sugu: ").append(getSugu()).append(", ");
        sb.append("Suletud: ").append(getSuletud()).append(", ");
        sb.append("Sulgeja: ").append(getSulgeja()).append(", ");
        sb.append("Synniaeg: ").append(getSynniaeg()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}
