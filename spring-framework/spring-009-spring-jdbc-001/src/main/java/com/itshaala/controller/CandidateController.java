package com.itshaala.controller;

import com.itshaala.model.Candidate;
import com.itshaala.service.CandidateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CandidateController {
    private CandidateService candidateService;

    public void add(Candidate candidate) {
        candidateService.add(candidate);
    }

    public void update(Candidate candidate) {
        candidateService.update(candidate);
    }

    public void deleteById(int id) {
        candidateService.deleteById(id);
    }

    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    public Candidate getById(int id) {
        return candidateService.getById(id);
    }
}
