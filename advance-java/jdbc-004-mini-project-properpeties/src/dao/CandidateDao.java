package dao;

import lombok.SneakyThrows;
import model.Candidate;
import util.Connection.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class CandidateDao {

    @SneakyThrows
    public void add(Candidate candidate) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "insert into candidate(name, email, phone, address) values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, candidate.getName());
        preparedStatement.setString(2, candidate.getEmail());
        preparedStatement.setString(3, candidate.getPhone());
        preparedStatement.setString(4, candidate.getAddress());
        preparedStatement.executeUpdate();
        connection.close();
        System.out.println("Candidate added successfully.");

    }

    public void update(Candidate candidate) {
    }

    public void delete(Candidate candidate) {
    }

    public Candidate getById(int id) {
        return null;
    }

    public List<Candidate> getAllCandidates() {
        return null;
    }
}
