package com.itshaala.itshaalajobportal.controller;

import com.itshaala.itshaalajobportal.model.User;
import com.itshaala.itshaalajobportal.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/user/{id}", produces = "application/json")
    public User getUserById(@PathVariable int id) {
        User userById = userService.getUserById(id);
        return userById;
    }

    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable int id) {
        userService.deleteUserById(id);
    }

    @DeleteMapping("/user/all")
    public void deleteAllUsers() {
        userService.deleteAllUsers();
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        User createdUser = userService.saveUser(user);
        return createdUser;
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        User updatedUser = userService.updateUser(user);
        return updatedUser;
    }

}
