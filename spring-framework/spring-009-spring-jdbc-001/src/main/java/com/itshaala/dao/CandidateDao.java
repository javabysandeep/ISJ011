package com.itshaala.dao;

import com.itshaala.model.Candidate;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class CandidateDao {
    private JdbcTemplate jdbcTemplate;

    public void add(Candidate candidate) {
        //logic to add data in the database
        String query = "insert into candidate(name, email, phone, address) values(?,?,?,?)";
        PreparedStatementSetter pss = ps -> {
            ps.setString(1, candidate.getName());
            ps.setString(2, candidate.getEmail());
            ps.setString(3, candidate.getPhone());
            ps.setString(4, candidate.getAddress());
        };
        jdbcTemplate.update(query, pss);
        System.out.println("Candidate added");
    }

    public void update(Candidate candidate) {
        String query = "update candidate set name = ?, email = ?, phone = ?, address = ? where id = ?";
        PreparedStatementSetter pss = ps -> {
            ps.setString(1, candidate.getName());
            ps.setString(2, candidate.getEmail());
            ps.setString(3, candidate.getPhone());
            ps.setString(4, candidate.getAddress());
            ps.setInt(5, candidate.getId());
        };
        jdbcTemplate.update(query, pss);
        System.out.println("Candidate updated");
    }

    public void deleteById(int id) {
        String query = "delete from candidate where id =? ";
        PreparedStatementSetter pss = ps -> {
            ps.setInt(1, id);
        };
        jdbcTemplate.update(query, pss);
        System.out.println("Candidate deleted");
    }

    public List<Candidate> getAllCandidates() {
        String query = "select * from candidate";
        RowMapper<Candidate> rowMapper =  new RowMapper<Candidate>() {
            @Override
            public Candidate mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                    Candidate candidate = Candidate.builder()
                            .id(resultSet.getInt("id"))
                            .name(resultSet.getString("name"))
                            .email(resultSet.getString("email"))
                            .phone(resultSet.getString("phone"))
                            .address(resultSet.getString("address"))
                            .build();
                    return candidate;
            }
        };
        List<Candidate> candidateList = jdbcTemplate.query(query, rowMapper);
        return candidateList;
    }

    public Candidate getById(int id) {
        String query = "select * from candidate where id=" + id;

        RowMapper<Candidate> rowMapper = (resultSet, rowNum) -> {
            Candidate candidate = Candidate.builder()
                    .id(resultSet.getInt("id"))
                    .name(resultSet.getString("name"))
                    .email(resultSet.getString("email"))
                    .phone(resultSet.getString("phone"))
                    .address(resultSet.getString("address"))
                    .build();
            return candidate;
        };

        List<Candidate> candidateList = jdbcTemplate.query(query, rowMapper);
        return candidateList.get(0);
    }
}
