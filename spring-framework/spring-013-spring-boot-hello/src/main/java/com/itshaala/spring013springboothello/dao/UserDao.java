package com.itshaala.spring013springboothello.dao;

import com.itshaala.spring013springboothello.model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@NoArgsConstructor
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveUser(User user) {
        String query = "insert into user (name, email,password,role,createdAt,updatedAt)  values (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(query, user.getName(), user.getEmail(), user.getPassword(), user.getRole().toString(), user.getCreatedAt(), user.getUpdatedAt());
    }

    public User getUserById(int id) {
        String query = "select * from user where id = ?";
        return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<User>(User.class), id);
    }
}
