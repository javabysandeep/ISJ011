package com.itshaala.itshaalajobportal.service;

import com.itshaala.itshaalajobportal.dao.UserDao;
import com.itshaala.itshaalajobportal.dto.UserDto;
import com.itshaala.itshaalajobportal.mapper.UserMapper;
import com.itshaala.itshaalajobportal.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserDao userDao;

    public User saveUser(User user) {
        user.setCreatedAt(LocalDateTime.now());
        return userDao.save(user);
    }

    public User updateUser(User user) {
        user.setUpdatedAt(LocalDateTime.now());
        return userDao.save(user);
    }

    public UserDto getUserById(int id) {
        return UserMapper.getUserDto(userDao.findById(id).get());
    }

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public void deleteUserById(int id) {
        userDao.deleteById(id);
    }

    public void deleteAllUsers() {
        userDao.deleteAll();
    }

}
