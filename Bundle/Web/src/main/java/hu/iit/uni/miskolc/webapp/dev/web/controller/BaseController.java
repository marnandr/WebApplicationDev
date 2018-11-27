package hu.iit.uni.miskolc.webapp.dev.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class BaseController {

    @RequestMapping(value = "/allJobs", method = RequestMethod.GET)
    public String base() {
        return "index";
    }
}
