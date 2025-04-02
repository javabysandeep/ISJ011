package com.itshaala.spring014springboot2.service;

import com.itshaala.spring014springboot2.dao.UserDao;
import com.itshaala.spring014springboot2.model.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void saveUser(User user) {
        userDao.save(user);
    }

    public User getUserById(int id) {
        return userDao.findById(id).get();
    }

    public List<User> getAllUsers() {
        return userDao.findAll();
    }
}