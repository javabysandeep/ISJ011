package com.itshaala.itshaalajobportal.service;

import com.itshaala.itshaalajobportal.dao.JobDao;
import com.itshaala.itshaalajobportal.model.Job;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class JobService {
    private final JobDao jobDao;

    public List<Job> getAllJobs() {
        return jobDao.findAll();
    }

    public Job getJobById(int id) {
        return jobDao.findById(id).get();
    }

    public Job createJob(Job job) {
        job.setCreatedAt(LocalDateTime.now());
        return jobDao.save(job);
    }

    public Job updateJob(Job job) {
        job.setUpdatedAt(LocalDateTime.now());
        return jobDao.save(job);
    }

    public void deleteJob(int id) {
        jobDao.deleteById(id);
    }

    public void deleteAllJobs() {
        jobDao.deleteAll();
    }

}
