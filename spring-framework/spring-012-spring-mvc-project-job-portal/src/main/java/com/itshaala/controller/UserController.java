package com.itshaala.controller;

import com.itshaala.model.User;
import com.itshaala.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@AllArgsConstructor
@Controller
@RequestMapping("/auth")
public class UserController {

    private final UserService userService;

    @GetMapping("/form")
    public String form() {
        return "register-form";
    }

    @PostMapping("/register")
    public ModelAndView register(@ModelAttribute User user) {
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        userService.saveUser(user);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("register-success");
        return mav;
    }

    @GetMapping("/user/{id}")
    public ModelAndView user(@PathVariable("id") int id) {
        User user = userService.getUserById(id);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("user-view");
        mav.addObject("user", user);
        return mav;
    }

}
