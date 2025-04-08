package com.itshaala.itshaalajobportal.controller;

import com.itshaala.itshaalajobportal.model.Job;
import com.itshaala.itshaalajobportal.service.JobService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
@AllArgsConstructor
public class JobController {

    private final JobService jobService;

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable("id") int id) {
        return jobService.getJobById(id);
    }

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobService.createJob(job);
    }

    @PutMapping
    public Job updateJob(@RequestBody Job job) {
        return jobService.updateJob(job);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable("id") int id) {
        jobService.deleteJob(id);
    }

    @DeleteMapping("/all")
    public void deleteAllJobs() {
        jobService.deleteAllJobs();
    }

}
