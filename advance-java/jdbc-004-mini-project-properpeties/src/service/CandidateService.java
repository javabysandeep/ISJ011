package service;

import dao.CandidateDao;
import model.Candidate;

import java.util.List;

public class CandidateService {

    private CandidateDao candidateDao = new CandidateDao();

    public void add(Candidate candidate) {
        candidateDao.add(candidate);
    }

    public void update(Candidate candidate) {
        candidateDao.update(candidate);
    }

    public void delete(Candidate candidate) {
        candidateDao.delete(candidate);
    }

    public Candidate getById(int id) {
        return candidateDao.getById(id);
    }

    public List<Candidate> getAllCandidates() {
        return candidateDao.getAllCandidates();
    }
}
