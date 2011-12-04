package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.KONTAKTI_LIIK;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "kontakti_liiks", formBackingObject = KONTAKTI_LIIK.class)
@RequestMapping("/kontakti_liiks")
@Controller
public class KONTAKTI_LIIKController {
}
