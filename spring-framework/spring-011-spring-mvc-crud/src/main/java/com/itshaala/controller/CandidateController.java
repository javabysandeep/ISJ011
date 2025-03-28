package com.itshaala.controller;

import com.itshaala.model.Candidate;
import com.itshaala.service.CandidateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
@RequestMapping("/app")
public class CandidateController {
    private CandidateService candidateService;

    @PostMapping("/candidate")
    public ModelAndView addCandidate(@ModelAttribute Candidate candidate) {
        candidateService.addCandidate(candidate);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("addCandidateSuccess");
        return mav;
    }

    @GetMapping("/form")
    public ModelAndView addForm() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("addCandidateForm");
        return mav;
    }

    @GetMapping("/candidate/{id}")
    public ModelAndView getCandidateById(@PathVariable("id") int id) {
        Candidate candidate = candidateService.getStudentById(id);
        ModelAndView mav = new ModelAndView();
        mav.addObject("candidate", candidate);
        mav.setViewName("showCandidate");
        return mav;
    }
}
