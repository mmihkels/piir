package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.ORG_YKSUS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "org_yksus", formBackingObject = ORG_YKSUS.class)
@RequestMapping("/org_yksus")
@Controller
public class ORG_YKSUSController {
}
