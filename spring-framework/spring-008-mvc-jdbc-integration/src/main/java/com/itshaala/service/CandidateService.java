package com.itshaala.service;


import com.itshaala.dao.CandidateDao;
import com.itshaala.model.Candidate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CandidateService {
    private CandidateDao candidateDao;

    public void addCandidate(Candidate candidate) {
        candidateDao.addCandidate(candidate);
    }

    public List<Candidate> getAllCandidates() {
        return candidateDao.getAllCandidates();
    }
}
