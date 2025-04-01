package com.itshaala.dao;

import com.itshaala.model.User;
import com.mysql.cj.protocol.a.result.ByteArrayRow;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class UserDao {
    private JdbcTemplate jdbcTemplate;

    public void saveUser(User user) {
        String query = "insert into user (name, email,password,role,createdAt,updatedAt)  values (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(query, user.getName(), user.getEmail(), user.getPassword(), user.getRole().toString(), user.getCreatedAt(), user.getUpdatedAt());
    }

    public User getUserById(int id) {
        String query = "select * from User where id = ?";
        return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<User>(User.class), id);
    }
}
