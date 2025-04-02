package com.itshaala.spring013springboothello.service;

import com.itshaala.spring013springboothello.dao.UserDao;
import com.itshaala.spring013springboothello.model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}