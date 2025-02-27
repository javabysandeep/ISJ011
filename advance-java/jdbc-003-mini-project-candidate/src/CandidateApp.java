import controller.CandidateController;
import model.Candidate;

import java.util.List;

public class CandidateApp {
    public static void main(String[] args) {
        //UI --> Controller ---> Service ---> Dao

        //Candidate candidate = new Candidate(1,"Sachin","sachin@gmail.com","XXX","Pune");
        Candidate candidate =
                Candidate.builder()
                        .id(1)
                        .name("Sachin")
                        .email("sachin@gmail.com")
                        .phone("XXXXXX")
                        .address("Wakad")
                        .build();

        CandidateController candidateController = new CandidateController();

      //  candidateController.addCandidate(candidate);

        List<Candidate> candidateList = candidateController.getAllCandidates();
        candidateList.forEach(System.out::println);


    }
}
