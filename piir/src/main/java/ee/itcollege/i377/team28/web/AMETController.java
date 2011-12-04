package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.AMET;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "amets", formBackingObject = AMET.class)
@RequestMapping("/amets")
@Controller
public class AMETController {
}
