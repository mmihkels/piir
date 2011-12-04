package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.RUUMIYKSUSE_LIIK;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "ruumiyksuse_liiks", formBackingObject = RUUMIYKSUSE_LIIK.class)
@RequestMapping("/ruumiyksuse_liiks")
@Controller
public class RUUMIYKSUSE_LIIKController {
}
