package com.itshaala.dao;

import com.itshaala.model.Candidate;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CandidateDao {
    private JdbcTemplate jdbcTemplate;

    public void addCandidate(Candidate candidate) {
        String sql = "insert into candidate(name,email,phone, address) values(?,?,?,?)";
        jdbcTemplate.update(sql, candidate.getName(), candidate.getEmail(), candidate.getPhone(), candidate.getAddress());
        System.out.println("candidate added");
    }

    public Candidate getCandidateById(int id) {
        String sql = "select * from candidate where id=?";
        Candidate candidate = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Candidate>(Candidate.class), id);
        return candidate;
    }
}
