package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.PIIRIVALVURI_KONTAKT;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piirivalvuri_kontakts", formBackingObject = PIIRIVALVURI_KONTAKT.class)
@RequestMapping("/piirivalvuri_kontakts")
@Controller
public class PIIRIVALVURI_KONTAKTController {
}
