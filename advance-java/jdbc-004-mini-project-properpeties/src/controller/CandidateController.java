package controller;

import model.Candidate;
import service.CandidateService;

import java.util.List;

public class CandidateController {
    private CandidateService candidateService = new CandidateService();

    public void add(Candidate candidate) {
        candidateService.add(candidate);
    }

    public void update(Candidate candidate) {
        candidateService.update(candidate);
    }

    public void delete(Candidate candidate) {
        candidateService.delete(candidate);
    }

    public Candidate getById(int id) {
        return candidateService.getById(id);
    }

    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }
}
