package com.itshaala.spring014springboot2;

import com.itshaala.spring014springboot2.controller.UserController;
import com.itshaala.spring014springboot2.model.Role;
import com.itshaala.spring014springboot2.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDateTime;

@SpringBootApplication
public class Spring014SpringBoot2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Spring014SpringBoot2Application.class, args);
        UserController userController = context.getBean(UserController.class);
        User user = new User();
        user.setName("pranay");
        user.setEmail("pranay@gmail.com");
        user.setPassword("pranay");
        user.setRole(Role.ADMIN);
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        userController.save(user);
        System.out.println("user saved successfully");
    }

}
