package com.itshaala.spring014springboot2.controller;

import com.itshaala.spring014springboot2.model.User;
import com.itshaala.spring014springboot2.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.util.List;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void save(User user) {
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        userService.saveUser(user);
    }

    public User getUserById(int id) {
        return userService.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


}
