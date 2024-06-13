package com.example.quiz.dto;

import com.example.quiz.Question;

import java.util.UUID;

public class QuestionDTO {

    private UUID id;
    private UUID quizid;
    private String text;

    // Default constructor
    public QuestionDTO() {
    }

    // Parameterized constructor
    public QuestionDTO(UUID id, UUID quizid, String text) {
        this.id = id;
        this.quizid = quizid;
        this.text = text;
    }

    // Constructor from Question entity
    public static QuestionDTO from(Question question) {
        return new QuestionDTO(question.getId(), question.getQuiz().getId(), question.getText());
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getQuizid() {
        return quizid;
    }

    public void setQuizid(UUID quizid) {
        this.quizid = quizid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
