package com.itshaala.service;

import com.itshaala.dao.CandidateDao;
import com.itshaala.model.Candidate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CandidateService {
    private CandidateDao candidateDao;

    public void add(Candidate candidate) {
        candidateDao.add(candidate);
    }

    public void update(Candidate candidate) {
        candidateDao.update(candidate);
    }

    public void deleteById(int id) {
        candidateDao.deleteById(id);
    }

    public List<Candidate> getAllCandidates() {
        return candidateDao.getAllCandidates();
    }

    public Candidate getById(int id) {
        return candidateDao.getById(id);
    }
}
