package com.example.quiz;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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
