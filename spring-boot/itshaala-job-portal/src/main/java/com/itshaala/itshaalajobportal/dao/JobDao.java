package com.itshaala.itshaalajobportal.dao;

import com.itshaala.itshaalajobportal.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobDao extends JpaRepository<Job, Integer> {
}
