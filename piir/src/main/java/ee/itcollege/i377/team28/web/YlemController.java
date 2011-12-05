package ee.itcollege.i377.team28.web;

import java.util.ArrayList;
import java.util.Iterator;
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
import ee.itcollege.i377.team28.entities.VAHTKOND;

@RequestMapping("/ylem/**")
@Controller
public class YlemController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping
    public String index(Model uiModel) {
    	
    	/*
    	List<String[]> data;
    	
    	for(VAHTKOND vk : VAHTKOND.findAllVAHTKONDS() )
    	{
    		data.add(PIIRILOIK_VAHTKONNAS või VAHTKOND_PIIRILOIGUL);
    	}
    	*/
    	
    	uiModel.addAttribute("vahtkonnad",  VAHTKOND.findAllVAHTKONDS());
    	
        return "ylem/index";
    }
}
