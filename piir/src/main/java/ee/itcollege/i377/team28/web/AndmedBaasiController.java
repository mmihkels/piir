package ee.itcollege.i377.team28.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

import ee.itcollege.i377.team28.entities.PIIRILOIK;
import ee.itcollege.i377.team28.entities.PIIRIVALVUR;
import ee.itcollege.i377.team28.entities.VAHTKOND;

@RequestMapping("/andmedbaasi/**")
@Controller
public class AndmedBaasiController {
	

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping
    public String index() {
    	
    	// Siin peaks kontrollima sessiooni kaudu kas on jub aselles sessioonis ehk juba tehtud
    	//AndmedBaasi.doInsert(); // Ei tööta 
    	
    	//AndmedBaasi ab = new AndmedBaasi();
    	//ab.fillDB();
    	
    	String[][] names = {	{"Paul", "Andres", "Serjoga","Anatoli","John"},
								{"Smith", "Ais", "Papahhov","Tsehhov", "Smith"}
			};
    	
    	if(PIIRIVALVUR.countPIIRIVALVURS() <= 0)
    	{ 		
    		for (int i = 0; i < names[0].length; i++) {			
        		PIIRIVALVUR p = new PIIRIVALVUR();
        		p.setEesnimed(names[0][i]);
        		p.setPerekonnanimi(names[1][i]);
        		p.setAvaja("Avaja");
        		p.setAvatud(new Date());
        		p.setMuudetud(new Date());
        		p.setMuutja("Muutja");
        		p.setSugu("M");
        		p.setSulgeja("Sulgeja");
        		p.setSuletud(new Date());
        		p.persist();
    		}
    	}
    	
    	
    	String[][] piiriloiks = {	{"Narva","Ikla","Sõrve","Vaindloo"},
    								{"12356","654321","7890","0987"}
    	};
    	if(PIIRILOIK.countPIIRILOIKS() <=0)
    	{
    		for (int i = 0; i < piiriloiks[0].length; i++) {
        		PIIRILOIK p = new PIIRILOIK();
        		p.setNimetus(piiriloiks[0][i]);
        		p.setKood(piiriloiks[1][i]);
        		p.setAvaja("Avaja");
        		p.setAvatud(new Date());
        		p.setMuudetud(new Date());
        		p.setMuutja("Muutja");
        		p.setSulgeja("Sulgeja");
        		p.setSuletud(new Date());
        		p.persist();
    		}
    		
    	}
    	
    	
    	String[][] vahtkonds = {	{"VK_Öine","VK_Päevane"},
									{"12356","654321"}
		};
		if(VAHTKOND.countVAHTKONDS() <=0)
		{
		for (int i = 0; i < vahtkonds[0].length; i++) {
			VAHTKOND p = new VAHTKOND();
			p.setNimetus(vahtkonds[0][i]);
			p.setKood(vahtkonds[1][i]);
			p.setAvaja("Avaja");
			p.setAvatud(new Date());
			p.setMuudetud(new Date());
			p.setMuutja("Muutja");
			p.setSulgeja("Sulgeja");
			p.setSuletud(new Date());
			p.persist();
			}
		
		}
    		
        return "andmedbaasi/index";
    }
}
