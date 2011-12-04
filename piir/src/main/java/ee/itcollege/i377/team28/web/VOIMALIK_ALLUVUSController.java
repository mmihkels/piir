package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.VOIMALIK_ALLUVUS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "voimalik_alluvus", formBackingObject = VOIMALIK_ALLUVUS.class)
@RequestMapping("/voimalik_alluvus")
@Controller
public class VOIMALIK_ALLUVUSController {
}
