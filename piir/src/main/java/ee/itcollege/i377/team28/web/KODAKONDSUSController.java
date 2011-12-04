package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.KODAKONDSUS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "kodakondsus", formBackingObject = KODAKONDSUS.class)
@RequestMapping("/kodakondsus")
@Controller
public class KODAKONDSUSController {
}
