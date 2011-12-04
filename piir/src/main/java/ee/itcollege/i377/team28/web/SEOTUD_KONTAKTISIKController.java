package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.SEOTUD_KONTAKTISIK;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "seotud_kontaktisiks", formBackingObject = SEOTUD_KONTAKTISIK.class)
@RequestMapping("/seotud_kontaktisiks")
@Controller
public class SEOTUD_KONTAKTISIKController {
}
