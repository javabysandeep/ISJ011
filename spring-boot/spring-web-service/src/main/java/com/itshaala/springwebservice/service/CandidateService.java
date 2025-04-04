package com.itshaala.springwebservice.service;

import com.itshaala.springwebservice.dao.CandidateDao;
import com.itshaala.springwebservice.model.Candidate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CandidateService {
    @Autowired
    private CandidateDao candidateDao;

    public List<Candidate> findAll() {
        return (List<Candidate>) candidateDao.findAll();
    }
}
