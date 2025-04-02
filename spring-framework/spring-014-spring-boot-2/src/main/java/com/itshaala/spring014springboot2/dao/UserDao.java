package com.itshaala.spring014springboot2.dao;

import com.itshaala.spring014springboot2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
