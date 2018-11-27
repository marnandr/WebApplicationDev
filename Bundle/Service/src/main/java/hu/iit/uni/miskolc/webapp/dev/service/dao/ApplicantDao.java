package hu.iit.uni.miskolc.webapp.dev.service.dao;

import hu.iit.uni.miskolc.webapp.dev.core.model.Applicant;
import hu.iit.uni.miskolc.webapp.dev.service.dao.exception.ObjectNotFoundException;

import java.util.List;

public interface ApplicantDao {

    List<Applicant> getAllApplicants();

    Applicant getApplicantByName(String name) throws ObjectNotFoundException;
}
