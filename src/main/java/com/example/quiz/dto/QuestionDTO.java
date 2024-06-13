package com.example.quiz.dto;

import com.example.quiz.Question;

import java.util.UUID;

public class QuestionDTO {

    private UUID id;
    private UUID quizid;
    private String text;

    public static QuestionDTO from(Question question) {
        var dto = new QuestionDTO(); //rest
        dto.id = question.getId();
        dto.quizid = question.getQuizid();
        dto.text = question.getText();
        return dto;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getQuizId() {
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
