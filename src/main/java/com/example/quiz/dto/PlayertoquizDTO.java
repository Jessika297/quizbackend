package com.example.quiz.dto;

import java.io.Serializable;
import java.util.UUID;


public class PlayertoquizDTO implements Serializable {

    private PlayerDTO playerid;
    private QuizDTO quizid;

    private int score;
    private UUID id;

    // Getters and setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

//Help