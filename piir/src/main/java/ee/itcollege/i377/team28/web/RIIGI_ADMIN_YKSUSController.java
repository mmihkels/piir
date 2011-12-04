package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.RIIGI_ADMIN_YKSUS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "riigi_admin_yksus", formBackingObject = RIIGI_ADMIN_YKSUS.class)
@RequestMapping("/riigi_admin_yksus")
@Controller
public class RIIGI_ADMIN_YKSUSController {
}
