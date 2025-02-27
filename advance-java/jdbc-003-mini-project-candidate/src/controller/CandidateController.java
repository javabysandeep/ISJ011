package controller;

import model.Candidate;
import service.CandidateService;

import java.util.List;

public class CandidateController {
    private CandidateService candidateService = new CandidateService();

    public void addCandidate(Candidate candidate) {
        candidateService.addCandidate(candidate);
    }

    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }
}
