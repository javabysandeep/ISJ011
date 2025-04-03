package com.itshaala;

import com.itshaala.config.SpringConfig;
import com.itshaala.controller.CandidateController;
import com.itshaala.model.Candidate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        CandidateController controller = context.getBean(CandidateController.class);

        List<Candidate> candidateList = controller.getAllCandidates();

        candidateList.forEach(System.out::println);

    }
}
