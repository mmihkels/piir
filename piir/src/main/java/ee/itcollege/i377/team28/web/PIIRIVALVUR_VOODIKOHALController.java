package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.PIIRIVALVUR_VOODIKOHAL;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piirivalvur_voodikohals", formBackingObject = PIIRIVALVUR_VOODIKOHAL.class)
@RequestMapping("/piirivalvur_voodikohals")
@Controller
public class PIIRIVALVUR_VOODIKOHALController {
}
