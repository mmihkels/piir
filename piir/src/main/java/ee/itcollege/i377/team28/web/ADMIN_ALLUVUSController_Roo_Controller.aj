// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.i377.team28.web;

import ee.itcollege.i377.team28.entities.ADMIN_ALLUVUS;
import ee.itcollege.i377.team28.entities.RIIGI_ADMIN_YKSUS;
import java.io.UnsupportedEncodingException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.joda.time.format.DateTimeFormat;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect ADMIN_ALLUVUSController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST)
    public String ADMIN_ALLUVUSController.create(@Valid ADMIN_ALLUVUS ADMIN_ALLUVUS, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("ADMIN_ALLUVUS", ADMIN_ALLUVUS);
            addDateTimeFormatPatterns(uiModel);
            return "admin_alluvus/create";
        }
        uiModel.asMap().clear();
        ADMIN_ALLUVUS.persist();
        return "redirect:/admin_alluvus/" + encodeUrlPathSegment(ADMIN_ALLUVUS.getAdmin_alluvus_id().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String ADMIN_ALLUVUSController.createForm(Model uiModel) {
        uiModel.addAttribute("ADMIN_ALLUVUS", new ADMIN_ALLUVUS());
        addDateTimeFormatPatterns(uiModel);
        return "admin_alluvus/create";
    }
    
    @RequestMapping(value = "/{admin_alluvus_id}", method = RequestMethod.GET)
    public String ADMIN_ALLUVUSController.show(@PathVariable("admin_alluvus_id") Long admin_alluvus_id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("admin_alluvus", ADMIN_ALLUVUS.findADMIN_ALLUVUS(admin_alluvus_id));
        uiModel.addAttribute("itemId", admin_alluvus_id);
        return "admin_alluvus/show";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String ADMIN_ALLUVUSController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            uiModel.addAttribute("admin_alluvus", ADMIN_ALLUVUS.findADMIN_ALLUVUSEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) ADMIN_ALLUVUS.countADMIN_ALLUVUS() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("admin_alluvus", ADMIN_ALLUVUS.findAllADMIN_ALLUVUS());
        }
        addDateTimeFormatPatterns(uiModel);
        return "admin_alluvus/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String ADMIN_ALLUVUSController.update(@Valid ADMIN_ALLUVUS ADMIN_ALLUVUS, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("ADMIN_ALLUVUS", ADMIN_ALLUVUS);
            addDateTimeFormatPatterns(uiModel);
            return "admin_alluvus/update";
        }
        uiModel.asMap().clear();
        ADMIN_ALLUVUS.merge();
        return "redirect:/admin_alluvus/" + encodeUrlPathSegment(ADMIN_ALLUVUS.getAdmin_alluvus_id().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{admin_alluvus_id}", params = "form", method = RequestMethod.GET)
    public String ADMIN_ALLUVUSController.updateForm(@PathVariable("admin_alluvus_id") Long admin_alluvus_id, Model uiModel) {
        uiModel.addAttribute("ADMIN_ALLUVUS", ADMIN_ALLUVUS.findADMIN_ALLUVUS(admin_alluvus_id));
        addDateTimeFormatPatterns(uiModel);
        return "admin_alluvus/update";
    }
    
    @RequestMapping(value = "/{admin_alluvus_id}", method = RequestMethod.DELETE)
    public String ADMIN_ALLUVUSController.delete(@PathVariable("admin_alluvus_id") Long admin_alluvus_id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        ADMIN_ALLUVUS.findADMIN_ALLUVUS(admin_alluvus_id).remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/admin_alluvus";
    }
    
    @ModelAttribute("admin_alluvus")
    public Collection<ADMIN_ALLUVUS> ADMIN_ALLUVUSController.populateADMIN_ALLUVUS() {
        return ADMIN_ALLUVUS.findAllADMIN_ALLUVUS();
    }
    
    @ModelAttribute("riigi_admin_yksus")
    public Collection<RIIGI_ADMIN_YKSUS> ADMIN_ALLUVUSController.populateRIIGI_ADMIN_YKSUS() {
        return RIIGI_ADMIN_YKSUS.findAllRIIGI_ADMIN_YKSUS();
    }
    
    void ADMIN_ALLUVUSController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("ADMIN_ALLUVUS_alates_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        uiModel.addAttribute("ADMIN_ALLUVUS_kuni_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        uiModel.addAttribute("ADMIN_ALLUVUS_avatud_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        uiModel.addAttribute("ADMIN_ALLUVUS_muudetud_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        uiModel.addAttribute("ADMIN_ALLUVUS_suletud_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    String ADMIN_ALLUVUSController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        }
        catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
