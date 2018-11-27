package hu.iit.uni.miskolc.webapp.dev.service.serviceimpl;

import hu.iit.uni.miskolc.webapp.dev.core.model.Job;
import hu.iit.uni.miskolc.webapp.dev.core.service.JobService;
import hu.iit.uni.miskolc.webapp.dev.core.service.exception.ServiceException;
import hu.iit.uni.miskolc.webapp.dev.service.dao.JobDao;
import hu.iit.uni.miskolc.webapp.dev.service.dao.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobDao jobDao;

    @Override
    public List<Job> getAllJobs() {
        return jobDao.getAllJobs();
    }

    @Override
    public Job getJobByName(String name) throws ServiceException {
        Job foundJob = null;

        try {
            foundJob = jobDao.getJobByName(name);
        } catch (ObjectNotFoundException e) {
            throw new ServiceException(e);
        }

        return foundJob;
    }
}
