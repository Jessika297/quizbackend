package com.example.quiz.dto;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class QuizDTO {

    private UUID id;

    private String name;
    private String description;

    private final Set<QuestionDTO> questions = new HashSet<>();
    private final Set<PlayertoquizDTO> scores = new HashSet<>();

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
