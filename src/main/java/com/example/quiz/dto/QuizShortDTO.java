package com.example.quiz.dto;

import com.example.quiz.Quiz;

import java.util.UUID;

public class QuizShortDTO {

    private UUID id;
    private String name;
    private String description;
    private int questionCount;

    // Default constructor
    public QuizShortDTO() {
    }

    // Parameterized constructor
    public QuizShortDTO(UUID id, String name, String description, int questionCount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.questionCount = questionCount;
    }

    // Constructor from Quiz entity
    public static QuizShortDTO from(Quiz quiz) {
        return new QuizShortDTO(quiz.getId(), quiz.getName(), quiz.getDescription(), quiz.getQuestions().size());
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
