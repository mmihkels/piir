package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.AUASTME_MUUTMINE;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "auastme_muutmines", formBackingObject = AUASTME_MUUTMINE.class)
@RequestMapping("/auastme_muutmines")
@Controller
public class AUASTME_MUUTMINEController {
}
