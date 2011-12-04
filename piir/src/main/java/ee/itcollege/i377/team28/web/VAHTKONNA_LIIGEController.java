package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.VAHTKONNA_LIIGE;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "vahtkonna_liiges", formBackingObject = VAHTKONNA_LIIGE.class)
@RequestMapping("/vahtkonna_liiges")
@Controller
public class VAHTKONNA_LIIGEController {
}
