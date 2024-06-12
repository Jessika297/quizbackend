package com.example.quiz.dto;

import java.util.UUID;

public class AnswerDTO {

    private UUID id;
    private UUID questionid;
    private String text;
    private boolean istrue;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getQuestionid() {
        return questionid;
    }

    public void setQuestionid(UUID questionid) {
        this.questionid = questionid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isIstrue() {
        return istrue;
    }

    public void setIstrue(boolean istrue) {
        this.istrue = istrue;
    }
}
