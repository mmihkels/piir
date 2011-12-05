package ee.itcollege.i377.team28.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ee.itcollege.i377.team28.entities.PIIRIVALVUR;

@RequestMapping("/valvur/**")
@Controller
public class ValvurController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping
    public String index(Model uiModel) {
    	
    	List<PIIRIVALVUR> pv = new ArrayList<PIIRIVALVUR>();
    	
    	pv = PIIRIVALVUR.findAllPIIRIVALVURS();
    	
    	//andmebaasist pekas tooma ka kõik vahtkonnad, kus piirivalvur peab olema.
    	/* ja muud andmed
    	for (PIIRIVALVUR p : PIIRIVALVUR.findAllVAHTKONNAD()) {
			data.add(xxx));
		}
    	*/
    	
    	// Saadan viewle muutuja data, mis sisaldab siin kogutud data listi ratsioonidest_puuride_kaupa
    	uiModel.addAttribute("piirivalvurs",pv);
   
        return "valvur/index";
    }

}
