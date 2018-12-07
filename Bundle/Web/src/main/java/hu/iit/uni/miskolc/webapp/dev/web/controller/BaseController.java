package hu.iit.uni.miskolc.webapp.dev.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController("/")
public class BaseController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView basepage() {
        return new ModelAndView("index");
    }
}
