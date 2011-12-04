package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.ADMIN_ALLUVUS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "admin_alluvus", formBackingObject = ADMIN_ALLUVUS.class)
@RequestMapping("/admin_alluvus")
@Controller
public class ADMIN_ALLUVUSController {
}
