package hu.iit.uni.miskolc.webapp.dev.dao.daoimpl;

import hu.iit.uni.miskolc.webapp.dev.core.model.Applicant;
import hu.iit.uni.miskolc.webapp.dev.service.dao.ApplicantDao;
import hu.iit.uni.miskolc.webapp.dev.service.dao.JobDao;
import hu.iit.uni.miskolc.webapp.dev.service.dao.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class ApplicantDaoImpl implements ApplicantDao {

    @Autowired
    private JobDao jobDao;

    private List<Applicant> applicants;

    public ApplicantDaoImpl() {
        applicants = new ArrayList<>();
    }
    @Override
    public List<Applicant> getAllApplicants() {
        return applicants;
    }

    @Override
    public Applicant getApplicantByName(String name) throws ObjectNotFoundException {
        Applicant foundApplicant = null;

        for (Applicant applicant : applicants) {
            if (applicant.getName().equals(name)) {
                foundApplicant = applicant;
                break;
            }
        }

        if (foundApplicant == null) {
            throw new ObjectNotFoundException();
        }

        return foundApplicant;
    }

    private void createApplicants(List<Applicant> applicants) {
        Applicant applicant1 = new Applicant();
        applicant1.setId(1);
        applicant1.setApplicationDate(new Date());
        applicant1.setName("Name1");
        applicant1.setPhoneNumber("Phone1");
        applicant1.setAppliedJob(jobDao.getJobById(1));

        Applicant applicant2 = new Applicant();
        applicant2.setId(2);
        applicant2.setApplicationDate(new Date());
        applicant2.setName("Name2");
        applicant2.setPhoneNumber("Phone2");
        applicant2.setAppliedJob(jobDao.getJobById(2));

        Applicant applicant3 = new Applicant();
        applicant3.setId(3);
        applicant3.setApplicationDate(new Date());
        applicant3.setName("Name3");
        applicant3.setPhoneNumber("Phone3");
        applicant3.setAppliedJob(jobDao.getJobById(3));

        Applicant applicant4 = new Applicant();
        applicant4.setId(4);
        applicant4.setApplicationDate(new Date());
        applicant4.setName("Name4");
        applicant4.setPhoneNumber("Phone4");
        applicant4.setAppliedJob(jobDao.getJobById(4));

        Applicant applicant5 = new Applicant();
        applicant5.setId(5);
        applicant5.setApplicationDate(new Date());
        applicant5.setName("Name5");
        applicant5.setAppliedJob(jobDao.getJobById(5));

        applicants.add(applicant1);
        applicants.add(applicant2);
        applicants.add(applicant3);
        applicants.add(applicant4);
        applicants.add(applicant5);
    }
}