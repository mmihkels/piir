package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.PIIRILOIK;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piiriloiks", formBackingObject = PIIRILOIK.class)
@RequestMapping("/piiriloiks")
@Controller
public class PIIRILOIKController {
}
