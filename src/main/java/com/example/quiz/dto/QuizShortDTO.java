package com.example.quiz.dto;

import com.example.quiz.Quiz;

import java.util.UUID;

public class QuizShortDTO {

    private UUID id;
    private String name;
    private String description;
    private int questionCount;

    public static QuizShortDTO from(Quiz quiz) {
        var dto = new QuizShortDTO();
        dto.id = quiz.getId();
        dto.name = quiz.getName();
        dto.description = quiz.getDescription();
        dto.questionCount = quiz.getQuestions().size();
        return dto;
    }

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

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

}
