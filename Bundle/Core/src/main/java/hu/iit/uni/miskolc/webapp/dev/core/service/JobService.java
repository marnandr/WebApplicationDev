package hu.iit.uni.miskolc.webapp.dev.core.service;

import hu.iit.uni.miskolc.webapp.dev.core.model.Job;
import hu.iit.uni.miskolc.webapp.dev.core.service.exception.JobNotFoundException;

import java.util.List;

public interface JobService {

    List<Job> getAllJobs();

    Job getJobByName(String name) throws JobNotFoundException;
}
