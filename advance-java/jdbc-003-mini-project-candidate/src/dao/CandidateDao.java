package dao;

import lombok.SneakyThrows;
import model.Candidate;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao {

    @SneakyThrows
    public void addCandidate(Candidate candidate) {
        //logic to add data in the database
        Connection connection = ConnectionUtil.getConnection();
        String query = "insert into candidate(name, email, phone, address) values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1,candidate.getName());
        ps.setString(2,candidate.getEmail());
        ps.setString(3,candidate.getPhone());
        ps.setString(4,candidate.getAddress());
        ps.executeUpdate();
        System.out.println("Candidate added");
    }

    @SneakyThrows
    public List<Candidate> getAllCandidates() {
        Connection connection = ConnectionUtil.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from candidate");
        List<Candidate> candidateList = new ArrayList<>();
        while (resultSet.next()){
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
