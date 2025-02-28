import controller.CandidateController;
import model.Candidate;

public class CandidateApp {
    public static void main(String[] args) {
        Candidate candidate = Candidate.builder()
                .name("Virat Kohli")
                .email("vk@gmail.com")
                .phone("XX XXXXX XXXXX")
                .address("Warje")
                .build();
        CandidateController candidateController = new CandidateController();
        candidateController.add(candidate);
    }
}
