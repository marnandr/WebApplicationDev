package hu.iit.uni.miskolc.webapp.dev.core.service;

import hu.iit.uni.miskolc.webapp.dev.core.model.Applicant;
import hu.iit.uni.miskolc.webapp.dev.core.service.exception.ServiceException;

import java.util.List;

public interface ApplicantService {

    List<Applicant> getAllApplicants();

    Applicant getApplicantByName(String name) throws ServiceException;
}
