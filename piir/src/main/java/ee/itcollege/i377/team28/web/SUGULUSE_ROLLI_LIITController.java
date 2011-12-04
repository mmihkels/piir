package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.SUGULUSE_ROLLI_LIIT;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "suguluse_rolli_liits", formBackingObject = SUGULUSE_ROLLI_LIIT.class)
@RequestMapping("/suguluse_rolli_liits")
@Controller
public class SUGULUSE_ROLLI_LIITController {
}
