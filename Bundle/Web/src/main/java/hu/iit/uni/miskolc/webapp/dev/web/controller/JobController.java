package hu.iit.uni.miskolc.webapp.dev.web.controller;

import hu.iit.uni.miskolc.webapp.dev.core.model.Job;
import hu.iit.uni.miskolc.webapp.dev.core.service.JobService;
import hu.iit.uni.miskolc.webapp.dev.core.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping(value = "/allJobs", method = RequestMethod.GET)
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @RequestMapping(value = "/job", method = RequestMethod.GET)
    public Job getJobByName(@RequestParam(value = "name", required = true) String name) throws ServiceException {
        return jobService.getJobByName(name);
    }
}
