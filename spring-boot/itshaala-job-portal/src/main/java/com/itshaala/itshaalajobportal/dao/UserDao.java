package com.itshaala.itshaalajobportal.dao;

import com.itshaala.itshaalajobportal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
