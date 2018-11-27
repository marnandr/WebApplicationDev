package hu.iit.uni.miskolc.webapp.dev.web.controller;

import hu.iit.uni.miskolc.webapp.dev.core.model.Applicant;
import hu.iit.uni.miskolc.webapp.dev.core.service.ApplicantService;
import hu.iit.uni.miskolc.webapp.dev.core.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/applicants")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @RequestMapping(value = "/allApplicants", method = RequestMethod.GET)
    public List<Applicant> getAllApplicants() {
        return applicantService.getAllApplicants();
    }

    @RequestMapping(value = "/applicant", method = RequestMethod.GET)
    public Applicant getApplicantByName(@RequestParam(value = "name", required = true) String name) throws ServiceException {
        return applicantService.getApplicantByName(name);
    }
}
