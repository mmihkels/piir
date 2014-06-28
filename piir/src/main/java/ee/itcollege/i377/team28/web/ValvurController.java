package ee.itcollege.i377.team28.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ee.itcollege.i377.team28.dao.Helper;
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
    	uiModel.addAttribute("piirivalvurs",PIIRIVALVUR.findAllPIIRIVALVURS());   
        return "valvur/index";
    }

    @RequestMapping(method = RequestMethod.GET, params =  { "pv", "startdate", "enddate" })
    public String showData(@RequestParam(value = "startdate", required = false) String startdate,
    		               @RequestParam(value = "enddate", required = false) String enddate,
    		               @RequestParam(value = "pv", required = false) Long id, Model uiModel) {
    	
    	
		Date alates = null, kuni = null;
		try {
			alates = new SimpleDateFormat("yyyy-MM-dd").parse(startdate);
			kuni = new SimpleDateFormat("yyyy-MM-dd").parse(enddate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	
		String sa = alates.toString();
		String sk = kuni.toString();
		uiModel.addAttribute("al",sa);	
		uiModel.addAttribute("kn",sk);
		
    	uiModel.addAttribute("piiriv",PIIRIVALVUR.findPIIRIVALVUR(id));
    	uiModel.addAttribute("vahtkonnad",Helper.getVahtkonds(PIIRIVALVUR.findPIIRIVALVUR(id),alates,kuni));  
    	uiModel.addAttribute("piirivalvurs",PIIRIVALVUR.findAllPIIRIVALVURS());
    	
    	return "valvur/index";
    }
}
