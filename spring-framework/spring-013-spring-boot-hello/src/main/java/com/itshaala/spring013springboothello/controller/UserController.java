package com.itshaala.spring013springboothello.controller;

import com.itshaala.spring013springboothello.model.User;
import com.itshaala.spring013springboothello.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@AllArgsConstructor
@NoArgsConstructor
@Controller
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/form")
    public String form() {
        return "register-form";
    }

    @PostMapping("/register")
    public ModelAndView register(@ModelAttribute User user) {
        //  user.setCreatedAt(LocalDateTime.now());
        // user.setUpdatedAt(LocalDateTime.now());
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

    @GetMapping("/login")
    public String loginForm() {
        return "login-form";
    }


    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("username " + username);
        System.out.println("password " + password);
        return "login-success";
    }
}
