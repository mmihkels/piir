package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.PIIRIPUNKTI_ALLUVUS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piiripunkti_alluvus", formBackingObject = PIIRIPUNKTI_ALLUVUS.class)
@RequestMapping("/piiripunkti_alluvus")
@Controller
public class PIIRIPUNKTI_ALLUVUSController {
}
