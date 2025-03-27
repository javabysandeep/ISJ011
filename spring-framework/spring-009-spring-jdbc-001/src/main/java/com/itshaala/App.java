package com.itshaala;

import com.itshaala.config.SpringConfig;
import com.itshaala.controller.CandidateController;
import com.itshaala.model.Candidate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        CandidateController controller = context.getBean(CandidateController.class);
       /* controller.add(Candidate.builder()
                .name("Pranay")
                .address("Wani")
                .email("pranay@gmail.com")
                .phone("XXXXXXXXX")
                .build());*/

        /*controller.update(Candidate.builder()
                .id(18)
                .name("Pranay")
                .address("Yawatmal - Wani")
                .email("pranay123@gmail.com")
                .phone("+XX XXXXX XXXXX")
                .build());*/
       /* controller.deleteById(4);*/
        List<Candidate> candidateList = controller.getAllCandidates();
        candidateList.forEach(System.out::println);

      /*  Candidate candidate = controller.getById(18);
        System.out.println(candidate);*/

    }
}
