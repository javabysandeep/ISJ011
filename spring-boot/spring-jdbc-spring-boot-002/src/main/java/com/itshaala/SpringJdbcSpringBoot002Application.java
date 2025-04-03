package com.itshaala;

import com.itshaala.controller.CandidateController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJdbcSpringBoot002Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcSpringBoot002Application.class, args);
        CandidateController controller = context.getBean(CandidateController.class);
        controller.getAllCandidates().forEach(System.out::println);
    }

}
