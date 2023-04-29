package com.example.program.controller;

import com.example.program.entity.Feedback;
import com.example.program.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
    @Autowired
    FeedbackService feedbackService;

    @PostMapping("/upload")
    public void addFeedback(@RequestBody Feedback feedback){
        boolean save = feedbackService.save(feedback);

    }
}
