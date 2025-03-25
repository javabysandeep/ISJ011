package com.itshaala.dao;

import com.itshaala.model.Candidate;
import com.itshaala.util.ConnectionUtil;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Repository
public class CandidateDao {
    private ConnectionUtil connectionUtil;

    @SneakyThrows
    public void addCandidate(Candidate candidate) {
        //logic to add data in the database

        String query = "insert into candidate(name, email, phone, address) values(?,?,?,?)";
        Connection connection = connectionUtil.getConnection();
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, candidate.getName());
        ps.setString(2, candidate.getEmail());
        ps.setString(3, candidate.getPhone());
        ps.setString(4, candidate.getAddress());
        ps.executeUpdate();
        System.out.println("Candidate added");
    }

    @SneakyThrows
    public List<Candidate> getAllCandidates() {
        Connection connection = connectionUtil.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from candidate");
        List<Candidate> candidateList = new ArrayList<>();
        while (resultSet.next()) {
            Candidate candidate = Candidate.builder()
                    .id(resultSet.getInt("id"))
                    .name(resultSet.getString("name"))
                    .email(resultSet.getString("email"))
                    .phone(resultSet.getString("phone"))
                    .address(resultSet.getString("address"))
                    .build();
            candidateList.add(candidate);
        }

        return candidateList;
    }
}
