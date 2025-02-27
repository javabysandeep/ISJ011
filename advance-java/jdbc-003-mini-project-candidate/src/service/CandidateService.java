package service;

import dao.CandidateDao;
import model.Candidate;

import java.util.List;

public class CandidateService {
    private CandidateDao candidateDao = new CandidateDao();

    public void addCandidate(Candidate candidate) {
        candidateDao.addCandidate(candidate);
    }

    public List<Candidate> getAllCandidates() {
        return candidateDao.getAllCandidates();
    }
}
