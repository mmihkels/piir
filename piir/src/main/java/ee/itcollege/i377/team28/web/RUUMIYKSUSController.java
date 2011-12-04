package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.RUUMIYKSUS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "ruumiyksus", formBackingObject = RUUMIYKSUS.class)
@RequestMapping("/ruumiyksus")
@Controller
public class RUUMIYKSUSController {
}
