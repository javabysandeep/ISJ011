package com.itshaala;


import com.itshaala.config.SpringConfig;
import com.itshaala.controller.CandidateController;
import com.itshaala.model.Candidate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class CandidateApp {
    public static void main(String[] args) {
        //UI --> Controller ---> Service ---> Dao

        //Candidate candidate = new Candidate(1,"Sachin","sachin@gmail.com","XXX","Pune");
        Candidate candidate =
                Candidate.builder()
                        .id(101)
                        .name("Sachin")
                        .email("sachin@gmail.com")
                        .phone("XXXXXX")
                        .address("Wakad")
                        .build();
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        CandidateController candidateController = context.getBean(CandidateController.class);

        candidateController.addCandidate(candidate);

        List<Candidate> candidateList = candidateController.getAllCandidates();
        candidateList.forEach(System.out::println);


    }
}
