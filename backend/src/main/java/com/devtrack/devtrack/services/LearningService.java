package com.devtrack.devtrack.services;

import org.springframework.stereotype.Service;
import com.devtrack.devtrack.dto.LearningStatus;
import java.util.List;

@Service
public class LearningService {
    public List<String> getTopics() {
        return List.of(
                "Java",
                "Spring Boot",
                "SQL",
                "SAP Integration");
    }

    public LearningStatus getStatus() {
        return new LearningStatus(
                "Spring Boot",
                "IN_PROGRESS",
                2,
                10);
    }

}
