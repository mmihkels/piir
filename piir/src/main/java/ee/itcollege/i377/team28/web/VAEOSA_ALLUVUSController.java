package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.VAEOSA_ALLUVUS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "vaeosa_alluvus", formBackingObject = VAEOSA_ALLUVUS.class)
@RequestMapping("/vaeosa_alluvus")
@Controller
public class VAEOSA_ALLUVUSController {
}
