package com.devtrack.devtrack.dto;

public record LearningStatus(String technology,
        String status,
        int completedTopics,
        int totalTopics) {

}
