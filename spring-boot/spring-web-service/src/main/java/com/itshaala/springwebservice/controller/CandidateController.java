package com.itshaala.springwebservice.controller;

import com.itshaala.springwebservice.model.Candidate;
import com.itshaala.springwebservice.service.CandidateService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/app")
@AllArgsConstructor
@NoArgsConstructor
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping("/candidate")
    public List<Candidate> getCandidates() {
        return candidateService.findAll();
    }
}
