package hu.iit.uni.miskolc.webapp.dev.service.dao;

import hu.iit.uni.miskolc.webapp.dev.core.model.Job;
import hu.iit.uni.miskolc.webapp.dev.service.dao.exception.ObjectNotFoundException;

import java.util.List;

public interface JobDao {

    Job getJobById(int id);

    List<Job> getAllJobs();

    Job getJobByName(String name) throws ObjectNotFoundException;
}
