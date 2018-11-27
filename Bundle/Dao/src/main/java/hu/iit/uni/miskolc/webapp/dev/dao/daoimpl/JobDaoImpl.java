package hu.iit.uni.miskolc.webapp.dev.dao.daoimpl;

import hu.iit.uni.miskolc.webapp.dev.core.model.Job;
import hu.iit.uni.miskolc.webapp.dev.core.model.JobType;
import hu.iit.uni.miskolc.webapp.dev.service.dao.JobDao;
import hu.iit.uni.miskolc.webapp.dev.service.dao.exception.ObjectNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobDaoImpl implements JobDao {

    private List<Job> jobs;

    public JobDaoImpl() {
        jobs = new ArrayList<>();
        createJobs(jobs);

    }

    @Override
    public Job getJobById(int id) {
        Job foundJob = null;

        for (Job job : jobs) {
            if (job.getId() == id) {
                foundJob = job;
                break;
            }
        }

        return foundJob;
    }

    @Override
    public List<Job> getAllJobs() {
        return jobs;
    }

    @Override
    public Job getJobByName(String name) throws ObjectNotFoundException {
        Job foundJob = null;

        for (Job job : jobs) {
            if (job.getName().equals(name)) {
                foundJob = job;
                break;
            }
        }

        if (foundJob == null) {
            throw new ObjectNotFoundException();
        }
        return foundJob;
    }

    private void createJobs(List<Job> jobs) {
        Job job1 = new Job();
        job1.setId(1);
        job1.setDescription("Job1");
        job1.setJobType(JobType.FULL_TIME);
        job1.setName("JobName1");
        job1.setSalary(1000);

        Job job2 = new Job();
        job2.setId(2);
        job2.setDescription("Job2");
        job2.setJobType(JobType.PART_TIME);
        job2.setName("JobName2");
        job2.setSalary(2000);

        Job job3 = new Job();
        job3.setId(3);
        job3.setDescription("Job3");
        job3.setJobType(JobType.HOME_OFFICE);
        job3.setName("JobName3");
        job3.setSalary(3000);

        Job job4 = new Job();
        job4.setId(4);
        job4.setDescription("Job4");
        job4.setJobType(JobType.FULL_TIME);
        job4.setName("JobName4");
        job4.setSalary(4000);

        Job job5 = new Job();
        job5.setId(5);
        job5.setDescription("Job5");
        job5.setJobType(JobType.PART_TIME);
        job5.setName("JobName5");
        job5.setSalary(5000);

        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);
        jobs.add(job4);
        jobs.add(job5);
    }
}
