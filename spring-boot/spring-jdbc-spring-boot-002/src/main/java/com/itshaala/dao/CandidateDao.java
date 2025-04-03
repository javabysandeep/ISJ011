package com.itshaala.dao;

import com.itshaala.model.Candidate;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class CandidateDao {
    private JdbcTemplate jdbcTemplate;

    public List<Candidate> getAllCandidates() {
        String query = "select * from candidate";
        RowMapper<Candidate> rowMapper = (rs, rn) -> Candidate.builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .email(rs.getString("email"))
                .phone(rs.getString("phone"))
                .address(rs.getString("address"))
                .build();
        return jdbcTemplate.query(query, rowMapper);
    }

}
