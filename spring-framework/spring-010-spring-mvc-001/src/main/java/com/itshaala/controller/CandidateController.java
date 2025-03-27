package com.itshaala.controller;

import com.itshaala.model.Candidate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public ModelAndView add(@ModelAttribute Candidate candidate) {
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }
}
