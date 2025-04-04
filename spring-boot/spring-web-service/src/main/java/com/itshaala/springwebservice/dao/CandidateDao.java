package com.itshaala.springwebservice.dao;

import com.itshaala.springwebservice.model.Candidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateDao extends CrudRepository<Candidate, Integer> {
}
