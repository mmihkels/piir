package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.VAEOSA;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "vaeosas", formBackingObject = VAEOSA.class)
@RequestMapping("/vaeosas")
@Controller
public class VAEOSAController {
}
