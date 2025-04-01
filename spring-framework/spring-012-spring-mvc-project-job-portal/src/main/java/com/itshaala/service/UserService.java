package com.itshaala.service;

import com.itshaala.dao.UserDao;
import com.itshaala.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {
    private UserDao userDao;

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
