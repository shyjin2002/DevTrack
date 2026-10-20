package com.devtrack.devtrack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.devtrack.devtrack.dto.LearningStatus;
import com.devtrack.devtrack.services.LearningService;

@RestController
@RequestMapping("/api/learning")
public class LearningController {

    private final LearningService learningService;

    public LearningController(LearningService learningService) {
        this.learningService = learningService;
    }

    @GetMapping
    public List<String> getTopics() {
        return learningService.getTopics();
    }

    @GetMapping("/status")
    public LearningStatus getStatus() {
        return learningService.getStatus();
    }

}
