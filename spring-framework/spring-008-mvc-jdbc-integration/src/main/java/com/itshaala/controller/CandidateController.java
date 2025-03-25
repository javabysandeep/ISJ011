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

    public void addCandidate(Candidate candidate) {
        candidateService.addCandidate(candidate);
    }

    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }
}
