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

    public List<Candidate> getAllCandidates() {
        return candidateDao.getAllCandidates();
    }
}
