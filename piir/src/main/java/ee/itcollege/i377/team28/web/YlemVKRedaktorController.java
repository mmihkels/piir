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

import ee.itcollege.i377.team28.entities.PIIRILOIK;
import ee.itcollege.i377.team28.entities.PIIRIPUNKT;
import ee.itcollege.i377.team28.entities.PIIRIVALVUR;

@RequestMapping("/ylemvkredaktor/**")
@Controller
public class YlemVKRedaktorController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping
    public String index(Model uiModel) {
    	List<PIIRILOIK> pp = new ArrayList<PIIRILOIK>();
    	pp = PIIRILOIK.findAllPIIRILOIKS();
    	
    	uiModel.addAttribute("piiriloiks",pp);
    	
        return "ylemvkredaktor/index";
    }
}
