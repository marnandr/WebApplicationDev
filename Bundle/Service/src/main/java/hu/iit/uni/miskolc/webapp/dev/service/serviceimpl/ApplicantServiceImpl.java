package hu.iit.uni.miskolc.webapp.dev.service.serviceimpl;

import hu.iit.uni.miskolc.webapp.dev.core.model.Applicant;
import hu.iit.uni.miskolc.webapp.dev.core.service.ApplicantService;
import hu.iit.uni.miskolc.webapp.dev.core.service.exception.ServiceException;
import hu.iit.uni.miskolc.webapp.dev.service.dao.ApplicantDao;
import hu.iit.uni.miskolc.webapp.dev.service.dao.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    @Autowired
    private ApplicantDao applicantDao;

    @Override
    public List<Applicant> getAllApplicants() {
        return applicantDao.getAllApplicants();
    }

    @Override
    public Applicant getApplicantByName(String name) throws ServiceException {
        Applicant foundApplicant = null;

        try {
            foundApplicant = applicantDao.getApplicantByName(name);
        } catch (ObjectNotFoundException e) {
            throw new ServiceException(e);
        }

        return foundApplicant;
    }
}
