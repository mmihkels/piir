package ee.itcollege.i377.team28.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    	AndmedBaasi.doInsert(); // Ei tööta 
    	
    	//AndmedBaasi ab = new AndmedBaasi();
    	//ab.fillDB();
    	
        return "andmedbaasi/index";
    }
}
